package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

/* loaded from: classes15.dex */
public final class GetWithdrawalOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository> getHighSpeedVideoFpsRangesFor;

    private GetWithdrawalOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository withdrawMoneyRepository) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase(withdrawMoneyRepository);
    }
}
