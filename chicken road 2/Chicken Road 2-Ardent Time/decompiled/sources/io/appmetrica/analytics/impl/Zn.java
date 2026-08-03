package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zn extends io.appmetrica.analytics.impl.A4 {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E6 f5441b;

    public Zn(io.appmetrica.analytics.impl.C0813x4 c0813x4, io.appmetrica.analytics.impl.E6 e6) {
        super(c0813x4);
        this.f5441b = e6;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0735u4 c0735u4) {
        io.appmetrica.analytics.impl.C0580o4 c0580o4 = c0735u4.f6876b.f7085d.f7189a;
        this.f5441b.a(c0580o4.f6561i);
        io.appmetrica.analytics.impl.Kb m2 = io.appmetrica.analytics.impl.C0560na.f6484I.m();
        if (java.lang.Boolean.TRUE.equals(c0580o4.f6554b)) {
            m2.a(true);
        } else {
            if (java.lang.Boolean.FALSE.equals(c0580o4.f6554b)) {
                m2.a(false);
            }
        }
        m2.a(c0580o4.f6555c);
        java.lang.Boolean bool = c0580o4.f6566n;
        io.appmetrica.analytics.impl.C0560na.f6484I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
