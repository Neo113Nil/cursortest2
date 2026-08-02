package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

/* loaded from: classes12.dex */
public final class StepupCreditCardViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> getHighSpeedVideoSizes;

    private StepupCreditCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer> provider3) {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel newInstance(com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardReducer stepupCreditCardReducer) {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel(validateChallengeUseCase, stringProvider, stepupCreditCardReducer);
    }
}
