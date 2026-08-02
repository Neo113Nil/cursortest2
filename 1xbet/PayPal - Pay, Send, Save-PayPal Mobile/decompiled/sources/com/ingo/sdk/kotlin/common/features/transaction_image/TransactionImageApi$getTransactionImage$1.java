package com.ingo.sdk.kotlin.common.features.transaction_image;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi", f = "TransactionImageApi.kt", i = {0}, l = {65, 38, 38, 42}, m = "getTransactionImage", n = {"url"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class TransactionImageApi$getTransactionImage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getTransactionImage(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionImageApi$getTransactionImage$1(com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi transactionImageApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi$getTransactionImage$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = transactionImageApi;
    }
}
