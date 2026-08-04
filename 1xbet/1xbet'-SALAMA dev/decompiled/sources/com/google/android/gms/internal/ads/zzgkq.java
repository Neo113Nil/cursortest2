package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgkq implements zzgct {
    final String zza;
    final Class zzb;
    final zzgry zzc;

    public zzgkq(String str, Class cls, zzgry zzgryVar, zzgyz zzgyzVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgryVar;
    }

    public static zzgct zzd(String str, Class cls, zzgry zzgryVar, zzgyz zzgyzVar) {
        return new zzgkq(str, cls, zzgryVar, zzgyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final zzgsa zza(zzgvy zzgvyVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb(this.zza);
        zzgscVarZza.zzc(zzgvyVar);
        zzgscVarZza.zza(zzgte.RAW);
        zzgmw zzgmwVar = (zzgmw) zzglu.zzc().zzd(zzglk.zzb().zza(zzglu.zzc().zzb(zzgmx.zza((zzgse) zzgscVarZza.zzbr())), null), zzgmw.class, zzgcr.zza());
        zzgrx zzgrxVarZza = zzgsa.zza();
        zzgrxVarZza.zzb(zzgmwVar.zzg());
        zzgrxVarZza.zzc(zzgmwVar.zze());
        zzgrxVarZza.zza(zzgmwVar.zzb());
        return (zzgsa) zzgrxVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Object zzc(zzgvy zzgvyVar) {
        return zzglr.zza().zzb(zzglu.zzc().zza(zzgmw.zza(this.zza, zzgvyVar, this.zzc, zzgte.RAW, null), zzgcr.zza()), this.zzb);
    }
}
