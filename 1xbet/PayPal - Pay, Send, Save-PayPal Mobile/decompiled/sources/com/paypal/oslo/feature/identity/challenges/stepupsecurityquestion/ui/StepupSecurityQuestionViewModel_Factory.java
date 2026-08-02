package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui;

/* loaded from: classes12.dex */
public final class StepupSecurityQuestionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> getHighSpeedVideoSizes;

    private StepupSecurityQuestionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionReducer> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionReducer> provider3) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel newInstance(com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionReducer stepupSecurityQuestionReducer) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel(validateChallengeUseCase, stringProvider, stepupSecurityQuestionReducer);
    }
}
