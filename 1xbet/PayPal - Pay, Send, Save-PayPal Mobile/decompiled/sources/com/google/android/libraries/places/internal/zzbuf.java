package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbuf implements java.lang.Runnable {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbuf.class.getName());
    private final java.lang.Runnable zzb;

    public zzbuf(java.lang.Runnable runnable) {
        this.zzb = (java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(runnable, "task");
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 22);
        sb.append("LogExceptionRunnable(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (java.lang.Throwable th) {
            zza.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zzb))), th);
            com.google.common.base.Throwables.throwIfUnchecked(th);
            throw new java.lang.AssertionError(th);
        }
    }
}
