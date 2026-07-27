package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550bo extends H4 {

    /* renamed from: b, reason: collision with root package name */
    public final L6 f7961b;

    public C0550bo(E4 e42, L6 l6) {
        super(e42);
        this.f7961b = l6;
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b42) {
        C1047v4 c1047v4 = b42.f6583b.f6725d.f6753a;
        this.f7961b.a(c1047v4.f9434i);
        Rb m6 = C1027ua.f9366H.m();
        if (Boolean.TRUE.equals(c1047v4.f9427b)) {
            m6.a(true);
        } else {
            if (Boolean.FALSE.equals(c1047v4.f9427b)) {
                m6.a(false);
            }
        }
        m6.a(c1047v4.f9428c);
        Boolean bool = c1047v4.f9439n;
        C1027ua.f9366H.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
