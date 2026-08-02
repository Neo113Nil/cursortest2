package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PaymentSummaryScreenKt$PaymentSummaryScreen$3$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent paymentSummaryEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel) this.receiver).processEvent(paymentSummaryEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent paymentSummaryEvent) {
        getHighSpeedVideoFpsRanges(paymentSummaryEvent);
        return kotlin.Unit.INSTANCE;
    }

    PaymentSummaryScreenKt$PaymentSummaryScreen$3$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;)V", 0);
    }
}
