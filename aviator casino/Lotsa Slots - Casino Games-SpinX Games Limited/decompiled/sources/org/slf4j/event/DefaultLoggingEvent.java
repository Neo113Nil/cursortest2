package org.slf4j.event;

/* loaded from: classes6.dex */
public class DefaultLoggingEvent implements org.slf4j.event.LoggingEvent {
    java.util.List<java.lang.Object> arguments;
    java.lang.String callerBoundary;
    java.util.List<org.slf4j.event.KeyValuePair> keyValuePairs;
    org.slf4j.event.Level level;
    org.slf4j.Logger logger;
    java.util.List<org.slf4j.Marker> markers;
    java.lang.String message;
    java.lang.String threadName;
    java.lang.Throwable throwable;
    long timeStamp;

    public DefaultLoggingEvent(org.slf4j.event.Level level, org.slf4j.Logger logger) {
        this.logger = logger;
        this.level = level;
    }

    public void addMarker(org.slf4j.Marker marker) {
        if (this.markers == null) {
            this.markers = new java.util.ArrayList(2);
        }
        this.markers.add(marker);
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.Marker> getMarkers() {
        return this.markers;
    }

    public void addArgument(java.lang.Object obj) {
        getNonNullArguments().add(obj);
    }

    public void addArguments(java.lang.Object... objArr) {
        getNonNullArguments().addAll(java.util.Arrays.asList(objArr));
    }

    private java.util.List<java.lang.Object> getNonNullArguments() {
        if (this.arguments == null) {
            this.arguments = new java.util.ArrayList(3);
        }
        return this.arguments;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<java.lang.Object> getArguments() {
        return this.arguments;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Object[] getArgumentArray() {
        java.util.List<java.lang.Object> list = this.arguments;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    public void addKeyValue(java.lang.String str, java.lang.Object obj) {
        getNonnullKeyValuePairs().add(new org.slf4j.event.KeyValuePair(str, obj));
    }

    private java.util.List<org.slf4j.event.KeyValuePair> getNonnullKeyValuePairs() {
        if (this.keyValuePairs == null) {
            this.keyValuePairs = new java.util.ArrayList(4);
        }
        return this.keyValuePairs;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.util.List<org.slf4j.event.KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    public void setThrowable(java.lang.Throwable th) {
        this.throwable = th;
    }

    @Override // org.slf4j.event.LoggingEvent
    public org.slf4j.event.Level getLevel() {
        return this.level;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getLoggerName() {
        return this.logger.getName();
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getThreadName() {
        return this.threadName;
    }

    @Override // org.slf4j.event.LoggingEvent
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setCallerBoundary(java.lang.String str) {
        this.callerBoundary = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public java.lang.String getCallerBoundary() {
        return this.callerBoundary;
    }
}
