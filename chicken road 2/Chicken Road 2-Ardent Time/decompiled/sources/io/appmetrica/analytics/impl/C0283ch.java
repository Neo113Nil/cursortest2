package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283ch extends io.appmetrica.analytics.impl.Rg {
    public C0283ch(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.Dk dk;
        io.appmetrica.analytics.impl.Tk tk;
        io.appmetrica.analytics.impl.C0481k9 c0481k9 = this.f4907a.f5268n;
        io.appmetrica.analytics.impl.Rk rk = c0481k9.f6266c;
        if (rk.f4916g == 0) {
            dk = rk.f4913d.b();
            io.appmetrica.analytics.impl.Dk b2 = rk.f4914e.b();
            if ((dk == null ? -1L : dk.f4222d) <= (b2 != null ? b2.f4222d : -1L)) {
                dk = b2;
            }
        } else {
            dk = rk.f4915f;
        }
        if (dk != null) {
            tk = new io.appmetrica.analytics.impl.Tk();
            tk.f5032a = dk.f4222d;
            long andIncrement = dk.f4224f.getAndIncrement();
            io.appmetrica.analytics.impl.Uk uk = dk.f4220b;
            uk.a(io.appmetrica.analytics.impl.Uk.f5087g, java.lang.Long.valueOf(dk.f4224f.get()));
            uk.b();
            tk.f5033b = andIncrement;
            tk.f5034c = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(dk.f4228j);
            tk.f5035d = dk.f4221c.f4343a;
        } else {
            long j2 = p5.f4822j;
            long a2 = rk.f4911b.a();
            io.appmetrica.analytics.impl.L6 l6 = rk.f4910a.f5259e;
            io.appmetrica.analytics.impl.Vk vk = io.appmetrica.analytics.impl.Vk.BACKGROUND;
            l6.a(a2, vk, j2);
            io.appmetrica.analytics.impl.Tk tk2 = new io.appmetrica.analytics.impl.Tk();
            tk2.f5032a = a2;
            tk2.f5035d = vk;
            tk2.f5033b = 0L;
            tk2.f5034c = 0L;
            tk = tk2;
        }
        c0481k9.a(p5, tk);
        return false;
    }
}
