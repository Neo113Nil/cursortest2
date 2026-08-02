package org.slf4j.event;

/* loaded from: classes18.dex */
public class EventRecordingLogger extends org.slf4j.helpers.LegacyAbstractLogger {
    private static final long serialVersionUID = -176083308134819629L;
    org.slf4j.helpers.SubstituteLogger getHighResolutionOutputSizeshNQ4ISI;
    java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.slf4j.helpers.AbstractLogger
    public java.lang.String getFullyQualifiedCallerName() {
        return null;
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return true;
    }

    public EventRecordingLogger(org.slf4j.helpers.SubstituteLogger substituteLogger, java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> queue) {
        this.getHighResolutionOutputSizeshNQ4ISI = substituteLogger;
        this.getHighSpeedVideoFpsRangesFor = substituteLogger.getName();
        this.getHighSpeedVideoFpsRanges = queue;
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public void handleNormalizedLoggingCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        org.slf4j.event.SubstituteLoggingEvent substituteLoggingEvent = new org.slf4j.event.SubstituteLoggingEvent();
        substituteLoggingEvent.setTimeStamp(java.lang.System.currentTimeMillis());
        substituteLoggingEvent.setLevel(level);
        substituteLoggingEvent.setLogger(this.getHighResolutionOutputSizeshNQ4ISI);
        substituteLoggingEvent.setLoggerName(this.getHighSpeedVideoFpsRangesFor);
        if (marker != null) {
            substituteLoggingEvent.addMarker(marker);
        }
        substituteLoggingEvent.setMessage(str);
        substituteLoggingEvent.setThreadName(java.lang.Thread.currentThread().getName());
        substituteLoggingEvent.setArgumentArray(objArr);
        substituteLoggingEvent.setThrowable(th);
        this.getHighSpeedVideoFpsRanges.add(substituteLoggingEvent);
    }
}
