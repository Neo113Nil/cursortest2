package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface InterfaceAds {
    public static final int PluginType = 1;

    void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    java.lang.String getPluginVersion();

    java.lang.String getSDKVersion();

    void hideAds(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    void queryPoints();

    void setDebugMode(boolean z);

    void showAds(java.util.Hashtable<java.lang.String, java.lang.String> hashtable, int i);

    void spendPoints(int i);
}
