package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzett implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzett(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar4;
    }

    public static zzetr zza(String str, zzazz zzazzVar, zzbyq zzbyqVar, ScheduledExecutorService scheduledExecutorService, zzgbn zzgbnVar) {
        return new zzetr(str, zzazzVar, zzbyqVar, scheduledExecutorService, zzgbnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetr(((zzeuo) this.zza).zza(), zzcjo.zza(), (zzbyq) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfdy.zzc());
    }
}
