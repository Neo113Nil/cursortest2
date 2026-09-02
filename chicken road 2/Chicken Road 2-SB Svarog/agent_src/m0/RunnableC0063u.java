package m0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: m0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0063u extends C implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0063u f953j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f954k;

    static {
        Long l2;
        RunnableC0063u runnableC0063u = new RunnableC0063u();
        f953j = runnableC0063u;
        runnableC0063u.k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f954k = timeUnit.toNanos(l2.longValue());
    }

    @Override // m0.D
    public final Thread j() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // m0.C
    public final void m(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m(runnable);
    }

    public final synchronized void p() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            C.f886g.set(this, null);
            C.f887h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n2;
        a0.f916a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (n2) {
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
                    long o2 = o();
                    if (o2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f954k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            j();
                            return;
                        }
                        if (o2 > j3) {
                            o2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (o2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            j();
                            return;
                        }
                        LockSupport.parkNanos(this, o2);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!n()) {
                j();
            }
        }
    }

    @Override // m0.C, m0.D
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
