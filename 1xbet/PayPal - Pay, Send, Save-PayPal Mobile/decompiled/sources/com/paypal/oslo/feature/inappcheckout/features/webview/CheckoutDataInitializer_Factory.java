package com.paypal.oslo.feature.inappcheckout.features.webview;

/* loaded from: classes13.dex */
public final class CheckoutDataInitializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> getHighSpeedVideoFpsRangesFor;

    private CheckoutDataInitializer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer newInstance(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer(checkoutUrlHandler, appSwitchSession, featureGateManager, checkoutLogger);
    }
}
