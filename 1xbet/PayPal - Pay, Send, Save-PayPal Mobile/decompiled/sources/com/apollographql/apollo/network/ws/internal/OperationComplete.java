package com.apollographql.apollo.network.ws.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/OperationComplete;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "", "id", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationComplete implements com.apollographql.apollo.network.ws.internal.Event {
    private final java.lang.String id;

    public OperationComplete(java.lang.String str) {
        this.id = str;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public final java.lang.String getId() {
        return this.id;
    }
}
