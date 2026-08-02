package com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer;

/* loaded from: classes13.dex */
public final class WebViewReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizes;

    private WebViewReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer newInstance(com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase loaderTypeUseCase, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetXORLoadingHeadersUseCase getXORLoadingHeadersUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.reducer.WebViewReducer(loaderTypeUseCase, getXORLoadingHeadersUseCase, checkoutLogger, analyticsTracer);
    }
}
