package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

/* loaded from: classes12.dex */
public final class DebitCardApplyAndCreateSideEffectsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase> Camera2StreamConfigurationMap;

    private DebitCardApplyAndCreateSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase> provider) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware newInstance(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.ProvisionDebitInstrumentUseCase provisionDebitInstrumentUseCase) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateSideEffectsMiddleware(provisionDebitInstrumentUseCase);
    }
}
