package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/trace/TracingHeaderType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "headerType", "Ljava/lang/String;", "getHeaderType", "()Ljava/lang/String;", "DATADOG", "B3", "B3MULTI", "TRACECONTEXT"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TracingHeaderType {
    DATADOG("DATADOG"),
    B3("B3"),
    B3MULTI("B3MULTI"),
    TRACECONTEXT("TRACECONTEXT");

    private final java.lang.String headerType;

    TracingHeaderType(java.lang.String str) {
        this.headerType = str;
    }

    public final java.lang.String getHeaderType() {
        return this.headerType;
    }
}
