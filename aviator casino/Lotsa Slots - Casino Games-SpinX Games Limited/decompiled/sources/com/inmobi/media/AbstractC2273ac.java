package com.inmobi.media;

/* renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2273ac {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.CoroutineScope f5097a;
    public static final java.util.concurrent.Semaphore b;
    public static final java.util.concurrent.atomic.AtomicBoolean c;

    static {
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("LogSingle", true));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f5097a = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(newSingleThreadExecutor));
        b = new java.util.concurrent.Semaphore(1);
        c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
