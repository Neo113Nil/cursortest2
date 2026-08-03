package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzasq extends java.lang.Thread {
    private static final boolean zza = com.google.android.gms.internal.ads.zzatq.zzb;
    private final java.util.concurrent.BlockingQueue zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private final com.google.android.gms.internal.ads.zzaso zzd;
    private volatile boolean zze = false;
    private final com.google.android.gms.internal.ads.zzatr zzf;
    private final com.google.android.gms.internal.ads.zzasv zzg;

    public zzasq(java.util.concurrent.BlockingQueue blockingQueue, java.util.concurrent.BlockingQueue blockingQueue2, com.google.android.gms.internal.ads.zzaso zzasoVar, com.google.android.gms.internal.ads.zzasv zzasvVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzasoVar;
        this.zzg = zzasvVar;
        this.zzf = new com.google.android.gms.internal.ads.zzatr(this, blockingQueue2, zzasvVar);
    }

    private void zzc() throws java.lang.InterruptedException {
        com.google.android.gms.internal.ads.zzate zzateVar = (com.google.android.gms.internal.ads.zzate) this.zzb.take();
        zzateVar.zzc("cache-queue-take");
        zzateVar.zze(1);
        try {
            zzateVar.zzl();
            com.google.android.gms.internal.ads.zzaso zzasoVar = this.zzd;
            com.google.android.gms.internal.ads.zzasn zza2 = zzasoVar.zza(zzateVar.zzi());
            if (zza2 == null) {
                zzateVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzateVar)) {
                    this.zzc.put(zzateVar);
                }
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzateVar.zzc("cache-hit-expired");
                    zzateVar.zzj(zza2);
                    if (!this.zzf.zzc(zzateVar)) {
                        this.zzc.put(zzateVar);
                    }
                } else {
                    zzateVar.zzc("cache-hit");
                    com.google.android.gms.internal.ads.zzatk zzr = zzateVar.zzr(new com.google.android.gms.internal.ads.zzata(zza2.zza, zza2.zzg));
                    zzateVar.zzc("cache-hit-parsed");
                    if (!zzr.zzc()) {
                        zzateVar.zzc("cache-parsing-failed");
                        zzasoVar.zzd(zzateVar.zzi(), true);
                        zzateVar.zzj(null);
                        if (!this.zzf.zzc(zzateVar)) {
                            this.zzc.put(zzateVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzateVar.zzc("cache-hit-refresh-needed");
                        zzateVar.zzj(zza2);
                        zzr.zzd = true;
                        if (this.zzf.zzc(zzateVar)) {
                            this.zzg.zza(zzateVar, zzr, null);
                        } else {
                            this.zzg.zza(zzateVar, zzr, new com.google.android.gms.internal.ads.zzasp(this, zzateVar));
                        }
                    } else {
                        this.zzg.zza(zzateVar, zzr, null);
                    }
                }
            }
        } finally {
            zzateVar.zze(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            com.google.android.gms.internal.ads.zzatq.zza("start new dispatcher", new java.lang.Object[0]);
        }
        android.os.Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (java.lang.InterruptedException unused) {
                if (this.zze) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.google.android.gms.internal.ads.zzatq.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    final /* synthetic */ java.util.concurrent.BlockingQueue zzb() {
        return this.zzc;
    }
}
