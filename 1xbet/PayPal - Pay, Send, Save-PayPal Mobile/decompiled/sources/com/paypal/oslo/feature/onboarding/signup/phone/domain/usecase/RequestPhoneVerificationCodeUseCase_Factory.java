package com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase;

/* loaded from: classes13.dex */
public final class RequestPhoneVerificationCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository> getHighSpeedVideoSizes;

    private RequestPhoneVerificationCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.RequestPhoneVerificationCodeUseCase(phoneRepository);
    }
}
