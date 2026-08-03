package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwm {
    private org.json.JSONObject zza;
    private final com.google.android.gms.internal.ads.zzfwv zzb;

    public zzfwm(com.google.android.gms.internal.ads.zzfwv zzfwvVar) {
        this.zzb = zzfwvVar;
    }

    public final void zza(org.json.JSONObject jSONObject, java.util.HashSet hashSet, long j) {
        this.zzb.zza(new com.google.android.gms.internal.ads.zzfwy(this, hashSet, jSONObject, j));
    }

    public final void zzb(org.json.JSONObject jSONObject, java.util.HashSet hashSet, long j) {
        this.zzb.zza(new com.google.android.gms.internal.ads.zzfwx(this, hashSet, jSONObject, j));
    }

    public final void zzc() {
        this.zzb.zza(new com.google.android.gms.internal.ads.zzfww(this));
    }

    public final org.json.JSONObject zzd() {
        return this.zza;
    }

    public final void zze(org.json.JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
