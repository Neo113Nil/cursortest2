package com.datadog.trace.core;

/* loaded from: classes8.dex */
public final class Metadata {
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final long getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final java.util.Map<java.lang.String, java.lang.Object> getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getOutputMinFrameDuration;

    public Metadata(long j, com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString uTF8BytesString, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2, int i, boolean z, boolean z2, com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString uTF8BytesString2, java.lang.CharSequence charSequence, int i2) {
        this.getHighSpeedVideoSizesFor = j;
        this.getOutputMinFrameDuration = uTF8BytesString;
        this.Camera2StreamConfigurationMap = uTF8BytesString2;
        this.getInputSizeshNQ4ISI = map;
        this.getHighResolutionOutputSizeshNQ4ISI = map2;
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRanges = z;
        this.getOutputFormats = z2;
        this.getHighSpeedVideoFpsRangesFor = charSequence;
        this.getHighSpeedVideoSizes = i2;
    }

    public final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHttpStatusCode() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.CharSequence getOrigin() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final long getThreadId() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getThreadName() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getTags() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getBaggage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean measured() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int longRunningVersion() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean topLevel() {
        return this.getOutputFormats;
    }

    public final boolean hasSamplingPriority() {
        return this.getInputFormats != -128;
    }

    public final int samplingPriority() {
        return this.getInputFormats;
    }
}
