package org.slf4j.event;

/* loaded from: classes18.dex */
public interface LoggingEvent {
    java.lang.Object[] getArgumentArray();

    java.util.List<java.lang.Object> getArguments();

    default java.lang.String getCallerBoundary() {
        return null;
    }

    java.util.List<org.slf4j.event.KeyValuePair> getKeyValuePairs();

    org.slf4j.event.Level getLevel();

    java.lang.String getLoggerName();

    java.util.List<org.slf4j.Marker> getMarkers();

    java.lang.String getMessage();

    java.lang.String getThreadName();

    java.lang.Throwable getThrowable();

    long getTimeStamp();
}
