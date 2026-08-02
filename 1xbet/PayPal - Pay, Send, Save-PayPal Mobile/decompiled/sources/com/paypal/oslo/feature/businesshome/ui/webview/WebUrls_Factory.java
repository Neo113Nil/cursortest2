package com.paypal.oslo.feature.businesshome.ui.webview;

/* loaded from: classes11.dex */
public final class WebUrls_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighSpeedVideoFpsRanges;

    private WebUrls_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesshome.ui.webview.WebUrls_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        return new com.paypal.oslo.feature.businesshome.ui.webview.WebUrls_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.ui.webview.WebUrls newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        return new com.paypal.oslo.feature.businesshome.ui.webview.WebUrls(webEnvironmentProvider);
    }
}
