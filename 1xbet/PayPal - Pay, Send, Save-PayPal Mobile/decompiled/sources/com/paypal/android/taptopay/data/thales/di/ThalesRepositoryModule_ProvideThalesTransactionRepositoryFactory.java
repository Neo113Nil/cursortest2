package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class ThalesRepositoryModule_ProvideThalesTransactionRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> Camera2StreamConfigurationMap;
    private final com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule getHighSpeedVideoFpsRangesFor;

    public ThalesRepositoryModule_ProvideThalesTransactionRepositoryFactory(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> provider) {
        this.getHighSpeedVideoFpsRangesFor = thalesRepositoryModule;
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository get() {
        return provideThalesTransactionRepository(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule_ProvideThalesTransactionRepositoryFactory create(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> provider) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule_ProvideThalesTransactionRepositoryFactory(thalesRepositoryModule, provider);
    }

    public static com.paypal.android.taptopay.domain.repository.payment.TransactionRepository provideThalesTransactionRepository(com.paypal.android.taptopay.data.thales.di.ThalesRepositoryModule thalesRepositoryModule, com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource) {
        return (com.paypal.android.taptopay.domain.repository.payment.TransactionRepository) dagger.internal.Preconditions.checkNotNullFromProvides(thalesRepositoryModule.provideThalesTransactionRepository(transactionDataSource));
    }
}
