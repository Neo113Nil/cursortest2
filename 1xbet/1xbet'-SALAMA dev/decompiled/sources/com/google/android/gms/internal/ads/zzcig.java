package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzcig implements zzeyl {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    final zzhep zze;
    final zzhep zzf;
    final zzhep zzg;
    private final zzchl zzh;

    public zzcig(zzchl zzchlVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzchlVar;
        zzheg zzhegVarZza = zzheh.zza(context);
        this.zza = zzhegVarZza;
        zzheg zzhegVarZza2 = zzheh.zza(zzrVar);
        this.zzb = zzhegVarZza2;
        zzheg zzhegVarZza3 = zzheh.zza(str);
        this.zzc = zzhegVarZza3;
        zzhep zzhepVar = zzchlVar.zzK;
        zzhep zzhepVarZzc = zzhef.zzc(new zzeje(zzhepVar));
        this.zzd = zzhepVarZzc;
        zzhep zzhepVarZzc2 = zzhef.zzc(new zzezj(zzchlVar.zzbf));
        this.zze = zzhepVarZzc2;
        zzhep zzhepVarZzc3 = zzhef.zzc(new zzeyj(zzhegVarZza, zzchlVar.zza, zzchlVar.zzQ, zzhepVarZzc, zzhepVarZzc2, zzfbc.zza()));
        this.zzf = zzhepVarZzc3;
        this.zzg = zzhef.zzc(new zzejm(zzhegVarZza, zzhegVarZza2, zzhegVarZza3, zzhepVarZzc3, zzhepVarZzc, zzhepVarZzc2, zzchlVar.zzj, zzchlVar.zzS, zzhepVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeyl
    public final zzejl zza() {
        return (zzejl) this.zzg.zzb();
    }
}
