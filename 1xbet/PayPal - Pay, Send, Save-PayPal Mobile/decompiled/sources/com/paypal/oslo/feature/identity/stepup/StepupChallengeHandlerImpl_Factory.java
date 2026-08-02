package com.paypal.oslo.feature.identity.stepup;

/* loaded from: classes13.dex */
public final class StepupChallengeHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private StepupChallengeHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.stepup.domain.usecase.FetchStepupChallengesUseCase fetchStepupChallengesUseCase) {
        return new com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl(appNavigator, fetchStepupChallengesUseCase);
    }
}
