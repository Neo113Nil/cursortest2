package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", i = {}, l = {130}, m = "receiveMessageMap", n = {}, s = {})
/* loaded from: classes.dex */
final class WsProtocol$receiveMessageMap$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.ws.WsProtocol getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.receiveMessageMap(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WsProtocol$receiveMessageMap$1(com.apollographql.apollo.network.ws.WsProtocol wsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = wsProtocol;
    }
}
