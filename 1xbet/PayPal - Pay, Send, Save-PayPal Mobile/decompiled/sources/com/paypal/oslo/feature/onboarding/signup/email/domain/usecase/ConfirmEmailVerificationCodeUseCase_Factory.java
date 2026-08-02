package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

/* loaded from: classes13.dex */
public final class ConfirmEmailVerificationCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository> getHighSpeedVideoFpsRangesFor;

    private ConfirmEmailVerificationCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository emailRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ConfirmEmailVerificationCodeUseCase(emailRepository);
    }
}
