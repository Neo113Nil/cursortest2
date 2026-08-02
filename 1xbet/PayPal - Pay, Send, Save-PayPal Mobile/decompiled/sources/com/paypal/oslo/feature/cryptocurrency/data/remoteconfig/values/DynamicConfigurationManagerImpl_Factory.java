package com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values;

/* loaded from: classes12.dex */
public final class DynamicConfigurationManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoSizes;

    private DynamicConfigurationManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.DynamicConfigurationManagerImpl(dynamicConfiguration);
    }
}
