package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzcvf implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzcvf(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvd(((zzcve) this.zza).zzb(), ((zzhes) this.zzb).zzb(), zzfdy.zzc(), (ScheduledExecutorService) this.zzc.zzb());
    }
}
