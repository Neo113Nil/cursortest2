package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class B3TraceId extends com.datadog.trace.api.DDTraceId {
    protected final com.datadog.trace.api.DDTraceId delegate;
    protected final java.lang.String original;

    public static com.datadog.trace.core.propagation.B3TraceId fromHex(java.lang.String str) {
        return new com.datadog.trace.core.propagation.B3TraceId(str, com.datadog.trace.api.DD128bTraceId.fromHex(str));
    }

    protected B3TraceId(java.lang.String str, com.datadog.trace.api.DDTraceId dDTraceId) {
        this.original = str;
        this.delegate = dDTraceId;
    }

    public java.lang.String getOriginal() {
        return this.original;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public java.lang.String toHexString() {
        return this.delegate.toHexString();
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public java.lang.String toHexStringPadded(int i) {
        return this.delegate.toHexStringPadded(i);
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public long toLong() {
        return this.delegate.toLong();
    }

    @Override // com.datadog.trace.api.DDTraceId
    public long toHighOrderLong() {
        return this.delegate.toHighOrderLong();
    }

    @Override // com.datadog.trace.api.DDTraceId
    public java.lang.String toString() {
        return this.delegate.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.delegate.equals(((com.datadog.trace.core.propagation.B3TraceId) obj).delegate);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }
}
