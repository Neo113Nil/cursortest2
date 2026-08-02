package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeow implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzeow(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        return new zzeqt(((zzert) this.zza).zzb(), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmd)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
