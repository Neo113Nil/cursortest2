package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CashInBalanceLandingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private CashInBalanceLandingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration> provider5) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase setHasSeenLandingUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase checkLocationPermissionUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase checkLocationEnabledUseCase, com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration cashInDynamicConfiguration) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel(appNavigator, setHasSeenLandingUseCase, checkLocationPermissionUseCase, checkLocationEnabledUseCase, cashInDynamicConfiguration);
    }
}
