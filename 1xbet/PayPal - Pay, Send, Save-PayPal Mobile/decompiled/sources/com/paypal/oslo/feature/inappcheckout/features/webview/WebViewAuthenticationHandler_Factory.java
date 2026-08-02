package com.paypal.oslo.feature.inappcheckout.features.webview;

/* loaded from: classes13.dex */
public final class WebViewAuthenticationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> getHighSpeedVideoSizes;

    private WebViewAuthenticationHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler newInstance(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase processOneShotAuthenticationDataUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler(processOneShotAuthenticationDataUseCase, appSwitchSession, navResultManager, checkoutLogger);
    }
}
