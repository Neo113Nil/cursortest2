package com.paypal.oslo.feature.taptopay.data.payair.init;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer", f = "PayairInitializer.kt", i = {0, 0}, l = {76}, m = "init", n = {"paymentActivity", "baseUrl"}, nl = {80}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PayairInitializer$init$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.init(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairInitializer$init$1(com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer payairInitializer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer$init$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = payairInitializer;
    }
}
