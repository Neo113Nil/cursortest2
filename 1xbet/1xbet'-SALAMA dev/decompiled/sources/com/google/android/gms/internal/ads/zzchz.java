package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzchz implements zzdrt {
    private final Long zza;
    private final String zzb;
    private final zzchl zzc;
    private final zzcib zzd;

    public zzchz(zzchl zzchlVar, zzcib zzcibVar, Long l7, String str) {
        this.zzc = zzchlVar;
        this.zzd = zzcibVar;
        this.zza = l7;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdrt
    public final zzdsd zza() {
        zzcib zzcibVar = this.zzd;
        return zzdse.zza(this.zza.longValue(), zzcibVar.zze, zzcibVar.zzc(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdrt
    public final zzdsh zzb() {
        zzcib zzcibVar = this.zzd;
        return zzdsi.zza(this.zza.longValue(), zzcibVar.zze, zzcibVar.zzc(), this.zzc, this.zzb);
    }
}
