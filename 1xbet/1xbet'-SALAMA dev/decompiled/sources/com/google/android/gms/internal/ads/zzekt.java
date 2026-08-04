package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzekt implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzekt(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzekr((I3.b) this.zza.zzb(), zzfdy.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
