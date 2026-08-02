package com.paypal.android.taptopay.domain.di;

/* loaded from: classes10.dex */
public final class RepositoryProviderModule_ProvidePaymentRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.android.taptopay.domain.di.RepositoryProviderModule getHighSpeedVideoSizes;

    public RepositoryProviderModule_ProvidePaymentRepositoryFactory(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper> provider) {
        this.getHighSpeedVideoSizes = repositoryProviderModule;
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository get() {
        return providePaymentRepository(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.domain.di.RepositoryProviderModule_ProvidePaymentRepositoryFactory create(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper> provider) {
        return new com.paypal.android.taptopay.domain.di.RepositoryProviderModule_ProvidePaymentRepositoryFactory(repositoryProviderModule, provider);
    }

    public static com.paypal.android.taptopay.domain.repository.payment.PaymentRepository providePaymentRepository(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper paymentRepositoryWrapper) {
        return (com.paypal.android.taptopay.domain.repository.payment.PaymentRepository) dagger.internal.Preconditions.checkNotNullFromProvides(repositoryProviderModule.providePaymentRepository(paymentRepositoryWrapper));
    }
}
