package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl", f = "PaymentRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {116}, m = "confirmQrcodePayment", n = {"request", "sessionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "input"}, nl = {120}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentRepositoryImpl$confirmQrcodePayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.confirmQrcodePayment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRepositoryImpl$confirmQrcodePayment$1(com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl paymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$confirmQrcodePayment$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = paymentRepositoryImpl;
    }
}
