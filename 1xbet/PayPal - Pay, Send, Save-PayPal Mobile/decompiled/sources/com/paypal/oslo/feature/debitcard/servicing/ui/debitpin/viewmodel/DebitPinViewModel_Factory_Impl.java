package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel;

/* loaded from: classes12.dex */
public final class DebitPinViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.C0359DebitPinViewModel_Factory getHighSpeedVideoSizes;

    private DebitPinViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.C0359DebitPinViewModel_Factory c0359DebitPinViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0359DebitPinViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel create(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode) {
        return this.getHighSpeedVideoSizes.get(str, setDebitPinFlowType, debitPinMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.C0359DebitPinViewModel_Factory c0359DebitPinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel_Factory_Impl(c0359DebitPinViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.C0359DebitPinViewModel_Factory c0359DebitPinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel_Factory_Impl(c0359DebitPinViewModel_Factory));
    }
}
