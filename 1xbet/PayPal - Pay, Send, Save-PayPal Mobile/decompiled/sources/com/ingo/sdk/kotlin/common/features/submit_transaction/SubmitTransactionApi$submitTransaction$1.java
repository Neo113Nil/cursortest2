package com.ingo.sdk.kotlin.common.features.submit_transaction;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi", f = "SubmitTransactionApi.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 61}, m = "submitTransaction", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class SubmitTransactionApi$submitTransaction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.submitTransaction(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitTransactionApi$submitTransaction$1(com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi submitTransactionApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi$submitTransaction$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = submitTransactionApi;
    }
}
