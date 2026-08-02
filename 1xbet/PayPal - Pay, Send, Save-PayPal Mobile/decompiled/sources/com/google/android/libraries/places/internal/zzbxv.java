package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxv {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final java.util.concurrent.Executor zzb;
    private final java.lang.Runnable zzc;
    private final com.google.common.base.Stopwatch zzd;
    private long zze;
    private boolean zzf;
    private java.util.concurrent.ScheduledFuture zzg;

    zzbxv(java.lang.Runnable runnable, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.common.base.Stopwatch stopwatch) {
        this.zzc = runnable;
        this.zzb = executor;
        this.zza = scheduledExecutorService;
        this.zzd = stopwatch;
        stopwatch.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final long zzc() {
        return this.zzd.elapsed(java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    final void zza(long j, java.util.concurrent.TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long zzc = zzc() + nanos;
        this.zzf = true;
        if (zzc - this.zze < 0 || this.zzg == null) {
            java.util.concurrent.ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzg = this.zza.schedule(new com.google.android.libraries.places.internal.zzbxu(this, null), nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        this.zze = zzc;
    }

    final void zzb(boolean z) {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        this.zzf = false;
        if (!z || (scheduledFuture = this.zzg) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.zzg = null;
    }

    final /* synthetic */ void zzj(java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.zzg = scheduledFuture;
    }

    final /* synthetic */ void zzi(boolean z) {
        this.zzf = false;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzf;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ java.lang.Runnable zzf() {
        return this.zzc;
    }

    final /* synthetic */ java.util.concurrent.Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzd() {
        return this.zza;
    }
}
