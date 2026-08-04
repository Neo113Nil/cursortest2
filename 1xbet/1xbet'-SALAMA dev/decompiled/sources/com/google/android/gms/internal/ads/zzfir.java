package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
public final class zzfir {
    private final Object zza;
    private final long zzb;
    private final p090m3.a zzc;
    private final long zzd;

    public zzfir(Object obj, p090m3.a aVar) {
        this.zza = obj;
        this.zzc = aVar;
        ((p090m3.b) aVar).getClass();
        this.zzb = System.currentTimeMillis();
        this.zzd = ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzC)).longValue() * 1000;
    }

    public final long zza() {
        long jMin = this.zzd + Math.min(Math.max(((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzx)).longValue(), -900000L), 10000L);
        ((p090m3.b) this.zzc).getClass();
        return jMin - (System.currentTimeMillis() - this.zzb);
    }

    public final long zzb() {
        return this.zzb;
    }

    public final Object zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        long j = this.zzb;
        long j3 = this.zzd;
        ((p090m3.b) this.zzc).getClass();
        return System.currentTimeMillis() >= j + j3;
    }
}
