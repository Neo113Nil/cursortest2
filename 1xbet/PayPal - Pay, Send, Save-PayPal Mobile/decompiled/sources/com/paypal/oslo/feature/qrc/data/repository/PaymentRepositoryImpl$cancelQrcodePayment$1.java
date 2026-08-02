package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl", f = "PaymentRepositoryImpl.kt", i = {0, 0}, l = {147}, m = "cancelQrcodePayment", n = {"request", "input"}, nl = {151}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentRepositoryImpl$cancelQrcodePayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.cancelQrcodePayment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRepositoryImpl$cancelQrcodePayment$1(com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl paymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$cancelQrcodePayment$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = paymentRepositoryImpl;
    }
}
