package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class CheckoutUrlHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizes;

    private CheckoutUrlHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler newInstance(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase getCheckoutUrlUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler(getCheckoutUrlUseCase, appSwitchSession, checkoutLogger);
    }
}
