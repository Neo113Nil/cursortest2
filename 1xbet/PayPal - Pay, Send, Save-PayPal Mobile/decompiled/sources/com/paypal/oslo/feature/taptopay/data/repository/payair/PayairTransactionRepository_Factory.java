package com.paypal.oslo.feature.taptopay.data.repository.payair;

/* loaded from: classes15.dex */
public final class PayairTransactionRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository> {
    private final dagger.internal.Provider<com.payair.logic.managers.TransactionHistoryManager> getHighSpeedVideoFpsRanges;

    private PayairTransactionRepository_Factory(dagger.internal.Provider<com.payair.logic.managers.TransactionHistoryManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository_Factory create(dagger.internal.Provider<com.payair.logic.managers.TransactionHistoryManager> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository newInstance(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository(transactionHistoryManager);
    }
}
