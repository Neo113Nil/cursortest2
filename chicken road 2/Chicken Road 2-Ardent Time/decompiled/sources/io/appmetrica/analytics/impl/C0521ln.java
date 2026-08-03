package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0521ln implements io.appmetrica.analytics.impl.InterfaceC0518lk, io.appmetrica.analytics.impl.InterfaceC0766v9 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ea f6375a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Kl f6376b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f6377c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public C0521ln(io.appmetrica.analytics.impl.Ea ea, io.appmetrica.analytics.impl.Kl kl) {
        this.f6375a = ea;
        this.f6376b = kl;
        java.util.Objects.toString(ea.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f6377c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f6377c.get()) {
            return;
        }
        f();
        a();
    }

    public final io.appmetrica.analytics.impl.Ea d() {
        return this.f6375a;
    }

    public final boolean e() {
        return this.f6377c.get();
    }

    public void f() {
        this.f6376b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final void onCreate() {
        this.f6377c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0518lk
    public final void onDestroy() {
        if (this.f6377c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask) {
        io.appmetrica.analytics.impl.C0560na.f6484I.getClass();
        io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
