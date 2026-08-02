package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class GetDebitCardWidgetUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> getHighSpeedVideoFpsRangesFor;

    private GetDebitCardWidgetUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase(debitCardServicingRepository);
    }
}
