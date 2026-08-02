package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* loaded from: classes12.dex */
public final class CryptoEopProvisioningUrls_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> Camera2StreamConfigurationMap;

    private CryptoEopProvisioningUrls_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls(webEnvironmentProvider);
    }
}
