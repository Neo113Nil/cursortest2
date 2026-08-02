package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideProductOffersRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ProductOffersRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideProductOffersRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ProductOffersRepositoryImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository get() {
        return provideProductOffersRepository(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideProductOffersRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ProductOffersRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideProductOffersRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository provideProductOffersRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.ProductOffersRepositoryImpl productOffersRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.ProductOffersRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideProductOffersRepository(productOffersRepositoryImpl));
    }
}
