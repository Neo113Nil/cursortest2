package org.slf4j;

/* loaded from: classes3.dex */
public interface Logger {
    public static final java.lang.String ROOT_LOGGER_NAME = "ROOT";

    void debug(java.lang.String str);

    void debug(java.lang.String str, java.lang.Object obj);

    void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void debug(java.lang.String str, java.lang.Throwable th);

    void debug(java.lang.String str, java.lang.Object... objArr);

    void debug(org.slf4j.Marker marker, java.lang.String str);

    void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj);

    void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th);

    void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr);

    void error(java.lang.String str);

    void error(java.lang.String str, java.lang.Object obj);

    void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void error(java.lang.String str, java.lang.Throwable th);

    void error(java.lang.String str, java.lang.Object... objArr);

    void error(org.slf4j.Marker marker, java.lang.String str);

    void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj);

    void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th);

    void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr);

    java.lang.String getName();

    void info(java.lang.String str);

    void info(java.lang.String str, java.lang.Object obj);

    void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void info(java.lang.String str, java.lang.Throwable th);

    void info(java.lang.String str, java.lang.Object... objArr);

    void info(org.slf4j.Marker marker, java.lang.String str);

    void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj);

    void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th);

    void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr);

    boolean isDebugEnabled();

    boolean isDebugEnabled(org.slf4j.Marker marker);

    boolean isErrorEnabled();

    boolean isErrorEnabled(org.slf4j.Marker marker);

    boolean isInfoEnabled();

    boolean isInfoEnabled(org.slf4j.Marker marker);

    boolean isTraceEnabled();

    boolean isTraceEnabled(org.slf4j.Marker marker);

    boolean isWarnEnabled();

    boolean isWarnEnabled(org.slf4j.Marker marker);

    void trace(java.lang.String str);

    void trace(java.lang.String str, java.lang.Object obj);

    void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void trace(java.lang.String str, java.lang.Throwable th);

    void trace(java.lang.String str, java.lang.Object... objArr);

    void trace(org.slf4j.Marker marker, java.lang.String str);

    void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj);

    void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th);

    void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr);

    void warn(java.lang.String str);

    void warn(java.lang.String str, java.lang.Object obj);

    void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void warn(java.lang.String str, java.lang.Throwable th);

    void warn(java.lang.String str, java.lang.Object... objArr);

    void warn(org.slf4j.Marker marker, java.lang.String str);

    void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj);

    void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th);

    void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr);

    default org.slf4j.spi.LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level level) {
        return new org.slf4j.spi.DefaultLoggingEventBuilder(this, level);
    }

    @org.slf4j.helpers.CheckReturnValue
    default org.slf4j.spi.LoggingEventBuilder atLevel(org.slf4j.event.Level level) {
        if (isEnabledForLevel(level)) {
            return makeLoggingEventBuilder(level);
        }
        return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
    }

    default boolean isEnabledForLevel(org.slf4j.event.Level level) {
        int i = level.toInt();
        if (i == 0) {
            return isTraceEnabled();
        }
        if (i == 10) {
            return isDebugEnabled();
        }
        if (i == 20) {
            return isInfoEnabled();
        }
        if (i == 30) {
            return isWarnEnabled();
        }
        if (i == 40) {
            return isErrorEnabled();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Level [");
        sb.append(level);
        sb.append("] not recognized.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @org.slf4j.helpers.CheckReturnValue
    default org.slf4j.spi.LoggingEventBuilder atTrace() {
        if (isTraceEnabled()) {
            return makeLoggingEventBuilder(org.slf4j.event.Level.TRACE);
        }
        return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
    }

    @org.slf4j.helpers.CheckReturnValue
    default org.slf4j.spi.LoggingEventBuilder atDebug() {
        if (isDebugEnabled()) {
            return makeLoggingEventBuilder(org.slf4j.event.Level.DEBUG);
        }
        return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
    }

    @org.slf4j.helpers.CheckReturnValue
    default org.slf4j.spi.LoggingEventBuilder atInfo() {
        if (isInfoEnabled()) {
            return makeLoggingEventBuilder(org.slf4j.event.Level.INFO);
        }
        return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
    }

    @org.slf4j.helpers.CheckReturnValue
    default org.slf4j.spi.LoggingEventBuilder atWarn() {
        if (isWarnEnabled()) {
            return makeLoggingEventBuilder(org.slf4j.event.Level.WARN);
        }
        return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
    }

    @org.slf4j.helpers.CheckReturnValue
    default org.slf4j.spi.LoggingEventBuilder atError() {
        if (isErrorEnabled()) {
            return makeLoggingEventBuilder(org.slf4j.event.Level.ERROR);
        }
        return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
    }
}
