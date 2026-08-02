package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "", "url", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/websocket/WebSocket;", "newWebSocket", "(Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/network/websocket/WebSocketListener;)Lcom/apollographql/apollo/network/websocket/WebSocket;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WebSocketEngine extends java.io.Closeable {
    com.apollographql.apollo.network.websocket.WebSocket newWebSocket(java.lang.String url, java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers, com.apollographql.apollo.network.websocket.WebSocketListener listener);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ com.apollographql.apollo.network.websocket.WebSocket newWebSocket$default(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, java.util.List list, com.apollographql.apollo.network.websocket.WebSocketListener webSocketListener, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newWebSocket");
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return webSocketEngine.newWebSocket(str, list, webSocketListener);
    }
}
