package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzchv implements zzewu {
    final zzhep zza;
    final zzhep zzb;
    final zzhep zzc;
    final zzhep zzd;
    final zzhep zze;
    final zzhep zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzchl zzj;

    public zzchv(zzchl zzchlVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzchlVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzheg zzhegVarZza = zzheh.zza(context);
        this.zza = zzhegVarZza;
        zzheg zzhegVarZza2 = zzheh.zza(zzrVar);
        this.zzb = zzhegVarZza2;
        zzhep zzhepVarZzc = zzhef.zzc(new zzeje(zzchlVar.zzK));
        this.zzc = zzhepVarZzc;
        zzhep zzhepVarZzc2 = zzhef.zzc(zzejj.zza());
        this.zzd = zzhepVarZzc2;
        zzhep zzhepVarZzc3 = zzhef.zzc(zzczq.zza());
        this.zze = zzhepVarZzc3;
        this.zzf = zzhef.zzc(new zzews(zzhegVarZza, zzchlVar.zza, zzhegVarZza2, zzchlVar.zzQ, zzhepVarZzc, zzhepVarZzc2, zzfbc.zza(), zzhepVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzewu
    public final zzeij zza() {
        return new zzeij(this.zzg, this.zzh, this.zzi, (zzewr) this.zzf.zzb(), (zzejd) this.zzc.zzb(), zzcgw.zzc(this.zzj.zzbn), (zzdqq) this.zzj.zzK.zzb());
    }
}
