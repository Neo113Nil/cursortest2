package org.slf4j;

/* loaded from: classes6.dex */
public interface Logger {
    public static final java.lang.String ROOT_LOGGER_NAME = "ROOT";

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder atDebug();

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder atError();

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder atInfo();

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder atLevel(org.slf4j.event.Level level);

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder atTrace();

    @org.slf4j.helpers.CheckReturnValue
    org.slf4j.spi.LoggingEventBuilder atWarn();

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

    boolean isEnabledForLevel(org.slf4j.event.Level level);

    boolean isErrorEnabled();

    boolean isErrorEnabled(org.slf4j.Marker marker);

    boolean isInfoEnabled();

    boolean isInfoEnabled(org.slf4j.Marker marker);

    boolean isTraceEnabled();

    boolean isTraceEnabled(org.slf4j.Marker marker);

    boolean isWarnEnabled();

    boolean isWarnEnabled(org.slf4j.Marker marker);

    org.slf4j.spi.LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level level);

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

    /* renamed from: org.slf4j.Logger$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static org.slf4j.spi.LoggingEventBuilder $default$makeLoggingEventBuilder(org.slf4j.Logger _this, org.slf4j.event.Level level) {
            return new org.slf4j.spi.DefaultLoggingEventBuilder(_this, level);
        }

        @org.slf4j.helpers.CheckReturnValue
        public static org.slf4j.spi.LoggingEventBuilder $default$atLevel(org.slf4j.Logger _this, org.slf4j.event.Level level) {
            if (_this.isEnabledForLevel(level)) {
                return _this.makeLoggingEventBuilder(level);
            }
            return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
        }

        public static boolean $default$isEnabledForLevel(org.slf4j.Logger _this, org.slf4j.event.Level level) {
            int i = level.toInt();
            if (i == 0) {
                return _this.isTraceEnabled();
            }
            if (i == 10) {
                return _this.isDebugEnabled();
            }
            if (i == 20) {
                return _this.isInfoEnabled();
            }
            if (i == 30) {
                return _this.isWarnEnabled();
            }
            if (i == 40) {
                return _this.isErrorEnabled();
            }
            throw new java.lang.IllegalArgumentException("Level [" + level + "] not recognized.");
        }

        @org.slf4j.helpers.CheckReturnValue
        public static org.slf4j.spi.LoggingEventBuilder $default$atTrace(org.slf4j.Logger _this) {
            if (_this.isTraceEnabled()) {
                return _this.makeLoggingEventBuilder(org.slf4j.event.Level.TRACE);
            }
            return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
        }

        @org.slf4j.helpers.CheckReturnValue
        public static org.slf4j.spi.LoggingEventBuilder $default$atDebug(org.slf4j.Logger _this) {
            if (_this.isDebugEnabled()) {
                return _this.makeLoggingEventBuilder(org.slf4j.event.Level.DEBUG);
            }
            return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
        }

        @org.slf4j.helpers.CheckReturnValue
        public static org.slf4j.spi.LoggingEventBuilder $default$atInfo(org.slf4j.Logger _this) {
            if (_this.isInfoEnabled()) {
                return _this.makeLoggingEventBuilder(org.slf4j.event.Level.INFO);
            }
            return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
        }

        @org.slf4j.helpers.CheckReturnValue
        public static org.slf4j.spi.LoggingEventBuilder $default$atWarn(org.slf4j.Logger _this) {
            if (_this.isWarnEnabled()) {
                return _this.makeLoggingEventBuilder(org.slf4j.event.Level.WARN);
            }
            return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
        }

        @org.slf4j.helpers.CheckReturnValue
        public static org.slf4j.spi.LoggingEventBuilder $default$atError(org.slf4j.Logger _this) {
            if (_this.isErrorEnabled()) {
                return _this.makeLoggingEventBuilder(org.slf4j.event.Level.ERROR);
            }
            return org.slf4j.spi.NOPLoggingEventBuilder.singleton();
        }
    }
}
