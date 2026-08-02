package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class RepaymentsScreenKt$RepaymentsScreen$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent repaymentsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel) this.receiver).processEvent(repaymentsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent repaymentsEvent) {
        getHighSpeedVideoFpsRangesFor(repaymentsEvent);
        return kotlin.Unit.INSTANCE;
    }

    RepaymentsScreenKt$RepaymentsScreen$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;)V", 0);
    }
}
