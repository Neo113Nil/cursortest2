package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0687n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0739p0 f7903a;

    public RunnableC0687n0(C0739p0 c0739p0) {
        this.f7903a = c0739p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0739p0 c0739p0 = this.f7903a;
        synchronized (c0739p0) {
            if (c0739p0.f8030a != null && c0739p0.a()) {
                try {
                    c0739p0.f8033d = null;
                    c0739p0.f8030a.unbindService(c0739p0.f8037i);
                } catch (Throwable unused) {
                }
            }
            c0739p0.f8033d = null;
        }
    }
}
