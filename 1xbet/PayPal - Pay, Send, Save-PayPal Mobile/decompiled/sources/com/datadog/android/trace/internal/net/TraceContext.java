package com.datadog.android.trace.internal.net;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/datadog/android/trace/internal/net/TraceContext;", "", "", "traceId", "spanId", "", "samplingPriority", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/datadog/android/trace/internal/net/TraceContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getSamplingPriority", "Ljava/lang/String;", "getSpanId", "getTraceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TraceContext {
    private final int samplingPriority;
    private final java.lang.String spanId;
    private final java.lang.String traceId;

    public TraceContext(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.traceId = str;
        this.spanId = str2;
        this.samplingPriority = i;
    }

    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    public final java.lang.String getSpanId() {
        return this.spanId;
    }

    public final int getSamplingPriority() {
        return this.samplingPriority;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.traceId;
        java.lang.String str2 = this.spanId;
        int i = this.samplingPriority;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraceContext(traceId=");
        sb.append(str);
        sb.append(", spanId=");
        sb.append(str2);
        sb.append(", samplingPriority=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.traceId.hashCode() * 31) + this.spanId.hashCode()) * 31) + java.lang.Integer.hashCode(this.samplingPriority);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.trace.internal.net.TraceContext)) {
            return false;
        }
        com.datadog.android.trace.internal.net.TraceContext traceContext = (com.datadog.android.trace.internal.net.TraceContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, traceContext.traceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.spanId, traceContext.spanId) && this.samplingPriority == traceContext.samplingPriority;
    }

    public final com.datadog.android.trace.internal.net.TraceContext copy(java.lang.String traceId, java.lang.String spanId, int samplingPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanId, "");
        return new com.datadog.android.trace.internal.net.TraceContext(traceId, spanId, samplingPriority);
    }

    /* renamed from: component3, reason: from getter */
    public final int getSamplingPriority() {
        return this.samplingPriority;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSpanId() {
        return this.spanId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    public static /* synthetic */ com.datadog.android.trace.internal.net.TraceContext copy$default(com.datadog.android.trace.internal.net.TraceContext traceContext, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = traceContext.traceId;
        }
        if ((i2 & 2) != 0) {
            str2 = traceContext.spanId;
        }
        if ((i2 & 4) != 0) {
            i = traceContext.samplingPriority;
        }
        return traceContext.copy(str, str2, i);
    }
}
