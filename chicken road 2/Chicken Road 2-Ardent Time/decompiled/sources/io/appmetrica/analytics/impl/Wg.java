package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wg extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f5217b;

    public Wg(io.appmetrica.analytics.impl.X4 x4) {
        this(x4, x4.u());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.X4 x4 = this.f4907a;
        if (this.f5217b.c()) {
            return false;
        }
        if (!this.f5217b.d()) {
            io.appmetrica.analytics.impl.C0481k9 c0481k9 = x4.f5268n;
            c0481k9.f6266c.b(io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f5217b;
        synchronized (c0833xo) {
            io.appmetrica.analytics.impl.C0859yo c0859yo = c0833xo.f7123a;
            c0859yo.a(c0859yo.a().put("first_event_done", true));
        }
        return false;
    }

    public Wg(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0833xo c0833xo) {
        super(x4);
        this.f5217b = c0833xo;
    }
}
