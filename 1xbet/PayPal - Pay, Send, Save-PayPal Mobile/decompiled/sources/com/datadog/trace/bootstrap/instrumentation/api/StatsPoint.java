package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes8.dex */
public class StatsPoint implements com.datadog.trace.bootstrap.instrumentation.api.InboxItem {
    private final long Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;
    private final long getInputFormats;
    private final long getOutputFormats;

    public StatsPoint(java.util.List<java.lang.String> list, long j, long j2, long j3, long j4, long j5, long j6) {
        this.getHighSpeedVideoFpsRangesFor = list;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = j2;
        this.getInputFormats = j3;
        this.getHighSpeedVideoFpsRanges = j4;
        this.getHighResolutionOutputSizeshNQ4ISI = j5;
        this.getOutputFormats = j6;
    }

    public java.util.List<java.lang.String> getEdgeTags() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public long getHash() {
        return this.Camera2StreamConfigurationMap;
    }

    public long getParentHash() {
        return this.getHighSpeedVideoSizes;
    }

    public long getTimestampNanos() {
        return this.getInputFormats;
    }

    public long getPathwayLatencyNano() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public long getEdgeLatencyNano() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public long getPayloadSizeBytes() {
        return this.getOutputFormats;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsPoint{tags='");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("', hash=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", parentHash=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", timestampNanos=");
        sb.append(this.getInputFormats);
        sb.append(", pathwayLatencyNano=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", edgeLatencyNano=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", payloadSizeBytes=");
        sb.append(this.getOutputFormats);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
