package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzdvv implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzdvv(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar4;
        this.zzc = zzhepVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvu zzb() {
        return new zzdvu((ScheduledExecutorService) this.zza.zzb(), zzfdy.zzc(), zzfee.zzc(), ((zzdwq) this.zzb).zzb(), zzhef.zza(this.zzc));
    }
}
