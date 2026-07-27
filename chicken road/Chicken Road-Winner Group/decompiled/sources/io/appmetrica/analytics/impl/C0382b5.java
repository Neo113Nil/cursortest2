package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382b5 extends AbstractC0356a5 {
    public C0382b5(C0459e5 c0459e5) {
        super(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0356a5
    public final boolean b(int i3) {
        return i3 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0356a5
    public final void c() {
        C0392bf c0392bf = this.f6949a.f7195c;
        try {
            Zk zk = new Zk(c0392bf, H2.f6008g);
            Long a3 = zk.f6925c.a(Zk.f6918d);
            if (a3 != null) {
                zk.a(Zk.f6918d, Long.valueOf(TimeUnit.SECONDS.toMillis(a3.longValue())));
            }
            Long a4 = zk.f6925c.a(Zk.f6919e);
            if (a4 != null) {
                zk.a(Zk.f6919e, Long.valueOf(TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Zk zk2 = new Zk(c0392bf, C0723oa.f7988g);
            Long a5 = zk2.f6925c.a(Zk.f6918d);
            if (a5 != null) {
                zk2.a(Zk.f6918d, Long.valueOf(TimeUnit.SECONDS.toMillis(a5.longValue())));
            }
            Long a6 = zk2.f6925c.a(Zk.f6919e);
            if (a6 != null) {
                zk2.a(Zk.f6919e, Long.valueOf(TimeUnit.SECONDS.toMillis(a6.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
