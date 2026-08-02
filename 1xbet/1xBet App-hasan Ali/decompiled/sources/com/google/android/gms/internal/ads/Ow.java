package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class Ow extends AtomicReference implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final C4 f11011k = new C4(8);

    /* renamed from: l, reason: collision with root package name */
    public static final C4 f11012l = new C4(8);

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        Nw nw = null;
        boolean z3 = false;
        int i = 0;
        while (true) {
            boolean z5 = runnable instanceof Nw;
            C4 c42 = f11012l;
            if (!z5) {
                if (runnable != c42) {
                    break;
                }
            } else {
                nw = (Nw) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == c42 || compareAndSet(runnable, c42)) {
                z3 = Thread.interrupted() || z3;
                LockSupport.park(nw);
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        C4 c42 = f11012l;
        C4 c43 = f11011k;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            Nw nw = new Nw(this);
            nw.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, nw)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(c43)) == c42) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(c43)) == c42) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean f = f();
            C4 c42 = f11011k;
            if (!f) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, c42)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, c42)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, c42)) {
                c(currentThread);
            }
            if (f) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return AbstractC0467k.v(runnable == f11011k ? "running=[DONE]" : runnable instanceof Nw ? "running=[INTERRUPTED]" : runnable instanceof Thread ? L1.a.n("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", b());
    }
}
