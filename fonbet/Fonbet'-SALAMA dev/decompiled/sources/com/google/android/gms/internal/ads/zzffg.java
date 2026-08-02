package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzffg implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzffg(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzffe(zzfdy.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzffh) this.zzb).zzb());
    }
}
