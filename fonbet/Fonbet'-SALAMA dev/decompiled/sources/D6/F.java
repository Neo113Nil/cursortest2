package D6;

import i6.InterfaceC1292i;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class F extends W implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static final F f1788A;

    /* renamed from: B, reason: collision with root package name */
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
    public final O a(long j, E0 e02, InterfaceC1292i interfaceC1292i) {
        long j3 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j3 >= 4611686018427387903L) {
            return v0.f1883a;
        }
        long nanoTime = System.nanoTime();
        T t7 = new T(j3 + nanoTime, e02);
        q(nanoTime, t7);
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
        boolean p5;
        C0.f1776a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (p5) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long i8 = i();
                    if (i8 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f1789B + nanoTime;
                        }
                        long j3 = j - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (i8 > j3) {
                            i8 = j3;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (i8 > 0) {
                        int i9 = debugStatus;
                        if (i9 == 2 || i9 == 3) {
                            _thread = null;
                            r();
                            if (p()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, i8);
                    }
                }
            }
        } finally {
            _thread = null;
            r();
            if (!p()) {
                g();
            }
        }
    }

    @Override // D6.W, D6.X
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
