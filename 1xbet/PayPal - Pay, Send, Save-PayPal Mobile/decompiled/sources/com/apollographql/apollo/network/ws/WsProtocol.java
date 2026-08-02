package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\u0017*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b*\u00020\fH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001e\u0010\u000fJ%\u0010\u001f\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001f\u0010\u000fJ-\u0010\"\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0084@¢\u0006\u0004\b$\u0010\nJ\u0010\u0010%\u001a\u00020\bH\u0096@¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol;", "", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "messageMap", "handleServerMessage", "(Ljava/util/Map;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "startOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "stopOperation", "Lokio/ByteString;", "toByteString", "(Ljava/util/Map;)Lokio/ByteString;", "toUtf8", "(Ljava/util/Map;)Ljava/lang/String;", "toMessageMap", "(Ljava/lang/String;)Ljava/util/Map;", "sendMessageMapBinary", "sendMessageMapText", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "frameType", "sendMessageMap", "(Ljava/util/Map;Lcom/apollographql/apollo/network/ws/WsFrameType;)V", "receiveMessageMap", "run", "close", "()V", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "getWebSocketConnection", "()Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "getListener", "()Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "Listener", "Factory"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WsProtocol {
    private final com.apollographql.apollo.network.ws.WsProtocol.Listener listener;
    private final com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/apollographql/apollo/network/ws/WsProtocol;", "create", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;)Lcom/apollographql/apollo/network/ws/WsProtocol;", "", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        com.apollographql.apollo.network.ws.WsProtocol create(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope scope);

        java.lang.String getName();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "", "", "id", "", "payload", "", "operationResponse", "(Ljava/lang/String;Ljava/util/Map;)V", "operationError", "operationComplete", "(Ljava/lang/String;)V", "generalError", "(Ljava/util/Map;)V", "", "cause", "networkError", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void generalError(java.util.Map<java.lang.String, ? extends java.lang.Object> payload);

        void networkError(java.lang.Throwable cause);

        void operationComplete(java.lang.String id);

        void operationError(java.lang.String id, java.util.Map<java.lang.String, ? extends java.lang.Object> payload);

        void operationResponse(java.lang.String id, java.util.Map<java.lang.String, ? extends java.lang.Object> payload);
    }

    public abstract java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract void handleServerMessage(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap);

    public abstract <D extends com.apollographql.apollo.api.Operation.Data> void startOperation(com.apollographql.apollo.api.ApolloRequest<D> request);

    public abstract <D extends com.apollographql.apollo.api.Operation.Data> void stopOperation(com.apollographql.apollo.api.ApolloRequest<D> request);

    public WsProtocol(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.webSocketConnection = webSocketConnection;
        this.listener = listener;
    }

    protected final com.apollographql.apollo.network.ws.WebSocketConnection getWebSocketConnection() {
        return this.webSocketConnection;
    }

    protected final com.apollographql.apollo.network.ws.WsProtocol.Listener getListener() {
        return this.listener;
    }

    protected final java.util.Map<java.lang.String, java.lang.Object> toMessageMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object fromJson = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(new com.apollographql.apollo.api.json.BufferedSourceJsonReader(new okio.Buffer().writeUtf8(str)), com.apollographql.apollo.api.CustomScalarAdapters.Empty);
            if (fromJson instanceof java.util.Map) {
                return (java.util.Map) fromJson;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    protected final void sendMessageMapBinary(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageMap, "");
        this.webSocketConnection.send(toByteString(messageMap));
    }

    protected final void sendMessageMapText(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageMap, "");
        this.webSocketConnection.send(toUtf8(messageMap));
    }

    protected final void sendMessageMap(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap, com.apollographql.apollo.network.ws.WsFrameType frameType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameType, "");
        int i = com.apollographql.apollo.network.ws.WsProtocol.WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
        if (i == 1) {
            sendMessageMapText(messageMap);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            sendMessageMapBinary(messageMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:10:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object receiveMessageMap(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
        com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1 wsProtocol$receiveMessageMap$1;
        int i;
        if (continuation instanceof com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1) {
            wsProtocol$receiveMessageMap$1 = (com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1) continuation;
            if ((wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = wsProtocol$receiveMessageMap$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection = this.webSocketConnection;
                    wsProtocol$receiveMessageMap$1.Camera2StreamConfigurationMap = this;
                    wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = webSocketConnection.receive(wsProtocol$receiveMessageMap$1);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.apollographql.apollo.network.ws.WsProtocol wsProtocol = (com.apollographql.apollo.network.ws.WsProtocol) wsProtocol$receiveMessageMap$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<java.lang.String, java.lang.Object> messageMap = wsProtocol.toMessageMap((java.lang.String) obj);
                    if (messageMap != null) {
                        return messageMap;
                    }
                    com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection2 = this.webSocketConnection;
                    wsProtocol$receiveMessageMap$1.Camera2StreamConfigurationMap = this;
                    wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = webSocketConnection2.receive(wsProtocol$receiveMessageMap$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wsProtocol = this;
                    java.util.Map<java.lang.String, java.lang.Object> messageMap2 = wsProtocol.toMessageMap((java.lang.String) obj);
                    if (messageMap2 != null) {
                    }
                    com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection22 = this.webSocketConnection;
                    wsProtocol$receiveMessageMap$1.Camera2StreamConfigurationMap = this;
                    wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = webSocketConnection22.receive(wsProtocol$receiveMessageMap$1);
                    if (obj == coroutine_suspended) {
                    }
                }
            }
        }
        wsProtocol$receiveMessageMap$1 = new com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1(this, continuation);
        java.lang.Object obj2 = wsProtocol$receiveMessageMap$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wsProtocol$receiveMessageMap$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0051 -> B:13:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(com.apollographql.apollo.network.ws.WsProtocol wsProtocol, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.network.ws.WsProtocol$run$1 wsProtocol$run$1;
        int i;
        java.lang.Exception e;
        java.lang.Exception e2;
        java.lang.Object receiveMessageMap;
        com.apollographql.apollo.network.ws.WsProtocol$run$1 wsProtocol$run$12;
        java.lang.Object obj;
        com.apollographql.apollo.network.ws.WsProtocol wsProtocol2;
        if (continuation instanceof com.apollographql.apollo.network.ws.WsProtocol$run$1) {
            wsProtocol$run$1 = (com.apollographql.apollo.network.ws.WsProtocol$run$1) continuation;
            if ((wsProtocol$run$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                wsProtocol$run$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj2 = wsProtocol$run$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wsProtocol$run$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    wsProtocol$run$1.getHighSpeedVideoSizes = wsProtocol;
                    wsProtocol$run$1.getHighResolutionOutputSizeshNQ4ISI = wsProtocol;
                    wsProtocol$run$1.Camera2StreamConfigurationMap = 1;
                    receiveMessageMap = wsProtocol.receiveMessageMap(wsProtocol$run$1);
                    if (receiveMessageMap == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.apollographql.apollo.network.ws.WsProtocol wsProtocol3 = (com.apollographql.apollo.network.ws.WsProtocol) wsProtocol$run$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.apollographql.apollo.network.ws.WsProtocol wsProtocol4 = (com.apollographql.apollo.network.ws.WsProtocol) wsProtocol$run$1.getHighSpeedVideoSizes;
                    try {
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            wsProtocol2 = wsProtocol3;
                            wsProtocol = wsProtocol4;
                            wsProtocol$run$12 = wsProtocol$run$1;
                            obj = obj2;
                        } catch (java.util.concurrent.CancellationException e3) {
                            throw e3;
                        }
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        e2 = e;
                        wsProtocol = wsProtocol4;
                        wsProtocol.listener.networkError(e2);
                        return kotlin.Unit.INSTANCE;
                    }
                    try {
                        try {
                            wsProtocol2.handleServerMessage((java.util.Map) obj);
                            wsProtocol$run$1.getHighSpeedVideoSizes = wsProtocol;
                            wsProtocol$run$1.getHighResolutionOutputSizeshNQ4ISI = wsProtocol;
                            wsProtocol$run$1.Camera2StreamConfigurationMap = 1;
                            receiveMessageMap = wsProtocol.receiveMessageMap(wsProtocol$run$1);
                            if (receiveMessageMap == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            wsProtocol$run$12 = wsProtocol$run$1;
                            obj = receiveMessageMap;
                            wsProtocol2 = wsProtocol;
                            wsProtocol2.handleServerMessage((java.util.Map) obj);
                            wsProtocol$run$1 = wsProtocol$run$12;
                            wsProtocol$run$1.getHighSpeedVideoSizes = wsProtocol;
                            wsProtocol$run$1.getHighResolutionOutputSizeshNQ4ISI = wsProtocol;
                            wsProtocol$run$1.Camera2StreamConfigurationMap = 1;
                            receiveMessageMap = wsProtocol.receiveMessageMap(wsProtocol$run$1);
                            if (receiveMessageMap == coroutine_suspended) {
                            }
                        } catch (java.lang.Exception e5) {
                            wsProtocol4 = wsProtocol;
                            e = e5;
                            e2 = e;
                            wsProtocol = wsProtocol4;
                            wsProtocol.listener.networkError(e2);
                            return kotlin.Unit.INSTANCE;
                        }
                    } catch (java.lang.Exception e6) {
                        e2 = e6;
                        wsProtocol.listener.networkError(e2);
                        return kotlin.Unit.INSTANCE;
                    }
                    wsProtocol$run$1 = wsProtocol$run$12;
                }
            }
        }
        wsProtocol$run$1 = new com.apollographql.apollo.network.ws.WsProtocol$run$1(wsProtocol, continuation);
        java.lang.Object obj22 = wsProtocol$run$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wsProtocol$run$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    public void close() {
        this.webSocketConnection.close();
    }

    protected final okio.ByteString toByteString(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.JsonWriters.writeAny(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), map);
        return buffer.readByteString();
    }

    protected final java.lang.String toUtf8(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.JsonWriters.writeAny(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), map);
        return buffer.readUtf8();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.apollographql.apollo.network.ws.WsFrameType.values().length];
            try {
                iArr[com.apollographql.apollo.network.ws.WsFrameType.Text.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.apollographql.apollo.network.ws.WsFrameType.Binary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public java.lang.Object run(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighSpeedVideoFpsRanges(this, continuation);
    }
}
