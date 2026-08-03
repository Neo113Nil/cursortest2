package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface InterfaceIAP {
    public static final int PluginType = 3;

    void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    java.lang.String getPluginVersion();

    java.lang.String getSDKVersion();

    void payForProduct(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    void setDebugMode(boolean z);
}
