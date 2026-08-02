package com.paypal.oslo.feature.debitcard.api.widget;

/* loaded from: classes12.dex */
public final class DebitCardWidgetBridgeViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_HiltModules_KeyModule_ProvideFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
