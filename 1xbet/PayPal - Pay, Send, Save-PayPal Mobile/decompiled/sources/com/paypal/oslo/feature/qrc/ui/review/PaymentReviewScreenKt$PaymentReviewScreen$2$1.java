package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PaymentReviewScreenKt$PaymentReviewScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel) this.receiver).handleIntent(paymentReviewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        getHighResolutionOutputSizeshNQ4ISI(paymentReviewEvent);
        return kotlin.Unit.INSTANCE;
    }

    PaymentReviewScreenKt$PaymentReviewScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.class, "handleIntent", "handleIntent(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;)V", 0);
    }
}
