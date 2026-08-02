package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b#\u0010'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0019J#\u0010)\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b)\u0010*J-\u00101\u001a\u00020\u0017\"\b\b\u0000\u0010,*\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\u0017\"\b\b\u0000\u0010,*\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b3\u00104R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010:\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010;R\u001a\u0010A\u001a\u00060=j\u0002`>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u00107\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010GR\u0016\u0010C\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010?\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010LR\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010NR \u0010J\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010QR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/SubscribableWebSocket;", "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "webSocketEngine", "", "serverUrl", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "wsProtocol", "Lkotlin/time/Duration;", "pingInterval", "connectionAcknowledgeTimeout", "idleTimeout", "<init>", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/network/websocket/WsProtocol;Lkotlin/time/Duration;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "markActive", "isShutdown", "(Z)Z", "Lcom/apollographql/apollo/exception/ApolloException;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/apollographql/apollo/exception/ApolloException;)V", "cause", "", "code", "reason", "shutdown", "(Lcom/apollographql/apollo/exception/ApolloException;ILjava/lang/String;)V", "onOpen", "()V", "text", "onMessage", "(Ljava/lang/String;)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "([B)V", "onError", "onClosed", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/network/websocket/internal/OperationListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/network/websocket/internal/OperationListener;)V", "stopOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "getOutputMinFrameDurationlomOqCM", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "getOutputFormats", "Lkotlin/time/Duration;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/atomicfu/locks/getHighSpeedVideoFpsRangesFor;", "getInputFormats", "Ljava/util/concurrent/locks/ReentrantLock;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/CoroutineScope;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Lcom/apollographql/apollo/network/websocket/internal/SocketState;", "getOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/websocket/internal/SocketState;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "Ljava/util/Map;", "getOutputSizes", "", "Ljava/util/List;", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "getOutputStallDurationlomOqCM", "Lcom/apollographql/apollo/network/websocket/WebSocket;", "getOutputStallDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubscribableWebSocket implements com.apollographql.apollo.network.websocket.WebSocketListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, com.apollographql.apollo.network.websocket.internal.OperationListener> getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.util.List<com.apollographql.apollo.api.ApolloRequest<?>> getOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private java.util.concurrent.locks.ReentrantLock getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.apollographql.apollo.exception.ApolloException getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.time.Duration getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.WsProtocol getHighSpeedVideoSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.apollographql.apollo.network.websocket.internal.SocketState getOutputMinFrameDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private com.apollographql.apollo.network.websocket.WebSocket getOutputStallDuration;

    private SubscribableWebSocket(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, com.apollographql.apollo.network.websocket.WsProtocol wsProtocol, kotlin.time.Duration duration, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsProtocol, "");
        this.getHighSpeedVideoSizes = wsProtocol;
        this.getHighSpeedVideoFpsRangesFor = duration;
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
        this.getInputSizeshNQ4ISI = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault());
        this.getOutputMinFrameDuration = com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoSizes;
        this.getOutputSizes = new java.util.LinkedHashMap();
        this.getOutputSizeshNQ4ISI = new java.util.ArrayList();
        java.util.List<com.apollographql.apollo.api.http.HttpHeader> list2 = list;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                java.lang.String lowerCase = ((com.apollographql.apollo.api.http.HttpHeader) it.next()).getName().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "sec-websocket-protocol")) {
                    break;
                }
            }
        }
        list = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.apollographql.apollo.api.http.HttpHeader>) list, new com.apollographql.apollo.api.http.HttpHeader(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_PROTOCOL, this.getHighSpeedVideoSizes.getName()));
        this.getOutputStallDuration = webSocketEngine.newWebSocket(str, list, this);
    }

    public final boolean isShutdown(boolean markActive) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            boolean z = this.getOutputMinFrameDuration == com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRanges;
            if (!z && markActive) {
                kotlinx.coroutines.Job job = this.getOutputFormats;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                this.getOutputFormats = null;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void getHighSpeedVideoSizes(com.apollographql.apollo.exception.ApolloException p0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            if (this.getOutputMinFrameDuration == com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getOutputMinFrameDuration = com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getInputSizeshNQ4ISI, null, 1, null);
            this.getInputFormats = p0;
            arrayList.addAll(this.getOutputSizes.values());
            this.getOutputSizes.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.apollographql.apollo.network.websocket.internal.OperationListener) it.next()).onTransportError(p0);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void shutdown(com.apollographql.apollo.exception.ApolloException cause, int code, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        getHighSpeedVideoSizes(cause);
        this.getOutputStallDuration.close(code, reason);
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public final void onOpen() {
        kotlinx.coroutines.Job launch$default;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            if (com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket.WhenMappings.$EnumSwitchMapping$0[this.getOutputMinFrameDuration.ordinal()] == 1) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onOpen$1$1(this, null), 3, null);
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onOpen$1$2(this, null), 3, null);
                this.getHighSpeedVideoSizesFor = launch$default;
                this.getOutputMinFrameDuration = com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRangesFor;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public final void onMessage(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        com.apollographql.apollo.network.websocket.ServerMessage parseServerMessage = this.getHighSpeedVideoSizes.parseServerMessage(text);
        if (kotlin.jvm.internal.Intrinsics.areEqual(parseServerMessage, com.apollographql.apollo.network.websocket.ConnectionAckServerMessage.INSTANCE)) {
            kotlinx.coroutines.Job job = this.getHighSpeedVideoSizesFor;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.getHighSpeedVideoSizesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI.lock();
            try {
                if (this.getOutputMinFrameDuration != com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getOutputMinFrameDuration = com.apollographql.apollo.network.websocket.internal.SocketState.Camera2StreamConfigurationMap;
                if (this.getHighSpeedVideoFpsRangesFor != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$1(this, null), 3, null);
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2(this, null), 3, null);
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof com.apollographql.apollo.network.websocket.ConnectionErrorServerMessage) {
            shutdown(new com.apollographql.apollo.exception.SubscriptionConnectionException(((com.apollographql.apollo.network.websocket.ConnectionErrorServerMessage) parseServerMessage).getPayload()), 1001, "Connection error");
            return;
        }
        if (parseServerMessage instanceof com.apollographql.apollo.network.websocket.ResponseServerMessage) {
            this.getHighResolutionOutputSizeshNQ4ISI.lock();
            try {
                com.apollographql.apollo.network.websocket.internal.OperationListener operationListener = this.getOutputSizes.get(((com.apollographql.apollo.network.websocket.ResponseServerMessage) parseServerMessage).getId());
                if (operationListener != null) {
                    operationListener.onResponse(((com.apollographql.apollo.network.websocket.ResponseServerMessage) parseServerMessage).getResponse());
                    return;
                }
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof com.apollographql.apollo.network.websocket.CompleteServerMessage) {
            this.getHighResolutionOutputSizeshNQ4ISI.lock();
            try {
                com.apollographql.apollo.network.websocket.internal.OperationListener operationListener2 = this.getOutputSizes.get(((com.apollographql.apollo.network.websocket.CompleteServerMessage) parseServerMessage).getId());
                if (operationListener2 != null) {
                    operationListener2.onComplete();
                    return;
                }
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof com.apollographql.apollo.network.websocket.OperationErrorServerMessage) {
            this.getHighResolutionOutputSizeshNQ4ISI.lock();
            try {
                com.apollographql.apollo.network.websocket.internal.OperationListener operationListener3 = this.getOutputSizes.get(((com.apollographql.apollo.network.websocket.OperationErrorServerMessage) parseServerMessage).getId());
                if (operationListener3 != null) {
                    operationListener3.onError(((com.apollographql.apollo.network.websocket.OperationErrorServerMessage) parseServerMessage).getPayload());
                    return;
                }
                return;
            } finally {
            }
        }
        if (parseServerMessage instanceof com.apollographql.apollo.network.websocket.ParseErrorServerMessage) {
            java.lang.String errorMessage = ((com.apollographql.apollo.network.websocket.ParseErrorServerMessage) parseServerMessage).getErrorMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse message: '");
            sb.append(errorMessage);
            sb.append("'");
            java.lang.System.out.println((java.lang.Object) sb.toString());
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(parseServerMessage, com.apollographql.apollo.network.websocket.PingServerMessage.INSTANCE)) {
            com.apollographql.apollo.network.websocket.ClientMessage pong = this.getHighSpeedVideoSizes.pong();
            if (pong != null) {
                com.apollographql.apollo.network.websocket.internal.SubscribableWebSocketKt.access$send(this.getOutputStallDuration, pong);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(parseServerMessage, com.apollographql.apollo.network.websocket.PongServerMessage.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(parseServerMessage, com.apollographql.apollo.network.websocket.ConnectionKeepAliveServerMessage.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public final void onMessage(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        onMessage(kotlin.text.StringsKt.decodeToString(data));
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public final void onError(com.apollographql.apollo.exception.ApolloException cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
        getHighSpeedVideoSizes(cause);
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketListener
    public final void onClosed(java.lang.Integer code, java.lang.String reason) {
        getHighSpeedVideoSizes(new com.apollographql.apollo.exception.ApolloWebSocketClosedException(code != null ? code.intValue() : 1001, reason, null, 4, null));
    }

    public final <D extends com.apollographql.apollo.api.Operation.Data> void startOperation(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.network.websocket.internal.OperationListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.Job job = this.getOutputFormats;
            com.apollographql.apollo.exception.DefaultApolloException defaultApolloException = null;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.getOutputFormats = null;
            int i = com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket.WhenMappings.$EnumSwitchMapping$0[this.getOutputMinFrameDuration.ordinal()];
            if (i == 1 || i == 2) {
                java.util.Map<java.lang.String, com.apollographql.apollo.network.websocket.internal.OperationListener> map = this.getOutputSizes;
                java.lang.String obj = request.getRequestUuid().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                map.put(obj, listener);
                this.getOutputSizeshNQ4ISI.add(request);
            } else if (i == 3) {
                java.util.Map<java.lang.String, com.apollographql.apollo.network.websocket.internal.OperationListener> map2 = this.getOutputSizes;
                java.lang.String obj2 = request.getRequestUuid().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                map2.put(obj2, listener);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$startOperation$1$1(this, request, null), 3, null);
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                defaultApolloException = new com.apollographql.apollo.exception.DefaultApolloException("Apollo: the WebSocket is shut down", this.getInputFormats);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (defaultApolloException != null) {
                listener.onTransportError(defaultApolloException);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final <D extends com.apollographql.apollo.api.Operation.Data> void stopOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.lang.String obj = request.getRequestUuid().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            if (this.getOutputSizes.containsKey(obj)) {
                this.getOutputSizes.remove(obj);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$stopOperation$1$1(this, request, null), 3, null);
                if (this.getOutputSizes.isEmpty()) {
                    kotlinx.coroutines.Job job = this.getOutputFormats;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$restartIdleTimeout$1(this, null), 3, null);
                    this.getOutputFormats = launch$default;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.apollographql.apollo.network.websocket.internal.SocketState.values().length];
            try {
                iArr[com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoSizes.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRangesFor.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.apollographql.apollo.network.websocket.internal.SocketState.Camera2StreamConfigurationMap.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.apollographql.apollo.network.websocket.internal.SocketState.getHighSpeedVideoFpsRanges.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SubscribableWebSocket(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, java.util.List list, com.apollographql.apollo.network.websocket.WsProtocol wsProtocol, kotlin.time.Duration duration, long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketEngine, str, list, wsProtocol, duration, j, j2);
    }
}
