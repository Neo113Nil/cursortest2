package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeob implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzeob(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        return new zzeqt(((zzekx) this.zza).zzb(), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzmp)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
