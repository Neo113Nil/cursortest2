package L3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f1494c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f1495d;

    public e() {
        this.f1492a = 1;
        this.f1494c = new AtomicInteger();
        this.f1495d = Executors.defaultThreadFactory();
        this.f1493b = "GAC_Executor";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1492a) {
            case 0:
                Thread newThread = this.f1495d.newThread(runnable);
                newThread.setUncaughtExceptionHandler(new d(newThread.getUncaughtExceptionHandler()));
                try {
                    newThread.setDaemon(true);
                    newThread.setName(this.f1493b + "-" + this.f1494c.incrementAndGet());
                    newThread.setContextClassLoader(null);
                } catch (SecurityException unused) {
                }
                return newThread;
            default:
                Thread newThread2 = this.f1495d.newThread(new O1.j(runnable, 2));
                newThread2.setName(this.f1493b + "[" + this.f1494c.getAndIncrement() + "]");
                return newThread2;
        }
    }

    public e(String str) {
        this.f1492a = 0;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        this.f1492a = 0;
        this.f1494c = new AtomicInteger();
        this.f1493b = str;
        this.f1495d = defaultThreadFactory;
    }
}
