package c;

import android.window.OnBackInvokedDispatcher;

/* renamed from: c.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519F {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f7307a;

    /* renamed from: b, reason: collision with root package name */
    public final W3.m f7308b = G4.d.E(new O3.l(11, this));

    public C0519F(Runnable runnable) {
        this.f7307a = runnable;
    }

    public final C0517D a() {
        return (C0517D) this.f7308b.getValue();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().f7304c.f(new I1.k(onBackInvokedDispatcher, 0), 1);
        a().f7304c.f(new I1.k(onBackInvokedDispatcher, 1000000), 0);
    }
}
