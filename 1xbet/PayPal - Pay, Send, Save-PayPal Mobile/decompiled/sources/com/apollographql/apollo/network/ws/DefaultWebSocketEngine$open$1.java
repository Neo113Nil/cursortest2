package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", i = {0, 0}, l = {85}, m = "open", n = {"messageChannel", "webSocket"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class DefaultWebSocketEngine$open$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.ws.DefaultWebSocketEngine getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.open(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketEngine$open$1(com.apollographql.apollo.network.ws.DefaultWebSocketEngine defaultWebSocketEngine, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = defaultWebSocketEngine;
    }
}
