package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideUpdateApplicationRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideUpdateApplicationRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository get() {
        return provideUpdateApplicationRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideUpdateApplicationRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideUpdateApplicationRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository provideUpdateApplicationRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl updateApplicationRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideUpdateApplicationRepository(updateApplicationRepositoryImpl));
    }
}
