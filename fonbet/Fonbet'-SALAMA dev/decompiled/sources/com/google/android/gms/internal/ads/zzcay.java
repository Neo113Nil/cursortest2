package com.google.android.gms.internal.ads;

import I2.K;
import I2.P;

/* loaded from: classes.dex */
final class zzcay implements Runnable {
    private final zzcak zza;
    private boolean zzb = false;

    public zzcay(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    private final void zzc() {
        K k7 = P.f3579l;
        k7.removeCallbacks(this);
        k7.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
