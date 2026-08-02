package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPayDataModule_ProvideThalesTransactionRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> getHighSpeedVideoFpsRangesFor;

    public ThalesTapToPayDataModule_ProvideThalesTransactionRepositoryFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository get() {
        return provideThalesTransactionRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPayDataModule_ProvideThalesTransactionRepositoryFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> provider) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPayDataModule_ProvideThalesTransactionRepositoryFactory(provider);
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository provideThalesTransactionRepository(com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource) {
        return (com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPayDataModule.INSTANCE.provideThalesTransactionRepository(transactionDataSource));
    }
}
