package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class FetchGoalsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighSpeedVideoFpsRanges;

    private FetchGoalsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase(savingsRepository);
    }
}
