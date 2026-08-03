package i;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0179b implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f3305a = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setName("arch_disk_io_" + this.f3305a.getAndIncrement());
        return thread;
    }
}
