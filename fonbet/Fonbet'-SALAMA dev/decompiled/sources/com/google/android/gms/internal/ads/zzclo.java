package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzclo implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;

    public zzclo(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar6;
        this.zzf = zzhepVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcln(((zzcgi) this.zza).zza(), ((zzcgf) this.zzb).zzb(), (zzebn) this.zzc.zzb(), (zzdnv) this.zzd.zzb(), zzfdy.zzc(), (zzgbn) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb());
    }
}
