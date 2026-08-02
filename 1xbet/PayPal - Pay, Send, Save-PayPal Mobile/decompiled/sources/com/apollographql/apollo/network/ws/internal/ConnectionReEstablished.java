package com.apollographql.apollo.network.ws.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/ConnectionReEstablished;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionReEstablished implements com.apollographql.apollo.network.ws.internal.Event {
    private final java.lang.String id;

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public final java.lang.String getId() {
        return this.id;
    }
}
