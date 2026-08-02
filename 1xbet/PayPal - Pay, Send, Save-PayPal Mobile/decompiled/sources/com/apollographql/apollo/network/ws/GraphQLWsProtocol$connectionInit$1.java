package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol", f = "GraphQLWsProtocol.kt", i = {0}, l = {54, 61}, m = "connectionInit", n = {"message"}, s = {"L$0"})
/* loaded from: classes.dex */
final class GraphQLWsProtocol$connectionInit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.network.ws.GraphQLWsProtocol getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.connectionInit(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLWsProtocol$connectionInit$1(com.apollographql.apollo.network.ws.GraphQLWsProtocol graphQLWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = graphQLWsProtocol;
    }
}
