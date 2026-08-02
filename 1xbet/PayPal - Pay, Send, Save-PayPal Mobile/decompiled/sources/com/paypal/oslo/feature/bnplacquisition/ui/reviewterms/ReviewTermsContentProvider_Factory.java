package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

/* loaded from: classes11.dex */
public final class ReviewTermsContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
