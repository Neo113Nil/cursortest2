package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl", f = "PaymentRepositoryImpl.kt", i = {0, 0}, l = {55}, m = "getQrcSession", n = {"request", "input"}, nl = {66}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentRepositoryImpl$getQrcSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getQrcSession(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRepositoryImpl$getQrcSession$1(com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl paymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$getQrcSession$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = paymentRepositoryImpl;
    }
}
