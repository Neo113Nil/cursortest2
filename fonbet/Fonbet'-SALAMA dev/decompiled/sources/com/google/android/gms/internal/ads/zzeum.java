package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeum implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzeum(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuk(zzcju.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzcgi) this.zzb).zza());
    }
}
