package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl", f = "PaymentOptionsRepositoryImpl.kt", i = {0, 0}, l = {33}, m = "fetchPaymentOptions", n = {"request", "query"}, nl = {38}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentOptionsRepositoryImpl$fetchPaymentOptions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchPaymentOptions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentOptionsRepositoryImpl$fetchPaymentOptions$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl paymentOptionsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl$fetchPaymentOptions$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = paymentOptionsRepositoryImpl;
    }
}
