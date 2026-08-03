package org.slf4j.event;

/* loaded from: classes6.dex */
public class SubstituteLoggingEvent implements org.slf4j.event.LoggingEvent {
    java.lang.Object[] argArray;
    java.util.List<org.slf4j.event.KeyValuePair> keyValuePairList;
    org.slf4j.event.Level level;
    org.slf4j.helpers.SubstituteLogger logger;
    java.lang.String loggerName;
    java.util.List<org.slf4j.Marker> markers;
    java.lang.String message;
    java.lang.String threadName;
    java.lang.Throwable throwable;
    long timeStamp;

    @Override // org.slf4j.event.LoggingEvent
    public /* synthetic */ java.lang.String getCallerBoundary() {
        return org.slf4j.event.LoggingEvent.CC.$default$getCallerBoundary(this);
    }

    @Override // org.slf4j.event.LoggingEvent
    public org.slf4j.event.Level getLevel() {
        return this.level;
    }

    public void setLevel(org.slf4j.event.Level level) {
        this.level = level;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.Marker> getMarkers() {
        return this.markers;
    }

    public void addMarker(org.slf4j.Marker marker) {
        if (marker == null) {
            return;
        }
        if (this.markers == null) {
            this.markers = new java.util.ArrayList(2);
        }
        this.markers.add(marker);
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getLoggerName() {
        return this.loggerName;
    }

    public void setLoggerName(java.lang.String str) {
        this.loggerName = str;
    }

    public org.slf4j.helpers.SubstituteLogger getLogger() {
        return this.logger;
    }

    public void setLogger(org.slf4j.helpers.SubstituteLogger substituteLogger) {
        this.logger = substituteLogger;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Object[] getArgumentArray() {
        return this.argArray;
    }

    public void setArgumentArray(java.lang.Object[] objArr) {
        this.argArray = objArr;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<java.lang.Object> getArguments() {
        java.lang.Object[] objArr = this.argArray;
        if (objArr == null) {
            return null;
        }
        return java.util.Arrays.asList(objArr);
    }

    @Override // org.slf4j.event.LoggingEvent
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getThreadName() {
        return this.threadName;
    }

    public void setThreadName(java.lang.String str) {
        this.threadName = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public void setThrowable(java.lang.Throwable th) {
        this.throwable = th;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.event.KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairList;
    }
}
