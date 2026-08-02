package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/apollographql/apollo/network/NetworkTransport;", "", "reason", "", "closeConnection", "(Lcom/apollographql/apollo/network/NetworkTransport;Ljava/lang/Throwable;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketNetworkTransportKt {
    public static final void closeConnection(com.apollographql.apollo.network.NetworkTransport networkTransport, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTransport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport = networkTransport instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport ? (com.apollographql.apollo.network.ws.WebSocketNetworkTransport) networkTransport : null;
        if (webSocketNetworkTransport != null) {
            webSocketNetworkTransport.closeConnection(th);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
        sb.append(networkTransport);
        sb.append("' is not an instance of com.apollographql.apollo.ws.WebSocketNetworkTransport");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
