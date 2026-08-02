package org.slf4j.event;

/* loaded from: classes18.dex */
public class SubstituteLoggingEvent implements org.slf4j.event.LoggingEvent {
    java.lang.Object[] Camera2StreamConfigurationMap;
    org.slf4j.helpers.SubstituteLogger getHighResolutionOutputSizeshNQ4ISI;
    java.util.List<org.slf4j.event.KeyValuePair> getHighSpeedVideoFpsRanges;
    org.slf4j.event.Level getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighSpeedVideoSizes;
    java.lang.String getHighSpeedVideoSizesFor;
    java.lang.String getInputFormats;
    long getInputSizeshNQ4ISI;
    java.util.List<org.slf4j.Marker> getOutputFormats;
    java.lang.Throwable getOutputMinFrameDuration;

    @Override // org.slf4j.event.LoggingEvent
    public org.slf4j.event.Level getLevel() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setLevel(org.slf4j.event.Level level) {
        this.getHighSpeedVideoFpsRangesFor = level;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.Marker> getMarkers() {
        return this.getOutputFormats;
    }

    public void addMarker(org.slf4j.Marker marker) {
        if (marker == null) {
            return;
        }
        if (this.getOutputFormats == null) {
            this.getOutputFormats = new java.util.ArrayList(2);
        }
        this.getOutputFormats.add(marker);
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getLoggerName() {
        return this.getHighSpeedVideoSizes;
    }

    public void setLoggerName(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public org.slf4j.helpers.SubstituteLogger getLogger() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setLogger(org.slf4j.helpers.SubstituteLogger substituteLogger) {
        this.getHighResolutionOutputSizeshNQ4ISI = substituteLogger;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getMessage() {
        return this.getInputFormats;
    }

    public void setMessage(java.lang.String str) {
        this.getInputFormats = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Object[] getArgumentArray() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setArgumentArray(java.lang.Object[] objArr) {
        this.Camera2StreamConfigurationMap = objArr;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<java.lang.Object> getArguments() {
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        if (objArr == null) {
            return null;
        }
        return java.util.Arrays.asList(objArr);
    }

    @Override // org.slf4j.event.LoggingEvent
    public long getTimeStamp() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setTimeStamp(long j) {
        this.getInputSizeshNQ4ISI = j;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getThreadName() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setThreadName(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Throwable getThrowable() {
        return this.getOutputMinFrameDuration;
    }

    public void setThrowable(java.lang.Throwable th) {
        this.getOutputMinFrameDuration = th;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.event.KeyValuePair> getKeyValuePairs() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
