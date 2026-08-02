package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware", f = "FetchPaymentOptionsMiddleware.kt", i = {0, 0, 0}, l = {106}, m = "successData", n = {"paymentOptions", "creditProductIdentifier", "resolvedCreditAccountId"}, nl = {111}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class FetchPaymentOptionsMiddleware$successData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPaymentOptionsMiddleware$successData$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware fetchPaymentOptionsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1> continuation) {
        super(continuation);
        this.getInputFormats = fetchPaymentOptionsMiddleware;
    }
}
