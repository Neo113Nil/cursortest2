package com.apollographql.apollo.network.websocket;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1", f = "WebSocketNetworkTransport.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class WebSocketNetworkTransport$execute$flow$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.network.websocket.WebSocketNetworkTransport getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.apollographql.apollo.api.ApolloRequest<D> apolloRequest;
        com.apollographql.apollo.network.websocket.SubscriptionParserFactory subscriptionParserFactory;
        com.apollographql.apollo.network.websocket.internal.WebSocketPool webSocketPool;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
            if (this.getHighSpeedVideoFpsRanges.element) {
                com.apollographql.apollo.api.ApolloRequest.Builder<D> newBuilder = this.Camera2StreamConfigurationMap.newBuilder();
                java.util.UUID randomUUID = java.util.UUID.randomUUID();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
                apolloRequest = newBuilder.requestUuid(randomUUID).build();
            } else {
                apolloRequest = this.Camera2StreamConfigurationMap;
            }
            this.getHighSpeedVideoFpsRanges.element = true;
            subscriptionParserFactory = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            com.apollographql.apollo.network.websocket.DefaultOperationListener defaultOperationListener = new com.apollographql.apollo.network.websocket.DefaultOperationListener(apolloRequest, producerScope, subscriptionParserFactory.createParser(this.Camera2StreamConfigurationMap));
            webSocketPool = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders = apolloRequest.getHttpHeaders();
            if (httpHeaders == null) {
                httpHeaders = kotlin.collections.CollectionsKt.emptyList();
            }
            final com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket acquire = webSocketPool.acquire(httpHeaders);
            acquire.startOperation(apolloRequest, defaultOperationListener);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1.getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket.this, apolloRequest);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket, com.apollographql.apollo.api.ApolloRequest apolloRequest) {
        subscribableWebSocket.stopOperation(apolloRequest);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1 webSocketNetworkTransport$execute$flow$1 = new com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        webSocketNetworkTransport$execute$flow$1.getHighSpeedVideoSizes = obj;
        return webSocketNetworkTransport$execute$flow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$execute$flow$1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.network.websocket.WebSocketNetworkTransport webSocketNetworkTransport, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = booleanRef;
        this.Camera2StreamConfigurationMap = apolloRequest;
        this.getHighSpeedVideoFpsRangesFor = webSocketNetworkTransport;
    }
}
