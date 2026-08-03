package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645qh extends io.appmetrica.analytics.impl.Rg {
    public C0645qh(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        ((io.appmetrica.analytics.impl.C0477k5) this.f4907a.f5270p).e();
        io.appmetrica.analytics.impl.Rk rk = this.f4907a.f5264j;
        synchronized (rk) {
            try {
                io.appmetrica.analytics.impl.Dk b2 = rk.b(p5);
                if (b2.f4225g) {
                    b2.f4225g = false;
                    io.appmetrica.analytics.impl.Uk uk = b2.f4220b;
                    uk.a(io.appmetrica.analytics.impl.Uk.f5089i, java.lang.Boolean.FALSE);
                    uk.b();
                }
                if (rk.f4916g != 1) {
                    rk.b(rk.f4915f, p5);
                }
                rk.f4916g = 1;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
