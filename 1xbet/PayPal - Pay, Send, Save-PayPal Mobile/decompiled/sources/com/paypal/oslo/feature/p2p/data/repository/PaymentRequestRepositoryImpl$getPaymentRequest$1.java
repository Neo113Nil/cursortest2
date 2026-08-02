package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl", f = "PaymentRequestRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {52}, m = "getPaymentRequest", n = {"id", "type", "raise$iv$iv$iv", "$this$getPaymentRequest_u24lambda_u240", "graphqlType", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PaymentRequestRepositoryImpl$getPaymentRequest$2"}, nl = {56}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PaymentRequestRepositoryImpl$getPaymentRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.getPaymentRequest(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRequestRepositoryImpl$getPaymentRequest$1(com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl paymentRequestRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$getPaymentRequest$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = paymentRequestRepositoryImpl;
    }
}
