package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public interface InterfaceSocial {
    public static final int PluginType = 6;

    void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);

    java.lang.String getPluginVersion();

    java.lang.String getSDKVersion();

    void setDebugMode(boolean z);

    void showAchievements();

    void showLeaderboard(java.lang.String str);

    void submitScore(java.lang.String str, long j);

    void unlockAchievement(java.util.Hashtable<java.lang.String, java.lang.String> hashtable);
}
