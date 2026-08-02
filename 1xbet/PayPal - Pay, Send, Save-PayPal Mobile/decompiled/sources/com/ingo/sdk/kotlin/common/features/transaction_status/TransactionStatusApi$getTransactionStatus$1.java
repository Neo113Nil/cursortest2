package com.ingo.sdk.kotlin.common.features.transaction_status;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi", f = "TransactionStatusApi.kt", i = {0, 1, 1}, l = {69, 40}, m = "getTransactionStatus", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class TransactionStatusApi$getTransactionStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getTransactionStatus(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionStatusApi$getTransactionStatus$1(com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi transactionStatusApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi$getTransactionStatus$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = transactionStatusApi;
    }
}
