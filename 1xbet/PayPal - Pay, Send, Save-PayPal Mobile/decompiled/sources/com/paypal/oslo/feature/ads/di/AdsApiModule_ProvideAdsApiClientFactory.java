package com.paypal.oslo.feature.ads.di;

/* loaded from: classes5.dex */
public final class AdsApiModule_ProvideAdsApiClientFactory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.api.config.AdsConfiguration> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private AdsApiModule_ProvideAdsApiClientFactory(dagger.internal.Provider<com.paypal.oslo.feature.ads.api.config.AdsConfiguration> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient get() {
        return provideAdsApiClient(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.ads.di.AdsApiModule_ProvideAdsApiClientFactory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.api.config.AdsConfiguration> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.ads.di.AdsApiModule_ProvideAdsApiClientFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient provideAdsApiClient(com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration, com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider adsClientOkHttpProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.ads.di.AdsApiModule.INSTANCE.provideAdsApiClient(adsConfiguration, adsClientOkHttpProvider, coroutineDispatcher));
    }
}
