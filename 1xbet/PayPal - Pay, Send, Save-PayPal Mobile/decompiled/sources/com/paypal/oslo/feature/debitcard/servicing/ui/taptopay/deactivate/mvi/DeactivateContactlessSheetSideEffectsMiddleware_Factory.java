package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi;

/* loaded from: classes12.dex */
public final class DeactivateContactlessSheetSideEffectsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi> getHighResolutionOutputSizeshNQ4ISI;

    private DeactivateContactlessSheetSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware newInstance(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi deleteCardApi) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware(deleteCardApi);
    }
}
