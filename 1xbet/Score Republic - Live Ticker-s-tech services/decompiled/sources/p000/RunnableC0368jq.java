package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: jq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0368jq extends AbstractC0486mx implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u */
    public static final RunnableC0368jq f4062u;

    /* JADX INFO: renamed from: v */
    public static final long f4063v;

    static {
        Long l;
        RunnableC0368jq runnableC0368jq = new RunnableC0368jq();
        f4062u = runnableC0368jq;
        runnableC0368jq.m3098s(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f4063v = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // p000.AbstractC0486mx
    /* JADX INFO: renamed from: B */
    public final Thread mo2951B() {
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
                thread.setContextClassLoader(f4062u.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized void m2952F() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m3441E();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        cd1.f1223a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m2952F();
                    if (m3439C()) {
                        return;
                    }
                    mo2951B();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo3099t = mo3099t();
                    if (jMo3099t == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f4063v + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m2952F();
                            if (m3439C()) {
                                return;
                            }
                            mo2951B();
                            return;
                        }
                        if (jMo3099t > j2) {
                            jMo3099t = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo3099t > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m2952F();
                            if (m3439C()) {
                                return;
                            }
                            mo2951B();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo3099t);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m2952F();
            if (!m3439C()) {
                mo2951B();
            }
            throw th;
        }
    }

    @Override // p000.AbstractC0486mx, p000.AbstractC0412kx
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC0292hn
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.AbstractC0486mx
    /* JADX INFO: renamed from: x */
    public final void mo2953x(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo2953x(runnable);
    }
}
