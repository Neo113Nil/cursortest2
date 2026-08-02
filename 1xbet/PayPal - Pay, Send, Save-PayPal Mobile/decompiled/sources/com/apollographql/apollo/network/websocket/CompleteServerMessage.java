package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/network/websocket/CompleteServerMessage;", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "", "id", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompleteServerMessage implements com.apollographql.apollo.network.websocket.ServerMessage {
    private final java.lang.String id;

    public CompleteServerMessage(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
    }
}
