package z1;

/* renamed from: z1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1069w extends z1.G implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final z1.RunnableC1069w f8602j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f8603k;

    static {
        java.lang.Long l2;
        z1.RunnableC1069w runnableC1069w = new z1.RunnableC1069w();
        f8602j = runnableC1069w;
        runnableC1069w.q(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l2 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l2 = 1000L;
        }
        f8603k = timeUnit.toNanos(l2.longValue());
    }

    @Override // z1.H
    public final java.lang.Thread p() {
        java.lang.Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean v2;
        z1.h0.f8570a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (v2) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    java.lang.Thread.interrupted();
                    long r2 = r();
                    if (r2 == Long.MAX_VALUE) {
                        long nanoTime = java.lang.System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f8603k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            w();
                            if (v()) {
                                return;
                            }
                            p();
                            return;
                        }
                        if (r2 > j3) {
                            r2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (r2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            w();
                            if (v()) {
                                return;
                            }
                            p();
                            return;
                        }
                        java.util.concurrent.locks.LockSupport.parkNanos(this, r2);
                    }
                }
            }
        } finally {
            _thread = null;
            w();
            if (!v()) {
                p();
            }
        }
    }

    @Override // z1.G, z1.H
    public final void t() {
        debugStatus = 4;
        super.t();
    }

    @Override // z1.G
    public final void u(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.u(runnable);
    }

    public final synchronized void w() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            z1.G.f8525g.set(this, null);
            z1.G.f8526h.set(this, null);
            notifyAll();
        }
    }
}
