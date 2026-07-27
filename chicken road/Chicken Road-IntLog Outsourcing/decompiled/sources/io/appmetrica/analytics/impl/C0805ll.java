package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805ll implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final C1095x0 f8746a;

    public C0805ll(C1095x0 c1095x0) {
        this.f8746a = c1095x0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Void r32) {
        this.f8746a.getClass();
        return C1095x0.a() ? new C0989so(this, true, "") : new C0989so(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C0989so a() {
        return a((Void) null);
    }
}
