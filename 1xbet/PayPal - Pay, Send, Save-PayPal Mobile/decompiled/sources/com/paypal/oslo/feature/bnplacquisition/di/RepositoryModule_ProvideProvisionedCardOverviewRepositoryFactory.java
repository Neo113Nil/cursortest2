package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideProvisionedCardOverviewRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ProvisionedCardOverviewRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideProvisionedCardOverviewRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ProvisionedCardOverviewRepositoryImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository get() {
        return provideProvisionedCardOverviewRepository(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideProvisionedCardOverviewRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ProvisionedCardOverviewRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideProvisionedCardOverviewRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository provideProvisionedCardOverviewRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.ProvisionedCardOverviewRepositoryImpl provisionedCardOverviewRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideProvisionedCardOverviewRepository(provisionedCardOverviewRepositoryImpl));
    }
}
