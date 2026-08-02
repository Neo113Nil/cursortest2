package com.google.android.gms.internal.ads;

import I2.J;

/* loaded from: classes.dex */
public final class zzbmw extends zzbzm {
    private final Object zza = new Object();
    private final zzbnb zzb;
    private boolean zzc;

    public zzbmw(zzbnb zzbnbVar) {
        this.zzb = zzbnbVar;
    }

    public final void zzb() {
        J.k("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                J.k("release: Lock acquired");
                if (this.zzc) {
                    J.k("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zzj(new zzbmt(this), new zzbzi());
                zzj(new zzbmu(this), new zzbmv(this));
                J.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
