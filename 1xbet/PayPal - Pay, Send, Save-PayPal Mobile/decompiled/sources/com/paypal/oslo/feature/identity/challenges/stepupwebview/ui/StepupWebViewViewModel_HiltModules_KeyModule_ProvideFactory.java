package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

/* loaded from: classes12.dex */
public final class StepupWebViewViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_HiltModules_KeyModule_ProvideFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
