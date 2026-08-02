package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
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
        zzheg zza = zzheh.zza(context);
        this.zza = zza;
        zzheg zza2 = zzheh.zza(str);
        this.zzb = zza2;
        zzhep zzhepVar = zzchlVar.zzbf;
        zzexy zzexyVar = new zzexy(zza, zzhepVar, zzchlVar.zzbg);
        this.zzc = zzexyVar;
        zzhep zzc = zzhef.zzc(new zzewe(zzhepVar));
        this.zzd = zzc;
        zzhep zzhepVar2 = zzchlVar.zza;
        zzhep zzhepVar3 = zzchlVar.zzQ;
        zzfbc zza3 = zzfbc.zza();
        zzhep zzhepVar4 = zzchlVar.zzj;
        zzhep zzc2 = zzhef.zzc(new zzewg(zza, zzhepVar2, zzhepVar3, zzexyVar, zzc, zza3, zzhepVar4));
        this.zze = zzc2;
        this.zzf = zzhef.zzc(new zzewm(zzhepVar3, zza, zza2, zzc2, zzc, zzhepVar4, zzchlVar.zzK));
    }

    @Override // com.google.android.gms.internal.ads.zzevg
    public final zzewl zza() {
        return (zzewl) this.zzf.zzb();
    }
}
