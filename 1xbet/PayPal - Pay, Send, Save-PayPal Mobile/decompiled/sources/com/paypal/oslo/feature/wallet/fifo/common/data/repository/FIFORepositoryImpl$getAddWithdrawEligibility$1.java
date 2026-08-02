package com.paypal.oslo.feature.wallet.fifo.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl", f = "FIFORepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {62}, m = "getAddWithdrawEligibility", n = {"input", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$getAddWithdrawEligibility_u24lambda_u241", "transferCapabilitiesEvaluationInput", "query", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-FIFORepositoryImpl$getAddWithdrawEligibility$3"}, nl = {63}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class FIFORepositoryImpl$getAddWithdrawEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl isOutputSupportedForhNQ4ISI;
    /* synthetic */ java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.unwrapAs = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.getAddWithdrawEligibility(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FIFORepositoryImpl$getAddWithdrawEligibility$1(com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl fIFORepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAddWithdrawEligibility$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = fIFORepositoryImpl;
    }
}
