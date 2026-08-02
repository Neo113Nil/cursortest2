package com.paypal.oslo.app.emw.ui.viewmodel;

/* loaded from: classes10.dex */
public final class EmwViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static boolean provide() {
        return com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_HiltModules_KeyModule_ProvideFactory Camera2StreamConfigurationMap = new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
