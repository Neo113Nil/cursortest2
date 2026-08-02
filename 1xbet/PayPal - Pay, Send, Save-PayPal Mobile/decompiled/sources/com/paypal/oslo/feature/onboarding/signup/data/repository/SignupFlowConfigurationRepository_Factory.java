package com.paypal.oslo.feature.onboarding.signup.data.repository;

/* loaded from: classes13.dex */
public final class SignupFlowConfigurationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository_Factory create() {
        return com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository newInstance() {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupFlowConfigurationRepository_Factory();

        private InstanceHolder() {
        }
    }
}
