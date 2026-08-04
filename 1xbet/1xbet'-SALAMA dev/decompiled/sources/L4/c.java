package L4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable, ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f4341a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f4342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f4343c;

    public c(d dVar) {
        this.f4343c = dVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        p113p3.f.O("Only one thread may be created in an AsyncQueue.", this.f4342b == null, new Object[0]);
        this.f4342b = runnable;
        this.f4341a.countDown();
        return this.f4343c.f4346c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4341a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.f4342b.run();
    }
}
