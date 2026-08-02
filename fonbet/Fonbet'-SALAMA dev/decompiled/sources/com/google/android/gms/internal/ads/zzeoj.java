package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzeoj implements zzheg {
    private final zzhep zza;

    public zzeoj(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzfwm zzn;
        zzenb zza = zzend.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzel)).booleanValue()) {
            zzn = zzfwm.zzo(new zzeqt(zza, ((Integer) r3.f2726c.zzb(zzbby.zzem)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzfwm.zzn();
        }
        zzheo.zzb(zzn);
        return zzn;
    }
}
