package com.google.android.gms.internal.ads;

import F2.C0254t;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzfir {
    private final Object zza;
    private final long zzb;
    private final InterfaceC1436a zzc;
    private final long zzd;

    public zzfir(Object obj, InterfaceC1436a interfaceC1436a) {
        this.zza = obj;
        this.zzc = interfaceC1436a;
        ((m3.b) interfaceC1436a).getClass();
        this.zzb = System.currentTimeMillis();
        this.zzd = ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzC)).longValue() * 1000;
    }

    public final long zza() {
        long min = this.zzd + Math.min(Math.max(((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzx)).longValue(), -900000L), 10000L);
        ((m3.b) this.zzc).getClass();
        return min - (System.currentTimeMillis() - this.zzb);
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
        ((m3.b) this.zzc).getClass();
        return System.currentTimeMillis() >= j + j3;
    }
}
