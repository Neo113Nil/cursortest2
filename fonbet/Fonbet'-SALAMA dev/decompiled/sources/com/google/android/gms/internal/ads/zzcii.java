package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
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
        zzheg zza = zzheh.zza(context);
        this.zza = zza;
        zzhep zzhepVar = zzchlVar.zzbf;
        zzexz zzexzVar = new zzexz(zza, zzhepVar, zzchlVar.zzbg);
        this.zzb = zzexzVar;
        zzhep zzc = zzhef.zzc(new zzezj(zzhepVar));
        this.zzc = zzc;
        zzhep zzc2 = zzhef.zzc(zzfax.zza());
        this.zzd = zzc2;
        zzhep zzc3 = zzhef.zzc(new zzezt(zza, zzchlVar.zza, zzchlVar.zzQ, zzexzVar, zzc, zzfbc.zza(), zzc2));
        this.zze = zzc3;
        this.zzf = zzhef.zzc(new zzfad(zzc3, zzc, zzc2));
        zzheg zzc4 = zzheh.zzc(str);
        this.zzg = zzc4;
        this.zzh = zzhef.zzc(new zzezx(zzc4, zzc3, zza, zzc, zzc2, zzchlVar.zzj, zzchlVar.zzS, zzchlVar.zzK));
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
