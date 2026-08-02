package com.paypal.oslo.feature.inappcheckout.features.webview;

/* loaded from: classes13.dex */
public final class AppSwitchWebViewViewModel_Factory_Impl implements com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory {
    private final com.paypal.oslo.feature.inappcheckout.features.webview.C0373AppSwitchWebViewViewModel_Factory getHighSpeedVideoFpsRanges;

    private AppSwitchWebViewViewModel_Factory_Impl(com.paypal.oslo.feature.inappcheckout.features.webview.C0373AppSwitchWebViewViewModel_Factory c0373AppSwitchWebViewViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0373AppSwitchWebViewViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory
    public final com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel create(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination) {
        return this.getHighSpeedVideoFpsRanges.get(webViewCheckoutDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory> create(com.paypal.oslo.feature.inappcheckout.features.webview.C0373AppSwitchWebViewViewModel_Factory c0373AppSwitchWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel_Factory_Impl(c0373AppSwitchWebViewViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.inappcheckout.features.webview.C0373AppSwitchWebViewViewModel_Factory c0373AppSwitchWebViewViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel_Factory_Impl(c0373AppSwitchWebViewViewModel_Factory));
    }
}
