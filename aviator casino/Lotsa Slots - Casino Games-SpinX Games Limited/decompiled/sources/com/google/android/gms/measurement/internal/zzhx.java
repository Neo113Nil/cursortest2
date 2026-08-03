package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhx extends java.lang.Thread {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhy zza;
    private final java.lang.Object zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private boolean zzd;

    public zzhx(com.google.android.gms.measurement.internal.zzhy zzhyVar, java.lang.String str, java.util.concurrent.BlockingQueue blockingQueue) {
        java.util.Objects.requireNonNull(zzhyVar);
        this.zza = zzhyVar;
        this.zzd = false;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(blockingQueue);
        this.zzb = new java.lang.Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zza;
        synchronized (zzhyVar.zzr()) {
            if (!this.zzd) {
                zzhyVar.zzs().release();
                zzhyVar.zzr().notifyAll();
                if (this == zzhyVar.zzn()) {
                    zzhyVar.zzo(null);
                } else if (this == zzhyVar.zzp()) {
                    zzhyVar.zzq(null);
                } else {
                    zzhyVar.zzu.zzaV().zzb().zza("Current scheduler thread is neither worker nor network");
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(java.lang.InterruptedException interruptedException) {
        com.google.android.gms.measurement.internal.zzgr zze = this.zza.zzu.zzaV().zze();
        java.lang.String name = getName();
        java.lang.String.valueOf(name);
        zze.zzb(java.lang.String.valueOf(name).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.zza.zzs().acquire();
                z = true;
            } catch (java.lang.InterruptedException e) {
                zzc(e);
            }
        }
        try {
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            while (true) {
                java.util.concurrent.BlockingQueue blockingQueue = this.zzc;
                com.google.android.gms.measurement.internal.zzhw zzhwVar = (com.google.android.gms.measurement.internal.zzhw) blockingQueue.poll();
                if (zzhwVar != null) {
                    android.os.Process.setThreadPriority(true != zzhwVar.zza ? 10 : threadPriority);
                    zzhwVar.run();
                } else {
                    java.lang.Object obj = this.zzb;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.zza.zzt();
                            try {
                                obj.wait(30000L);
                            } catch (java.lang.InterruptedException e2) {
                                zzc(e2);
                            }
                        }
                    }
                    synchronized (this.zza.zzr()) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        java.lang.Object obj = this.zzb;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
