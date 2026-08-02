package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class SecureWebViewAppConfigProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.SecureWebViewAppConfigProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.app.config.SSLConfig> getHighResolutionOutputSizeshNQ4ISI;

    private SecureWebViewAppConfigProvider_Factory(dagger.internal.Provider<com.paypal.oslo.app.config.SSLConfig> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.SecureWebViewAppConfigProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.config.SecureWebViewAppConfigProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.app.config.SSLConfig> provider) {
        return new com.paypal.oslo.app.config.SecureWebViewAppConfigProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.config.SecureWebViewAppConfigProvider newInstance(com.paypal.oslo.app.config.SSLConfig sSLConfig) {
        return new com.paypal.oslo.app.config.SecureWebViewAppConfigProvider(sSLConfig);
    }
}
