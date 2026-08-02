package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

/* loaded from: classes15.dex */
public final class ObserveTransactionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> getHighSpeedVideoFpsRangesFor;

    private ObserveTransactionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase(transactionRepository);
    }
}
