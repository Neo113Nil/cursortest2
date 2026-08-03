package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzcv {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.android.billingclient.api.ProductDetails.PricingPhase zzf;

    zzcv(org.json.JSONObject jSONObject) throws org.json.JSONException {
        this.zza = jSONObject.getString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.zzb = jSONObject.optString("title");
        this.zzc = jSONObject.optString("name");
        this.zzd = jSONObject.optString("description");
        this.zze = jSONObject.optString("basePlanId");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.zzf = optJSONObject == null ? null : new com.android.billingclient.api.ProductDetails.PricingPhase(optJSONObject);
    }
}
