package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291d extends java.lang.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f5680a = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0316e f5681b;

    public C0291d(io.appmetrica.analytics.impl.C0316e c0316e) {
        this.f5681b = c0316e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f5680a.get()) {
            this.f5681b.f5765e.set(false);
            io.appmetrica.analytics.impl.C0316e c0316e = this.f5681b;
            c0316e.f5763c.postAtFrontOfQueue(c0316e.f5766f);
            int i2 = this.f5681b.f5762b.get();
            while (i2 > 0) {
                try {
                    java.lang.Thread.sleep(io.appmetrica.analytics.impl.C0316e.f5759g);
                    if (this.f5681b.f5765e.get()) {
                        break;
                    } else {
                        i2--;
                    }
                } catch (java.lang.InterruptedException unused) {
                    return;
                }
            }
            if (i2 == 0 && !android.os.Debug.isDebuggerConnected()) {
                java.util.Iterator it = this.f5681b.f5761a.iterator();
                while (it.hasNext()) {
                    ((io.appmetrica.analytics.impl.InterfaceC0265c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f5681b.f5765e.get()) {
                try {
                    java.lang.Thread.sleep(io.appmetrica.analytics.impl.C0316e.f5759g);
                } catch (java.lang.InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
