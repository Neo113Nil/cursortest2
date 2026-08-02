package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideSubmitCreditApplicationRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl> getHighSpeedVideoFpsRangesFor;

    private RepositoryModule_ProvideSubmitCreditApplicationRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository get() {
        return provideSubmitCreditApplicationRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideSubmitCreditApplicationRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideSubmitCreditApplicationRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository provideSubmitCreditApplicationRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl submitCreditApplicationRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideSubmitCreditApplicationRepository(submitCreditApplicationRepositoryImpl));
    }
}
