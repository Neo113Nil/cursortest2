package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgbx implements Runnable {
    zzgca zza;

    public zzgbx(zzgca zzgcaVar) {
        this.zza = zzgcaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        I3.b bVar;
        ScheduledFuture scheduledFuture;
        zzgca zzgcaVar = this.zza;
        if (zzgcaVar == null || bVar == null) {
            return;
        }
        this.zza = null;
        if (bVar.isDone()) {
            zzgcaVar.zzs(bVar);
            return;
        }
        try {
            scheduledFuture = zzgcaVar.zzb;
            zzgcaVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgcaVar.zzd(new zzgby(str, null));
                    throw th;
                }
            }
            zzgcaVar.zzd(new zzgby(str + ": " + bVar.toString(), null));
        } finally {
            bVar.cancel(true);
        }
    }
}
