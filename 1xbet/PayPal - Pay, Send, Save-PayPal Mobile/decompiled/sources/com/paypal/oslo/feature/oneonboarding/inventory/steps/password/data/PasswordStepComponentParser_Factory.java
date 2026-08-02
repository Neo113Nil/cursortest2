package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data;

/* loaded from: classes13.dex */
public final class PasswordStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.data.PasswordStepComponentParser_Factory();

        private InstanceHolder() {
        }
    }
}
