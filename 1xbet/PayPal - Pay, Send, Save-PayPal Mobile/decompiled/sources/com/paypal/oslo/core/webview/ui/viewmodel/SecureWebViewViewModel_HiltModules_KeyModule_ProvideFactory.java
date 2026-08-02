package com.paypal.oslo.core.webview.ui.viewmodel;

/* loaded from: classes10.dex */
public final class SecureWebViewViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static boolean provide() {
        return com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_HiltModules_KeyModule_ProvideFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
