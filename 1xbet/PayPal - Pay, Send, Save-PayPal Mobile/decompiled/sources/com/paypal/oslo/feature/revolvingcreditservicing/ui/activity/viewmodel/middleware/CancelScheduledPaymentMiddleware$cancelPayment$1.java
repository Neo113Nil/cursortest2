package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware", f = "CancelScheduledPaymentMiddleware.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {62, 65}, m = "cancelPayment", n = {"repaymentId", "creditAccountId", "creditProductIdentifier", "eventDispatcher", "request", "repaymentId", "creditAccountId", "creditProductIdentifier", "eventDispatcher", "request", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-CancelScheduledPaymentMiddleware$cancelPayment$3"}, nl = {72, 66}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class CancelScheduledPaymentMiddleware$cancelPayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputSizes = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor(null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelScheduledPaymentMiddleware$cancelPayment$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware cancelScheduledPaymentMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware$cancelPayment$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = cancelScheduledPaymentMiddleware;
    }
}
