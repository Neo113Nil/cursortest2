package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class ExtractedContext extends com.datadog.trace.bootstrap.instrumentation.api.TagContext {
    private final com.datadog.trace.api.DDTraceId Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.core.propagation.PropagationTags getHighSpeedVideoSizes;

    public ExtractedContext(com.datadog.trace.api.DDTraceId dDTraceId, long j, int i, java.lang.CharSequence charSequence, com.datadog.trace.core.propagation.PropagationTags propagationTags, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle) {
        this(dDTraceId, j, i, charSequence, 0L, null, null, null, propagationTags, null, tracePropagationStyle);
    }

    public ExtractedContext(com.datadog.trace.api.DDTraceId dDTraceId, long j, int i, java.lang.CharSequence charSequence, long j2, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders httpHeaders, com.datadog.trace.core.propagation.PropagationTags propagationTags, com.datadog.trace.api.TraceConfig traceConfig, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle) {
        super(charSequence, map2, httpHeaders, map, i, traceConfig, tracePropagationStyle);
        this.Camera2StreamConfigurationMap = dDTraceId;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighSpeedVideoSizes = propagationTags;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.TagContext, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public final com.datadog.trace.api.DDTraceId getTraceId() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.TagContext, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public final long getSpanId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final long getEndToEndStartTime() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.datadog.trace.core.propagation.PropagationTags getPropagationTags() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.TagContext
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtractedContext{");
        if (this.Camera2StreamConfigurationMap != null) {
            sb.append("traceId=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", ");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            sb.append("endToEndStartTime=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", ");
        }
        if (this.getHighSpeedVideoFpsRanges != 0) {
            sb.append("spanId=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", ");
        }
        if (getOrigin() != null) {
            sb.append("origin=");
            sb.append(getOrigin());
            sb.append(", ");
        }
        if (getTags() != null) {
            sb.append("tags=");
            sb.append(getTags());
            sb.append(", ");
        }
        if (getBaggage() != null) {
            sb.append("baggage=");
            sb.append(getBaggage());
            sb.append(", ");
        }
        if (getTraceSamplingPriority() != -128) {
            sb.append("samplingPriority=");
            sb.append(getTraceSamplingPriority());
            sb.append(", ");
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
