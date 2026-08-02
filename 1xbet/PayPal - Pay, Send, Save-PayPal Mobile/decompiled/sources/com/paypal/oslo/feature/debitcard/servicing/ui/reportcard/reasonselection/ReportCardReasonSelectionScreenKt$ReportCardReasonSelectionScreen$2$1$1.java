package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent reportCardReasonSelectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReasonSelectionEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel) this.receiver).processEvent(reportCardReasonSelectionEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEvent reportCardReasonSelectionEvent) {
        Camera2StreamConfigurationMap(reportCardReasonSelectionEvent);
        return kotlin.Unit.INSTANCE;
    }

    ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$2$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
