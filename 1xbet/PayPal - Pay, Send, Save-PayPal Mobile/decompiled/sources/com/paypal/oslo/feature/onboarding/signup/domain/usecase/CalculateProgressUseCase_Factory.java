package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

/* loaded from: classes13.dex */
public final class CalculateProgressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository> getHighResolutionOutputSizeshNQ4ISI;

    private CalculateProgressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository flowConfigurationRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.CalculateProgressUseCase(flowConfigurationRepository);
    }
}
