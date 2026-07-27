package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400bn extends A4 {

    /* renamed from: g, reason: collision with root package name */
    public final Nn f7073g;

    public C0400bn(String str, String str2, Nn nn, InterfaceC0892uo interfaceC0892uo, R2 r22) {
        super(0, str, str2, interfaceC0892uo, r22);
        this.f7073g = nn;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C0556ho c0556ho) {
        String str = (String) this.f7073g.a((String) this.f);
        c0556ho.f7466d.f7672a = str == null ? new byte[0] : str.getBytes();
    }

    public final Nn h() {
        return this.f7073g;
    }
}
