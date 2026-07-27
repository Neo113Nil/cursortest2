package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class J0 extends AbstractC0368s0 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile I0 f5070h;

    public J0(Callable callable) {
        this.f5070h = new I0(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0354n0
    public final String c() {
        I0 i02 = this.f5070h;
        return i02 != null ? AbstractC0279e.f("task=[", i02.toString(), "]") : super.c();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0354n0
    public final void d() {
        I0 i02;
        Object obj = this.f5216a;
        if (((obj instanceof C0324d0) && ((C0324d0) obj).f5165a) && (i02 = this.f5070h) != null) {
            RunnableC0380w0 runnableC0380w0 = I0.f5064d;
            RunnableC0380w0 runnableC0380w02 = I0.f5063c;
            Runnable runnable = (Runnable) i02.get();
            if (runnable instanceof Thread) {
                RunnableC0377v0 runnableC0377v0 = new RunnableC0377v0(i02);
                runnableC0377v0.setExclusiveOwnerThread(Thread.currentThread());
                if (i02.compareAndSet(runnable, runnableC0377v0)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) i02.getAndSet(runnableC0380w02)) == runnableC0380w0) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) i02.getAndSet(runnableC0380w02)) == runnableC0380w0) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f5070h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        I0 i02 = this.f5070h;
        if (i02 != null) {
            i02.run();
        }
        this.f5070h = null;
    }
}
