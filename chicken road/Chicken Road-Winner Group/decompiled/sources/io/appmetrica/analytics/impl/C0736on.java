package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0736on implements InterfaceC0759pk, C9 {

    /* renamed from: a, reason: collision with root package name */
    public final La f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final Ol f8024b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f8025c = new AtomicBoolean(false);

    public C0736on(La la, Ol ol) {
        this.f8023a = la;
        this.f8024b = ol;
        Objects.toString(la.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f8025c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f8025c.get()) {
            return;
        }
        f();
        a();
    }

    public final La d() {
        return this.f8023a;
    }

    public final boolean e() {
        return this.f8025c.get();
    }

    public void f() {
        this.f8024b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final void onCreate() {
        this.f8025c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0759pk
    public final void onDestroy() {
        if (this.f8025c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        C0878ua.f8414H.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
