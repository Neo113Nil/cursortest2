package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware", f = "MakePaymentMiddleware.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {49, 72, 76}, m = "makePaymentRequest", n = {"state", "eventDispatcher", "readyInfo", "uiModel", "request", "state", "eventDispatcher", "readyInfo", "uiModel", "request", "result", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-MakePaymentMiddleware$makePaymentRequest$3", "state", "eventDispatcher", "readyInfo", "uiModel", "request", "result", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-MakePaymentMiddleware$makePaymentRequest$4"}, nl = {51, 73, 77}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class MakePaymentMiddleware$makePaymentRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakePaymentMiddleware$makePaymentRequest$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware makePaymentMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware$makePaymentRequest$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = makePaymentMiddleware;
    }
}
