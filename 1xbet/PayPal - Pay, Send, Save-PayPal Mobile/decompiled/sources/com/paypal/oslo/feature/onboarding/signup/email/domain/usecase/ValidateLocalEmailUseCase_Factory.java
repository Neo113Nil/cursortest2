package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

/* loaded from: classes13.dex */
public final class ValidateLocalEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase_Factory create() {
        return com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase newInstance() {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
