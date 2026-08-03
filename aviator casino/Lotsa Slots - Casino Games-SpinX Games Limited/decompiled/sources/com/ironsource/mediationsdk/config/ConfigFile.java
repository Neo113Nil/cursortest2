package com.ironsource.mediationsdk.config;

/* loaded from: classes5.dex */
public class ConfigFile {
    private static com.ironsource.mediationsdk.config.ConfigFile mInstance;
    private java.lang.String mPluginFrameworkVersion;
    private java.lang.String mPluginType;
    private java.lang.String mPluginVersion;
    private java.lang.String[] mSupportedPlugins = {"AdobeAir", "Cocos2dx", "Cordova", "Corona", "Defold", "Flutter", "ReactNative", "Unity", "Unreal", "MAUI", "Other"};

    public static synchronized com.ironsource.mediationsdk.config.ConfigFile getConfigFile() {
        com.ironsource.mediationsdk.config.ConfigFile configFile;
        synchronized (com.ironsource.mediationsdk.config.ConfigFile.class) {
            if (mInstance == null) {
                mInstance = new com.ironsource.mediationsdk.config.ConfigFile();
            }
            configFile = mInstance;
        }
        return configFile;
    }

    public java.lang.String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public java.lang.String getPluginType() {
        return this.mPluginType;
    }

    public java.lang.String getPluginVersion() {
        return this.mPluginVersion;
    }

    public void setPluginData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mPluginType = null;
        if (str != null) {
            java.lang.String[] strArr = this.mSupportedPlugins;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                java.lang.String str4 = strArr[i];
                if (str.equalsIgnoreCase(str4)) {
                    this.mPluginType = str4;
                    break;
                }
                i++;
            }
        }
        if (str2 != null) {
            this.mPluginVersion = str2;
        }
        if (str3 != null) {
            this.mPluginFrameworkVersion = str3;
        }
    }
}
