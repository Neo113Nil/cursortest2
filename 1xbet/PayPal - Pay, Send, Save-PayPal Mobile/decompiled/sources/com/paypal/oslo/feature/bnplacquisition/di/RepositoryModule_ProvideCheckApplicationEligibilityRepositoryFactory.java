package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideCheckApplicationEligibilityRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideCheckApplicationEligibilityRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository get() {
        return provideCheckApplicationEligibilityRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideCheckApplicationEligibilityRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideCheckApplicationEligibilityRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository provideCheckApplicationEligibilityRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl checkApplicationEligibilityRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideCheckApplicationEligibilityRepository(checkApplicationEligibilityRepositoryImpl));
    }
}
