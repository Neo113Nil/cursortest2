package org.slf4j.helpers;

/* loaded from: classes18.dex */
public abstract class LegacyAbstractLogger extends org.slf4j.helpers.AbstractLogger {
    private static final long serialVersionUID = -7041884104854048950L;

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(org.slf4j.Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(org.slf4j.Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(org.slf4j.Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(org.slf4j.Marker marker) {
        return isWarnEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(org.slf4j.Marker marker) {
        return isErrorEnabled();
    }
}
