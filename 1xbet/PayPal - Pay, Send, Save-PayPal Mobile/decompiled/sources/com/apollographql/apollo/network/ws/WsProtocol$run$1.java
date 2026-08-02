package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", i = {0}, l = {143}, m = "run$suspendImpl", n = {"$this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class WsProtocol$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.network.ws.WsProtocol getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.apollographql.apollo.network.ws.WsProtocol.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WsProtocol$run$1(com.apollographql.apollo.network.ws.WsProtocol wsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WsProtocol$run$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = wsProtocol;
    }
}
