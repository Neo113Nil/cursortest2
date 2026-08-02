package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzq implements java.util.concurrent.Executor, java.lang.Runnable {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbzq.class.getName());
    private static final com.google.android.libraries.places.internal.zzbzn zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.Queue zzd = new java.util.concurrent.ConcurrentLinkedQueue();
    private volatile int zze = 0;

    static {
        com.google.android.libraries.places.internal.zzbzn zzbzpVar;
        byte[] bArr = null;
        try {
            zzbzpVar = new com.google.android.libraries.places.internal.zzbzo(java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.google.android.libraries.places.internal.zzbzq.class, "zze"), bArr);
        } catch (java.lang.Throwable th) {
            zza.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            zzbzpVar = new com.google.android.libraries.places.internal.zzbzp(bArr);
        }
        zzb = zzbzpVar;
    }

    public zzbzq(java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(executor, "'executor' must not be null.");
        this.zzc = executor;
    }

    private final void zzc(@javax.annotation.Nullable java.lang.Runnable runnable) {
        if (zzb.zza(this, 0, -1)) {
            try {
                this.zzc.execute(this);
            } catch (java.lang.Throwable th) {
                if (runnable != null) {
                    this.zzd.remove(runnable);
                }
                zzb.zzb(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zzd.add((java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(runnable, "'r' must not be null."));
        zzc(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) this.zzd.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (java.lang.RuntimeException e) {
                    java.util.logging.Logger logger = zza;
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.String obj = runnable.toString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(obj);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (java.lang.Throwable) e);
                }
            } catch (java.lang.Throwable th) {
                zzb.zzb(this, 0);
                throw th;
            }
        }
        zzb.zzb(this, 0);
        if (this.zzd.isEmpty()) {
            return;
        }
        zzc(null);
    }

    final /* synthetic */ void zzb(int i) {
        this.zze = i;
    }

    final /* synthetic */ int zza() {
        return this.zze;
    }
}
