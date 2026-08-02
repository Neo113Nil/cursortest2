package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent cancelCardReasonSelectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReasonSelectionEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel) this.receiver).processEvent(cancelCardReasonSelectionEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEvent cancelCardReasonSelectionEvent) {
        getHighSpeedVideoFpsRanges(cancelCardReasonSelectionEvent);
        return kotlin.Unit.INSTANCE;
    }

    CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
