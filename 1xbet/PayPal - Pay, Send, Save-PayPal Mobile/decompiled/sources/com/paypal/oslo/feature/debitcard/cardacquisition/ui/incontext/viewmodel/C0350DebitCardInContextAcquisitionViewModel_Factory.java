package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0350DebitCardInContextAcquisitionViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory> getHighSpeedVideoSizes;

    private C0350DebitCardInContextAcquisitionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return newInstance(debitCardProductName, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.C0350DebitCardInContextAcquisitionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory> provider2) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.C0350DebitCardInContextAcquisitionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionReducer debitCardInContextAcquisitionReducer, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel(debitCardProductName, debitCardInContextAcquisitionReducer, factory);
    }
}
