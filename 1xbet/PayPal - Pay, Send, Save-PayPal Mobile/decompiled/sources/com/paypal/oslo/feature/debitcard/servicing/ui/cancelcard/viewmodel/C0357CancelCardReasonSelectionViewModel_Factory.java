package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0357CancelCardReasonSelectionViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionReducer> getHighSpeedVideoFpsRangesFor;

    private C0357CancelCardReasonSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionReducer> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel get(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
        return newInstance(cancelCardInfo, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0357CancelCardReasonSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionReducer> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.C0357CancelCardReasonSelectionViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionReducer cancelCardReasonSelectionReducer) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel(cancelCardInfo, cancelCardReasonSelectionReducer);
    }
}
