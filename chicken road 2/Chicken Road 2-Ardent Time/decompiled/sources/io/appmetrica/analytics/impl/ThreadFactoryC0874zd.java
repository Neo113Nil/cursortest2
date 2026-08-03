package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0874zd implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f7184a = new java.util.concurrent.atomic.AtomicInteger(0);

    public static int a() {
        return f7184a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread(runnable, "null-" + f7184a.incrementAndGet());
    }
}
