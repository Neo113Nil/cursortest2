package com.paypal.android.taptopay.domain.di;

/* loaded from: classes10.dex */
public final class RepositoryProviderModule_ProvideTransactionRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.payment.TransactionRepository> {
    private final com.paypal.android.taptopay.domain.di.RepositoryProviderModule getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper> getHighSpeedVideoSizes;

    public RepositoryProviderModule_ProvideTransactionRepositoryFactory(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = repositoryProviderModule;
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository get() {
        return provideTransactionRepository(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.di.RepositoryProviderModule_ProvideTransactionRepositoryFactory create(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper> provider) {
        return new com.paypal.android.taptopay.domain.di.RepositoryProviderModule_ProvideTransactionRepositoryFactory(repositoryProviderModule, provider);
    }

    public static com.paypal.android.taptopay.domain.repository.payment.TransactionRepository provideTransactionRepository(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper transactionRepositoryWrapper) {
        return (com.paypal.android.taptopay.domain.repository.payment.TransactionRepository) dagger.internal.Preconditions.checkNotNullFromProvides(repositoryProviderModule.provideTransactionRepository(transactionRepositoryWrapper));
    }
}
