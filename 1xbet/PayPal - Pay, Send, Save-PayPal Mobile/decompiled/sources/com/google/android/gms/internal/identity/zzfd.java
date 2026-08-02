package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzfd {
    public static boolean zza(java.util.concurrent.CountDownLatch countDownLatch, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(30L);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return countDownLatch.await(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }
}
