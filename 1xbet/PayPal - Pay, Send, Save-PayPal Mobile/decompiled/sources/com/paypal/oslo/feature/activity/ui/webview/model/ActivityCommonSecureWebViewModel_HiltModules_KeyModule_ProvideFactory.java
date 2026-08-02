package com.paypal.oslo.feature.activity.ui.webview.model;

/* loaded from: classes10.dex */
public final class ActivityCommonSecureWebViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_HiltModules_KeyModule_ProvideFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
