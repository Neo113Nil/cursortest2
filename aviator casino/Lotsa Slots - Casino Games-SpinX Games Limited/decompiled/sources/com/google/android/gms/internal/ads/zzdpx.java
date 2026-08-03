package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdpx extends com.google.android.gms.internal.ads.zzdpy {
    private final org.json.JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final org.json.JSONObject zzh;

    public zzdpx(com.google.android.gms.internal.ads.zzfkf zzfkfVar, org.json.JSONObject jSONObject) {
        super(zzfkfVar);
        this.zzb = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, com.ironsource.Y3.c, "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbp.zzk("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final org.json.JSONObject zza() {
        org.json.JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new org.json.JSONObject(this.zza.zzz);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final boolean zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final java.lang.String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    public final com.google.android.gms.internal.ads.zzflb zzg() {
        org.json.JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new com.google.android.gms.internal.ads.zzflb(jSONObject) : this.zza.zzV;
    }
}
