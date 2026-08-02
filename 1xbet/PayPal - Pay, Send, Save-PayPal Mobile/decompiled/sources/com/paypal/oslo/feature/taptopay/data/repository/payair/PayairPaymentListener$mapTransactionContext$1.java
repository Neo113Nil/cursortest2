package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener", f = "PayairPaymentListener.kt", i = {0, 0, 0, 0}, l = {135}, m = "mapTransactionContext", n = {"transactionEventData", "networkTokenReference", "convertedAmount", "rawAmount"}, nl = {136}, s = {"L$0", "L$1", "L$2", "D$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayairPaymentListener$mapTransactionContext$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    double getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.access$mapTransactionContext(this.getInputSizeshNQ4ISI, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairPaymentListener$mapTransactionContext$1(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$mapTransactionContext$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = payairPaymentListener;
    }
}
