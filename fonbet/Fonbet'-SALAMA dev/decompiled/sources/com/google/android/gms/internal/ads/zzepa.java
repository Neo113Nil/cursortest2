package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzepa implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzepa(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzesw zzb = ((zzesx) this.zza).zzb();
        zzemz zzemzVar = (zzemz) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("39")) {
            return new zzeqt(zzemzVar, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzlZ)).intValue(), scheduledExecutorService);
        }
        return new zzeqt(zzb, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzlZ)).intValue(), scheduledExecutorService);
    }
}
