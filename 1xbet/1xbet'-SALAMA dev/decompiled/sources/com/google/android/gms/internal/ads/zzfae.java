package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
public final class zzfae {
    private final p090m3.a zza;
    private final zzdqq zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfae(p090m3.a aVar, zzdqq zzdqqVar) {
        this.zza = aVar;
        this.zzb = zzdqqVar;
    }

    private final void zze() {
        ((p090m3.b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzfU)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i7, int i8) {
        zze();
        Object obj = this.zzc;
        ((p090m3.b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i7) {
                    return;
                }
                this.zze = i8;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z4) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmX)).booleanValue()) {
            zzdqp zzdqpVarZza = this.zzb.zza();
            zzdqpVarZza.zzb("action", "mbs_state");
            zzdqpVarZza.zzb("mbs_state", true != z4 ? "0" : "1");
            zzdqpVarZza.zzj();
        }
        if (z4) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzc) {
            zze();
            z4 = this.zze == 3;
        }
        return z4;
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zzc) {
            zze();
            z4 = this.zze == 2;
        }
        return z4;
    }
}
