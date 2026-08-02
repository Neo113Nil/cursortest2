package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

/* loaded from: classes12.dex */
public final class DeactivateContactlessSheetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware> getHighResolutionOutputSizeshNQ4ISI;

    private DeactivateContactlessSheetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetReducer deactivateContactlessSheetReducer, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetSideEffectsMiddleware deactivateContactlessSheetSideEffectsMiddleware) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel(deactivateContactlessSheetReducer, deactivateContactlessSheetSideEffectsMiddleware);
    }
}
