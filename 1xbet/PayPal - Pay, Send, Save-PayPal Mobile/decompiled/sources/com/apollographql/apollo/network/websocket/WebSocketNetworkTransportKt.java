package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0006"}, d2 = {"Lcom/apollographql/apollo/network/NetworkTransport;", "Lcom/apollographql/apollo/exception/ApolloException;", "exception", "", "closeConnection", "(Lcom/apollographql/apollo/network/NetworkTransport;Lcom/apollographql/apollo/exception/ApolloException;)V", "(Lcom/apollographql/apollo/network/NetworkTransport;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketNetworkTransportKt {
    public static final void closeConnection(com.apollographql.apollo.network.NetworkTransport networkTransport, com.apollographql.apollo.exception.ApolloException apolloException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTransport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloException, "");
        com.apollographql.apollo.network.websocket.WebSocketNetworkTransport webSocketNetworkTransport = networkTransport instanceof com.apollographql.apollo.network.websocket.WebSocketNetworkTransport ? (com.apollographql.apollo.network.websocket.WebSocketNetworkTransport) networkTransport : null;
        if (webSocketNetworkTransport == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(networkTransport);
            sb.append("' is not an instance of com.apollographql.apollo.websocket.WebSocketNetworkTransport");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        webSocketNetworkTransport.closeConnection(apolloException);
    }

    public static final void closeConnection(com.apollographql.apollo.network.NetworkTransport networkTransport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTransport, "");
        com.apollographql.apollo.network.websocket.WebSocketNetworkTransport webSocketNetworkTransport = networkTransport instanceof com.apollographql.apollo.network.websocket.WebSocketNetworkTransport ? (com.apollographql.apollo.network.websocket.WebSocketNetworkTransport) networkTransport : null;
        if (webSocketNetworkTransport == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(networkTransport);
            sb.append("' is not an instance of com.apollographql.apollo.websocket.WebSocketNetworkTransport");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        webSocketNetworkTransport.closeConnection(com.apollographql.apollo.exception.ApolloWebSocketForceCloseException.INSTANCE);
    }
}
