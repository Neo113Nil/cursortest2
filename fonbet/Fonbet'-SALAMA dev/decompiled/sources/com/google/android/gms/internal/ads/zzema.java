package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzema implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzema(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzely(((zzcgi) this.zza).zza(), (zzbyq) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfdy.zzc());
    }
}
