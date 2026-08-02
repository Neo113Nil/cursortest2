package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

/* loaded from: classes11.dex */
public final class EnterAmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer> getOutputStallDuration;

    private EnterAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper> provider9, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider10, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> provider11, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper> provider12) {
        this.getOutputStallDuration = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getInputFormats = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.getOutputSizeshNQ4ISI = provider8;
        this.getOutputFormats = provider9;
        this.getHighSpeedVideoSizes = provider10;
        this.getHighResolutionOutputSizeshNQ4ISI = provider11;
        this.getHighSpeedVideoFpsRanges = provider12;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel get() {
        return newInstance(this.getOutputStallDuration.get(), this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getOutputMinFrameDuration.get(), this.getOutputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper> provider9, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider10, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> provider11, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper> provider12) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer enterAmountReducer, com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase getExperienceSessionUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase checkApplicationEligibilityUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase getLoanConstraintsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase createCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountAnalyticsHelper enterAmountAnalyticsHelper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel(enterAmountReducer, featureGateManager, cpiAvailabilityProvider, getExperienceSessionUsecase, checkApplicationEligibilityUseCase, getLoanConstraintsUseCase, createCreditApplicationUsecase, sessionStorage, enterAmountUiMapper, bnplAcquisitionFormatter, enterAmountConfig, enterAmountAnalyticsHelper);
    }
}
