package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhy extends com.google.android.gms.measurement.internal.zzje {
    private static final java.util.concurrent.atomic.AtomicLong zzj = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
    private com.google.android.gms.measurement.internal.zzhx zza;
    private com.google.android.gms.measurement.internal.zzhx zzb;
    private final java.util.concurrent.PriorityBlockingQueue zzc;
    private final java.util.concurrent.BlockingQueue zzd;
    private final java.lang.Thread.UncaughtExceptionHandler zze;
    private final java.lang.Thread.UncaughtExceptionHandler zzf;
    private final java.lang.Object zzg;
    private final java.util.concurrent.Semaphore zzh;
    private volatile boolean zzi;

    zzhy(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzg = new java.lang.Object();
        this.zzh = new java.util.concurrent.Semaphore(2);
        this.zzc = new java.util.concurrent.PriorityBlockingQueue();
        this.zzd = new java.util.concurrent.LinkedBlockingQueue();
        this.zze = new com.google.android.gms.measurement.internal.zzhv(this, "Thread death: Uncaught exception on worker thread");
        this.zzf = new com.google.android.gms.measurement.internal.zzhv(this, "Thread death: Uncaught exception on network thread");
    }

    private final void zzz(com.google.android.gms.measurement.internal.zzhw zzhwVar) {
        synchronized (this.zzg) {
            java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = this.zzc;
            priorityBlockingQueue.add(zzhwVar);
            com.google.android.gms.measurement.internal.zzhx zzhxVar = this.zza;
            if (zzhxVar == null) {
                com.google.android.gms.measurement.internal.zzhx zzhxVar2 = new com.google.android.gms.measurement.internal.zzhx(this, "Measurement Worker", priorityBlockingQueue);
                this.zza = zzhxVar2;
                zzhxVar2.setUncaughtExceptionHandler(this.zze);
                this.zza.start();
            } else {
                zzhxVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    protected final boolean zza() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    public final void zzaX() {
        if (java.lang.Thread.currentThread() != this.zzb) {
            throw new java.lang.IllegalStateException("Call expected from network thread");
        }
    }

    public final void zzd() {
        if (java.lang.Thread.currentThread() == this.zza) {
            throw new java.lang.IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean zze() {
        return java.lang.Thread.currentThread() == this.zza;
    }

    public final boolean zzf() {
        return java.lang.Thread.currentThread() == this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    public final void zzg() {
        if (java.lang.Thread.currentThread() != this.zza) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    public final java.util.concurrent.Future zzh(java.util.concurrent.Callable callable) throws java.lang.IllegalStateException {
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.measurement.internal.zzhw zzhwVar = new com.google.android.gms.measurement.internal.zzhw(this, callable, false, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zza) {
            if (!this.zzc.isEmpty()) {
                this.zzu.zzaV().zze().zza("Callable skipped the worker queue.");
            }
            zzhwVar.run();
        } else {
            zzz(zzhwVar);
        }
        return zzhwVar;
    }

    public final java.util.concurrent.Future zzi(java.util.concurrent.Callable callable) throws java.lang.IllegalStateException {
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.measurement.internal.zzhw zzhwVar = new com.google.android.gms.measurement.internal.zzhw(this, callable, true, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zza) {
            zzhwVar.run();
        } else {
            zzz(zzhwVar);
        }
        return zzhwVar;
    }

    public final void zzj(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        zzz(new com.google.android.gms.measurement.internal.zzhw(this, runnable, false, "Task exception on worker thread"));
    }

    final java.lang.Object zzk(java.util.concurrent.atomic.AtomicReference atomicReference, long j, java.lang.String str, java.lang.Runnable runnable) {
        synchronized (atomicReference) {
            this.zzu.zzaW().zzj(runnable);
            try {
                atomicReference.wait(j);
            } catch (java.lang.InterruptedException unused) {
                com.google.android.gms.measurement.internal.zzgr zze = this.zzu.zzaV().zze();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                zze.zza(sb.toString());
                return null;
            }
        }
        java.lang.Object obj = atomicReference.get();
        if (obj == null) {
            this.zzu.zzaV().zze().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void zzl(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        zzz(new com.google.android.gms.measurement.internal.zzhw(this, runnable, true, "Task exception on worker thread"));
    }

    public final void zzm(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzhw zzhwVar = new com.google.android.gms.measurement.internal.zzhw(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzg) {
            java.util.concurrent.BlockingQueue blockingQueue = this.zzd;
            blockingQueue.add(zzhwVar);
            com.google.android.gms.measurement.internal.zzhx zzhxVar = this.zzb;
            if (zzhxVar == null) {
                com.google.android.gms.measurement.internal.zzhx zzhxVar2 = new com.google.android.gms.measurement.internal.zzhx(this, "Measurement Network", blockingQueue);
                this.zzb = zzhxVar2;
                zzhxVar2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzhxVar.zza();
            }
        }
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzhx zzn() {
        return this.zza;
    }

    final /* synthetic */ void zzo(com.google.android.gms.measurement.internal.zzhx zzhxVar) {
        this.zza = null;
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzhx zzp() {
        return this.zzb;
    }

    final /* synthetic */ void zzq(com.google.android.gms.measurement.internal.zzhx zzhxVar) {
        this.zzb = null;
    }

    final /* synthetic */ java.lang.Object zzr() {
        return this.zzg;
    }

    final /* synthetic */ java.util.concurrent.Semaphore zzs() {
        return this.zzh;
    }

    final /* synthetic */ boolean zzt() {
        return false;
    }
}
