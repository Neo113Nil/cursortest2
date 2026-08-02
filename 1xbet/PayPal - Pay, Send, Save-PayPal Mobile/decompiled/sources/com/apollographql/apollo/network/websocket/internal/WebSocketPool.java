package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u001a\u0010+\u001a\u00060(j\u0002`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010*R&\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/WebSocketPool;", "", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "webSocketEngine", "", "serverUrl", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "wsProtocol", "Lkotlin/time/Duration;", "connectionAcknowledgeTimeout", "pingInterval", "idleTimeout", "<init>", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;Ljava/lang/String;Lcom/apollographql/apollo/network/websocket/WsProtocol;JLkotlin/time/Duration;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/apollographql/apollo/exception/ApolloException;", "cause", "", "closeAllConnections", "(Lcom/apollographql/apollo/exception/ApolloException;)V", "close", "()V", "p0", "getHighSpeedVideoSizes", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "Lcom/apollographql/apollo/network/websocket/internal/SubscribableWebSocket;", "acquire", "(Ljava/util/List;)Lcom/apollographql/apollo/network/websocket/internal/SubscribableWebSocket;", "getHighSpeedVideoSizesFor", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "J", "Lkotlin/time/Duration;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/atomicfu/locks/getHighSpeedVideoFpsRangesFor;", "Ljava/util/concurrent/locks/ReentrantLock;", "getInputFormats", "", "getOutputFormats", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketPool {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.concurrent.locks.ReentrantLock getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.time.Duration Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.WebSocketEngine getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.WsProtocol getHighSpeedVideoSizes;
    private final java.util.Map<java.util.List<com.apollographql.apollo.api.http.HttpHeader>, com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket> getOutputFormats;

    private WebSocketPool(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, com.apollographql.apollo.network.websocket.WsProtocol wsProtocol, long j, kotlin.time.Duration duration, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsProtocol, "");
        this.getHighSpeedVideoFpsRanges = webSocketEngine;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = wsProtocol;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = duration;
        this.getInputSizeshNQ4ISI = j2;
        this.getInputFormats = new java.util.concurrent.locks.ReentrantLock();
        this.getOutputFormats = new java.util.LinkedHashMap();
    }

    public final void closeAllConnections(com.apollographql.apollo.exception.ApolloException cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getInputFormats;
        reentrantLock.lock();
        try {
            getHighSpeedVideoSizes(cause);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void close() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getInputFormats;
        reentrantLock.lock();
        try {
            getHighSpeedVideoSizes(new com.apollographql.apollo.exception.ApolloNetworkException("WebSocketNetworkTransport was closed", null, 2, null));
            this.getHighSpeedVideoFpsRanges.close();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void getHighSpeedVideoSizes(com.apollographql.apollo.exception.ApolloException p0) {
        java.util.Iterator<java.util.Map.Entry<java.util.List<com.apollographql.apollo.api.http.HttpHeader>, com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket>> it = this.getOutputFormats.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().shutdown(p0, 1001, "Client requested closing the connection");
            it.remove();
        }
    }

    public final com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket acquire(java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpHeaders, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getInputFormats;
        reentrantLock.lock();
        try {
            java.util.Iterator<java.util.Map.Entry<java.util.List<com.apollographql.apollo.api.http.HttpHeader>, com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket>> it = this.getOutputFormats.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<java.util.List<com.apollographql.apollo.api.http.HttpHeader>, com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket> next = it.next();
                if (next.getValue().isShutdown(kotlin.jvm.internal.Intrinsics.areEqual(next.getKey(), httpHeaders))) {
                    it.remove();
                }
            }
            com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket subscribableWebSocket = this.getOutputFormats.get(httpHeaders);
            if (subscribableWebSocket == null) {
                subscribableWebSocket = new com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, httpHeaders, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, null);
                this.getOutputFormats.put(httpHeaders, subscribableWebSocket);
            }
            return subscribableWebSocket;
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ WebSocketPool(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, com.apollographql.apollo.network.websocket.WsProtocol wsProtocol, long j, kotlin.time.Duration duration, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketEngine, str, wsProtocol, j, duration, j2);
    }
}
