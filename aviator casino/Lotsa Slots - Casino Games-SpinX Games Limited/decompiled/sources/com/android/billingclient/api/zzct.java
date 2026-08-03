package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzct {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    zzct(org.json.JSONObject jSONObject) throws org.json.JSONException {
        this.zza = jSONObject.getString("rentalPeriod");
        java.lang.String optString = jSONObject.optString("rentalExpirationPeriod");
        this.zzb = true == optString.isEmpty() ? null : optString;
    }
}
