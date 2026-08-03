package org.slf4j.helpers;

/* loaded from: classes6.dex */
public abstract class MarkerIgnoringBase extends org.slf4j.helpers.NamedLoggerBase implements org.slf4j.Logger {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // org.slf4j.helpers.NamedLoggerBase, org.slf4j.Logger
    public /* bridge */ /* synthetic */ java.lang.String getName() {
        return super.getName();
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(org.slf4j.Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str) {
        trace(str);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        trace(str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        trace(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        trace(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        trace(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(org.slf4j.Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str) {
        debug(str);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        debug(str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        debug(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        debug(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        debug(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(org.slf4j.Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str) {
        info(str);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        info(str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        info(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        info(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        info(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(org.slf4j.Marker marker) {
        return isWarnEnabled();
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str) {
        warn(str);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        warn(str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        warn(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        warn(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        warn(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(org.slf4j.Marker marker) {
        return isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str) {
        error(str);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj) {
        error(str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        error(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Object... objArr) {
        error(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(org.slf4j.Marker marker, java.lang.String str, java.lang.Throwable th) {
        error(str, th);
    }

    public java.lang.String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
