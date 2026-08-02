package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetSavingsAccountEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighSpeedVideoFpsRangesFor;

    private GetSavingsAccountEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase(savingsRepository);
    }
}
