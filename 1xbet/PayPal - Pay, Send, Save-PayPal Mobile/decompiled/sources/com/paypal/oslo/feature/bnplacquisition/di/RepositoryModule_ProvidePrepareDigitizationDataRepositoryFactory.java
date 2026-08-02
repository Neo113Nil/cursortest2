package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvidePrepareDigitizationDataRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.PrepareDigitizationDataRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvidePrepareDigitizationDataRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.PrepareDigitizationDataRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository get() {
        return providePrepareDigitizationDataRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvidePrepareDigitizationDataRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.PrepareDigitizationDataRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvidePrepareDigitizationDataRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository providePrepareDigitizationDataRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.PrepareDigitizationDataRepositoryImpl prepareDigitizationDataRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.providePrepareDigitizationDataRepository(prepareDigitizationDataRepositoryImpl));
    }
}
