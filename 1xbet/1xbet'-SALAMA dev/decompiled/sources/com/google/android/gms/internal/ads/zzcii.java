package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzcii implements zzezz {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    final zzhep zze;
    final zzhep zzf;
    final zzhep zzg;
    final zzhep zzh;
    private final zzchl zzi;

    public zzcii(zzchl zzchlVar, Context context, String str) {
        this.zzi = zzchlVar;
        zzheg zzhegVarZza = zzheh.zza(context);
        this.zza = zzhegVarZza;
        zzhep zzhepVar = zzchlVar.zzbf;
        zzexz zzexzVar = new zzexz(zzhegVarZza, zzhepVar, zzchlVar.zzbg);
        this.zzb = zzexzVar;
        zzhep zzhepVarZzc = zzhef.zzc(new zzezj(zzhepVar));
        this.zzc = zzhepVarZzc;
        zzhep zzhepVarZzc2 = zzhef.zzc(zzfax.zza());
        this.zzd = zzhepVarZzc2;
        zzhep zzhepVarZzc3 = zzhef.zzc(new zzezt(zzhegVarZza, zzchlVar.zza, zzchlVar.zzQ, zzexzVar, zzhepVarZzc, zzfbc.zza(), zzhepVarZzc2));
        this.zze = zzhepVarZzc3;
        this.zzf = zzhef.zzc(new zzfad(zzhepVarZzc3, zzhepVarZzc, zzhepVarZzc2));
        zzheg zzhegVarZzc = zzheh.zzc(str);
        this.zzg = zzhegVarZzc;
        this.zzh = zzhef.zzc(new zzezx(zzhegVarZzc, zzhepVarZzc3, zzhegVarZza, zzhepVarZzc, zzhepVarZzc2, zzchlVar.zzj, zzchlVar.zzS, zzchlVar.zzK));
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final zzezw zza() {
        return (zzezw) this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzezz
    public final zzfac zzb() {
        return (zzfac) this.zzf.zzb();
    }
}
