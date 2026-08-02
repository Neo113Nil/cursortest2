package com.paypal.oslo.feature.savings.ui.onboarding;

/* loaded from: classes14.dex */
public final class OnboardingAddMoneyViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private OnboardingAddMoneyViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel(fetchGoalsUseCase);
    }
}
