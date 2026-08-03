package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiConsent {
    private static org.json.JSONObject consentObj = new org.json.JSONObject();

    public static void updateGDPRConsent(org.json.JSONObject jSONObject) {
        if (com.inmobi.sdk.InMobiSdk.isSDKInitialized()) {
            com.inmobi.sdk.InMobiSdk.updateGDPRConsent(jSONObject);
        }
        consentObj = jSONObject;
    }

    static org.json.JSONObject getConsentObj() {
        return consentObj;
    }

    private InMobiConsent() {
    }
}
