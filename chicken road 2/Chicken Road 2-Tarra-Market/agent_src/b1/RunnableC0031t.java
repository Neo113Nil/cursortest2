package b1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: b1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0031t extends B implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final RunnableC0031t f689i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f690j;

    static {
        Long l2;
        RunnableC0031t runnableC0031t = new RunnableC0031t();
        f689i = runnableC0031t;
        runnableC0031t.p(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f690j = timeUnit.toNanos(l2.longValue());
    }

    @Override // b1.C
    public final Thread o() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // b1.B, b1.C
    public final void r() {
        debugStatus = 4;
        super.r();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean t2;
        Z.f649a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (t2) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long u2 = u();
                    if (u2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f690j + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            v();
                            if (t()) {
                                return;
                            }
                            o();
                            return;
                        }
                        if (u2 > j3) {
                            u2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (u2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            v();
                            if (t()) {
                                return;
                            }
                            o();
                            return;
                        }
                        LockSupport.parkNanos(this, u2);
                    }
                }
            }
        } finally {
            _thread = null;
            v();
            if (!t()) {
                o();
            }
        }
    }

    @Override // b1.B
    public final void s(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.s(runnable);
    }

    public final synchronized void v() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            B.f620f.set(this, null);
            B.f621g.set(this, null);
            notifyAll();
        }
    }
}
