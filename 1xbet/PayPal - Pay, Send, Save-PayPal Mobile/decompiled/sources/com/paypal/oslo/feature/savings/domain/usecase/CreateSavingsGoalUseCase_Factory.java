package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class CreateSavingsGoalUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private CreateSavingsGoalUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase(savingsRepository);
    }
}
