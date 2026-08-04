package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzeol implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzeol(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        return new zzeqt(((zzepf) this.zza).zzb(), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmk)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
