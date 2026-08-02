package com.apollographql.apollo.network.http;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor", f = "BatchingHttpInterceptor.kt", i = {1, 1, 2, 2, 2}, l = {96, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 109, 121}, m = "intercept", n = {"pendingRequest", "$this$withLock_u24default$iv", "pendingRequest", "$this$withLock_u24default$iv", "batchFull"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
final class BatchingHttpInterceptor$intercept$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.apollographql.apollo.network.http.BatchingHttpInterceptor getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.intercept(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchingHttpInterceptor$intercept$1(com.apollographql.apollo.network.http.BatchingHttpInterceptor batchingHttpInterceptor, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1> continuation) {
        super(continuation);
        this.getOutputFormats = batchingHttpInterceptor;
    }
}
