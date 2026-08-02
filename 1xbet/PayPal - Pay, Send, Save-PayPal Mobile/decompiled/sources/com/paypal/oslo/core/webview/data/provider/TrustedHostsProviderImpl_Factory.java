package com.paypal.oslo.core.webview.data.provider;

/* loaded from: classes10.dex */
public final class TrustedHostsProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl_Factory create() {
        return com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl newInstance() {
        return new com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.webview.data.provider.TrustedHostsProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
