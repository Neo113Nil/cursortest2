package org.slf4j.helpers;

/* loaded from: classes18.dex */
public abstract class AbstractLogger implements org.slf4j.Logger, java.io.Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    /* renamed from: name, reason: collision with root package name */
    protected java.lang.String f7056name;

    protected abstract java.lang.String getFullyQualifiedCallerName();

    protected abstract void handleNormalizedLoggingCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th);

    @Override // org.slf4j.Logger
    public java.lang.String getName() {
        return this.f7056name;
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
        return org.slf4j.LoggerFactory.getLogger(getName());
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str) {
        if (isTraceEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.TRACE, null, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object obj) {
        if (isTraceEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.TRACE, null, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isTraceEnabled()) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.TRACE, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Object... objArr) {
        if (isTraceEnabled()) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.TRACE, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(java.lang.String str, java.lang.Throwable th) {
        if (isTraceEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.TRACE, null, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str) {
        if (isTraceEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.TRACE, marker, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isTraceEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.TRACE, marker, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isTraceEnabled(marker)) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.TRACE, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isTraceEnabled(marker)) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.TRACE, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isTraceEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.TRACE, marker, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str) {
        if (isDebugEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.DEBUG, null, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object obj) {
        if (isDebugEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.DEBUG, null, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isDebugEnabled()) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Object... objArr) {
        if (isDebugEnabled()) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.DEBUG, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(java.lang.String str, java.lang.Throwable th) {
        if (isDebugEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.DEBUG, null, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str) {
        if (isDebugEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.DEBUG, marker, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isDebugEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.DEBUG, marker, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isDebugEnabled(marker)) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.DEBUG, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isDebugEnabled(marker)) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.DEBUG, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isDebugEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.DEBUG, marker, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str) {
        if (isInfoEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.INFO, null, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object obj) {
        if (isInfoEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.INFO, null, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isInfoEnabled()) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.INFO, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Object... objArr) {
        if (isInfoEnabled()) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.INFO, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void info(java.lang.String str, java.lang.Throwable th) {
        if (isInfoEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.INFO, null, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str) {
        if (isInfoEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.INFO, marker, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isInfoEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.INFO, marker, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isInfoEnabled(marker)) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.INFO, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isInfoEnabled(marker)) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.INFO, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isInfoEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.INFO, marker, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str) {
        if (isWarnEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.WARN, null, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object obj) {
        if (isWarnEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.WARN, null, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isWarnEnabled()) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.WARN, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Object... objArr) {
        if (isWarnEnabled()) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.WARN, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(java.lang.String str, java.lang.Throwable th) {
        if (isWarnEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.WARN, null, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str) {
        if (isWarnEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.WARN, marker, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isWarnEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.WARN, marker, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isWarnEnabled(marker)) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.WARN, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isWarnEnabled(marker)) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.WARN, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isWarnEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.WARN, marker, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str) {
        if (isErrorEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.ERROR, null, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object obj) {
        if (isErrorEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.ERROR, null, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isErrorEnabled()) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.ERROR, null, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Object... objArr) {
        if (isErrorEnabled()) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.ERROR, null, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void error(java.lang.String str, java.lang.Throwable th) {
        if (isErrorEnabled()) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.ERROR, null, str, null, th);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str) {
        if (isErrorEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.ERROR, marker, str, null, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        if (isErrorEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.ERROR, marker, str, new java.lang.Object[]{obj}, null);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (isErrorEnabled(marker)) {
            getHighSpeedVideoFpsRanges(org.slf4j.event.Level.ERROR, marker, str, obj, obj2);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        if (isErrorEnabled(marker)) {
            getHighSpeedVideoSizes(org.slf4j.event.Level.ERROR, marker, str, objArr);
        }
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        if (isErrorEnabled(marker)) {
            handleNormalizedLoggingCall(org.slf4j.event.Level.ERROR, marker, str, null, th);
        }
    }

    private void getHighSpeedVideoFpsRanges(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 instanceof java.lang.Throwable) {
            handleNormalizedLoggingCall(level, marker, str, new java.lang.Object[]{obj}, (java.lang.Throwable) obj2);
        } else {
            handleNormalizedLoggingCall(level, marker, str, new java.lang.Object[]{obj, obj2}, null);
        }
    }

    private void getHighSpeedVideoSizes(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.Throwable throwableCandidate = org.slf4j.helpers.MessageFormatter.getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            handleNormalizedLoggingCall(level, marker, str, org.slf4j.helpers.MessageFormatter.trimmedCopy(objArr), throwableCandidate);
        } else {
            handleNormalizedLoggingCall(level, marker, str, objArr, null);
        }
    }
}
