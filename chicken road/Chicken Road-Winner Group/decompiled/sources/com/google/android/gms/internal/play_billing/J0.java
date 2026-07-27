package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class J0 extends AbstractC0224s0 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile I0 f2645h;

    public J0(Callable callable) {
        this.f2645h = new I0(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0210n0
    public final String b() {
        I0 i02 = this.f2645h;
        return i02 != null ? B0.c.k("task=[", i02.toString(), "]") : super.b();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0210n0
    public final void c() {
        I0 i02;
        Object obj = this.f2782a;
        if (((obj instanceof C0177c0) && ((C0177c0) obj).f2729a) && (i02 = this.f2645h) != null) {
            RunnableC0236w0 runnableC0236w0 = I0.f2639d;
            RunnableC0236w0 runnableC0236w02 = I0.f2638c;
            Runnable runnable = (Runnable) i02.get();
            if (runnable instanceof Thread) {
                RunnableC0233v0 runnableC0233v0 = new RunnableC0233v0(i02);
                runnableC0233v0.setExclusiveOwnerThread(Thread.currentThread());
                if (i02.compareAndSet(runnable, runnableC0233v0)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) i02.getAndSet(runnableC0236w02)) == runnableC0236w0) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) i02.getAndSet(runnableC0236w02)) == runnableC0236w0) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f2645h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        I0 i02 = this.f2645h;
        if (i02 != null) {
            i02.run();
        }
        this.f2645h = null;
    }
}
