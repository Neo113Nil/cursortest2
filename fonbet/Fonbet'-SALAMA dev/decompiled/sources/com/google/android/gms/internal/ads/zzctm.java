package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzctm implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzctm(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzctl((zzcvi) this.zza.zzb(), ((zzcqn) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzfdy.zzc(), ((zzcqo) this.zzd).zza());
    }
}
