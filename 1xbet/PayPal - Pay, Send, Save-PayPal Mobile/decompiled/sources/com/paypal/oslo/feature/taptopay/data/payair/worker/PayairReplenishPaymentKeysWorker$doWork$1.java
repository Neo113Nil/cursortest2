package com.paypal.oslo.feature.taptopay.data.payair.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker", f = "PayairReplenishPaymentKeysWorker.kt", i = {0, 0}, l = {47}, m = "doWork", n = {"params", "$i$a$-let-PayairReplenishPaymentKeysWorker$doWork$2"}, nl = {86}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayairReplenishPaymentKeysWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairReplenishPaymentKeysWorker$doWork$1(com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker payairReplenishPaymentKeysWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker$doWork$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = payairReplenishPaymentKeysWorker;
    }
}
