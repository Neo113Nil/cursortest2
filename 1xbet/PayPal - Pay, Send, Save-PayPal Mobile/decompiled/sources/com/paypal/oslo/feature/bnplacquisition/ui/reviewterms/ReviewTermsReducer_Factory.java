package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

/* loaded from: classes11.dex */
public final class ReviewTermsReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> Camera2StreamConfigurationMap;

    private ReviewTermsReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer newInstance(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider reviewTermsContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsReducer(reviewTermsContentProvider);
    }
}
