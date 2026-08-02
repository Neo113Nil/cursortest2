package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

/* loaded from: classes13.dex */
public final class PasswordStepViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
