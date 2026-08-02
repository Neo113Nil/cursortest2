package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

/* loaded from: classes13.dex */
public final class SignupDataManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository> getHighSpeedVideoFpsRanges;

    private SignupDataManager_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager newInstance(com.paypal.oslo.feature.onboarding.signup.domain.repository.SignupDataRepository signupDataRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager(signupDataRepository);
    }
}
