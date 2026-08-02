package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/apollographql/apollo/network/websocket/ConnectionErrorServerMessage;", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "payload", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionErrorServerMessage implements com.apollographql.apollo.network.websocket.ServerMessage {
    private final java.lang.Object payload;

    public ConnectionErrorServerMessage(java.lang.Object obj) {
        this.payload = obj;
    }

    public final java.lang.Object getPayload() {
        return this.payload;
    }
}
