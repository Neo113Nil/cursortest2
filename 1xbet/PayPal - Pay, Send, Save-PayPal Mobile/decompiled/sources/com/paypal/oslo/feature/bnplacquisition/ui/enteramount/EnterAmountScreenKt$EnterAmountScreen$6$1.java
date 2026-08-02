package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class EnterAmountScreenKt$EnterAmountScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent enterAmountEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel) this.receiver).processEvent(enterAmountEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent enterAmountEvent) {
        getHighSpeedVideoFpsRangesFor(enterAmountEvent);
        return kotlin.Unit.INSTANCE;
    }

    EnterAmountScreenKt$EnterAmountScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;)V", 0);
    }
}
