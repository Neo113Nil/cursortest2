package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CancelCardConfirmationScreenKt$CancelCardConfirmationScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent cancelCardConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardConfirmationEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel) this.receiver).processEvent(cancelCardConfirmationEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationEvent cancelCardConfirmationEvent) {
        getHighSpeedVideoFpsRangesFor(cancelCardConfirmationEvent);
        return kotlin.Unit.INSTANCE;
    }

    CancelCardConfirmationScreenKt$CancelCardConfirmationScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardConfirmationViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
