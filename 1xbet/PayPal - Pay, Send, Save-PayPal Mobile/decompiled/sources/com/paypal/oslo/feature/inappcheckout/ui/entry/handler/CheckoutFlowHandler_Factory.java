package com.paypal.oslo.feature.inappcheckout.ui.entry.handler;

/* loaded from: classes13.dex */
public final class CheckoutFlowHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoSizes;

    private CheckoutFlowHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.statsig.dynamicConfiguration.DynamicConfigurationManager dynamicConfigurationManager) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler(appSwitchSession, dynamicConfigurationManager);
    }
}
