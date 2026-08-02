package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

/* loaded from: classes11.dex */
public final class HowItWorksContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRanges;

    private HowItWorksContentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.HowItWorksContentProvider(configContext);
    }
}
