package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
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
        zzheg zza = zzheh.zza(context);
        this.zza = zza;
        zzheg zza2 = zzheh.zza(zzrVar);
        this.zzb = zza2;
        zzhep zzc = zzhef.zzc(new zzeje(zzchlVar.zzK));
        this.zzc = zzc;
        zzhep zzc2 = zzhef.zzc(zzejj.zza());
        this.zzd = zzc2;
        zzhep zzc3 = zzhef.zzc(zzczq.zza());
        this.zze = zzc3;
        this.zzf = zzhef.zzc(new zzews(zza, zzchlVar.zza, zza2, zzchlVar.zzQ, zzc, zzc2, zzfbc.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzewu
    public final zzeij zza() {
        zzcge zzcgeVar;
        zzewr zzewrVar = (zzewr) this.zzf.zzb();
        zzejd zzejdVar = (zzejd) this.zzc.zzb();
        zzcgeVar = this.zzj.zzbn;
        return new zzeij(this.zzg, this.zzh, this.zzi, zzewrVar, zzejdVar, zzcgw.zzc(zzcgeVar), (zzdqq) this.zzj.zzK.zzb());
    }
}
