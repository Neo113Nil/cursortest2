package org.slf4j.helpers;

/* loaded from: classes6.dex */
public abstract class AbstractLogger implements org.slf4j.Logger, java.io.Serializable {
    private static final long serialVersionUID = -2529255052481744503L;
    protected java.lang.String name;

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atDebug() {
        return org.slf4j.Logger.CC.$default$atDebug(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atError() {
        return org.slf4j.Logger.CC.$default$atError(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atInfo() {
        return org.slf4j.Logger.CC.$default$atInfo(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atLevel(org.slf4j.event.Level level) {
        return org.slf4j.Logger.CC.$default$atLevel(this, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atTrace() {
        return org.slf4j.Logger.CC.$default$atTrace(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder atWarn() {
        return org.slf4j.Logger.CC.$default$atWarn(this);
    }

    protected abstract java.lang.String getFullyQualifiedCallerName();

    protected abstract void handleNormalizedLoggingCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th);

    @Override // org.slf4j.Logger
    public /* synthetic */ boolean isEnabledForLevel(org.slf4j.event.Level level) {
        return org.slf4j.Logger.CC.$default$isEnabledForLevel(this, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ org.slf4j.spi.LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level level) {
        return org.slf4j.Logger.CC.$default$makeLoggingEventBuilder(this, level);
    }

    @Override // org.slf4j.Logger
    public java.lang.String getName() {
        return this.name;
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return org.slf4j.LoggerFactory.getLogger(getName());
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.TRACE, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object obj) {
        if (isTraceEnabled()) {
            handle_1ArgsCall(org.slf4j.event.Level.TRACE, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isTraceEnabled()) {
            handle2ArgsCall(org.slf4j.event.Level.TRACE, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object... objArr) {
        if (isTraceEnabled()) {
            handleArgArrayCall(org.slf4j.event.Level.TRACE, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Throwable th) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.TRACE, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.TRACE, marker, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isTraceEnabled(marker)) {
            handle_1ArgsCall(org.slf4j.event.Level.TRACE, marker, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isTraceEnabled(marker)) {
            handle2ArgsCall(org.slf4j.event.Level.TRACE, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isTraceEnabled(marker)) {
            handleArgArrayCall(org.slf4j.event.Level.TRACE, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.TRACE, marker, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.DEBUG, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object obj) {
        if (isDebugEnabled()) {
            handle_1ArgsCall(org.slf4j.event.Level.DEBUG, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isDebugEnabled()) {
            handle2ArgsCall(org.slf4j.event.Level.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object... objArr) {
        if (isDebugEnabled()) {
            handleArgArrayCall(org.slf4j.event.Level.DEBUG, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Throwable th) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.DEBUG, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.DEBUG, marker, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isDebugEnabled(marker)) {
            handle_1ArgsCall(org.slf4j.event.Level.DEBUG, marker, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isDebugEnabled(marker)) {
            handle2ArgsCall(org.slf4j.event.Level.DEBUG, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isDebugEnabled(marker)) {
            handleArgArrayCall(org.slf4j.event.Level.DEBUG, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.DEBUG, marker, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.INFO, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object obj) {
        if (isInfoEnabled()) {
            handle_1ArgsCall(org.slf4j.event.Level.INFO, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isInfoEnabled()) {
            handle2ArgsCall(org.slf4j.event.Level.INFO, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object... objArr) {
        if (isInfoEnabled()) {
            handleArgArrayCall(org.slf4j.event.Level.INFO, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Throwable th) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.INFO, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.INFO, marker, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isInfoEnabled(marker)) {
            handle_1ArgsCall(org.slf4j.event.Level.INFO, marker, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isInfoEnabled(marker)) {
            handle2ArgsCall(org.slf4j.event.Level.INFO, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isInfoEnabled(marker)) {
            handleArgArrayCall(org.slf4j.event.Level.INFO, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.INFO, marker, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.WARN, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object obj) {
        if (isWarnEnabled()) {
            handle_1ArgsCall(org.slf4j.event.Level.WARN, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isWarnEnabled()) {
            handle2ArgsCall(org.slf4j.event.Level.WARN, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object... objArr) {
        if (isWarnEnabled()) {
            handleArgArrayCall(org.slf4j.event.Level.WARN, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Throwable th) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.WARN, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.WARN, marker, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isWarnEnabled(marker)) {
            handle_1ArgsCall(org.slf4j.event.Level.WARN, marker, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isWarnEnabled(marker)) {
            handle2ArgsCall(org.slf4j.event.Level.WARN, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isWarnEnabled(marker)) {
            handleArgArrayCall(org.slf4j.event.Level.WARN, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.WARN, marker, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.ERROR, null, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object obj) {
        if (isErrorEnabled()) {
            handle_1ArgsCall(org.slf4j.event.Level.ERROR, null, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isErrorEnabled()) {
            handle2ArgsCall(org.slf4j.event.Level.ERROR, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object... objArr) {
        if (isErrorEnabled()) {
            handleArgArrayCall(org.slf4j.event.Level.ERROR, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Throwable th) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(org.slf4j.event.Level.ERROR, null, str, th);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.ERROR, marker, str, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isErrorEnabled(marker)) {
            handle_1ArgsCall(org.slf4j.event.Level.ERROR, marker, str, obj);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isErrorEnabled(marker)) {
            handle2ArgsCall(org.slf4j.event.Level.ERROR, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isErrorEnabled(marker)) {
            handleArgArrayCall(org.slf4j.event.Level.ERROR, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(org.slf4j.event.Level.ERROR, marker, str, th);
        }
    }

    private void handle_0ArgsCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        handleNormalizedLoggingCall(level, marker, str, null, th);
    }

    private void handle_1ArgsCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        handleNormalizedLoggingCall(level, marker, str, new java.lang.Object[]{obj}, null);
    }

    private void handle2ArgsCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 instanceof java.lang.Throwable) {
            handleNormalizedLoggingCall(level, marker, str, new java.lang.Object[]{obj}, (java.lang.Throwable) obj2);
        } else {
            handleNormalizedLoggingCall(level, marker, str, new java.lang.Object[]{obj, obj2}, null);
        }
    }

    private void handleArgArrayCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.Throwable throwableCandidate = org.slf4j.helpers.MessageFormatter.getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            handleNormalizedLoggingCall(level, marker, str, org.slf4j.helpers.MessageFormatter.trimmedCopy(objArr), throwableCandidate);
        } else {
            handleNormalizedLoggingCall(level, marker, str, objArr, null);
        }
    }
}
