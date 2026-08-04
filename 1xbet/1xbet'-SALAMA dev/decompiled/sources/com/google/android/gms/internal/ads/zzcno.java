package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzcno implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzcno(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    public static zzcxi zzc(ScheduledExecutorService scheduledExecutorService, p090m3.a aVar) {
        return new zzcxi(scheduledExecutorService, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxi zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (p090m3.a) this.zzb.zzb());
    }
}
