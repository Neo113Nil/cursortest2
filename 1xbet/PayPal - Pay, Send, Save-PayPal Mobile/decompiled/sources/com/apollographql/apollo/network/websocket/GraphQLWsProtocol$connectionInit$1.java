package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.GraphQLWsProtocol", f = "GraphQLWsProtocol.kt", i = {0}, l = {26}, m = "connectionInit", n = {"map"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class GraphQLWsProtocol$connectionInit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.websocket.GraphQLWsProtocol getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.connectionInit(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$connectionInit$1(com.apollographql.apollo.network.websocket.GraphQLWsProtocol graphQLWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.GraphQLWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = graphQLWsProtocol;
    }
}
