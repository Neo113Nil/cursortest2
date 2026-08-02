package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware", f = "PaymentSummarySideEffectMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {75, 84, 87, 88}, m = "fetchPaymentSummary", n = {"eventDispatcher", "currentCreditAccountId", "cachedOverview", "eventDispatcher", "currentCreditAccountId", "cachedOverview", "request", "eventDispatcher", "currentCreditAccountId", "cachedOverview", "request", "this_$iv", "result", "$i$f$fold", "$i$a$-fold-PaymentSummarySideEffectMiddleware$fetchPaymentSummary$3", "eventDispatcher", "currentCreditAccountId", "cachedOverview", "request", "this_$iv", "result", "$i$f$fold", "$i$a$-fold-PaymentSummarySideEffectMiddleware$fetchPaymentSummary$4"}, nl = {76, 85, 143, 144}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware paymentSummarySideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = paymentSummarySideEffectMiddleware;
    }
}
