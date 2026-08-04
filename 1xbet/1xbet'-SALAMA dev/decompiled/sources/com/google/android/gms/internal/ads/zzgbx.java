package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zzgbx implements Runnable {
    zzgca zza;

    public zzgbx(zzgca zzgcaVar) {
        this.zza = zzgcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I3.b bVar;
        zzgca zzgcaVar = this.zza;
        if (zzgcaVar == null || (bVar = zzgcaVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (bVar.isDone()) {
            zzgcaVar.zzs(bVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzgcaVar.zzb;
            zzgcaVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgcaVar.zzd(new zzgby(str, null));
                    throw th;
                }
            }
            zzgcaVar.zzd(new zzgby(str + ": " + bVar.toString(), null));
            bVar.cancel(true);
        } catch (Throwable th2) {
            bVar.cancel(true);
            throw th2;
        }
    }
}
