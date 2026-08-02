package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware", f = "ReviewPaymentUpdaterMiddleware.kt", i = {0, 0, 0}, l = {72}, m = "handleOnPaymentInfoUpdated", n = {"args", "date", "eventDispatcher"}, nl = {76}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware.access$handleOnPaymentInfoUpdated(this.getInputFormats, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware reviewPaymentUpdaterMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1> continuation) {
        super(continuation);
        this.getInputFormats = reviewPaymentUpdaterMiddleware;
    }
}
