package com.paypal.oslo.feature.identity.stepup.domain.usecase;

/* loaded from: classes13.dex */
public final class FetchStepupChallengesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository> Camera2StreamConfigurationMap;

    private FetchStepupChallengesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository> provider) {
        return new com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase newInstance(com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository stepupChallengeRepository) {
        return new com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase(stepupChallengeRepository);
    }
}
