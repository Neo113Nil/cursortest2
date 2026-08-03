package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface InterfaceShare {
    public static final int PluginType = 4;

    void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    java.lang.String getPluginVersion();

    java.lang.String getSDKVersion();

    void setDebugMode(boolean z);

    void share(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);
}
