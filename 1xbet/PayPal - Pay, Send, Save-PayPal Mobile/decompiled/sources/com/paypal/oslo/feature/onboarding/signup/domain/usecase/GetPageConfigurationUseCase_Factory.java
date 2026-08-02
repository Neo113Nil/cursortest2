package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPageConfigurationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider> getHighSpeedVideoFpsRangesFor;

    private GetPageConfigurationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase newInstance(com.paypal.oslo.feature.onboarding.steps.struct.domain.repository.ConfigurationProvider configurationProvider) {
        return new com.paypal.oslo.feature.onboarding.signup.domain.usecase.GetPageConfigurationUseCase(configurationProvider);
    }
}
