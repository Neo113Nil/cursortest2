package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549hh extends Wg {
    public C0549hh(C0459e5 c0459e5) {
        super(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Ik ik;
        Yk yk;
        C0799r9 c0799r9 = this.f6796a.f7205n;
        Wk wk = c0799r9.f8207c;
        if (wk.f6804g == 0) {
            ik = wk.f6802d.b();
            Ik b3 = wk.f6803e.b();
            if ((ik == null ? -1L : ik.f6118d) <= (b3 != null ? b3.f6118d : -1L)) {
                ik = b3;
            }
        } else {
            ik = wk.f;
        }
        if (ik != null) {
            yk = new Yk();
            yk.f6876a = ik.f6118d;
            long andIncrement = ik.f.getAndIncrement();
            Zk zk = ik.f6116b;
            zk.a(Zk.f6920g, Long.valueOf(ik.f.get()));
            zk.b();
            yk.f6877b = andIncrement;
            yk.f6878c = TimeUnit.MILLISECONDS.toSeconds(ik.f6123j);
            yk.f6879d = ik.f6117c.f6242a;
        } else {
            long j3 = w5.f6783j;
            long a3 = wk.f6800b.a();
            S6 s6 = wk.f6799a.f7197e;
            EnumC0372al enumC0372al = EnumC0372al.BACKGROUND;
            s6.a(a3, enumC0372al, j3);
            yk = new Yk();
            yk.f6876a = a3;
            yk.f6879d = enumC0372al;
            yk.f6877b = 0L;
            yk.f6878c = 0L;
        }
        c0799r9.a(w5, yk);
        return false;
    }
}
