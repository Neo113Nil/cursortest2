package com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase;

/* loaded from: classes12.dex */
public final class ProvisionDebitInstrumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository> getHighSpeedVideoFpsRangesFor;

    private ProvisionDebitInstrumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase newInstance(com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository debitCardAcquisitionRepository) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase(debitCardAcquisitionRepository);
    }
}
