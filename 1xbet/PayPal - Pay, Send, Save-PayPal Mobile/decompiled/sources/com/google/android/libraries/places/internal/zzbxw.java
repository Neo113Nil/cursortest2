package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxw implements java.lang.Thread.UncaughtExceptionHandler {
    zzbxw(com.google.android.libraries.places.internal.zzbzf zzbzfVar) {
        java.util.Objects.requireNonNull(zzbzfVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzb(th).zze("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
