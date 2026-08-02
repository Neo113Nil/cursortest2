package com.paypal.oslo.feature.onboarding.signup.email.data.repository;

/* loaded from: classes13.dex */
public final class EmailRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService> Camera2StreamConfigurationMap;

    private EmailRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl newInstance(com.paypal.oslo.feature.onboarding.signup.email.domain.service.EmailService emailService) {
        return new com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl(emailService);
    }
}
