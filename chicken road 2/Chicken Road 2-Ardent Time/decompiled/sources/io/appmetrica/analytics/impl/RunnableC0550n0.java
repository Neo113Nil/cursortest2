package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0550n0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0602p0 f6454a;

    public RunnableC0550n0(io.appmetrica.analytics.impl.C0602p0 c0602p0) {
        this.f6454a = c0602p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0602p0 c0602p0 = this.f6454a;
        synchronized (c0602p0) {
            if (c0602p0.f6611a != null && c0602p0.a()) {
                try {
                    c0602p0.f6614d = null;
                    c0602p0.f6611a.unbindService(c0602p0.f6620j);
                } catch (java.lang.Throwable unused) {
                }
            }
            c0602p0.f6614d = null;
        }
    }
}
