package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class DeleteMoneyboxTransferScheduleUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> getHighSpeedVideoFpsRanges;

    private DeleteMoneyboxTransferScheduleUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase(savingsRepository);
    }
}
