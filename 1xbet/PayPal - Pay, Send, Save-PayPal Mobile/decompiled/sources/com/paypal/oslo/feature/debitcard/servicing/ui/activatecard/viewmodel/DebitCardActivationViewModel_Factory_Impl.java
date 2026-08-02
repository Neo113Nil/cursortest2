package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardActivationViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.C0355DebitCardActivationViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private DebitCardActivationViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.C0355DebitCardActivationViewModel_Factory c0355DebitCardActivationViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0355DebitCardActivationViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
        return this.getHighSpeedVideoFpsRangesFor.get(debitCardActivationInfo);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.C0355DebitCardActivationViewModel_Factory c0355DebitCardActivationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel_Factory_Impl(c0355DebitCardActivationViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.C0355DebitCardActivationViewModel_Factory c0355DebitCardActivationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel_Factory_Impl(c0355DebitCardActivationViewModel_Factory));
    }
}
