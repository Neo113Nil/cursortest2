package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcbf {
    private final java.util.List zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final boolean zzd;
    private final boolean zze;
    private final java.lang.String zzf;
    private final int zzg;
    private final org.json.JSONObject zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final long zzk;
    private final boolean zzl;
    private final java.lang.String zzm;

    public zzcbf(org.json.JSONObject jSONObject) {
        this.zzf = jSONObject.optString("url");
        this.zzb = jSONObject.optString("base_uri");
        this.zzc = jSONObject.optString("post_parameters");
        this.zzd = zzn(jSONObject.optString("drt_include"));
        this.zzm = jSONObject.optString(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE);
        this.zzl = zzn(jSONObject.optString("use_compression"));
        this.zze = zzn(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        java.lang.String optString = jSONObject.optString("errors");
        this.zza = optString == null ? null : java.util.Arrays.asList(optString.split(","));
        this.zzg = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzh = optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzi = jSONObject.optString("pool_key");
        this.zzj = zzo(jSONObject.optString("start_time")).longValue();
        this.zzk = zzo(jSONObject.optString("end_time")).longValue();
    }

    private static boolean zzn(java.lang.String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    private static java.lang.Long zzo(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return java.lang.Long.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public final int zza() {
        return this.zzg;
    }

    public final java.util.List zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    public final java.lang.String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final org.json.JSONObject zzh() {
        return this.zzh;
    }

    public final java.lang.String zzi() {
        return this.zzi;
    }

    public final long zzj() {
        return this.zzj;
    }

    public final long zzk() {
        return this.zzk;
    }

    public final java.lang.String zzl() {
        return this.zzm;
    }

    public final boolean zzm() {
        return this.zzl;
    }
}
