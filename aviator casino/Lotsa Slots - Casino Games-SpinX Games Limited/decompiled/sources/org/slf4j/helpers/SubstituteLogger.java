package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class SubstituteLogger implements org.slf4j.Logger {
    private volatile org.slf4j.Logger _delegate;
    public final boolean createdPostInitialization;
    private java.lang.Boolean delegateEventAware;
    private final java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> eventQueue;
    private org.slf4j.event.EventRecordingLogger eventRecordingLogger;
    private java.lang.reflect.Method logMethodCache;
    private final java.lang.String name;

    public SubstituteLogger(java.lang.String str, java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> queue, boolean z) {
        this.name = str;
        this.eventQueue = queue;
        this.createdPostInitialization = z;
    }

    @Override // org.slf4j.Logger
    public java.lang.String getName() {
        return this.name;
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level level) {
        return delegate().makeLoggingEventBuilder(level);
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder atLevel(org.slf4j.event.Level level) {
        return delegate().atLevel(level);
    }

    @Override // org.slf4j.Logger
    public boolean isEnabledForLevel(org.slf4j.event.Level level) {
        return delegate().isEnabledForLevel(level);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return delegate().isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str) {
        delegate().trace(str);
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object obj) {
        delegate().trace(str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().trace(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object... objArr) {
        delegate().trace(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Throwable th) {
        delegate().trace(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(org.slf4j.Marker marker) {
        return delegate().isTraceEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str) {
        delegate().trace(marker, str);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        delegate().trace(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().trace(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        delegate().trace(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        delegate().trace(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder atTrace() {
        return delegate().atTrace();
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return delegate().isDebugEnabled();
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str) {
        delegate().debug(str);
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object obj) {
        delegate().debug(str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().debug(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object... objArr) {
        delegate().debug(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Throwable th) {
        delegate().debug(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(org.slf4j.Marker marker) {
        return delegate().isDebugEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str) {
        delegate().debug(marker, str);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        delegate().debug(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().debug(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        delegate().debug(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        delegate().debug(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder atDebug() {
        return delegate().atDebug();
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return delegate().isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str) {
        delegate().info(str);
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object obj) {
        delegate().info(str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().info(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object... objArr) {
        delegate().info(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Throwable th) {
        delegate().info(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(org.slf4j.Marker marker) {
        return delegate().isInfoEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str) {
        delegate().info(marker, str);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        delegate().info(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().info(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        delegate().info(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        delegate().info(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder atInfo() {
        return delegate().atInfo();
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return delegate().isWarnEnabled();
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str) {
        delegate().warn(str);
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object obj) {
        delegate().warn(str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().warn(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object... objArr) {
        delegate().warn(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Throwable th) {
        delegate().warn(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(org.slf4j.Marker marker) {
        return delegate().isWarnEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str) {
        delegate().warn(marker, str);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        delegate().warn(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().warn(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        delegate().warn(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        delegate().warn(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder atWarn() {
        return delegate().atWarn();
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return delegate().isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str) {
        delegate().error(str);
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object obj) {
        delegate().error(str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().error(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object... objArr) {
        delegate().error(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Throwable th) {
        delegate().error(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(org.slf4j.Marker marker) {
        return delegate().isErrorEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str) {
        delegate().error(marker, str);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        delegate().error(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        delegate().error(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        delegate().error(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        delegate().error(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public org.slf4j.spi.LoggingEventBuilder atError() {
        return delegate().atError();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.name.equals(((org.slf4j.helpers.SubstituteLogger) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public org.slf4j.Logger delegate() {
        if (this._delegate != null) {
            return this._delegate;
        }
        if (this.createdPostInitialization) {
            return org.slf4j.helpers.NOPLogger.NOP_LOGGER;
        }
        return getEventRecordingLogger();
    }

    private org.slf4j.Logger getEventRecordingLogger() {
        if (this.eventRecordingLogger == null) {
            this.eventRecordingLogger = new org.slf4j.event.EventRecordingLogger(this, this.eventQueue);
        }
        return this.eventRecordingLogger;
    }

    public void setDelegate(org.slf4j.Logger logger) {
        this._delegate = logger;
    }

    public boolean isDelegateEventAware() {
        java.lang.Boolean bool = this.delegateEventAware;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.logMethodCache = this._delegate.getClass().getMethod("log", org.slf4j.event.LoggingEvent.class);
            this.delegateEventAware = java.lang.Boolean.TRUE;
        } catch (java.lang.NoSuchMethodException unused) {
            this.delegateEventAware = java.lang.Boolean.FALSE;
        }
        return this.delegateEventAware.booleanValue();
    }

    public void log(org.slf4j.event.LoggingEvent loggingEvent) {
        if (isDelegateEventAware()) {
            try {
                this.logMethodCache.invoke(this._delegate, loggingEvent);
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    public boolean isDelegateNull() {
        return this._delegate == null;
    }

    public boolean isDelegateNOP() {
        return this._delegate instanceof org.slf4j.helpers.NOPLogger;
    }
}
