package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface InterfaceAnalytics {
    public static final int PluginType = 2;

    java.lang.String getPluginVersion();

    java.lang.String getSDKVersion();

    void logError(java.lang.String str, java.lang.String str2);

    void logEvent(java.lang.String str);

    void logEvent(java.lang.String str, java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    void logTimedEventBegin(java.lang.String str);

    void logTimedEventEnd(java.lang.String str);

    void setCaptureUncaughtException(boolean z);

    void setDebugMode(boolean z);

    void setSessionContinueMillis(int i);

    void startSession(java.lang.String str);

    void stopSession();
}
