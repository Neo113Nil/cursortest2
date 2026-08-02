package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

/* loaded from: classes13.dex */
public final class DetermineSignupFlowUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase_Factory create() {
        return com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase newInstance() {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
