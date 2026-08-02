package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl", f = "PaymentRequestRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {85}, m = "startPaymentTransferAttemptForSubflow", n = {"requestId", "raise$iv$iv$iv", "$this$startPaymentTransferAttemptForSubflow_u24lambda_u240", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$2"}, nl = {89}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.startPaymentTransferAttemptForSubflow(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1(com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl paymentRequestRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl$startPaymentTransferAttemptForSubflow$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = paymentRequestRepositoryImpl;
    }
}
