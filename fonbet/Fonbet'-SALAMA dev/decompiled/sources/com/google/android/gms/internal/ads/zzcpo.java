package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcpo {
    private final zzcxi zza;
    private final zzczo zzb;

    public zzcpo(zzcxi zzcxiVar, zzczo zzczoVar) {
        this.zza = zzcxiVar;
        this.zzb = zzczoVar;
    }

    public final zzcxi zza() {
        return this.zza;
    }

    public final zzczo zzb() {
        return this.zzb;
    }

    public final zzdch zzc() {
        zzczo zzczoVar = this.zzb;
        return zzczoVar != null ? new zzdch(zzczoVar, zzbza.zzg) : new zzdch(new zzcpn(this), zzbza.zzg);
    }
}
