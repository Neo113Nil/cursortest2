package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

/* loaded from: classes11.dex */
public final class ReviewPlanContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
