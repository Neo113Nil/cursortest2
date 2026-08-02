package com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig;

/* loaded from: classes12.dex */
public final class DynamicConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoSizes;

    private DynamicConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DynamicConfigManagerImpl(dynamicConfiguration);
    }
}
