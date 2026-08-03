package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdop {
    private final org.json.JSONObject zza;
    private final com.google.android.gms.internal.ads.zzdux zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final com.google.android.gms.internal.ads.zzcdn zzd;

    public zzdop(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzdux zzduxVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        this.zza = jSONObject;
        this.zzb = zzduxVar;
        this.zzc = zzbVar;
        this.zzd = zzcdnVar;
    }

    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    final com.google.android.gms.internal.ads.zzcdn zzb() {
        return this.zzd;
    }

    public final org.json.JSONObject zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzdux zzd() {
        return this.zzb;
    }
}
