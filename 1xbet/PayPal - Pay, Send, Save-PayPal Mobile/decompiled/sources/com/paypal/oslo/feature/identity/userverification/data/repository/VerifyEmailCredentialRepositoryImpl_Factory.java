package com.paypal.oslo.feature.identity.userverification.data.repository;

/* loaded from: classes13.dex */
public final class VerifyEmailCredentialRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.EmailChecker> Camera2StreamConfigurationMap;

    private VerifyEmailCredentialRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.EmailChecker> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.EmailChecker> provider) {
        return new com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl newInstance(com.paypal.oslo.feature.onboarding.api.EmailChecker emailChecker) {
        return new com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl(emailChecker);
    }
}
