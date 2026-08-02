package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbl implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.CyclicBarrier zza;
    final /* synthetic */ java.util.concurrent.CountDownLatch zzb;

    zzcbl(com.google.android.libraries.places.internal.zzcbp zzcbpVar, java.util.concurrent.CyclicBarrier cyclicBarrier, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zza = cyclicBarrier;
        this.zzb = countDownLatch;
        java.util.Objects.requireNonNull(zzcbpVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            this.zzb.await();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        } catch (java.util.concurrent.BrokenBarrierException | java.util.concurrent.TimeoutException unused2) {
        }
    }
}
