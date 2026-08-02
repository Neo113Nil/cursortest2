package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class SubstituteLoggerFactory implements org.slf4j.ILoggerFactory {
    volatile boolean getHighSpeedVideoFpsRanges = false;
    final java.util.Map<java.lang.String, org.slf4j.helpers.SubstituteLogger> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap();
    final java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.SubstituteLoggingEvent> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.LinkedBlockingQueue<>();

    @Override // org.slf4j.ILoggerFactory
    public org.slf4j.Logger getLogger(java.lang.String str) {
        org.slf4j.helpers.SubstituteLogger substituteLogger;
        synchronized (this) {
            substituteLogger = this.Camera2StreamConfigurationMap.get(str);
            if (substituteLogger == null) {
                substituteLogger = new org.slf4j.helpers.SubstituteLogger(str, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                this.Camera2StreamConfigurationMap.put(str, substituteLogger);
            }
        }
        return substituteLogger;
    }

    public java.util.List<java.lang.String> getLoggerNames() {
        return new java.util.ArrayList(this.Camera2StreamConfigurationMap.keySet());
    }

    public java.util.List<org.slf4j.helpers.SubstituteLogger> getLoggers() {
        return new java.util.ArrayList(this.Camera2StreamConfigurationMap.values());
    }

    public java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.SubstituteLoggingEvent> getEventQueue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void postInitialization() {
        this.getHighSpeedVideoFpsRanges = true;
    }

    public void clear() {
        this.Camera2StreamConfigurationMap.clear();
        this.getHighSpeedVideoFpsRangesFor.clear();
    }
}
