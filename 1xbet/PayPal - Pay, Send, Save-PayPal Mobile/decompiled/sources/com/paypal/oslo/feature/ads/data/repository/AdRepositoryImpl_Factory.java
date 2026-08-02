package com.paypal.oslo.feature.ads.data.repository;

/* loaded from: classes11.dex */
public final class AdRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.data.tracking.AdTrackingService> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private AdRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.data.tracking.AdTrackingService> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.data.tracking.AdTrackingService> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl newInstance(com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource adProviderDataSource, com.paypal.oslo.feature.ads.data.tracking.AdTrackingService adTrackingService, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl(adProviderDataSource, adTrackingService, appInformation, coroutineDispatcher);
    }
}
