package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideBnplPlansRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.BnplPlansRepositoryImpl> getHighSpeedVideoFpsRanges;

    private RepositoryModule_ProvideBnplPlansRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.BnplPlansRepositoryImpl> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository get() {
        return provideBnplPlansRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideBnplPlansRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.BnplPlansRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideBnplPlansRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository provideBnplPlansRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.BnplPlansRepositoryImpl bnplPlansRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideBnplPlansRepository(bnplPlansRepositoryImpl));
    }
}
