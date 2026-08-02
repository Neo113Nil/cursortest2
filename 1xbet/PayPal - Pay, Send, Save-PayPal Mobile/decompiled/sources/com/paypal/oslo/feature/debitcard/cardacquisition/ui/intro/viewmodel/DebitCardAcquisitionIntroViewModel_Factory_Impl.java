package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0352DebitCardAcquisitionIntroViewModel_Factory Camera2StreamConfigurationMap;

    private DebitCardAcquisitionIntroViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0352DebitCardAcquisitionIntroViewModel_Factory c0352DebitCardAcquisitionIntroViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0352DebitCardAcquisitionIntroViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return this.Camera2StreamConfigurationMap.get(debitCardProductName);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.Factory> create(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0352DebitCardAcquisitionIntroViewModel_Factory c0352DebitCardAcquisitionIntroViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel_Factory_Impl(c0352DebitCardAcquisitionIntroViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0352DebitCardAcquisitionIntroViewModel_Factory c0352DebitCardAcquisitionIntroViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel_Factory_Impl(c0352DebitCardAcquisitionIntroViewModel_Factory));
    }
}
