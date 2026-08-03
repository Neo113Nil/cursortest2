package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0814x5 f4704a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ec f4705b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ec f4706c;

    public N4(io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.Qg qg) {
        io.appmetrica.analytics.impl.C0719te c0719te = new io.appmetrica.analytics.impl.C0719te(l6);
        this.f4704a = new io.appmetrica.analytics.impl.C0814x5(l6);
        this.f4705b = new io.appmetrica.analytics.impl.Ec(c0719te, new io.appmetrica.analytics.impl.M4(qg));
        this.f4706c = new io.appmetrica.analytics.impl.Ec(c0719te, io.appmetrica.analytics.impl.L4.f4579a);
    }

    public final java.util.List<io.appmetrica.analytics.impl.F8> a() {
        return i1.AbstractC0191j.H(this.f4704a, this.f4705b);
    }

    public final java.util.List<io.appmetrica.analytics.impl.F8> b() {
        return u0.AbstractC0995a.q(this.f4706c);
    }
}
