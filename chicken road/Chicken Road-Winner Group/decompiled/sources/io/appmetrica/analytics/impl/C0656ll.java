package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656ll implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final C0946x0 f7821a;

    public C0656ll(C0946x0 c0946x0) {
        this.f7821a = c0946x0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Void r3) {
        this.f7821a.getClass();
        return C0946x0.a() ? new C0840so(this, true, "") : new C0840so(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C0840so a() {
        return a((Void) null);
    }
}
