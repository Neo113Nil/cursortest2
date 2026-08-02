package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u00018B¥\u0001\b\u0000\u0012.\b\u0002\u0010\u0007\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u009d\u0001\b\u0017\u0012.\b\u0002\u0010\u0007\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\u001a\"\b\b\u0000\u0010\u001e*\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u001a\"\b\b\u0000\u0010\u001e*\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b$\u0010\u001cJ%\u0010&\u001a\u00020\u001a2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)R:\u0010,\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00100R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u00103\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00104\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lcom/apollographql/apollo/network/ws/GraphQLWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "pingPayload", "pongPayload", "", "connectionAcknowledgeTimeoutMs", "pingIntervalMillis", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "frameType", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "webSocketPayloadComposer", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/Map;JJLcom/apollographql/apollo/network/ws/WsFrameType;Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;)V", "(Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/Map;JJLcom/apollographql/apollo/network/ws/WsFrameType;Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;)V", "", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "startOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "stopOperation", "run", "messageMap", "handleServerMessage", "(Ljava/util/Map;)V", "Camera2StreamConfigurationMap", "()V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getInputFormats", "J", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/CoroutineScope;", "getOutputFormats", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "Factory"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphQLWsProtocol extends com.apollographql.apollo.network.ws.WsProtocol {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.ws.WsFrameType getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.WebSocketPayloadComposer getHighSpeedVideoSizesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$1", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation continuation) {
            return ((com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass1> continuation) {
            super(1, continuation);
        }
    }

    public /* synthetic */ GraphQLWsProtocol(kotlin.jvm.functions.Function1 function1, java.util.Map map, java.util.Map map2, long j, long j2, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope coroutineScope, com.apollographql.apollo.api.http.WebSocketPayloadComposer webSocketPayloadComposer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass1(null) : function1, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, j, j2, wsFrameType, webSocketConnection, listener, coroutineScope, webSocketPayloadComposer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLWsProtocol(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2, long j, long j2, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope coroutineScope, com.apollographql.apollo.api.http.WebSocketPayloadComposer webSocketPayloadComposer) {
        super(webSocketConnection, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsFrameType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketPayloadComposer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = map;
        this.Camera2StreamConfigurationMap = map2;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getInputSizeshNQ4ISI = wsFrameType;
        this.getInputFormats = coroutineScope;
        this.getHighSpeedVideoSizesFor = webSocketPayloadComposer;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$2", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation continuation) {
            return ((com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass2(continuation);
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass2> continuation) {
            super(1, continuation);
        }
    }

    public /* synthetic */ GraphQLWsProtocol(kotlin.jvm.functions.Function1 function1, java.util.Map map, java.util.Map map2, long j, long j2, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.apollographql.apollo.network.ws.GraphQLWsProtocol.AnonymousClass2(null) : function1, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, j, j2, wsFrameType, webSocketConnection, listener, coroutineScope);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "Use GraphQLWsProtocol.Factory instead")
    public GraphQLWsProtocol(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2, long j, long j2, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this(function1, map, map2, j, j2, wsFrameType, webSocketConnection, listener, coroutineScope, new com.apollographql.apollo.api.http.DefaultWebSocketPayloadComposer());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsFrameType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r4, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1 graphQLWsProtocol$connectionInit$1;
        int i;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mutableMapOf;
        java.util.Map map;
        if (continuation instanceof com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1) {
            graphQLWsProtocol$connectionInit$1 = (com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1) continuation;
            if ((graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = graphQLWsProtocol$connectionInit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("type", "connection_init"));
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                    graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRanges = mutableMapOf;
                    graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = function1.invoke(graphQLWsProtocol$connectionInit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    mutableMapOf = (java.util.Map) graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                map = (java.util.Map) obj;
                if (map != null) {
                    mutableMapOf.put("payload", map);
                }
                sendMessageMap(mutableMapOf, this.getInputSizeshNQ4ISI);
                long j = this.getHighSpeedVideoFpsRangesFor;
                com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2 graphQLWsProtocol$connectionInit$2 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2(this, null);
                graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRanges = null;
                graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        graphQLWsProtocol$connectionInit$1 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1(this, continuation);
        java.lang.Object obj2 = graphQLWsProtocol$connectionInit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        map = (java.util.Map) obj2;
        if (map != null) {
        }
        sendMessageMap(mutableMapOf, this.getInputSizeshNQ4ISI);
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2 graphQLWsProtocol$connectionInit$22 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2(this, null);
        graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRanges = null;
        graphQLWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> void startOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        sendMessageMap(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "subscribe"), kotlin.TuplesKt.to("id", request.getRequestUuid().toString()), kotlin.TuplesKt.to("payload", this.getHighSpeedVideoSizesFor.compose(request))), this.getInputSizeshNQ4ISI);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> void stopOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        sendMessageMap(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE), kotlin.TuplesKt.to("id", request.getRequestUuid().toString())), this.getInputSizeshNQ4ISI);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final java.lang.Object run(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getHighSpeedVideoFpsRanges > 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputFormats, null, null, new com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2(this, null), 3, null);
        }
        java.lang.Object run = super.run(continuation);
        return run == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? run : kotlin.Unit.INSTANCE;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void handleServerMessage(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageMap, "");
        java.lang.Object obj = messageMap.get("type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, io.ktor.http.LinkHeader.Rel.Next)) {
            com.apollographql.apollo.network.ws.WsProtocol.Listener listener = getListener();
            java.lang.Object obj2 = messageMap.get("id");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            java.lang.Object obj3 = messageMap.get("payload");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            listener.operationResponse((java.lang.String) obj2, (java.util.Map) obj3);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, "error")) {
            com.apollographql.apollo.network.ws.WsProtocol.Listener listener2 = getListener();
            java.lang.Object obj4 = messageMap.get("id");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
            listener2.operationResponse((java.lang.String) obj4, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, messageMap.get("payload"))));
            com.apollographql.apollo.network.ws.WsProtocol.Listener listener3 = getListener();
            java.lang.Object obj5 = messageMap.get("id");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "");
            listener3.operationComplete((java.lang.String) obj5);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE)) {
            com.apollographql.apollo.network.ws.WsProtocol.Listener listener4 = getListener();
            java.lang.Object obj6 = messageMap.get("id");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "");
            listener4.operationComplete((java.lang.String) obj6);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, "ping")) {
            Camera2StreamConfigurationMap();
        } else {
            kotlin.jvm.internal.Intrinsics.areEqual(obj, "pong");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap() {
        java.util.Map<java.lang.String, ? extends java.lang.Object> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("type", "pong"));
        java.util.Map<java.lang.String, java.lang.Object> map = this.Camera2StreamConfigurationMap;
        if (map != null) {
            mutableMapOf.put("payload", map);
        }
        sendMessageMap(mutableMapOf, this.getInputSizeshNQ4ISI);
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u008b\u0001\b\u0016\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0002\u0010\u0011J9\u0010\t\u001a\u00020\u00122*\u0010\t\u001a&\b\u0001\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\t\u0010\u0013J\u0015\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0014J%\u0010\f\u001a\u00020\u00122\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u0015J%\u0010\r\u001a\u00020\u00122\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R>\u0010$\u001a*\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010'R\u0018\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103"}, d2 = {"Lcom/apollographql/apollo/network/ws/GraphQLWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "", "pingIntervalMillis", "pingPayload", "pongPayload", "connectionAcknowledgeTimeoutMs", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "frameType", "(Lkotlin/jvm/functions/Function1;JLjava/util/Map;Ljava/util/Map;JLcom/apollographql/apollo/network/ws/WsFrameType;)V", "", "(Lkotlin/jvm/functions/Function1;)V", "(J)V", "(Ljava/util/Map;)V", "connectionAcknowledgeTimeoutMillis", "(Lcom/apollographql/apollo/network/ws/WsFrameType;)V", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "webSocketPayloadComposer", "(Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;)V", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/apollographql/apollo/network/ws/WsProtocol;", "create", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;)Lcom/apollographql/apollo/network/ws/WsProtocol;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Ljava/lang/Long;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/apollographql/apollo/api/http/WebSocketPayloadComposer;", "getOutputFormats", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements com.apollographql.apollo.network.ws.WsProtocol.Factory {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.Long getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.Long Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private com.apollographql.apollo.network.ws.WsFrameType getInputSizeshNQ4ISI;
        private kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.util.Map<java.lang.String, ? extends java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private com.apollographql.apollo.api.http.WebSocketPayloadComposer getOutputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private java.util.Map<java.lang.String, ? extends java.lang.Object> getHighSpeedVideoFpsRanges;

        public Factory() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$1", f = "GraphQLWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> {
            int getHighSpeedVideoFpsRanges;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRanges != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation continuation) {
                return ((com.apollographql.apollo.network.ws.GraphQLWsProtocol.Factory.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                return new com.apollographql.apollo.network.ws.GraphQLWsProtocol.Factory.AnonymousClass1(continuation);
            }

            AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.GraphQLWsProtocol.Factory.AnonymousClass1> continuation) {
                super(1, continuation);
            }
        }

        public /* synthetic */ Factory(kotlin.jvm.functions.Function1 function1, long j, java.util.Map map, java.util.Map map2, long j2, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.apollographql.apollo.network.ws.GraphQLWsProtocol.Factory.AnonymousClass1(null) : function1, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? null : map, (i & 8) == 0 ? map2 : null, (i & 16) != 0 ? 10000L : j2, (i & 32) != 0 ? com.apollographql.apollo.network.ws.WsFrameType.Text : wsFrameType);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, long j, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2, long j2, com.apollographql.apollo.network.ws.WsFrameType wsFrameType) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsFrameType, "");
            this.getHighSpeedVideoFpsRangesFor = function1;
            this.getHighSpeedVideoSizes = java.lang.Long.valueOf(j);
            this.getHighResolutionOutputSizeshNQ4ISI = map;
            this.getHighSpeedVideoFpsRanges = map2;
            this.Camera2StreamConfigurationMap = java.lang.Long.valueOf(j2);
            this.getInputSizeshNQ4ISI = wsFrameType;
        }

        public final void connectionPayload(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> connectionPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPayload, "");
            this.getHighSpeedVideoFpsRangesFor = connectionPayload;
        }

        public final void pingIntervalMillis(long pingIntervalMillis) {
            this.getHighSpeedVideoSizes = java.lang.Long.valueOf(pingIntervalMillis);
        }

        public final void pingPayload(java.util.Map<java.lang.String, ? extends java.lang.Object> pingPayload) {
            this.getHighResolutionOutputSizeshNQ4ISI = pingPayload;
        }

        public final void pongPayload(java.util.Map<java.lang.String, ? extends java.lang.Object> pongPayload) {
            this.getHighSpeedVideoFpsRanges = pongPayload;
        }

        public final void connectionAcknowledgeTimeoutMillis(long connectionAcknowledgeTimeoutMillis) {
            this.Camera2StreamConfigurationMap = java.lang.Long.valueOf(connectionAcknowledgeTimeoutMillis);
        }

        public final void frameType(com.apollographql.apollo.network.ws.WsFrameType frameType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameType, "");
            this.getInputSizeshNQ4ISI = frameType;
        }

        public final void webSocketPayloadComposer(com.apollographql.apollo.api.http.WebSocketPayloadComposer webSocketPayloadComposer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketPayloadComposer, "");
            this.getOutputFormats = webSocketPayloadComposer;
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final java.lang.String getName() {
            return "graphql-transport-ws";
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final com.apollographql.apollo.network.ws.WsProtocol create(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1 graphQLWsProtocol$Factory$create$connectionPayload$1 = this.getHighSpeedVideoFpsRangesFor;
            if (graphQLWsProtocol$Factory$create$connectionPayload$1 == null) {
                graphQLWsProtocol$Factory$create$connectionPayload$1 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1(null);
            }
            kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1 = graphQLWsProtocol$Factory$create$connectionPayload$1;
            java.lang.Long l = this.Camera2StreamConfigurationMap;
            long longValue = l != null ? l.longValue() : 10000L;
            java.lang.Long l2 = this.getHighSpeedVideoSizes;
            long longValue2 = l2 != null ? l2.longValue() : -1L;
            com.apollographql.apollo.network.ws.WsFrameType wsFrameType = this.getInputSizeshNQ4ISI;
            if (wsFrameType == null) {
                wsFrameType = com.apollographql.apollo.network.ws.WsFrameType.Text;
            }
            com.apollographql.apollo.network.ws.WsFrameType wsFrameType2 = wsFrameType;
            java.util.Map<java.lang.String, ? extends java.lang.Object> map = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = this.getHighSpeedVideoFpsRanges;
            com.apollographql.apollo.api.http.DefaultWebSocketPayloadComposer defaultWebSocketPayloadComposer = this.getOutputFormats;
            if (defaultWebSocketPayloadComposer == null) {
                defaultWebSocketPayloadComposer = new com.apollographql.apollo.api.http.DefaultWebSocketPayloadComposer();
            }
            return new com.apollographql.apollo.network.ws.GraphQLWsProtocol(function1, map, map2, longValue, longValue2, wsFrameType2, webSocketConnection, listener, scope, defaultWebSocketPayloadComposer);
        }
    }
}
