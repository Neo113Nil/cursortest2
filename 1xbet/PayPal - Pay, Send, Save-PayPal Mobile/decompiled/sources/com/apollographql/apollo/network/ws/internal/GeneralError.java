package com.apollographql.apollo.network.ws.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/GeneralError;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "", "", "", "payload", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeneralError implements com.apollographql.apollo.network.ws.internal.Event {
    private final java.lang.String id;
    private final java.util.Map<java.lang.String, java.lang.Object> payload;

    public GeneralError(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.payload = map;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getPayload() {
        return this.payload;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public final java.lang.String getId() {
        return this.id;
    }
}
