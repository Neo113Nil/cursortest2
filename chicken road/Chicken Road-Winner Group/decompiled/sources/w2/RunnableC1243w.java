package w2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: w2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1243w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC1243w f10534j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f10535k;

    static {
        Long l3;
        RunnableC1243w runnableC1243w = new RunnableC1243w();
        f10534j = runnableC1243w;
        runnableC1243w.j(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f10535k = timeUnit.toNanos(l3.longValue());
    }

    @Override // w2.H
    public final Thread f() {
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

    @Override // w2.G
    public final void n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n(runnable);
    }

    public final synchronized void p() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            G.f10466g.set(this, null);
            G.f10467h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o3;
        h0.f10506a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (o3) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l3 = l();
                    if (l3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f10535k + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            p();
                            if (o()) {
                                return;
                            }
                            f();
                            return;
                        }
                        if (l3 > j4) {
                            l3 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (l3 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            p();
                            if (o()) {
                                return;
                            }
                            f();
                            return;
                        }
                        LockSupport.parkNanos(this, l3);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!o()) {
                f();
            }
        }
    }

    @Override // w2.G, w2.H
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
