package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

/* loaded from: classes11.dex */
public final class ReviewPlanConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoSizes;

    private ReviewPlanConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanConfig(configContext);
    }
}
