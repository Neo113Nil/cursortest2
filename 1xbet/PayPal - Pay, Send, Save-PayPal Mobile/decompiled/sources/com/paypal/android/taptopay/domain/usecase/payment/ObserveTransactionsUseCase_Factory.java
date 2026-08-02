package com.paypal.android.taptopay.domain.usecase.payment;

/* loaded from: classes10.dex */
public final class ObserveTransactionsUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.payment.ObserveTransactionsUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> getHighSpeedVideoSizes;

    public ObserveTransactionsUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.payment.ObserveTransactionsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.ObserveTransactionsUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.payment.ObserveTransactionsUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.ObserveTransactionsUseCase newInstance(com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        return new com.paypal.android.taptopay.domain.usecase.payment.ObserveTransactionsUseCase(transactionRepository);
    }
}
