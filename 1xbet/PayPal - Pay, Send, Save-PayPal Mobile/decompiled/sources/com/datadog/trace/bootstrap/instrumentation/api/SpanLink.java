package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public class SpanLink implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink {
    private final long Camera2StreamConfigurationMap;
    private final com.datadog.trace.api.DDTraceId getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes getHighSpeedVideoFpsRangesFor;
    private final byte getHighSpeedVideoSizes;

    public SpanLink(com.datadog.trace.api.DDTraceId dDTraceId, long j, byte b, java.lang.String str, com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes attributes) {
        this.getHighResolutionOutputSizeshNQ4ISI = dDTraceId;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = b;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = attributes;
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.SpanLink from(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context) {
        return from(context, (byte) 0, "", com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.EMPTY);
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.SpanLink from(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, byte b, java.lang.String str, com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes attributes) {
        if (context.getTraceSamplingPriority() > 0) {
            b = (byte) (b | 1);
        }
        return new com.datadog.trace.bootstrap.instrumentation.api.SpanLink(context.getTraceId(), context.getSpanId(), b, str, attributes);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink
    public com.datadog.trace.api.DDTraceId traceId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink
    public long spanId() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink
    public byte traceFlags() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink
    public java.lang.String traceState() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink.Attributes attributes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanLink{traceId=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", spanId=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", traceFlags=");
        sb.append((int) this.getHighSpeedVideoSizes);
        sb.append(", traceState='");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("', attributes=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
