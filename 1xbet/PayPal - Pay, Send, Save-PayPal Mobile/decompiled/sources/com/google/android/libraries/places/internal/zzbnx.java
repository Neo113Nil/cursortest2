package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbnx implements java.util.concurrent.Executor {
    private final java.lang.Thread.UncaughtExceptionHandler zza;
    private final java.util.Queue zzb = new java.util.concurrent.ConcurrentLinkedQueue();
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();

    public zzbnx(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = (java.lang.Thread.UncaughtExceptionHandler) com.google.common.base.Preconditions.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        zzb(runnable);
        zza();
    }

    public final void zza() {
        while (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.zzc, null, java.lang.Thread.currentThread())) {
            while (true) {
                try {
                    java.lang.Runnable runnable = (java.lang.Runnable) this.zzb.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (java.lang.Throwable th) {
                        this.zza.uncaughtException(java.lang.Thread.currentThread(), th);
                    }
                } catch (java.lang.Throwable th2) {
                    this.zzc.set(null);
                    throw th2;
                }
            }
            this.zzc.set(null);
            if (this.zzb.isEmpty()) {
                return;
            }
        }
    }

    public final void zzb(java.lang.Runnable runnable) {
        this.zzb.add((java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(runnable, "runnable is null"));
    }

    public final void zzc() {
        com.google.common.base.Preconditions.checkState(java.lang.Thread.currentThread() == this.zzc.get(), "Not called from the SynchronizationContext");
    }

    public final com.google.android.libraries.places.internal.zzbnw zzd(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.android.libraries.places.internal.zzbnv zzbnvVar = new com.google.android.libraries.places.internal.zzbnv(runnable);
        return new com.google.android.libraries.places.internal.zzbnw(zzbnvVar, scheduledExecutorService.schedule(new com.google.android.libraries.places.internal.zzbnu(this, zzbnvVar, runnable), j, timeUnit), null);
    }
}
