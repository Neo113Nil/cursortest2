package com.apollographql.apollo.network.ws.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/OperationError;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "", "id", "", "", "payload", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationError implements com.apollographql.apollo.network.ws.internal.Event {
    private final java.lang.String id;
    private final java.util.Map<java.lang.String, java.lang.Object> payload;

    public OperationError(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.id = str;
        this.payload = map;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getPayload() {
        return this.payload;
    }
}
