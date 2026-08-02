package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig;

/* loaded from: classes14.dex */
public final class DynamicConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoSizes;

    private DynamicConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManagerImpl(dynamicConfiguration);
    }
}
