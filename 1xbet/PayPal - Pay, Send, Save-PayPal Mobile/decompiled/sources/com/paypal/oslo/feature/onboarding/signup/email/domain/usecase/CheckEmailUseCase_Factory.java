package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

/* loaded from: classes13.dex */
public final class CheckEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailValidationRepository> getHighSpeedVideoFpsRanges;

    private CheckEmailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailValidationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailValidationRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailValidationRepository emailValidationRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase(emailValidationRepository);
    }
}
