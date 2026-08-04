package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzcoh implements zzheg {
    private final zzcnw zza;
    private final zzhep zzb;

    public zzcoh(zzcnw zzcnwVar, zzhep zzhepVar) {
        this.zza = zzcnwVar;
        this.zzb = zzhepVar;
    }

    public static zzdch zza(zzcnw zzcnwVar, zzcpj zzcpjVar) {
        return new zzdch(zzcpjVar, zzbza.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcpj) this.zzb.zzb());
    }
}
