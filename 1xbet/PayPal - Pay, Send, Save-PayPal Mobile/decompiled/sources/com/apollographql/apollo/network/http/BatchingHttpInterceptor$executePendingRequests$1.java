package com.apollographql.apollo.network.http;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor", f = "BatchingHttpInterceptor.kt", i = {0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "executePendingRequests", n = {"$this$withLock_u24default$iv", "pending", "exception", "responseHeader"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class BatchingHttpInterceptor$executePendingRequests$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.apollographql.apollo.network.http.BatchingHttpInterceptor getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes(false, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchingHttpInterceptor$executePendingRequests$1(com.apollographql.apollo.network.http.BatchingHttpInterceptor batchingHttpInterceptor, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$1> continuation) {
        super(continuation);
        this.getInputFormats = batchingHttpInterceptor;
    }
}
