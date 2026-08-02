package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public abstract class s<T> extends AtomicReference<Runnable> implements Runnable {
    public static final b a = new b();
    public static final b b = new b();

    public static final class a extends AbstractOwnableSynchronizer implements Runnable {
        public final s<?> a;

        public a() {
            throw null;
        }

        public a(s sVar) {
            this.a = sVar;
        }

        public static void a(a aVar, Thread thread) {
            aVar.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public abstract void a(Throwable th);

    public abstract void b(T t);

    public final void c() {
        b bVar = b;
        b bVar2 = a;
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            a aVar = new a(this);
            a.a(aVar, Thread.currentThread());
            if (compareAndSet(runnable, aVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(bVar2) == bVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract T e() throws Exception;

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = get();
        a aVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof a;
            b bVar = b;
            if (!z2 && runnable != bVar) {
                break;
            }
            if (z2) {
                aVar = (a) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == bVar || compareAndSet(runnable, bVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(aVar);
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (compareAndSet(null, currentThread)) {
            boolean d = d();
            b bVar = a;
            if (!d) {
                try {
                    t = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, bVar)) {
                            g(currentThread);
                        }
                        if (d) {
                            return;
                        }
                        a(th);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, bVar)) {
                            g(currentThread);
                        }
                        if (!d) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof a) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder d = androidx.browser.browseractions.a.d(str, ", ");
        d.append(f());
        return d.toString();
    }
}
