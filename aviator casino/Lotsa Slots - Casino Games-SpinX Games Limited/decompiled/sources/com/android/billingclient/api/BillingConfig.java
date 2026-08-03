package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class BillingConfig {
    private final java.lang.String countryCode;
    private final java.lang.String jsonString;
    private final org.json.JSONObject parsedJson;

    BillingConfig(java.lang.String str) throws org.json.JSONException {
        this.jsonString = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.parsedJson = jSONObject;
        this.countryCode = jSONObject.optString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
    }

    public java.lang.String getCountryCode() {
        return this.countryCode;
    }
}
