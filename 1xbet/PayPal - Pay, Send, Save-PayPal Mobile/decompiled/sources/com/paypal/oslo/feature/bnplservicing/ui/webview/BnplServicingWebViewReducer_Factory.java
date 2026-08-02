package com.paypal.oslo.feature.bnplservicing.ui.webview;

/* loaded from: classes11.dex */
public final class BnplServicingWebViewReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.ui.webview.BnplServicingWebViewReducer_Factory();

        private InstanceHolder() {
        }
    }
}
