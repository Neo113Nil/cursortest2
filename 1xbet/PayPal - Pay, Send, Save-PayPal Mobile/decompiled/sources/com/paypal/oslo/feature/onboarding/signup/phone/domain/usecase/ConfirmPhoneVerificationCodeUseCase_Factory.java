package com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase;

/* loaded from: classes13.dex */
public final class ConfirmPhoneVerificationCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository> getHighSpeedVideoFpsRanges;

    private ConfirmPhoneVerificationCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.ConfirmPhoneVerificationCodeUseCase(phoneRepository);
    }
}
