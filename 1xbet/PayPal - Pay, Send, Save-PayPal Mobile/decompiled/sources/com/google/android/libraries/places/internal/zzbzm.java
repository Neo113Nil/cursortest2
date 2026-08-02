package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzm implements java.util.concurrent.Executor {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbzm.class.getName());
    private boolean zzb;
    private java.util.ArrayDeque zzc;

    private final void zza() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.zzc.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (java.lang.Throwable th) {
                zza.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(runnable, "'task' must not be null.");
        if (this.zzb) {
            if (this.zzc == null) {
                this.zzc = new java.util.ArrayDeque(4);
            }
            this.zzc.add(runnable);
            return;
        }
        this.zzb = true;
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            try {
                java.util.logging.Logger logger = zza;
                java.util.logging.Level level = java.util.logging.Level.SEVERE;
                java.lang.String valueOf = java.lang.String.valueOf(runnable);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 35);
                sb.append("Exception while executing runnable ");
                sb.append(valueOf);
                logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb.toString(), th);
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
            } finally {
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
            }
        }
    }

    zzbzm() {
    }
}
