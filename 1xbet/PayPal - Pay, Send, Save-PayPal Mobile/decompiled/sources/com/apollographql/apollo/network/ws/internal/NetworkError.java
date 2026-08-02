package com.apollographql.apollo.network.ws.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/apollographql/apollo/network/ws/internal/NetworkError;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkError implements com.apollographql.apollo.network.ws.internal.Event {
    private final java.lang.Throwable cause;
    private final java.lang.String id;

    public NetworkError(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        this.cause = th;
    }

    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    @Override // com.apollographql.apollo.network.ws.internal.Event
    public final java.lang.String getId() {
        return this.id;
    }
}
