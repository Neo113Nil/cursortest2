package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public enum ScopeSource {
    INSTRUMENTATION((byte) 0),
    MANUAL((byte) 1),
    ITERATION((byte) 2);

    private final byte getHighSpeedVideoFpsRanges;

    ScopeSource(byte b) {
        this.getHighSpeedVideoFpsRanges = b;
    }

    public final byte id() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
