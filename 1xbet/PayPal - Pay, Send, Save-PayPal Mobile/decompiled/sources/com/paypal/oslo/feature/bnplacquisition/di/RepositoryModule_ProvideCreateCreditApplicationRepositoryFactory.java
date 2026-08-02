package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideCreateCreditApplicationRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideCreateCreditApplicationRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository get() {
        return provideCreateCreditApplicationRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideCreateCreditApplicationRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideCreateCreditApplicationRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository provideCreateCreditApplicationRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl createCreditApplicationRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideCreateCreditApplicationRepository(createCreditApplicationRepositoryImpl));
    }
}
