package com.paypal.oslo.feature.home.ui;

/* loaded from: classes12.dex */
public final class HomeConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private HomeConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        return new com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.home.ui.HomeConfigManagerImpl(featureGate, dynamicConfiguration);
    }
}
