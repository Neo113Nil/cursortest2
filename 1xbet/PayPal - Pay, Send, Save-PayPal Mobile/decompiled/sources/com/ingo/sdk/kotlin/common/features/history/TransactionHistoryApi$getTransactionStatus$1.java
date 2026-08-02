package com.ingo.sdk.kotlin.common.features.history;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi", f = "TransactionHistoryApi.kt", i = {0, 1, 1}, l = {72, 43}, m = "getTransactionStatus", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class TransactionHistoryApi$getTransactionStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getTransactionStatus(0, 0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionHistoryApi$getTransactionStatus$1(com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi transactionHistoryApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi$getTransactionStatus$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = transactionHistoryApi;
    }
}
