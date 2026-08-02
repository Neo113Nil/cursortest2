package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

/* loaded from: classes11.dex */
public final class ReviewPlanViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> getOutputFormats;

    private ReviewPlanViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig> provider7) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getOutputFormats = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoSizes = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig> provider7) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanReducer reviewPlanReducer, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper reviewPlanUiMapper, com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase removeExistingPayLaterCardsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig reviewPlanConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel(reviewPlanReducer, reviewPlanUiMapper, submitCreditApplicationUsecase, sessionStorage, removeExistingPayLaterCardsUseCase, applicationFailureUiMapper, reviewPlanConfig);
    }
}
