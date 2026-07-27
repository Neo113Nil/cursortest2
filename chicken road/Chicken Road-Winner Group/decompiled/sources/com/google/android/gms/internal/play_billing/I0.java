package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class I0 extends AtomicReference implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final RunnableC0236w0 f2638c = new RunnableC0236w0();

    /* renamed from: d, reason: collision with root package name */
    public static final RunnableC0236w0 f2639d = new RunnableC0236w0();

    /* renamed from: a, reason: collision with root package name */
    public final Callable f2640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f2641b;

    public I0(J0 j02, Callable callable) {
        this.f2641b = j02;
        callable.getClass();
        this.f2640a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC0233v0 runnableC0233v0 = null;
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            boolean z4 = runnable instanceof RunnableC0233v0;
            RunnableC0236w0 runnableC0236w0 = f2639d;
            if (!z4) {
                if (runnable != runnableC0236w0) {
                    break;
                }
            } else {
                runnableC0233v0 = (RunnableC0233v0) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC0236w0 || compareAndSet(runnable, runnableC0236w0)) {
                z3 = Thread.interrupted() || z3;
                LockSupport.park(runnableC0233v0);
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            J0 j02 = this.f2641b;
            boolean isDone = j02.isDone();
            RunnableC0236w0 runnableC0236w0 = f2638c;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.f2640a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC0236w0)) {
                            a(currentThread);
                        }
                        j02.d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, runnableC0236w0)) {
                            a(currentThread);
                        }
                        j02.getClass();
                        if (AbstractC0210n0.f.D(j02, null, AbstractC0210n0.f2781g)) {
                            AbstractC0210n0.h(j02);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, runnableC0236w0)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            j02.getClass();
            if (call == null) {
                call = AbstractC0210n0.f2781g;
            }
            if (AbstractC0210n0.f.D(j02, null, call)) {
                AbstractC0210n0.h(j02);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return (runnable == f2638c ? "running=[DONE]" : runnable instanceof RunnableC0233v0 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? B0.c.k("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]") + ", " + this.f2640a.toString();
    }
}
