package com.datadog.android.trace.internal.net;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\r"}, d2 = {"Lcom/datadog/android/trace/internal/net/RequestTracingState;", "", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "tracedRequestInfoBuilder", "", "isSampled", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "", "sampleRate", "<init>", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;ZLcom/datadog/android/trace/api/span/DatadogSpan;Ljava/lang/Float;)V", "component1", "()Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "component2", "()Z", "component3", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "component4", "()Ljava/lang/Float;", "copy", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;ZLcom/datadog/android/trace/api/span/DatadogSpan;Ljava/lang/Float;)Lcom/datadog/android/trace/internal/net/RequestTracingState;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "createModifiedRequestInfo", "()Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Float;", "getSampleRate", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "getSpan", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "getTracedRequestInfoBuilder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RequestTracingState {
    private final boolean isSampled;
    private final java.lang.Float sampleRate;
    private final com.datadog.android.trace.api.span.DatadogSpan span;
    private final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder tracedRequestInfoBuilder;

    public RequestTracingState(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, boolean z, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, java.lang.Float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfoBuilder, "");
        this.tracedRequestInfoBuilder = httpRequestInfoBuilder;
        this.isSampled = z;
        this.span = datadogSpan;
        this.sampleRate = f;
    }

    public /* synthetic */ RequestTracingState(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, boolean z, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, java.lang.Float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpRequestInfoBuilder, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : datadogSpan, (i & 8) != 0 ? null : f);
    }

    public final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder getTracedRequestInfoBuilder() {
        return this.tracedRequestInfoBuilder;
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public final com.datadog.android.trace.api.span.DatadogSpan getSpan() {
        return this.span;
    }

    public final java.lang.Float getSampleRate() {
        return this.sampleRate;
    }

    public final com.datadog.android.api.instrumentation.network.HttpRequestInfo createModifiedRequestInfo() {
        return this.tracedRequestInfoBuilder.build();
    }

    public final java.lang.String toString() {
        com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder = this.tracedRequestInfoBuilder;
        boolean z = this.isSampled;
        com.datadog.android.trace.api.span.DatadogSpan datadogSpan = this.span;
        java.lang.Float f = this.sampleRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestTracingState(tracedRequestInfoBuilder=");
        sb.append(httpRequestInfoBuilder);
        sb.append(", isSampled=");
        sb.append(z);
        sb.append(", span=");
        sb.append(datadogSpan);
        sb.append(", sampleRate=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.tracedRequestInfoBuilder.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isSampled);
        com.datadog.android.trace.api.span.DatadogSpan datadogSpan = this.span;
        int hashCode3 = datadogSpan == null ? 0 : datadogSpan.hashCode();
        java.lang.Float f = this.sampleRate;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (f != null ? f.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.trace.internal.net.RequestTracingState)) {
            return false;
        }
        com.datadog.android.trace.internal.net.RequestTracingState requestTracingState = (com.datadog.android.trace.internal.net.RequestTracingState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tracedRequestInfoBuilder, requestTracingState.tracedRequestInfoBuilder) && this.isSampled == requestTracingState.isSampled && kotlin.jvm.internal.Intrinsics.areEqual(this.span, requestTracingState.span) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.sampleRate, (java.lang.Object) requestTracingState.sampleRate);
    }

    public final com.datadog.android.trace.internal.net.RequestTracingState copy(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder tracedRequestInfoBuilder, boolean isSampled, com.datadog.android.trace.api.span.DatadogSpan span, java.lang.Float sampleRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracedRequestInfoBuilder, "");
        return new com.datadog.android.trace.internal.net.RequestTracingState(tracedRequestInfoBuilder, isSampled, span, sampleRate);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component3, reason: from getter */
    public final com.datadog.android.trace.api.span.DatadogSpan getSpan() {
        return this.span;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder getTracedRequestInfoBuilder() {
        return this.tracedRequestInfoBuilder;
    }

    public static /* synthetic */ com.datadog.android.trace.internal.net.RequestTracingState copy$default(com.datadog.android.trace.internal.net.RequestTracingState requestTracingState, com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder httpRequestInfoBuilder, boolean z, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, java.lang.Float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpRequestInfoBuilder = requestTracingState.tracedRequestInfoBuilder;
        }
        if ((i & 2) != 0) {
            z = requestTracingState.isSampled;
        }
        if ((i & 4) != 0) {
            datadogSpan = requestTracingState.span;
        }
        if ((i & 8) != 0) {
            f = requestTracingState.sampleRate;
        }
        return requestTracingState.copy(httpRequestInfoBuilder, z, datadogSpan, f);
    }
}
