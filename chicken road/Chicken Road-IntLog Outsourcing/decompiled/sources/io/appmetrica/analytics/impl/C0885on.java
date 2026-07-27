package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0885on implements InterfaceC0908pk, C9 {

    /* renamed from: a, reason: collision with root package name */
    public final La f8957a;

    /* renamed from: b, reason: collision with root package name */
    public final Ol f8958b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f8959c = new AtomicBoolean(false);

    public C0885on(La la, Ol ol) {
        this.f8957a = la;
        this.f8958b = ol;
        Objects.toString(la.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f8959c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f8959c.get()) {
            return;
        }
        f();
        a();
    }

    public final La d() {
        return this.f8957a;
    }

    public final boolean e() {
        return this.f8959c.get();
    }

    public void f() {
        this.f8958b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final void onCreate() {
        this.f8959c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final void onDestroy() {
        if (this.f8959c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        C1027ua.f9366H.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
