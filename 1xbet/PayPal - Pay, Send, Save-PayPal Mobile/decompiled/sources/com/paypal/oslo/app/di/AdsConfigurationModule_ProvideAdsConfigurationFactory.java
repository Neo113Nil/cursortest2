package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class AdsConfigurationModule_ProvideAdsConfigurationFactory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.api.config.AdsConfiguration> {
    private final dagger.internal.Provider<com.paypal.oslo.app.config.AdsConfigurationProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighSpeedVideoSizes;

    private AdsConfigurationModule_ProvideAdsConfigurationFactory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.app.config.AdsConfigurationProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.api.config.AdsConfiguration get() {
        return provideAdsConfiguration(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.di.AdsConfigurationModule_ProvideAdsConfigurationFactory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.app.config.AdsConfigurationProvider> provider2) {
        return new com.paypal.oslo.app.di.AdsConfigurationModule_ProvideAdsConfigurationFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.ads.api.config.AdsConfiguration provideAdsConfiguration(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider, com.paypal.oslo.app.config.AdsConfigurationProvider adsConfigurationProvider) {
        return (com.paypal.oslo.feature.ads.api.config.AdsConfiguration) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.AdsConfigurationModule.INSTANCE.provideAdsConfiguration(environmentProvider, adsConfigurationProvider));
    }
}
