package com.sun.jna;

/* loaded from: classes16.dex */
public class CallbackThreadInitializer {
    private boolean Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.ThreadGroup getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;

    public CallbackThreadInitializer() {
        this(true);
    }

    public CallbackThreadInitializer(boolean z) {
        this(z, false);
    }

    public CallbackThreadInitializer(boolean z, boolean z2) {
        this(z, z2, null);
    }

    public CallbackThreadInitializer(boolean z, boolean z2, java.lang.String str) {
        this(z, z2, str, null);
    }

    public CallbackThreadInitializer(boolean z, boolean z2, java.lang.String str, java.lang.ThreadGroup threadGroup) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = threadGroup;
    }

    public java.lang.String getName(com.sun.jna.Callback callback) {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.ThreadGroup getThreadGroup(com.sun.jna.Callback callback) {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isDaemon(com.sun.jna.Callback callback) {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean detach(com.sun.jna.Callback callback) {
        return this.Camera2StreamConfigurationMap;
    }
}
