package org.slf4j.event;

/* loaded from: classes6.dex */
public interface LoggingEvent {

    /* renamed from: org.slf4j.event.LoggingEvent$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.lang.String $default$getCallerBoundary(org.slf4j.event.LoggingEvent _this) {
            return null;
        }
    }

    java.lang.Object[] getArgumentArray();

    java.util.List<java.lang.Object> getArguments();

    java.lang.String getCallerBoundary();

    java.util.List<org.slf4j.event.KeyValuePair> getKeyValuePairs();

    org.slf4j.event.Level getLevel();

    java.lang.String getLoggerName();

    java.util.List<org.slf4j.Marker> getMarkers();

    java.lang.String getMessage();

    java.lang.String getThreadName();

    java.lang.Throwable getThrowable();

    long getTimeStamp();
}
