package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdpn {
    private final JSONObject zza;
    private final zzdvv zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzcef zzd;

    public zzdpn(JSONObject jSONObject, zzdvv zzdvvVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar) {
        this.zza = jSONObject;
        this.zzb = zzdvvVar;
        this.zzc = zzbVar;
        this.zzd = zzcefVar;
    }

    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    final zzcef zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdvv zzd() {
        return this.zzb;
    }
}
