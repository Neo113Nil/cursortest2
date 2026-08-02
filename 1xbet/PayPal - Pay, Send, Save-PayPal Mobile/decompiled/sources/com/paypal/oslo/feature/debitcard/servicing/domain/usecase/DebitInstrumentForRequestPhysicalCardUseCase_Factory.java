package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class DebitInstrumentForRequestPhysicalCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DebitInstrumentForRequestPhysicalCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase(debitCardServicingRepository);
    }
}
