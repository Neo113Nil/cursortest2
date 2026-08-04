package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzeon implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzeon(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzfwm zzfwmVarZzn;
        zzepl zzeplVarZzb = ((zzepn) this.zza).zzb();
        Context contextZza = ((zzcgi) this.zzb).zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlr)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.c(contextZza)) {
                zzfwmVarZzn = zzfwm.zzo(zzeplVarZzb);
            } else {
                zzfwmVarZzn = zzfwm.zzn();
            }
        } else {
            zzfwmVarZzn = zzfwm.zzn();
        }
        zzheo.zzb(zzfwmVarZzn);
        return zzfwmVarZzn;
    }
}
