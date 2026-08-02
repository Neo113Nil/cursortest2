package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

/* loaded from: classes13.dex */
public final class RequestEmailVerificationCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository> getHighSpeedVideoFpsRanges;

    private RequestEmailVerificationCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository emailRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.RequestEmailVerificationCodeUseCase(emailRepository);
    }
}
