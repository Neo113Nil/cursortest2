package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class HomeConfigManagerModule_ProvideHomeConfigManager$home_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRanges;

    private HomeConfigManagerModule_ProvideHomeConfigManager$home_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.featureflags.HomeConfigManager get() {
        return provideHomeConfigManager$home_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.di.HomeConfigManagerModule_ProvideHomeConfigManager$home_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2) {
        return new com.paypal.oslo.feature.home.di.HomeConfigManagerModule_ProvideHomeConfigManager$home_prodReleaseFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.featureflags.HomeConfigManager provideHomeConfigManager$home_prodRelease(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return (com.paypal.oslo.feature.home.featureflags.HomeConfigManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.HomeConfigManagerModule.INSTANCE.provideHomeConfigManager$home_prodRelease(featureGate, dynamicConfiguration));
    }
}
