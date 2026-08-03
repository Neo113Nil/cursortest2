package com.vungle.ads.internal.executor;

/* compiled from: NamedThreadFactory.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "name", "", "(Ljava/lang/String;)V", "atomicInteger", "Ljava/util/concurrent/atomic/AtomicInteger;", "getName", "()Ljava/lang/String;", "threadFactory", "kotlin.jvm.PlatformType", "newThread", "Ljava/lang/Thread;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Ljava/lang/Runnable;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger atomicInteger;
    private final java.lang.String name;
    private final java.util.concurrent.ThreadFactory threadFactory;

    public NamedThreadFactory(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        this.atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        java.lang.Thread t = this.threadFactory.newThread(r);
        t.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "t");
        return t;
    }
}
