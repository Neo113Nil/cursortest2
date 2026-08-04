package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
final class zzbyo {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbyo() {
    }

    public final void zza() {
        o oVar = o.f1952C;
        oVar.j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzfU)).longValue() <= jCurrentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        oVar.j.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ zzbyo(zzbyp zzbypVar) {
    }
}
