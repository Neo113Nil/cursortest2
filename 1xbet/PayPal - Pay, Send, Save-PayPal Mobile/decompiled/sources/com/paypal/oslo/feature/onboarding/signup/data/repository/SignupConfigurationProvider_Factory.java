package com.paypal.oslo.feature.onboarding.signup.data.repository;

/* loaded from: classes13.dex */
public final class SignupConfigurationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository> Camera2StreamConfigurationMap;

    private SignupConfigurationProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider newInstance(com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository signupComponentConfigurationRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupConfigurationProvider(signupComponentConfigurationRepository);
    }
}
