package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel;

/* loaded from: classes12.dex */
public final class ReportCardReasonSelectionViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.C0366ReportCardReasonSelectionViewModel_Factory getHighSpeedVideoFpsRanges;

    private ReportCardReasonSelectionViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.C0366ReportCardReasonSelectionViewModel_Factory c0366ReportCardReasonSelectionViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0366ReportCardReasonSelectionViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return this.getHighSpeedVideoFpsRanges.get(cardReplacementInfo);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.C0366ReportCardReasonSelectionViewModel_Factory c0366ReportCardReasonSelectionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel_Factory_Impl(c0366ReportCardReasonSelectionViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.C0366ReportCardReasonSelectionViewModel_Factory c0366ReportCardReasonSelectionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel_Factory_Impl(c0366ReportCardReasonSelectionViewModel_Factory));
    }
}
