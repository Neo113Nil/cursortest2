package com.paypal.oslo.feature.onboarding.signup.ui;

/* loaded from: classes13.dex */
public final class SignupFlowViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> getInputSizeshNQ4ISI;

    private SignupFlowViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> provider3, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider5, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> provider3, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager> provider5, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase> provider6) {
        return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel newInstance(com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase getPageConfigurationUseCase, com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase preloadSignupFlowUseCase, com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService, com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase calculateProgressUseCase, com.paypal.oslo.feature.onboarding.signup.domain.usecase.SignupDataManager signupDataManager, com.paypal.oslo.feature.onboarding.signup.domain.usecase.DetermineSignupFlowUseCase determineSignupFlowUseCase) {
        return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel(getPageConfigurationUseCase, preloadSignupFlowUseCase, backstackFlowStepService, calculateProgressUseCase, signupDataManager, determineSignupFlowUseCase);
    }
}
