package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621kc implements InterfaceC0980y9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0795r5 f7700a;

    public C0621kc(C9 c9, S6 s6, Vg vg, C0898v4 c0898v4, X4 x4, C0392bf c0392bf) {
        C0595jc c0595jc = new C0595jc(s6, vg, this, c0898v4, c0392bf);
        this.f7700a = new C0795r5(c9, c0595jc.a(), c0595jc.b(), x4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0980y9
    public final InterfaceC0955x9 a() {
        return this.f7700a;
    }

    public final C0795r5 b() {
        return this.f7700a;
    }
}
