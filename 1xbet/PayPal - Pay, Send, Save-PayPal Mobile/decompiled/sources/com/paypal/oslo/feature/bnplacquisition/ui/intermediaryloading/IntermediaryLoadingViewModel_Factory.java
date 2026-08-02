package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

/* loaded from: classes11.dex */
public final class IntermediaryLoadingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getOutputFormats;

    private IntermediaryLoadingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getOutputFormats = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig> provider6) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingReducer intermediaryLoadingReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase getBnplPlansUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper intermediaryLoadingUiMapper, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider, com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig intermediaryLoadingConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel(intermediaryLoadingReducer, getBnplPlansUseCase, sessionStorage, intermediaryLoadingUiMapper, cpiAvailabilityProvider, intermediaryLoadingConfig);
    }
}
