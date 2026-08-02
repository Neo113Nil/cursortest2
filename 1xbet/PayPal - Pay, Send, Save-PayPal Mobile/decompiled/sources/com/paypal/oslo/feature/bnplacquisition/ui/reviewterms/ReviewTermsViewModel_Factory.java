package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

/* loaded from: classes11.dex */
public final class ReviewTermsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsAnalyticsHelper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> getInputFormats;

    private ReviewTermsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsAnalyticsHelper> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getInputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsAnalyticsHelper> provider6) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer reviewTermsReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase getRepaymentDetailsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper reviewTermsUiMapper, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsAnalyticsHelper reviewTermsAnalyticsHelper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel(reviewTermsReducer, getRepaymentDetailsUseCase, sessionStorage, reviewTermsUiMapper, analyticsTracker, reviewTermsAnalyticsHelper);
    }
}
