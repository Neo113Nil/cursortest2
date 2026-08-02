package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetGoalSuccessStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetGoalSuccessStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase(savingsRepository);
    }
}
