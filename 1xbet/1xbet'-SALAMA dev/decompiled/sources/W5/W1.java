package W5;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class W1 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f7085d = Logger.getLogger(W1.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Z1 f7086e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7088b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7089c = 0;

    static {
        Z1 v6;
        try {
            v6 = new U1(AtomicIntegerFieldUpdater.newUpdater(W1.class, "c"));
        } catch (Throwable th) {
            f7085d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            v6 = new V1();
        }
        f7086e = v6;
    }

    public W1(Executor executor) {
        p113p3.f.k(executor, "'executor' must not be null.");
        this.f7087a = executor;
    }

    public final void a(Runnable runnable) {
        Z1 z4 = f7086e;
        if (z4.r(this)) {
            try {
                this.f7087a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f7088b.remove(runnable);
                }
                z4.s(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f7088b;
        p113p3.f.k(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Z1 z4 = f7086e;
        while (true) {
            concurrentLinkedQueue = this.f7088b;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e7) {
                    f7085d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e7);
                }
            } catch (Throwable th) {
                z4.s(this);
                throw th;
            }
        }
        z4.s(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
