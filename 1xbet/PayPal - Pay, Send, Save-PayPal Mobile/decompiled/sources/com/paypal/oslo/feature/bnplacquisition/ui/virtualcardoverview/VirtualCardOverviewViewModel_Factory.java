package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

/* loaded from: classes11.dex */
public final class VirtualCardOverviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewReducer> getOutputMinFrameDuration;

    private VirtualCardOverviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig> provider7, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper> provider9) {
        this.getOutputMinFrameDuration = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getOutputFormats = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoSizes = provider7;
        this.getInputFormats = provider8;
        this.getHighResolutionOutputSizeshNQ4ISI = provider9;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig> provider7, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper> provider9) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewReducer virtualCardOverviewReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase getInstoreVccDetailsUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase prepareDigitizationDataUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase getProvisionedCardOverviewUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper virtualCardOverviewUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig virtualCardOverviewConfig, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper vccAnalyticsHelper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel(virtualCardOverviewReducer, getInstoreVccDetailsUsecase, prepareDigitizationDataUsecase, getProvisionedCardOverviewUseCase, sessionStorage, virtualCardOverviewUiMapper, virtualCardOverviewConfig, analyticsTracker, vccAnalyticsHelper);
    }
}
