package com.google.android.gms.internal.ads;

import P2.B;
import P2.G;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzbde implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzbde(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbdd zzb() {
        return new zzbdd((ScheduledExecutorService) this.zza.zzb(), (G) this.zzb.zzb(), (B) this.zzc.zzb(), (zzdqv) this.zzd.zzb());
    }
}
