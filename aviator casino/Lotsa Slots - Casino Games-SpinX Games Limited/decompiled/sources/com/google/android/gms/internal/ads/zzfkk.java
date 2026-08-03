package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfkk {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final org.json.JSONObject zzc;
    public final org.json.JSONObject zzd;

    zzfkk(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        org.json.JSONObject zzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
        this.zzd = zzd;
        this.zza = zzd.optString("ad_html", null);
        this.zzb = zzd.optString("ad_base_url", null);
        this.zzc = zzd.optJSONObject("ad_json");
    }
}
