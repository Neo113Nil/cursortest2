package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

/* loaded from: classes13.dex */
public final class PreloadSignupFlowUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository> getHighSpeedVideoFpsRanges;

    private PreloadSignupFlowUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService> provider2) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository flowConfigurationRepository, com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase(flowConfigurationRepository, backstackFlowStepService);
    }
}
