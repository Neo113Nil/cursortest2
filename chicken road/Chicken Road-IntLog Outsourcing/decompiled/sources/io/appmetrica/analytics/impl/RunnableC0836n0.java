package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0836n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0888p0 f8831a;

    public RunnableC0836n0(C0888p0 c0888p0) {
        this.f8831a = c0888p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0888p0 c0888p0 = this.f8831a;
        synchronized (c0888p0) {
            if (c0888p0.f8964a != null && c0888p0.a()) {
                try {
                    c0888p0.f8967d = null;
                    c0888p0.f8964a.unbindService(c0888p0.f8972i);
                } catch (Throwable unused) {
                }
            }
            c0888p0.f8967d = null;
        }
    }
}
