package com.paypal.oslo.feature.wallet.fifo.common.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl", f = "FIFORepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {104}, m = "getAccountBalances", n = {"combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$getAccountBalances_u24lambda_u241", "query", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-FIFORepositoryImpl$getAccountBalances$3"}, nl = {105}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class FIFORepositoryImpl$getAccountBalances$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.getAccountBalances(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FIFORepositoryImpl$getAccountBalances$1(com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl fIFORepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.common.data.repository.FIFORepositoryImpl$getAccountBalances$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = fIFORepositoryImpl;
    }
}
