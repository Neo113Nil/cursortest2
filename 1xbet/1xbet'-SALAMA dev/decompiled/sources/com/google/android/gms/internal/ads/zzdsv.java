package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzdsv implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;
    private final zzhep zzg;
    private final zzhep zzh;
    private final zzhep zzi;

    public zzdsv(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7, zzhep zzhepVar8, zzhep zzhepVar9, zzhep zzhepVar10) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar5;
        this.zze = zzhepVar6;
        this.zzf = zzhepVar7;
        this.zzg = zzhepVar8;
        this.zzh = zzhepVar9;
        this.zzi = zzhepVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsu((Executor) this.zza.zzb(), ((zzcgi) this.zzb).zza(), ((zzcgj) this.zzc).zza(), zzfdy.zzc(), (zzdog) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdrb) this.zzf.zzb(), ((zzcgw) this.zzg).zza(), ((zzdbp) this.zzh).zzb(), (zzfgb) this.zzi.zzb());
    }
}
