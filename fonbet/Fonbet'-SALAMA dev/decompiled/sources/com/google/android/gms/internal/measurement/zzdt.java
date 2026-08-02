package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import m3.b;

/* loaded from: classes.dex */
abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    public zzdt(zzee zzeeVar, boolean z4) {
        this.zzk = zzeeVar;
        ((b) zzeeVar.zza).getClass();
        this.zzh = System.currentTimeMillis();
        ((b) zzeeVar.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        this.zzj = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        z4 = this.zzk.zzh;
        if (z4) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e7) {
            this.zzk.zzS(e7, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
