package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzatm extends Thread {
    private final BlockingQueue zza;
    private final zzatl zzb;
    private final zzatc zzc;
    private volatile boolean zzd = false;
    private final zzatj zze;

    public zzatm(BlockingQueue blockingQueue, zzatl zzatlVar, zzatc zzatcVar, zzatj zzatjVar) {
        this.zza = blockingQueue;
        this.zzb = zzatlVar;
        this.zzc = zzatcVar;
        this.zze = zzatjVar;
    }

    private void zzb() throws InterruptedException {
        zzats zzatsVar = (zzats) this.zza.take();
        SystemClock.elapsedRealtime();
        zzatsVar.zze(3);
        try {
            try {
                zzatsVar.zzc("network-queue-take");
                zzatsVar.zzl();
                TrafficStats.setThreadStatsTag(zzatsVar.zzb());
                zzato zza = this.zzb.zza(zzatsVar);
                zzatsVar.zzc("network-http-complete");
                if (zza.zze && zzatsVar.zzq()) {
                    zzatsVar.zzd("not-modified");
                    zzatsVar.zzw();
                } else {
                    zzaty zzr = zzatsVar.zzr(zza);
                    zzatsVar.zzc("network-parse-complete");
                    zzatb zzatbVar = zzr.zzb;
                    if (zzatbVar != null) {
                        this.zzc.zzb(zzatsVar.zzi(), zzatbVar);
                        zzatsVar.zzc("network-cache-written");
                    }
                    zzatsVar.zzp();
                    this.zze.zza(zzatsVar, zzr, null);
                    zzatsVar.zzv(zzr);
                }
            } catch (zzaub e) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzatsVar, e);
                zzatsVar.zzw();
            } catch (Exception e2) {
                zzaue.zzd(e2, "Unhandled exception %s", e2.toString());
                zzaub zzaubVar = new zzaub(e2);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzatsVar, zzaubVar);
                zzatsVar.zzw();
            }
        } finally {
            zzatsVar.zze(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaue.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
