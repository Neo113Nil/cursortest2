package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel;

/* loaded from: classes12.dex */
public final class CancelCardConfirmationViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0356CancelCardConfirmationViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private CancelCardConfirmationViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0356CancelCardConfirmationViewModel_Factory c0356CancelCardConfirmationViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0356CancelCardConfirmationViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel create(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
        return this.getHighSpeedVideoFpsRangesFor.get(str, cancelCardInfo);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0356CancelCardConfirmationViewModel_Factory c0356CancelCardConfirmationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel_Factory_Impl(c0356CancelCardConfirmationViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0356CancelCardConfirmationViewModel_Factory c0356CancelCardConfirmationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel_Factory_Impl(c0356CancelCardConfirmationViewModel_Factory));
    }
}
