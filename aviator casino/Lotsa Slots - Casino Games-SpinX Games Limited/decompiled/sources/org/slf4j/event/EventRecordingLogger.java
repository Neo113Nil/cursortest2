package org.slf4j.event;

/* loaded from: classes6.dex */
public class EventRecordingLogger extends org.slf4j.helpers.LegacyAbstractLogger {
    static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    java.util.Queue<org.slf4j.event.SubstituteLoggingEvent> eventQueue;
    org.slf4j.helpers.SubstituteLogger logger;
    java.lang.String name;

    @Override // org.slf4j.helpers.AbstractLogger
    protected java.lang.String getFullyQualifiedCallerName() {
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
        this.logger = substituteLogger;
        this.name = substituteLogger.getName();
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.AbstractLogger, org.slf4j.Logger
    public java.lang.String getName() {
        return this.name;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    protected void handleNormalizedLoggingCall(org.slf4j.event.Level level, org.slf4j.Marker marker, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        org.slf4j.event.SubstituteLoggingEvent substituteLoggingEvent = new org.slf4j.event.SubstituteLoggingEvent();
        substituteLoggingEvent.setTimeStamp(java.lang.System.currentTimeMillis());
        substituteLoggingEvent.setLevel(level);
        substituteLoggingEvent.setLogger(this.logger);
        substituteLoggingEvent.setLoggerName(this.name);
        if (marker != null) {
            substituteLoggingEvent.addMarker(marker);
        }
        substituteLoggingEvent.setMessage(str);
        substituteLoggingEvent.setThreadName(java.lang.Thread.currentThread().getName());
        substituteLoggingEvent.setArgumentArray(objArr);
        substituteLoggingEvent.setThrowable(th);
        this.eventQueue.add(substituteLoggingEvent);
    }
}
