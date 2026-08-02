package com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration;

/* loaded from: classes13.dex */
public final class DynamicConfigurationManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRangesFor;

    private DynamicConfigurationManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManagerImpl(dynamicConfiguration);
    }
}
