package com.paypal.oslo.feature.onboarding.signup.data.repository;

/* loaded from: classes13.dex */
public final class SignupComponentConfigurationBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory> getHighSpeedVideoFpsRangesFor;

    private SignupComponentConfigurationBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder newInstance(com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory fieldConfigFactory) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupComponentConfigurationBuilder(fieldConfigFactory);
    }
}
