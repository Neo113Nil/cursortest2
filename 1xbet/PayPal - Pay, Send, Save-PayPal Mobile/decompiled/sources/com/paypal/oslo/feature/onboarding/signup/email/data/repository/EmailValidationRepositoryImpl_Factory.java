package com.paypal.oslo.feature.onboarding.signup.email.data.repository;

/* loaded from: classes13.dex */
public final class EmailValidationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> getHighSpeedVideoFpsRanges;

    private EmailValidationRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl newInstance(com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailValidationService emailValidationService) {
        return new com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailValidationRepositoryImpl(emailValidationService);
    }
}
