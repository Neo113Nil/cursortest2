package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvidePaymentFundingInstrumentsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvidePaymentFundingInstrumentsRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository get() {
        return providePaymentFundingInstrumentsRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvidePaymentFundingInstrumentsRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvidePaymentFundingInstrumentsRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository providePaymentFundingInstrumentsRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl paymentFundingInstrumentsRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.providePaymentFundingInstrumentsRepository(paymentFundingInstrumentsRepositoryImpl));
    }
}
