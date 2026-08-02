package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB#\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/datadog/android/trace/TraceConfiguration;", "", "", "customEndpointUrl", "Lcom/datadog/android/trace/event/SpanEventMapper;", "eventMapper", "", "networkInfoEnabled", "<init>", "(Ljava/lang/String;Lcom/datadog/android/trace/event/SpanEventMapper;Z)V", "component1$dd_sdk_android_trace_release", "()Ljava/lang/String;", "component2$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/event/SpanEventMapper;", "component3$dd_sdk_android_trace_release", "()Z", "copy", "(Ljava/lang/String;Lcom/datadog/android/trace/event/SpanEventMapper;Z)Lcom/datadog/android/trace/TraceConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_trace_release", "Lcom/datadog/android/trace/event/SpanEventMapper;", "getEventMapper$dd_sdk_android_trace_release", "Z", "getNetworkInfoEnabled$dd_sdk_android_trace_release", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TraceConfiguration {
    private final java.lang.String customEndpointUrl;
    private final com.datadog.android.trace.event.SpanEventMapper eventMapper;
    private final boolean networkInfoEnabled;

    public TraceConfiguration(java.lang.String str, com.datadog.android.trace.event.SpanEventMapper spanEventMapper, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanEventMapper, "");
        this.customEndpointUrl = str;
        this.eventMapper = spanEventMapper;
        this.networkInfoEnabled = z;
    }

    public final java.lang.String getCustomEndpointUrl$dd_sdk_android_trace_release() {
        return this.customEndpointUrl;
    }

    public final com.datadog.android.trace.event.SpanEventMapper getEventMapper$dd_sdk_android_trace_release() {
        return this.eventMapper;
    }

    public final boolean getNetworkInfoEnabled$dd_sdk_android_trace_release() {
        return this.networkInfoEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/trace/TraceConfiguration$Builder;", "", "<init>", "()V", "Lcom/datadog/android/trace/TraceConfiguration;", "build", "()Lcom/datadog/android/trace/TraceConfiguration;", "Lcom/datadog/android/trace/event/SpanEventMapper;", "eventMapper", "setEventMapper", "(Lcom/datadog/android/trace/event/SpanEventMapper;)Lcom/datadog/android/trace/TraceConfiguration$Builder;", "", "enabled", "setNetworkInfoEnabled", "(Z)Lcom/datadog/android/trace/TraceConfiguration$Builder;", "", "endpoint", "useCustomEndpoint", "(Ljava/lang/String;)Lcom/datadog/android/trace/TraceConfiguration$Builder;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Camera2StreamConfigurationMap", "Lcom/datadog/android/trace/event/SpanEventMapper;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private com.datadog.android.trace.event.SpanEventMapper Camera2StreamConfigurationMap = new com.datadog.android.trace.event.NoOpSpanEventMapper();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes = true;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        public final com.datadog.android.trace.TraceConfiguration.Builder useCustomEndpoint(java.lang.String endpoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
            this.getHighSpeedVideoFpsRangesFor = endpoint;
            return this;
        }

        public final com.datadog.android.trace.TraceConfiguration.Builder setEventMapper(com.datadog.android.trace.event.SpanEventMapper eventMapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
            this.Camera2StreamConfigurationMap = eventMapper;
            return this;
        }

        public final com.datadog.android.trace.TraceConfiguration.Builder setNetworkInfoEnabled(boolean enabled) {
            this.getHighSpeedVideoSizes = enabled;
            return this;
        }

        public final com.datadog.android.trace.TraceConfiguration build() {
            return new com.datadog.android.trace.TraceConfiguration(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.customEndpointUrl;
        com.datadog.android.trace.event.SpanEventMapper spanEventMapper = this.eventMapper;
        boolean z = this.networkInfoEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraceConfiguration(customEndpointUrl=");
        sb.append(str);
        sb.append(", eventMapper=");
        sb.append(spanEventMapper);
        sb.append(", networkInfoEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.customEndpointUrl;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.eventMapper.hashCode()) * 31) + java.lang.Boolean.hashCode(this.networkInfoEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.trace.TraceConfiguration)) {
            return false;
        }
        com.datadog.android.trace.TraceConfiguration traceConfiguration = (com.datadog.android.trace.TraceConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customEndpointUrl, traceConfiguration.customEndpointUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventMapper, traceConfiguration.eventMapper) && this.networkInfoEnabled == traceConfiguration.networkInfoEnabled;
    }

    public final com.datadog.android.trace.TraceConfiguration copy(java.lang.String customEndpointUrl, com.datadog.android.trace.event.SpanEventMapper eventMapper, boolean networkInfoEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventMapper, "");
        return new com.datadog.android.trace.TraceConfiguration(customEndpointUrl, eventMapper, networkInfoEnabled);
    }

    /* renamed from: component3$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getNetworkInfoEnabled() {
        return this.networkInfoEnabled;
    }

    /* renamed from: component2$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.event.SpanEventMapper getEventMapper() {
        return this.eventMapper;
    }

    /* renamed from: component1$dd_sdk_android_trace_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    public static /* synthetic */ com.datadog.android.trace.TraceConfiguration copy$default(com.datadog.android.trace.TraceConfiguration traceConfiguration, java.lang.String str, com.datadog.android.trace.event.SpanEventMapper spanEventMapper, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = traceConfiguration.customEndpointUrl;
        }
        if ((i & 2) != 0) {
            spanEventMapper = traceConfiguration.eventMapper;
        }
        if ((i & 4) != 0) {
            z = traceConfiguration.networkInfoEnabled;
        }
        return traceConfiguration.copy(str, spanEventMapper, z);
    }
}
