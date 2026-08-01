package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcyd {
    private final zzdgq zza;
    private final zzdiv zzb;

    public zzcyd(zzdgq zzdgqVar, zzdiv zzdivVar) {
        this.zza = zzdgqVar;
        this.zzb = zzdivVar;
    }

    public final zzdgq zza() {
        return this.zza;
    }

    final zzdlo zzb() {
        zzdiv zzdivVar = this.zzb;
        return zzdivVar != null ? new zzdlo(zzdivVar, zzcgj.zzh) : new zzdlo(new zzcyc(this), zzcgj.zzh);
    }

    final zzdiv zzc() {
        return this.zzb;
    }
}
