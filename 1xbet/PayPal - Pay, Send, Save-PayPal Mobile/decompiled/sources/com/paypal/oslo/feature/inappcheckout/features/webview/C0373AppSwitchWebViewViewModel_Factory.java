package com.paypal.oslo.feature.inappcheckout.features.webview;

/* renamed from: com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0373AppSwitchWebViewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler> getOutputSizeshNQ4ISI;

    private C0373AppSwitchWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider7, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider8, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider> provider9, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> provider11) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getOutputSizeshNQ4ISI = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getHighSpeedVideoSizes = provider8;
        this.getInputFormats = provider9;
        this.getOutputFormats = provider10;
        this.getHighSpeedVideoFpsRanges = provider11;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel get(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination) {
        return newInstance(webViewCheckoutDestination, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.C0373AppSwitchWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider7, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider8, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider> provider9, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> provider11) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.C0373AppSwitchWebViewViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel newInstance(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetActionFromLoadedUrlsUseCase getActionFromLoadedUrlsUseCase, com.paypal.oslo.feature.inappcheckout.features.webview.CheckoutDataInitializer checkoutDataInitializer, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler webViewAuthenticationHandler, com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler returnToMerchantHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer webViewReducer, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider inAppCheckoutMutationObserverJsProvider, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase, com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver checkoutAppLifecycleObserver) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel(webViewCheckoutDestination, getActionFromLoadedUrlsUseCase, checkoutDataInitializer, webViewAuthenticationHandler, returnToMerchantHandler, webViewReducer, checkoutLogger, analyticsTracer, appSwitchSession, inAppCheckoutMutationObserverJsProvider, trackMonitoringEventUseCase, checkoutAppLifecycleObserver);
    }
}
