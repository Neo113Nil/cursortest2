package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379ga extends io.appmetrica.analytics.impl.A4 {
    public C0379ga(io.appmetrica.analytics.impl.C0813x4 c0813x4) {
        super(c0813x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0735u4 c0735u4) {
        android.os.Bundle bundle = p5.f4825m;
        io.appmetrica.analytics.impl.Xa xa = bundle != null ? (io.appmetrica.analytics.impl.Xa) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (xa != null) {
            if (xa.f5298d) {
                io.appmetrica.analytics.impl.C0580o4 c0580o4 = c0735u4.f6876b.f7085d.f7189a;
                java.lang.Boolean bool = c0580o4.f6566n;
                java.lang.Boolean bool2 = c0580o4.f6561i;
                io.appmetrica.analytics.impl.C0560na.f6484I.c().c(bool != null ? bool.booleanValue() : true);
                io.appmetrica.analytics.impl.C0560na.f6484I.h().b(bool2);
            }
        }
        this.f4031a.a(xa);
        return false;
    }
}
