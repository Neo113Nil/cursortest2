package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzchq implements zzevg {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    final zzhep zze;
    final zzhep zzf;
    private final zzchl zzg;

    public zzchq(zzchl zzchlVar, Context context, String str) {
        this.zzg = zzchlVar;
        zzheg zzhegVarZza = zzheh.zza(context);
        this.zza = zzhegVarZza;
        zzheg zzhegVarZza2 = zzheh.zza(str);
        this.zzb = zzhegVarZza2;
        zzhep zzhepVar = zzchlVar.zzbf;
        zzexy zzexyVar = new zzexy(zzhegVarZza, zzhepVar, zzchlVar.zzbg);
        this.zzc = zzexyVar;
        zzhep zzhepVarZzc = zzhef.zzc(new zzewe(zzhepVar));
        this.zzd = zzhepVarZzc;
        zzhep zzhepVar2 = zzchlVar.zza;
        zzhep zzhepVar3 = zzchlVar.zzQ;
        zzfbc zzfbcVarZza = zzfbc.zza();
        zzhep zzhepVar4 = zzchlVar.zzj;
        zzhep zzhepVarZzc2 = zzhef.zzc(new zzewg(zzhegVarZza, zzhepVar2, zzhepVar3, zzexyVar, zzhepVarZzc, zzfbcVarZza, zzhepVar4));
        this.zze = zzhepVarZzc2;
        this.zzf = zzhef.zzc(new zzewm(zzhepVar3, zzhegVarZza, zzhegVarZza2, zzhepVarZzc2, zzhepVarZzc, zzhepVar4, zzchlVar.zzK));
    }

    @Override // com.google.android.gms.internal.ads.zzevg
    public final zzewl zza() {
        return (zzewl) this.zzf.zzb();
    }
}
