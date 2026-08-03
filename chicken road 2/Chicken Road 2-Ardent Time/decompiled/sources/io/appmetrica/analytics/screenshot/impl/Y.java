package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class Y implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.C0891g f7530a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.c0 f7531b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.r f7532c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.Q fromModel(io.appmetrica.analytics.screenshot.impl.W w2) {
        io.appmetrica.analytics.screenshot.impl.Q q2 = new io.appmetrica.analytics.screenshot.impl.Q();
        io.appmetrica.analytics.screenshot.impl.C0889e c0889e = w2.f7524a;
        q2.f7517a = c0889e != null ? this.f7530a.fromModel(c0889e) : null;
        io.appmetrica.analytics.screenshot.impl.a0 a0Var = w2.f7525b;
        q2.f7518b = a0Var != null ? this.f7531b.fromModel(a0Var) : null;
        io.appmetrica.analytics.screenshot.impl.C0900p c0900p = w2.f7526c;
        q2.f7519c = c0900p != null ? this.f7532c.fromModel(c0900p) : null;
        return q2;
    }

    public Y(io.appmetrica.analytics.screenshot.impl.C0891g c0891g, io.appmetrica.analytics.screenshot.impl.c0 c0Var, io.appmetrica.analytics.screenshot.impl.r rVar) {
        this.f7530a = c0891g;
        this.f7531b = c0Var;
        this.f7532c = rVar;
    }

    public /* synthetic */ Y(io.appmetrica.analytics.screenshot.impl.C0891g c0891g, io.appmetrica.analytics.screenshot.impl.c0 c0Var, io.appmetrica.analytics.screenshot.impl.r rVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.screenshot.impl.C0891g() : c0891g, (i2 & 2) != 0 ? new io.appmetrica.analytics.screenshot.impl.c0() : c0Var, (i2 & 4) != 0 ? new io.appmetrica.analytics.screenshot.impl.r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.W toModel(io.appmetrica.analytics.screenshot.impl.Q q2) {
        io.appmetrica.analytics.screenshot.impl.C0889e c0889e;
        io.appmetrica.analytics.screenshot.impl.a0 a0Var;
        io.appmetrica.analytics.screenshot.impl.N n2 = q2.f7517a;
        if (n2 != null) {
            this.f7530a.getClass();
            c0889e = new io.appmetrica.analytics.screenshot.impl.C0889e(n2.f7508a);
        } else {
            c0889e = null;
        }
        io.appmetrica.analytics.screenshot.impl.P p2 = q2.f7518b;
        if (p2 != null) {
            this.f7531b.getClass();
            a0Var = new io.appmetrica.analytics.screenshot.impl.a0(p2.f7514a, p2.f7515b);
        } else {
            a0Var = null;
        }
        io.appmetrica.analytics.screenshot.impl.O o2 = q2.f7519c;
        return new io.appmetrica.analytics.screenshot.impl.W(c0889e, a0Var, o2 != null ? this.f7532c.toModel(o2) : null);
    }
}
