package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzasy extends java.lang.Thread {
    private final java.util.concurrent.BlockingQueue zza;
    private final com.google.android.gms.internal.ads.zzasx zzb;
    private final com.google.android.gms.internal.ads.zzaso zzc;
    private volatile boolean zzd = false;
    private final com.google.android.gms.internal.ads.zzasv zze;

    public zzasy(java.util.concurrent.BlockingQueue blockingQueue, com.google.android.gms.internal.ads.zzasx zzasxVar, com.google.android.gms.internal.ads.zzaso zzasoVar, com.google.android.gms.internal.ads.zzasv zzasvVar) {
        this.zza = blockingQueue;
        this.zzb = zzasxVar;
        this.zzc = zzasoVar;
        this.zze = zzasvVar;
    }

    private void zzb() throws java.lang.InterruptedException {
        com.google.android.gms.internal.ads.zzate zzateVar = (com.google.android.gms.internal.ads.zzate) this.zza.take();
        android.os.SystemClock.elapsedRealtime();
        zzateVar.zze(3);
        try {
            try {
                zzateVar.zzc("network-queue-take");
                zzateVar.zzl();
                android.net.TrafficStats.setThreadStatsTag(zzateVar.zzb());
                com.google.android.gms.internal.ads.zzata zza = this.zzb.zza(zzateVar);
                zzateVar.zzc("network-http-complete");
                if (zza.zze && zzateVar.zzq()) {
                    zzateVar.zzd("not-modified");
                    zzateVar.zzw();
                } else {
                    com.google.android.gms.internal.ads.zzatk zzr = zzateVar.zzr(zza);
                    zzateVar.zzc("network-parse-complete");
                    com.google.android.gms.internal.ads.zzasn zzasnVar = zzr.zzb;
                    if (zzasnVar != null) {
                        this.zzc.zzb(zzateVar.zzi(), zzasnVar);
                        zzateVar.zzc("network-cache-written");
                    }
                    zzateVar.zzp();
                    this.zze.zza(zzateVar, zzr, null);
                    zzateVar.zzv(zzr);
                }
            } catch (com.google.android.gms.internal.ads.zzatn e) {
                android.os.SystemClock.elapsedRealtime();
                this.zze.zzb(zzateVar, e);
                zzateVar.zzw();
            } catch (java.lang.Exception e2) {
                com.google.android.gms.internal.ads.zzatq.zzd(e2, "Unhandled exception %s", e2.toString());
                com.google.android.gms.internal.ads.zzatn zzatnVar = new com.google.android.gms.internal.ads.zzatn(e2);
                android.os.SystemClock.elapsedRealtime();
                this.zze.zzb(zzateVar, zzatnVar);
                zzateVar.zzw();
            }
        } finally {
            zzateVar.zze(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (java.lang.InterruptedException unused) {
                if (this.zzd) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.google.android.gms.internal.ads.zzatq.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
