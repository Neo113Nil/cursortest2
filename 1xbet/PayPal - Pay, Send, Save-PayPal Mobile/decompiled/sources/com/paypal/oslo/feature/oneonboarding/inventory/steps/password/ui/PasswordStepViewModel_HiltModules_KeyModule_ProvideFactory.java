package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

/* loaded from: classes13.dex */
public final class PasswordStepViewModel_HiltModules_KeyModule_ProvideFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provide());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_HiltModules_KeyModule_ProvideFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static boolean provide() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_HiltModules.KeyModule.provide();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_HiltModules_KeyModule_ProvideFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
