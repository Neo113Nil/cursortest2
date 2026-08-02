package com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase;

/* loaded from: classes15.dex */
public final class GetConsumerAgreementsByFundingInstrumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository> getHighSpeedVideoSizes;

    private GetConsumerAgreementsByFundingInstrumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository> provider) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase newInstance(com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository bulkUpdateFiRepository) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase(bulkUpdateFiRepository);
    }
}
