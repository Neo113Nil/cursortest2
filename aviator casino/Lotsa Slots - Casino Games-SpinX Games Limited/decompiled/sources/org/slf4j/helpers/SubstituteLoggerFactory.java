package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class SubstituteLoggerFactory implements org.slf4j.ILoggerFactory {
    volatile boolean postInitialization = false;
    final java.util.Map<java.lang.String, org.slf4j.helpers.SubstituteLogger> loggers = new java.util.concurrent.ConcurrentHashMap();
    final java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.SubstituteLoggingEvent> eventQueue = new java.util.concurrent.LinkedBlockingQueue<>();

    @Override // org.slf4j.ILoggerFactory
    public synchronized org.slf4j.Logger getLogger(java.lang.String str) {
        org.slf4j.helpers.SubstituteLogger substituteLogger;
        substituteLogger = this.loggers.get(str);
        if (substituteLogger == null) {
            substituteLogger = new org.slf4j.helpers.SubstituteLogger(str, this.eventQueue, this.postInitialization);
            this.loggers.put(str, substituteLogger);
        }
        return substituteLogger;
    }

    public java.util.List<java.lang.String> getLoggerNames() {
        return new java.util.ArrayList(this.loggers.keySet());
    }

    public java.util.List<org.slf4j.helpers.SubstituteLogger> getLoggers() {
        return new java.util.ArrayList(this.loggers.values());
    }

    public java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.SubstituteLoggingEvent> getEventQueue() {
        return this.eventQueue;
    }

    public void postInitialization() {
        this.postInitialization = true;
    }

    public void clear() {
        this.loggers.clear();
        this.eventQueue.clear();
    }
}
