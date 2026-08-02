package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware", f = "PaymentSummarySideEffectMiddleware.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {131, 134}, m = "cancelPayment", n = {"eventDispatcher", "repaymentId", "creditAccountId", "request", "eventDispatcher", "repaymentId", "creditAccountId", "request", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-PaymentSummarySideEffectMiddleware$cancelPayment$3"}, nl = {141, 135}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummarySideEffectMiddleware$cancelPayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizes.Camera2StreamConfigurationMap(null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummarySideEffectMiddleware$cancelPayment$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware paymentSummarySideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$cancelPayment$1> continuation) {
        super(continuation);
        this.getOutputSizes = paymentSummarySideEffectMiddleware;
    }
}
