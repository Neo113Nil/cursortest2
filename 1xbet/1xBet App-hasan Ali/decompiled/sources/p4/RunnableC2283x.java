package p4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: p4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2283x extends J implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: t, reason: collision with root package name */
    public static final RunnableC2283x f18834t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f18835u;

    static {
        Long l5;
        RunnableC2283x runnableC2283x = new RunnableC2283x();
        f18834t = runnableC2283x;
        runnableC2283x.K(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f18835u = timeUnit.toNanos(l5.longValue());
    }

    @Override // p4.K
    public final Thread J() {
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
                thread.setContextClassLoader(f18834t.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p4.K
    public final void N(long j5, H h3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p4.J
    public final void O(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.O(runnable);
    }

    public final synchronized void T() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            J.f18750q.set(this, null);
            J.f18751r.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean R4;
        k0.f18800a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (R4) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j5 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long L5 = L();
                    if (L5 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j5 == Long.MAX_VALUE) {
                            j5 = f18835u + nanoTime;
                        }
                        long j6 = j5 - nanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            T();
                            if (R()) {
                                return;
                            }
                            J();
                            return;
                        }
                        if (L5 > j6) {
                            L5 = j6;
                        }
                    } else {
                        j5 = Long.MAX_VALUE;
                    }
                    if (L5 > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            T();
                            if (R()) {
                                return;
                            }
                            J();
                            return;
                        }
                        LockSupport.parkNanos(this, L5);
                    }
                }
            }
        } finally {
            _thread = null;
            T();
            if (!R()) {
                J();
            }
        }
    }

    @Override // p4.J, p4.K
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p4.AbstractC2277q
    public final String toString() {
        return "DefaultExecutor";
    }
}
