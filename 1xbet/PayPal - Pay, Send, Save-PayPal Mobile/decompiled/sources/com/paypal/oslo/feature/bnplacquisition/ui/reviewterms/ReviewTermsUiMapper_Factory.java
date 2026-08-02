package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

/* loaded from: classes11.dex */
public final class ReviewTermsUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoSizes;

    private ReviewTermsUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider> provider4) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider reviewTermsContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetContentProvider documentsHalfSheetContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper(applicationFailureUiMapper, reviewTermsContentProvider, exitConfirmationContentProvider, documentsHalfSheetContentProvider);
    }
}
