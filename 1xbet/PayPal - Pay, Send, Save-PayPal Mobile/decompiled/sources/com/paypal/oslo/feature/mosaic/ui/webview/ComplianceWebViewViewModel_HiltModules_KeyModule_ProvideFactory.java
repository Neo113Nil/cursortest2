package com.paypal.oslo.feature.mosaic.ui.webview;

/* loaded from: classes13.dex */
public final class ComplianceWebViewViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_HiltModules_KeyModule_ProvideFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.mosaic.ui.webview.ComplianceWebViewViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
