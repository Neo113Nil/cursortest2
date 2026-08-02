package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/network/websocket/OperationErrorServerMessage;", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "", "id", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperationErrorServerMessage implements com.apollographql.apollo.network.websocket.ServerMessage {
    private final java.lang.String id;
    private final java.lang.Object payload;

    public OperationErrorServerMessage(java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.payload = obj;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.Object getPayload() {
        return this.payload;
    }
}
