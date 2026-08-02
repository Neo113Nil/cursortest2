package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
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
        zzheg zza = zzheh.zza(context);
        this.zza = zza;
        zzheg zza2 = zzheh.zza(zzrVar);
        this.zzb = zza2;
        zzheg zza3 = zzheh.zza(str);
        this.zzc = zza3;
        zzhep zzhepVar = zzchlVar.zzK;
        zzhep zzc = zzhef.zzc(new zzeje(zzhepVar));
        this.zzd = zzc;
        zzhep zzc2 = zzhef.zzc(new zzezj(zzchlVar.zzbf));
        this.zze = zzc2;
        zzhep zzc3 = zzhef.zzc(new zzeyj(zza, zzchlVar.zza, zzchlVar.zzQ, zzc, zzc2, zzfbc.zza()));
        this.zzf = zzc3;
        this.zzg = zzhef.zzc(new zzejm(zza, zza2, zza3, zzc3, zzc, zzc2, zzchlVar.zzj, zzchlVar.zzS, zzhepVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeyl
    public final zzejl zza() {
        return (zzejl) this.zzg.zzb();
    }
}
