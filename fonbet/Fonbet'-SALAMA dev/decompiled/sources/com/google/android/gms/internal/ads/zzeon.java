package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzeon implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzeon(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzfwm zzn;
        zzepl zzb = ((zzepn) this.zza).zzb();
        Context zza = ((zzcgi) this.zzb).zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlr)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.c(zza)) {
                zzn = zzfwm.zzo(zzb);
                zzheo.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzfwm.zzn();
        zzheo.zzb(zzn);
        return zzn;
    }
}
