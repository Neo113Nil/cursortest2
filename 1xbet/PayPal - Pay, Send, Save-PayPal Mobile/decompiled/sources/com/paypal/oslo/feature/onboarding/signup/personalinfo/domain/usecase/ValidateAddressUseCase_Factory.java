package com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase;

/* loaded from: classes13.dex */
public final class ValidateAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase_Factory create() {
        return com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase newInstance() {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
