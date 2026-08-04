package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;

/* JADX INFO: loaded from: classes.dex */
final class zzbxb {
    private final L zza;

    public zzbxb(p090m3.a aVar, L l7, zzbxm zzbxmVar) {
        this.zza = l7;
    }

    public final void zza(int i7, long j) {
        long j3;
        zzbbp zzbbpVar = zzbby.zzaG;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return;
        }
        M m7 = (M) this.zza;
        m7.l();
        synchronized (m7.f3551a) {
            j3 = m7.f3550D;
        }
        if (j - j3 < 0) {
            J.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzaH)).booleanValue()) {
            ((M) this.zza).f(i7);
            ((M) this.zza).g(j);
        } else {
            ((M) this.zza).f(-1);
            ((M) this.zza).g(j);
        }
    }
}
