package com.paypal.oslo.feature.onboarding.signup.data.repository;

/* loaded from: classes13.dex */
public final class SignupComponentConfigurationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder> getHighSpeedVideoFpsRanges;

    private SignupComponentConfigurationRepository_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository newInstance(com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder signupComponentConfigurationBuilder) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationRepository(signupComponentConfigurationBuilder);
    }
}
