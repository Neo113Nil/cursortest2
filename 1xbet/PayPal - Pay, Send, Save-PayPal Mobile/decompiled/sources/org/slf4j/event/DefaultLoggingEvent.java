package org.slf4j.event;

/* loaded from: classes18.dex */
public class DefaultLoggingEvent implements org.slf4j.event.LoggingEvent {
    org.slf4j.Logger Camera2StreamConfigurationMap;
    java.util.List<org.slf4j.event.KeyValuePair> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    java.util.List<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    org.slf4j.event.Level getHighSpeedVideoSizes;
    java.lang.String getHighSpeedVideoSizesFor;
    java.util.List<org.slf4j.Marker> getInputFormats;
    java.lang.Throwable getInputSizeshNQ4ISI;
    long getOutputFormats;
    java.lang.String getOutputMinFrameDuration;

    public DefaultLoggingEvent(org.slf4j.event.Level level, org.slf4j.Logger logger) {
        this.Camera2StreamConfigurationMap = logger;
        this.getHighSpeedVideoSizes = level;
    }

    public void addMarker(org.slf4j.Marker marker) {
        if (this.getInputFormats == null) {
            this.getInputFormats = new java.util.ArrayList(2);
        }
        this.getInputFormats.add(marker);
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.Marker> getMarkers() {
        return this.getInputFormats;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<java.lang.Object> getArguments() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Object[] getArgumentArray() {
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRangesFor;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.event.KeyValuePair> getKeyValuePairs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setThrowable(java.lang.Throwable th) {
        this.getInputSizeshNQ4ISI = th;
    }

    @Override // org.slf4j.event.LoggingEvent
    public org.slf4j.event.Level getLevel() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getLoggerName() {
        return this.Camera2StreamConfigurationMap.getName();
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getMessage() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setMessage(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Throwable getThrowable() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getThreadName() {
        return this.getOutputMinFrameDuration;
    }

    @Override // org.slf4j.event.LoggingEvent
    public long getTimeStamp() {
        return this.getOutputFormats;
    }

    public void setTimeStamp(long j) {
        this.getOutputFormats = j;
    }

    public void setCallerBoundary(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getCallerBoundary() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void addArgument(java.lang.Object obj) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(3);
        }
        this.getHighSpeedVideoFpsRangesFor.add(obj);
    }

    public void addArguments(java.lang.Object... objArr) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(3);
        }
        this.getHighSpeedVideoFpsRangesFor.addAll(java.util.Arrays.asList(objArr));
    }

    public void addKeyValue(java.lang.String str, java.lang.Object obj) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(4);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.add(new org.slf4j.event.KeyValuePair(str, obj));
    }
}
