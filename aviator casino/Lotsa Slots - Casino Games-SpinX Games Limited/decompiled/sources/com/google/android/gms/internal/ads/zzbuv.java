package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbuv {
    public final java.util.List zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    public zzbuv(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.optString("id");
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zza = java.util.Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "video_reward_urls");
        jSONObject.optString(com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID);
        jSONObject.optString("valid_from_timestamp");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzx();
            com.google.android.gms.internal.ads.zzbux.zza(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzt.zzx();
        com.google.android.gms.internal.ads.zzbux.zza(jSONObject, "template_ids");
        org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.zzc = jSONObject.optString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
