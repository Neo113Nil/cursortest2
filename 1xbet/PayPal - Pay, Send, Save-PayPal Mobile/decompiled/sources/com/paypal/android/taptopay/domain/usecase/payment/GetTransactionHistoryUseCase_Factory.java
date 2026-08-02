package com.paypal.android.taptopay.domain.usecase.payment;

/* loaded from: classes10.dex */
public final class GetTransactionHistoryUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> Camera2StreamConfigurationMap;

    public GetTransactionHistoryUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase newInstance(com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        return new com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase(transactionRepository);
    }
}
