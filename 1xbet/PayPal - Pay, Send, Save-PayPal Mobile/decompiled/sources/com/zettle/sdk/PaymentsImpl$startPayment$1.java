package com.zettle.sdk;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.PaymentsImpl", f = "Payments.kt", i = {}, l = {44}, m = "startPayment", n = {}, s = {})
/* loaded from: classes16.dex */
final class PaymentsImpl$startPayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.PaymentsImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.startPayment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentsImpl$startPayment$1(com.zettle.sdk.PaymentsImpl paymentsImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.PaymentsImpl$startPayment$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = paymentsImpl;
    }
}
