package com.paypal.oslo.feature.ads.data.repository.ol;

/* loaded from: classes11.dex */
public final class AdProviderRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider> getHighSpeedVideoFpsRangesFor;

    private AdProviderRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider> provider3) {
        return new com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl newInstance(com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient adsApiClient, com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider userIdentifierProvider, com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider) {
        return new com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl(adsApiClient, userIdentifierProvider, userIdentificationProvider);
    }
}
