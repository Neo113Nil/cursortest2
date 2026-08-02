package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideCloseLoanRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideCloseLoanRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository get() {
        return provideCloseLoanRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideCloseLoanRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideCloseLoanRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository provideCloseLoanRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl closeCreditLoanRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideCloseLoanRepository(closeCreditLoanRepositoryImpl));
    }
}
