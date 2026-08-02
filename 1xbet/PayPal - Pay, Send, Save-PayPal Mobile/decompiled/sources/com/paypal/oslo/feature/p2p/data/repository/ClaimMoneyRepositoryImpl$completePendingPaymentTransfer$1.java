package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl", f = "ClaimMoneyRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {89}, m = "completePendingPaymentTransfer", n = {"transactionId", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$completePendingPaymentTransfer_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$3"}, nl = {95}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes5.dex */
final class ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.completePendingPaymentTransfer(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1(com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl claimMoneyRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl$completePendingPaymentTransfer$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = claimMoneyRepositoryImpl;
    }
}
