package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class ShouldAutoShowTaxPreferencePromptUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighSpeedVideoSizes;

    private ShouldAutoShowTaxPreferencePromptUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.ShouldAutoShowTaxPreferencePromptUseCase(savingsRepository);
    }
}
