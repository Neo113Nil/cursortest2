package com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdateSignupFieldUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> getHighResolutionOutputSizeshNQ4ISI;

    private UpdateSignupFieldUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager) {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.UpdateSignupFieldUseCase(signupDataManager);
    }
}
