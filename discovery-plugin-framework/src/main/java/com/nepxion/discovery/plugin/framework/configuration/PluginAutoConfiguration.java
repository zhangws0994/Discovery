package com.nepxion.discovery.plugin.framework.configuration;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nepxion.discovery.plugin.framework.cache.PluginCache;
import com.nepxion.discovery.plugin.framework.entity.RuleEntity;
import com.nepxion.discovery.plugin.framework.event.PluginPublisher;
import com.nepxion.discovery.plugin.framework.strategy.DiscoveryControlStrategy;
import com.nepxion.discovery.plugin.framework.strategy.RegisterControlStrategy;

@Configuration
public class PluginAutoConfiguration {
    @Bean
    public RuleEntity ruleEntity() {
        return new RuleEntity();
    }

    @Bean
    public PluginCache pluginCache() {
        return new PluginCache();
    }

    @Bean
    public PluginPublisher pluginPublisher() {
        return new PluginPublisher();
    }

    @Bean
    public ReentrantReadWriteLock reentrantReadWriteLock() {
        return new ReentrantReadWriteLock();
    }

    @Bean
    public RegisterControlStrategy registerControlStrategy() {
        return new RegisterControlStrategy();
    }

    @Bean
    public DiscoveryControlStrategy discoveryControlStrategy() {
        return new DiscoveryControlStrategy();
    }
}