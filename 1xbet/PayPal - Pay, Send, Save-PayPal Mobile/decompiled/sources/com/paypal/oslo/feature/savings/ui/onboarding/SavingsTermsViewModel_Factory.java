package com.paypal.oslo.feature.savings.ui.onboarding;

/* loaded from: classes14.dex */
public final class SavingsTermsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase> getHighSpeedVideoSizes;

    private SavingsTermsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase> provider) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase acceptSavingsAccountTermsUseCase) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel(acceptSavingsAccountTermsUseCase);
    }
}
