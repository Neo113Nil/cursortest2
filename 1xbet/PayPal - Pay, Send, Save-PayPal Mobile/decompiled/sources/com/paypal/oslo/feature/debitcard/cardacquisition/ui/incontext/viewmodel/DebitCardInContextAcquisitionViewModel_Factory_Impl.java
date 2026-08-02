package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardInContextAcquisitionViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.C0350DebitCardInContextAcquisitionViewModel_Factory Camera2StreamConfigurationMap;

    private DebitCardInContextAcquisitionViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.C0350DebitCardInContextAcquisitionViewModel_Factory c0350DebitCardInContextAcquisitionViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0350DebitCardInContextAcquisitionViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return this.Camera2StreamConfigurationMap.get(debitCardProductName);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.Factory> create(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.C0350DebitCardInContextAcquisitionViewModel_Factory c0350DebitCardInContextAcquisitionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel_Factory_Impl(c0350DebitCardInContextAcquisitionViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.C0350DebitCardInContextAcquisitionViewModel_Factory c0350DebitCardInContextAcquisitionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel_Factory_Impl(c0350DebitCardInContextAcquisitionViewModel_Factory));
    }
}
