package com.paypal.android.taptopay.domain.repository.payment;

/* loaded from: classes10.dex */
public final class TransactionRepositoryWrapper_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> getHighSpeedVideoSizes;

    public TransactionRepositoryWrapper_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> provider3) {
        return new com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper newInstance(com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository, com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository2, com.paypal.android.taptopay.domain.di.ImplementationSelector implementationSelector) {
        return new com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper(transactionRepository, transactionRepository2, implementationSelector);
    }
}
