package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzeor implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzeor(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzeqe zzeqeVarZza = zzeqg.zza();
        zzemz zzemzVar = (zzemz) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzeqt(zzemzVar, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmh)).intValue(), scheduledExecutorService);
        }
        return new zzeqt(zzeqeVarZza, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmh)).intValue(), scheduledExecutorService);
    }
}
