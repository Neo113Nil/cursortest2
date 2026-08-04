package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class zzaov extends Thread {
    private final BlockingQueue zza;
    private final zzaou zzb;
    private final zzaol zzc;
    private volatile boolean zzd = false;
    private final zzaos zze;

    public zzaov(BlockingQueue blockingQueue, zzaou zzaouVar, zzaol zzaolVar, zzaos zzaosVar) {
        this.zza = blockingQueue;
        this.zzb = zzaouVar;
        this.zzc = zzaolVar;
        this.zze = zzaosVar;
    }

    private void zzb() {
        zzapb zzapbVar = (zzapb) this.zza.take();
        SystemClock.elapsedRealtime();
        zzapbVar.zzt(3);
        try {
            try {
                zzapbVar.zzm("network-queue-take");
                zzapbVar.zzw();
                TrafficStats.setThreadStatsTag(zzapbVar.zzc());
                zzaox zzaoxVarZza = this.zzb.zza(zzapbVar);
                zzapbVar.zzm("network-http-complete");
                if (zzaoxVarZza.zze && zzapbVar.zzv()) {
                    zzapbVar.zzp("not-modified");
                    zzapbVar.zzr();
                } else {
                    zzaph zzaphVarZzh = zzapbVar.zzh(zzaoxVarZza);
                    zzapbVar.zzm("network-parse-complete");
                    if (zzaphVarZzh.zzb != null) {
                        this.zzc.zzd(zzapbVar.zzj(), zzaphVarZzh.zzb);
                        zzapbVar.zzm("network-cache-written");
                    }
                    zzapbVar.zzq();
                    this.zze.zzb(zzapbVar, zzaphVarZzh, null);
                    zzapbVar.zzs(zzaphVarZzh);
                }
            } catch (zzapk e7) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzapbVar, e7);
                zzapbVar.zzr();
            } catch (Exception e8) {
                zzapn.zzc(e8, "Unhandled exception %s", e8.toString());
                zzapk zzapkVar = new zzapk(e8);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzapbVar, zzapkVar);
                zzapbVar.zzr();
            }
        } finally {
            zzapbVar.zzt(4);
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
                zzapn.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
