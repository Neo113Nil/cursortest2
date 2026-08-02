package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "code", "", "reason", "", "cause", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloWebSocketClosedException extends com.apollographql.apollo.exception.ApolloException {
    private final int code;
    private final java.lang.String reason;

    public /* synthetic */ ApolloWebSocketClosedException(int i, java.lang.String str, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }

    public final int getCode() {
        return this.code;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApolloWebSocketClosedException(int i, java.lang.String str, java.lang.Throwable th) {
        super(r0.toString(), th, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSocket Closed code='");
        sb.append(i);
        sb.append("' reason='");
        sb.append(str);
        sb.append('\'');
        this.code = i;
        this.reason = str;
    }
}
