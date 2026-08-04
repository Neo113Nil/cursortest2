package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class zzaon extends Thread {
    private static final boolean zza = zzapn.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaol zzd;
    private volatile boolean zze = false;
    private final zzapo zzf;
    private final zzaos zzg;

    public zzaon(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaol zzaolVar, zzaos zzaosVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaolVar;
        this.zzg = zzaosVar;
        this.zzf = new zzapo(this, blockingQueue2, zzaosVar);
    }

    private void zzc() {
        zzapb zzapbVar = (zzapb) this.zzb.take();
        zzapbVar.zzm("cache-queue-take");
        zzapbVar.zzt(1);
        try {
            zzapbVar.zzw();
            zzaok zzaokVarZza = this.zzd.zza(zzapbVar.zzj());
            if (zzaokVarZza == null) {
                zzapbVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzapbVar)) {
                    this.zzc.put(zzapbVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzaokVarZza.zza(jCurrentTimeMillis)) {
                    zzapbVar.zzm("cache-hit-expired");
                    zzapbVar.zze(zzaokVarZza);
                    if (!this.zzf.zzc(zzapbVar)) {
                        this.zzc.put(zzapbVar);
                    }
                } else {
                    zzapbVar.zzm("cache-hit");
                    zzaph zzaphVarZzh = zzapbVar.zzh(new zzaox(zzaokVarZza.zza, zzaokVarZza.zzg));
                    zzapbVar.zzm("cache-hit-parsed");
                    if (!zzaphVarZzh.zzc()) {
                        zzapbVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzapbVar.zzj(), true);
                        zzapbVar.zze(null);
                        if (!this.zzf.zzc(zzapbVar)) {
                            this.zzc.put(zzapbVar);
                        }
                    } else if (zzaokVarZza.zzf < jCurrentTimeMillis) {
                        zzapbVar.zzm("cache-hit-refresh-needed");
                        zzapbVar.zze(zzaokVarZza);
                        zzaphVarZzh.zzd = true;
                        if (this.zzf.zzc(zzapbVar)) {
                            this.zzg.zzb(zzapbVar, zzaphVarZzh, null);
                        } else {
                            this.zzg.zzb(zzapbVar, zzaphVarZzh, new zzaom(this, zzapbVar));
                        }
                    } else {
                        this.zzg.zzb(zzapbVar, zzaphVarZzh, null);
                    }
                }
            }
        } finally {
            zzapbVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapn.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapn.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
