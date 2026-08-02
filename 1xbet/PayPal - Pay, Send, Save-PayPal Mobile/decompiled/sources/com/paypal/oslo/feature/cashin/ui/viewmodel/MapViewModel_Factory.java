package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class MapViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private MapViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel newInstance(com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase getUserLocationUseCase, com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase getCashInStoresUseCase, com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder cashInPlacesGeocoder, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel(getUserLocationUseCase, getCashInStoresUseCase, cashInPlacesGeocoder, coroutineDispatcher);
    }
}
