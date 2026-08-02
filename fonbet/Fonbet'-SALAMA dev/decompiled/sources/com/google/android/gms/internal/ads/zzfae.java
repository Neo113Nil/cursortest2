package com.google.android.gms.internal.ads;

import F2.C0254t;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzfae {
    private final InterfaceC1436a zza;
    private final zzdqq zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfae(InterfaceC1436a interfaceC1436a, zzdqq zzdqqVar) {
        this.zza = interfaceC1436a;
        this.zzb = zzdqqVar;
    }

    private final void zze() {
        ((m3.b) this.zza).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzfU)).longValue() <= currentTimeMillis) {
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
        ((m3.b) this.zza).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i7) {
                    return;
                }
                this.zze = i8;
                if (this.zze == 3) {
                    this.zzd = currentTimeMillis;
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
            zzdqp zza = this.zzb.zza();
            zza.zzb("action", "mbs_state");
            zza.zzb("mbs_state", true != z4 ? "0" : "1");
            zza.zzj();
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
