package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideLoanConstraintsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.LoanConstraintsRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideLoanConstraintsRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.LoanConstraintsRepositoryImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository get() {
        return provideLoanConstraintsRepository(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideLoanConstraintsRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.LoanConstraintsRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideLoanConstraintsRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository provideLoanConstraintsRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.LoanConstraintsRepositoryImpl loanConstraintsRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideLoanConstraintsRepository(loanConstraintsRepositoryImpl));
    }
}
