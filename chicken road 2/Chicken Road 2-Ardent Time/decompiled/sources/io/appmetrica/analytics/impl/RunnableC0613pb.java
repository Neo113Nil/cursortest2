package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0613pb implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f6644a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f6645b;

    public RunnableC0613pb(android.os.Handler handler, io.appmetrica.analytics.impl.I2 i2) {
        this.f6644a = new java.lang.ref.WeakReference(handler);
        this.f6645b = new java.lang.ref.WeakReference(i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Handler handler = (android.os.Handler) this.f6644a.get();
        io.appmetrica.analytics.impl.I2 i2 = (io.appmetrica.analytics.impl.I2) this.f6645b.get();
        if (handler == null || i2 == null) {
            return;
        }
        boolean f2 = i2.f4404b.f();
        if (!f2) {
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = i2.f4405c;
            java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
            io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
            io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", "", 3, 0, publicLogger);
            io.appmetrica.analytics.impl.C0801wi c0801wi = i2.f4410h;
            io.appmetrica.analytics.impl.Fh fh = i2.f4404b;
            c0801wi.getClass();
            c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        }
        if (f2) {
            return;
        }
        io.appmetrica.analytics.impl.C0587ob.a(handler, i2, this);
    }
}
