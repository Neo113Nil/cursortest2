package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface InterfaceUser {
    public static final int PluginType = 5;

    void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    java.lang.String getPluginVersion();

    java.lang.String getSDKVersion();

    java.lang.String getSessionID();

    boolean isLogined();

    void login();

    void logout();

    void setDebugMode(boolean z);
}
