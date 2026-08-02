package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware", f = "FetchPaymentOptionsMiddleware.kt", i = {0, 0, 0, 0, 0}, l = {89}, m = "handleSuccess", n = {"paymentOptions", "state", "eventDispatcher", "maxAmount", "resolvedCreditAccountId"}, nl = {88}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes14.dex */
final class FetchPaymentOptionsMiddleware$handleSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPaymentOptionsMiddleware$handleSuccess$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware fetchPaymentOptionsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$handleSuccess$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = fetchPaymentOptionsMiddleware;
    }
}
