package com.ironsource.mediationsdk.model;

/* loaded from: classes5.dex */
public class NetworkSettings {
    private static final java.lang.String r = "customNetwork";
    private static final java.lang.String s = "customNetworkPackage";
    private static final java.lang.String t = "customNetworkAdapterName";

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6453a;
    private java.lang.String b;
    private org.json.JSONObject c;
    private org.json.JSONObject d;
    private org.json.JSONObject e;
    private org.json.JSONObject f;
    private org.json.JSONObject g;
    private java.lang.String h;
    private java.lang.String i;
    private boolean j;
    private java.lang.String k;
    private int l;
    private int m;
    private int n;
    private int o;
    private java.lang.String p;
    private java.lang.String q;

    public NetworkSettings(java.lang.String str) {
        this.f6453a = str;
        this.k = str;
        this.b = str;
        this.p = str;
        this.q = str;
        this.d = new org.json.JSONObject();
        this.e = new org.json.JSONObject();
        this.f = new org.json.JSONObject();
        this.g = new org.json.JSONObject();
        this.c = new org.json.JSONObject();
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public java.lang.String getAdSourceNameForEvents() {
        return this.i;
    }

    public org.json.JSONObject getApplicationSettings() {
        return this.c;
    }

    public int getBannerPriority() {
        return this.n;
    }

    public org.json.JSONObject getBannerSettings() {
        return this.f;
    }

    public java.lang.String getCustomNetwork() {
        org.json.JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public java.lang.String getCustomNetworkAdapterName(com.ironsource.mediationsdk.IronSource.a aVar) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.c) != null) {
            return jSONObject5.optString(t);
        }
        if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.d) != null) {
            return jSONObject4.optString(t);
        }
        if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) && (jSONObject3 = this.e) != null) {
            return jSONObject3.optString(t);
        }
        if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.BANNER) && (jSONObject2 = this.f) != null) {
            return jSONObject2.optString(t);
        }
        if (!aVar.equals(com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) || (jSONObject = this.g) == null) {
            return null;
        }
        return jSONObject.optString(t);
    }

    public java.lang.String getCustomNetworkPackage() {
        org.json.JSONObject jSONObject = this.c;
        return jSONObject != null ? jSONObject.optString(s, "") : "";
    }

    public int getInstanceType(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.m;
    }

    public org.json.JSONObject getInterstitialSettings() {
        return this.e;
    }

    public int getMaxAdsPerSession(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.o;
    }

    public org.json.JSONObject getNativeAdSettings() {
        return this.g;
    }

    public java.lang.String getProviderDefaultInstance() {
        return this.p;
    }

    public java.lang.String getProviderInstanceName() {
        return this.k;
    }

    public java.lang.String getProviderName() {
        return this.f6453a;
    }

    public java.lang.String getProviderNetworkKey() {
        return this.q;
    }

    public java.lang.String getProviderTypeForReflection() {
        return this.b;
    }

    public int getRewardedVideoPriority() {
        return this.l;
    }

    public org.json.JSONObject getRewardedVideoSettings() {
        return this.d;
    }

    public java.lang.String getSubProviderId() {
        return this.h;
    }

    public boolean isBidder(com.ironsource.mediationsdk.IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !android.text.TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.j;
    }

    public void setAdSourceNameForEvents(java.lang.String str) {
        this.i = str;
    }

    public void setApplicationSettings(org.json.JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.n = i;
    }

    public void setBannerSettings(org.json.JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.m = i;
    }

    public void setInterstitialSettings(org.json.JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.j = z;
    }

    public void setNativeAdPriority(int i) {
        this.o = i;
    }

    public void setNativeAdSettings(org.json.JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public void setProviderNetworkKey(java.lang.String str) {
        this.q = str;
    }

    public void setRewardedVideoPriority(int i) {
        this.l = i;
    }

    public void setRewardedVideoSettings(org.json.JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public void setSubProviderId(java.lang.String str) {
        this.h = str;
    }

    public boolean shouldEarlyInit(boolean z) {
        org.json.JSONObject jSONObject = this.c;
        return (jSONObject == null || !jSONObject.has(com.ironsource.mediationsdk.utils.IronSourceConstants.EARLY_INIT_FIELD)) ? z : this.c.optBoolean(com.ironsource.mediationsdk.utils.IronSourceConstants.EARLY_INIT_FIELD);
    }

    public void setBannerSettings(java.lang.String str, java.lang.Object obj) {
        try {
            this.f.put(str, obj);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setInterstitialSettings(java.lang.String str, java.lang.Object obj) {
        try {
            this.e.put(str, obj);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setNativeAdSettings(java.lang.String str, java.lang.Object obj) {
        try {
            this.g.put(str, obj);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setRewardedVideoSettings(java.lang.String str, java.lang.Object obj) {
        try {
            this.d.put(str, obj);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public NetworkSettings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, org.json.JSONObject jSONObject5) {
        this.f6453a = str;
        this.k = str;
        this.b = str2;
        this.p = str3;
        this.q = str4;
        this.d = jSONObject2;
        this.e = jSONObject3;
        this.f = jSONObject4;
        this.g = jSONObject5;
        this.c = jSONObject;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public NetworkSettings(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        this.f6453a = networkSettings.getProviderName();
        this.k = networkSettings.getProviderName();
        this.b = networkSettings.getProviderTypeForReflection();
        this.d = networkSettings.getRewardedVideoSettings();
        this.e = networkSettings.getInterstitialSettings();
        this.f = networkSettings.getBannerSettings();
        this.g = networkSettings.getNativeAdSettings();
        this.c = networkSettings.getApplicationSettings();
        this.l = networkSettings.getRewardedVideoPriority();
        this.m = networkSettings.getInterstitialPriority();
        this.n = networkSettings.getBannerPriority();
        this.o = networkSettings.getNativeAdPriority();
        this.p = networkSettings.getProviderDefaultInstance();
        this.q = networkSettings.getProviderNetworkKey();
    }
}
