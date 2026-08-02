package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

/* loaded from: classes15.dex */
public final class WithdrawFundsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository> getHighSpeedVideoFpsRangesFor;

    private WithdrawFundsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.transfer.domain.repository.WithdrawMoneyRepository withdrawMoneyRepository) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase(withdrawMoneyRepository);
    }
}
