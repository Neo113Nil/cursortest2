package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzds {
    private boolean zza;

    public zzds() {
        throw null;
    }

    public zzds(com.google.android.gms.internal.ads.zzdo zzdoVar) {
    }

    public final synchronized boolean zza() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z;
        z = this.zza;
        this.zza = false;
        return z;
    }

    public final synchronized void zzc() throws java.lang.InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzd() {
        boolean z = false;
        while (!this.zza) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zze(long j) {
        if (j > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            if (j2 < elapsedRealtime) {
                zzd();
            } else {
                boolean z = false;
                while (!this.zza && elapsedRealtime < j2) {
                    try {
                        wait(j2 - elapsedRealtime);
                    } catch (java.lang.InterruptedException unused) {
                        z = true;
                    }
                    elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                }
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzf() {
        return this.zza;
    }
}
