package com.paypal.oslo.feature.inappcheckout.features.statsig.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/di/StatsigModule;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManagerImpl;", "implementation", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "featureGate", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManagerImpl;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManagerImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "dynamicConfiguration", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManagerImpl;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/dynamicConfiguration/DynamicConfigurationManager;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/experiments/ExperimentsManagerImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/experiments/ExperimentsManager;", "experiments", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/experiments/ExperimentsManagerImpl;)Lcom/paypal/oslo/feature/inappcheckout/features/statsig/experiments/ExperimentsManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface StatsigModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager dynamicConfiguration(com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl implementation);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManager experiments(com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl implementation);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGate(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl implementation);
}
