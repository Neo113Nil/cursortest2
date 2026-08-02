package com.paypal.oslo.core.webview.config;

/* loaded from: classes10.dex */
public final class DefaultWebEnvironmentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentConfig> getHighSpeedVideoSizes;

    private DefaultWebEnvironmentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentConfig> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentConfig> provider) {
        return new com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentConfig webEnvironmentConfig) {
        return new com.paypal.oslo.core.webview.config.DefaultWebEnvironmentProvider(webEnvironmentConfig);
    }
}
