package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC1093j0;

@SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: classes5.dex */
public final class P extends AbstractC1093j0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final P j;
    public static final long k;

    static {
        Long l;
        P p = new P();
        j = p;
        p.Y(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        k = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC1095k0
    public final Thread b0() {
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
                thread.setContextClassLoader(j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC1095k0
    public final void c0(long j2, AbstractC1093j0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC1093j0, kotlinx.coroutines.U
    public final InterfaceC1053e0 d(long j2, W0 w0, CoroutineContext coroutineContext) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 >= 4611686018427387903L) {
            return K0.a;
        }
        long nanoTime = System.nanoTime();
        AbstractC1093j0.b bVar = new AbstractC1093j0.b(j3 + nanoTime, w0);
        h0(nanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.AbstractC1093j0
    public final void d0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.d0(runnable);
    }

    public final synchronized void i0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC1093j0.e.set(this, null);
            AbstractC1093j0.f.set(this, null);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread thread;
        U0.a.set(this);
        Thread thread2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        int i = debugStatus;
                        if (i == 2 || i == 3) {
                            _thread = null;
                            i0();
                            if (g0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        debugStatus = 1;
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        long j2 = Long.MAX_VALUE;
                        while (true) {
                            Thread.interrupted();
                            long Z = Z();
                            if (Z == Long.MAX_VALUE) {
                                long nanoTime = System.nanoTime();
                                if (j2 == Long.MAX_VALUE) {
                                    j2 = k + nanoTime;
                                }
                                thread = thread2;
                                long j3 = j2 - nanoTime;
                                if (j3 <= 0) {
                                    _thread = thread;
                                    i0();
                                    if (g0()) {
                                        return;
                                    }
                                    b0();
                                    return;
                                }
                                Z = RangesKt.coerceAtMost(Z, j3);
                            } else {
                                thread = thread2;
                                j2 = Long.MAX_VALUE;
                            }
                            if (Z > 0) {
                                int i2 = debugStatus;
                                if (i2 == 2 || i2 == 3) {
                                    _thread = thread;
                                    i0();
                                    if (g0()) {
                                        return;
                                    }
                                    b0();
                                    return;
                                }
                                LockSupport.parkNanos(this, Z);
                            }
                            thread2 = thread;
                        }
                    } catch (Throwable th) {
                        th = th;
                        _thread = null;
                        i0();
                        if (!g0()) {
                            b0();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // kotlinx.coroutines.AbstractC1093j0, kotlinx.coroutines.AbstractC1083i0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return "DefaultExecutor";
    }
}
