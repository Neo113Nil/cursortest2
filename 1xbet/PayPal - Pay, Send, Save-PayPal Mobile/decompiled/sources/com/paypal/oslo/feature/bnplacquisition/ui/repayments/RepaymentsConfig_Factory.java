package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

/* loaded from: classes11.dex */
public final class RepaymentsConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighResolutionOutputSizeshNQ4ISI;

    private RepaymentsConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig(configContext);
    }
}
