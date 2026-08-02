package com.ingo.sdk.kotlin.common.features.confirm_amount;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi", f = "ConfirmAmountApi.kt", i = {0, 1, 1}, l = {103, 42}, m = "confirmAmount", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class ConfirmAmountApi$confirmAmount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.confirmAmount(0L, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmAmountApi$confirmAmount$1(com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi confirmAmountApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi$confirmAmount$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = confirmAmountApi;
    }
}
