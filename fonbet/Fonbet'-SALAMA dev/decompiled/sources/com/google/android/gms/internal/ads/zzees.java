package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzees implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzees(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar4;
        this.zzd = zzhepVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeeq zzb() {
        return new zzeeq(zzfdy.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcpz) this.zzb.zzb(), (zzefg) this.zzc.zzb(), (zzfhv) this.zzd.zzb());
    }
}
