package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzete implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;

    public zzete(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar4;
        this.zzd = zzhepVar5;
        this.zze = zzhepVar6;
        this.zzf = zzhepVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzcgf) this.zza).zzb(), ((zzcgi) this.zzb).zza(), zzfdy.zzc(), (ScheduledExecutorService) this.zzc.zzb(), ((zzebq) this.zzd).zzb(), ((zzcuh) this.zze).zza(), ((zzcgw) this.zzf).zza());
    }
}
