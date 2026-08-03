package com.helpshift.analytics;

/* loaded from: classes4.dex */
public class HSWebchatAnalyticsManager {
    private static final java.lang.String PLUGIN_VERSION = "pluginVersion";
    private static final java.lang.String RUNTIME_VERSION = "runtimeVersion";
    private static final java.lang.String SDK_TYPE = "sdkType";
    private final java.util.Map<java.lang.String, java.lang.String> analyticsData = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.String> commonAnalyticsMap = new java.util.HashMap();
    private final com.helpshift.platform.Device device;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;

    public HSWebchatAnalyticsManager(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.platform.Device device) {
        this.persistentStorage = hSPersistentStorage;
        this.device = device;
    }

    public void setAnalyticsEventsData(java.util.Map<java.lang.String, java.lang.Object> map) {
        setCommonAnalyticsMap(map);
        this.analyticsData.putAll(this.commonAnalyticsMap);
        this.analyticsData.put("rs", this.device.getRom());
        java.lang.String countryCode = this.device.getCountryCode();
        if (com.helpshift.util.Utils.isNotEmpty(countryCode)) {
            this.analyticsData.put("cc", countryCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setCommonAnalyticsMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj;
        java.lang.Object obj2;
        this.commonAnalyticsMap.put("v", this.device.getSDKVersion());
        this.commonAnalyticsMap.put("dm", this.device.getDeviceModel());
        this.commonAnalyticsMap.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, this.device.getAppVersion());
        this.commonAnalyticsMap.put(com.ironsource.M6.F, this.device.getOSVersion());
        java.lang.Object obj3 = map.get(SDK_TYPE);
        if (obj3 instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj3;
            if (com.helpshift.util.Utils.isNotEmpty(str)) {
                this.commonAnalyticsMap.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, str);
                obj = map.get(PLUGIN_VERSION);
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (com.helpshift.util.Utils.isNotEmpty(str2)) {
                        this.commonAnalyticsMap.put("pv", str2);
                    }
                }
                obj2 = map.get(RUNTIME_VERSION);
                if (obj2 instanceof java.lang.String) {
                    return;
                }
                java.lang.String str3 = (java.lang.String) obj2;
                if (com.helpshift.util.Utils.isNotEmpty(str3)) {
                    this.commonAnalyticsMap.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.RV_SIGNAL_KEY, str3);
                    return;
                }
                return;
            }
        }
        this.commonAnalyticsMap.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "androidx");
        obj = map.get(PLUGIN_VERSION);
        if (obj instanceof java.lang.String) {
        }
        obj2 = map.get(RUNTIME_VERSION);
        if (obj2 instanceof java.lang.String) {
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getAnalyticsDataMap() {
        setLanguageInMap(this.analyticsData);
        return this.analyticsData;
    }

    public java.util.Map<java.lang.String, java.lang.String> getCommonAnalyticsMap() {
        setLanguageInMap(this.commonAnalyticsMap);
        return this.commonAnalyticsMap;
    }

    private void setLanguageInMap(java.util.Map<java.lang.String, java.lang.String> map) {
        map.put(com.facebook.appevents.UserDataStore.LAST_NAME, this.device.getLanguage());
        java.lang.String language = this.persistentStorage.getLanguage();
        if (com.helpshift.util.Utils.isNotEmpty(language)) {
            map.put("dln", language);
        }
    }
}
