package com.paypal.oslo.feature.onboarding.signup.email.ui;

/* loaded from: classes13.dex */
public final class EmailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel> {
    private final dagger.internal.Provider<kotlin.coroutines.CoroutineContext> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> getHighSpeedVideoSizes;

    private EmailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase> provider3, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase> provider3, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider4) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager, com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.ValidateLocalEmailUseCase validateLocalEmailUseCase, com.paypal.oslo.feature.onboarding.signup.email.domain.usecase.CheckEmailUseCase checkEmailUseCase, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel(signupDataManager, validateLocalEmailUseCase, checkEmailUseCase, coroutineContext);
    }
}
