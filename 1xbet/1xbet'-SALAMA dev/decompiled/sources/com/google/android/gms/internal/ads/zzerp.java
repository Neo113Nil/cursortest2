package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzerp implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;
    private final zzhep zzg;
    private final zzhep zzh;
    private final zzhep zzi;

    public zzerp(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7, zzhep zzhepVar8, zzhep zzhepVar9, zzhep zzhepVar10) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar4;
        this.zzd = zzhepVar5;
        this.zze = zzhepVar6;
        this.zzf = zzhepVar7;
        this.zzg = zzhepVar8;
        this.zzh = zzhepVar9;
        this.zzi = zzhepVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzern(zzfdy.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzehz) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzcuh) this.zze).zza(), (zzehv) this.zzf.zzb(), (zzdog) this.zzg.zzb(), (zzdsw) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
