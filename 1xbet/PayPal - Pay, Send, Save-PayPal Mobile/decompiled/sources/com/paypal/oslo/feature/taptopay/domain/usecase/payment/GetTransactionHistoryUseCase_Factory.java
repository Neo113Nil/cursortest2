package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

/* loaded from: classes15.dex */
public final class GetTransactionHistoryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> Camera2StreamConfigurationMap;

    private GetTransactionHistoryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase(transactionRepository);
    }
}
