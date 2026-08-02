package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzcfe extends com.google.android.libraries.places.internal.zzcfx {
    private static final java.util.concurrent.locks.ReentrantLock zza;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        zza = reentrantLock;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(reentrantLock.newCondition(), "");
        java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.util.concurrent.TimeUnit.SECONDS.toMillis(60L));
    }

    public static final boolean zza() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = zza;
        reentrantLock.lock();
        reentrantLock.unlock();
        return false;
    }
}
