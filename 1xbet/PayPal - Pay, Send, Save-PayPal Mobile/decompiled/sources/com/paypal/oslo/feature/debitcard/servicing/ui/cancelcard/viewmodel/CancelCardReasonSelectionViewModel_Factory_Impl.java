package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel;

/* loaded from: classes12.dex */
public final class CancelCardReasonSelectionViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0357CancelCardReasonSelectionViewModel_Factory Camera2StreamConfigurationMap;

    private CancelCardReasonSelectionViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0357CancelCardReasonSelectionViewModel_Factory c0357CancelCardReasonSelectionViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0357CancelCardReasonSelectionViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
        return this.Camera2StreamConfigurationMap.get(cancelCardInfo);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0357CancelCardReasonSelectionViewModel_Factory c0357CancelCardReasonSelectionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel_Factory_Impl(c0357CancelCardReasonSelectionViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0357CancelCardReasonSelectionViewModel_Factory c0357CancelCardReasonSelectionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel_Factory_Impl(c0357CancelCardReasonSelectionViewModel_Factory));
    }
}
