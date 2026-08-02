package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class SubstituteLogger implements org.slf4j.Logger {
    private java.lang.Boolean Camera2StreamConfigurationMap;
    public final boolean createdPostInitialization;
    private org.slf4j.event.EventRecordingLogger getHighResolutionOutputSizeshNQ4ISI;
    private volatile org.slf4j.Logger getHighSpeedVideoFpsRanges;
    private final java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> getHighSpeedVideoFpsRangesFor;
    private java.lang.reflect.Method getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;

    public SubstituteLogger(java.lang.String str, java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> queue, boolean z) {
        this.getHighSpeedVideoSizesFor = str;
        this.getHighSpeedVideoFpsRangesFor = queue;
        this.createdPostInitialization = z;
    }

    @Override // org.slf4j.Logger
    public java.lang.String getName() {
        return this.getHighSpeedVideoSizesFor;
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
        return obj != null && getClass() == obj.getClass() && this.getHighSpeedVideoSizesFor.equals(((org.slf4j.helpers.SubstituteLogger) obj).getHighSpeedVideoSizesFor);
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizesFor.hashCode();
    }

    public org.slf4j.Logger delegate() {
        if (this.getHighSpeedVideoFpsRanges != null) {
            return this.getHighSpeedVideoFpsRanges;
        }
        if (this.createdPostInitialization) {
            return org.slf4j.helpers.NOPLogger.NOP_LOGGER;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.slf4j.event.EventRecordingLogger(this, this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDelegate(org.slf4j.Logger logger) {
        this.getHighSpeedVideoFpsRanges = logger;
    }

    public boolean isDelegateEventAware() {
        java.lang.Boolean bool = this.Camera2StreamConfigurationMap;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getClass().getMethod("log", org.slf4j.event.LoggingEvent.class);
            this.Camera2StreamConfigurationMap = java.lang.Boolean.TRUE;
        } catch (java.lang.NoSuchMethodException unused) {
            this.Camera2StreamConfigurationMap = java.lang.Boolean.FALSE;
        }
        return this.Camera2StreamConfigurationMap.booleanValue();
    }

    public void log(org.slf4j.event.LoggingEvent loggingEvent) {
        if (isDelegateEventAware()) {
            try {
                this.getHighSpeedVideoSizes.invoke(this.getHighSpeedVideoFpsRanges, loggingEvent);
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    public boolean isDelegateNull() {
        return this.getHighSpeedVideoFpsRanges == null;
    }

    public boolean isDelegateNOP() {
        return this.getHighSpeedVideoFpsRanges instanceof org.slf4j.helpers.NOPLogger;
    }
}
