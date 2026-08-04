package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzdsd implements zzdrr {
    private final long zza;
    private final zzejl zzb;

    public zzdsd(long j, Context context, zzdrw zzdrwVar, zzcgb zzcgbVar, String str) {
        this.zza = j;
        zzeyk zzeykVarZzu = zzcgbVar.zzu();
        zzeykVarZzu.zzc(context);
        zzeykVarZzu.zza(new com.google.android.gms.ads.internal.client.zzr());
        zzeykVarZzu.zzb(str);
        zzejl zzejlVarZza = zzeykVarZzu.zzd().zza();
        this.zzb = zzejlVarZza;
        zzejlVarZza.zzD(new zzdsc(this, zzdrwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zzc() {
        this.zzb.zzW(new p105o3.b(null));
    }
}
