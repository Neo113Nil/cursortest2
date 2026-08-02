package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

/* loaded from: classes11.dex */
public final class ReviewPlanUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider> getHighSpeedVideoSizes;

    private ReviewPlanUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider3) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider reviewPlanContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper(reviewPlanContentProvider, exitConfirmationContentProvider, applicationFailureUiMapper);
    }
}
