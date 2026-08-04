package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzeoj implements zzheg {
    private final zzhep zza;

    public zzeoj(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzfwm zzfwmVarZzn;
        zzenb zzenbVarZza = zzend.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        zzbbp zzbbpVar = zzbby.zzel;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzfwmVarZzn = zzfwm.zzo(new zzeqt(zzenbVarZza, ((Integer) c0254t.f2726c.zzb(zzbby.zzem)).intValue(), scheduledExecutorService));
        } else {
            zzfwmVarZzn = zzfwm.zzn();
        }
        zzheo.zzb(zzfwmVarZzn);
        return zzfwmVarZzn;
    }
}
