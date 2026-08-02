package com.paypal.oslo.feature.onboarding.signup.password.ui;

/* loaded from: classes13.dex */
public final class PasswordViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel> {
    private final dagger.internal.Provider<kotlin.coroutines.CoroutineContext> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> getHighSpeedVideoFpsRangesFor;

    private PasswordViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel(signupDataManager, coroutineContext);
    }
}
