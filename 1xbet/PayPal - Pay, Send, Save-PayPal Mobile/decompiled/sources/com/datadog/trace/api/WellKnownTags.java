package com.datadog.trace.api;

/* loaded from: classes8.dex */
public class WellKnownTags {
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString Camera2StreamConfigurationMap;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHighSpeedVideoFpsRangesFor;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHighSpeedVideoSizes;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getOutputMinFrameDuration;

    public WellKnownTags(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, java.lang.CharSequence charSequence5, java.lang.CharSequence charSequence6) {
        this.Camera2StreamConfigurationMap = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(charSequence);
        this.getHighSpeedVideoFpsRangesFor = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(charSequence2);
        this.getHighSpeedVideoFpsRanges = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(charSequence3);
        this.getHighSpeedVideoSizes = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(charSequence4);
        this.getOutputMinFrameDuration = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(charSequence5);
        this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(charSequence6);
    }

    public com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getRuntimeId() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getHostname() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getEnv() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getService() {
        return this.getHighSpeedVideoSizes;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getVersion() {
        return this.getOutputMinFrameDuration;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString getLanguage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
