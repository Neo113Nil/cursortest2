package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401bo extends H4 {

    /* renamed from: b, reason: collision with root package name */
    public final L6 f7074b;

    public C0401bo(E4 e4, L6 l6) {
        super(e4);
        this.f7074b = l6;
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b4) {
        C0898v4 c0898v4 = b4.f5751b.f5885d.f5912a;
        this.f7074b.a(c0898v4.f8480i);
        Rb m3 = C0878ua.f8414H.m();
        if (Boolean.TRUE.equals(c0898v4.f8474b)) {
            m3.a(true);
        } else {
            if (Boolean.FALSE.equals(c0898v4.f8474b)) {
                m3.a(false);
            }
        }
        m3.a(c0898v4.f8475c);
        Boolean bool = c0898v4.f8485n;
        C0878ua.f8414H.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
