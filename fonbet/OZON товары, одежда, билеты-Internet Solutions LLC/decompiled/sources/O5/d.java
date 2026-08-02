package O5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f19969d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f19970a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f19971b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f19972c;

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f19970a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f19972c = "lottie-" + f19969d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f19970a, runnable, this.f19972c + this.f19971b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
