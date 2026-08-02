package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class DeleteMoneyboxUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighSpeedVideoFpsRanges;

    private DeleteMoneyboxUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxUseCase(savingsRepository);
    }
}
