package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "toClientMessage", "(Ljava/lang/Object;)Lcom/apollographql/apollo/network/websocket/ClientMessage;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientMessageKt {
    public static final com.apollographql.apollo.network.websocket.ClientMessage toClientMessage(java.lang.Object obj) {
        okio.Buffer buffer = new okio.Buffer();
        com.apollographql.apollo.api.json.JsonWriters.writeAny(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), obj);
        return new com.apollographql.apollo.network.websocket.TextClientMessage(buffer.readUtf8());
    }
}
