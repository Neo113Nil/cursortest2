package com.paypal.oslo.feature.taptopay.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl", f = "PreTransactionManagerImpl.kt", i = {0}, l = {63}, m = "onHomeResumed", n = {"activity"}, nl = {65}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PreTransactionManagerImpl$onHomeResumed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.onHomeResumed(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreTransactionManagerImpl$onHomeResumed$1(com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl preTransactionManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl$onHomeResumed$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = preTransactionManagerImpl;
    }
}
