package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiSdkWrapper {
    public java.lang.String getToken(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        return com.inmobi.sdk.InMobiSdk.getToken(map, str);
    }

    public java.lang.String getVersion() {
        return com.inmobi.sdk.InMobiSdk.getVersion();
    }

    public boolean isSDKInitialized() {
        return com.inmobi.sdk.InMobiSdk.isSDKInitialized();
    }

    public void setIsAgeRestricted(java.lang.Boolean bool) {
        com.inmobi.sdk.InMobiSdk.setIsAgeRestricted(bool.booleanValue());
    }

    public void init(android.content.Context context, java.lang.String str, org.json.JSONObject jSONObject, com.inmobi.sdk.SdkInitializationListener sdkInitializationListener) {
        com.inmobi.sdk.InMobiSdk.init(context, str, jSONObject, sdkInitializationListener);
    }
}
