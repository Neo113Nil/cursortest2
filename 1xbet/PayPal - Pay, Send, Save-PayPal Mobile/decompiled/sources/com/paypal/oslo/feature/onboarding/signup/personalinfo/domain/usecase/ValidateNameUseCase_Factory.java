package com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase;

/* loaded from: classes13.dex */
public final class ValidateNameUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase_Factory create() {
        return com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase newInstance() {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateNameUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
