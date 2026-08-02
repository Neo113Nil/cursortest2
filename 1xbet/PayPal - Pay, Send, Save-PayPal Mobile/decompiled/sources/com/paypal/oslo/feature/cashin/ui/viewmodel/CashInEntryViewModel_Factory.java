package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CashInEntryViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private CashInEntryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> provider5) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase getHasSeenLandingUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase checkLocationPermissionUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase checkLocationEnabledUseCase, com.paypal.oslo.feature.cashin.manager.CashInFeatureManager cashInFeatureManager) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel(appNavigator, getHasSeenLandingUseCase, checkLocationPermissionUseCase, checkLocationEnabledUseCase, cashInFeatureManager);
    }
}
