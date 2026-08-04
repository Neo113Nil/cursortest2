package D6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends W implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final F f1788A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f1789B;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l7;
        F f7 = new F();
        f1788A = f7;
        f7.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f1789B = timeUnit.toNanos(l7.longValue());
    }

    @Override // D6.W, D6.J
    public final O a(long j, E0 e7, p065i6.i iVar) {
        long j3 = 0;
        if (j > 0) {
            j3 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j3 >= 4611686018427387903L) {
            return v0.f1883a;
        }
        long jNanoTime = System.nanoTime();
        T t7 = new T(j3 + jNanoTime, e7);
        q(jNanoTime, t7);
        return t7;
    }

    @Override // D6.X
    public final Thread g() {
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

    @Override // D6.X
    public final void k(long j, U u4) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // D6.W
    public final void n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n(runnable);
    }

    public final synchronized void r() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            W.f1808x.set(this, null);
            W.f1809y.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0.f1776a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    _thread = null;
                    r();
                    if (p()) {
                        return;
                    }
                    g();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jI = i();
                    if (jI == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f1789B + jNanoTime;
                        }
                        long j3 = j - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (jI > j3) {
                            jI = j3;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jI > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, jI);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            r();
            if (!p()) {
                g();
            }
            throw th;
        }
    }

    @Override // D6.W, D6.X
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
