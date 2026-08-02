package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class GetDebitPinUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> getHighSpeedVideoFpsRangesFor;

    private GetDebitPinUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitPinUseCase(debitCardServicingRepository);
    }
}
