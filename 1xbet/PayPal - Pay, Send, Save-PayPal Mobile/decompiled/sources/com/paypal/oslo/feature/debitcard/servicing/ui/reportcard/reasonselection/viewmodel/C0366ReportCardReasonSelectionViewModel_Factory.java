package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0366ReportCardReasonSelectionViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionReducer> getHighSpeedVideoFpsRanges;

    private C0366ReportCardReasonSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionReducer> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel get(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return newInstance(cardReplacementInfo, this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.C0366ReportCardReasonSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionReducer> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.C0366ReportCardReasonSelectionViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionReducer reportCardReasonSelectionReducer) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel(cardReplacementInfo, reportCardReasonSelectionReducer);
    }
}
