package com.google.android.gms.internal.ads;

import E2.o;
import I2.AbstractC0308p;
import I2.J;
import J2.j;

/* JADX INFO: loaded from: classes.dex */
final class zzbym extends AbstractC0308p {
    final /* synthetic */ zzbyq zza;

    public zzbym(zzbyq zzbyqVar) {
        this.zza = zzbyqVar;
    }

    @Override // I2.AbstractC0308p
    public final void zza() {
        zzbyq zzbyqVar = this.zza;
        zzbcb zzbcbVar = new zzbcb(zzbyqVar.zze, zzbyqVar.zzf.f10834a);
        synchronized (this.zza.zza) {
            try {
                zzbce zzbceVar = o.f1952C.f1965l;
                zzbce.zza(this.zza.zzh, zzbcbVar);
            } catch (IllegalArgumentException e7) {
                int i7 = J.f3546b;
                j.h("Cannot config CSI reporter.", e7);
            }
        }
    }
}
