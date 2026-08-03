package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U4 extends io.appmetrica.analytics.impl.T4 {
    public U4(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final boolean b(int i2) {
        return i2 < 113;
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final void c() {
        io.appmetrica.analytics.impl.We we = this.f4998a.f5257c;
        try {
            io.appmetrica.analytics.impl.Uk uk = new io.appmetrica.analytics.impl.Uk(we, io.appmetrica.analytics.impl.C0863z2.f7175g);
            java.lang.Long a2 = uk.f5092c.a(io.appmetrica.analytics.impl.Uk.f5084d);
            if (a2 != null) {
                uk.a(io.appmetrica.analytics.impl.Uk.f5084d, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(a2.longValue())));
            }
            java.lang.Long a3 = uk.f5092c.a(io.appmetrica.analytics.impl.Uk.f5085e);
            if (a3 != null) {
                uk.a(io.appmetrica.analytics.impl.Uk.f5085e, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(a3.longValue())));
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            io.appmetrica.analytics.impl.Uk uk2 = new io.appmetrica.analytics.impl.Uk(we, io.appmetrica.analytics.impl.C0405ha.f6047g);
            java.lang.Long a4 = uk2.f5092c.a(io.appmetrica.analytics.impl.Uk.f5084d);
            if (a4 != null) {
                uk2.a(io.appmetrica.analytics.impl.Uk.f5084d, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
            java.lang.Long a5 = uk2.f5092c.a(io.appmetrica.analytics.impl.Uk.f5085e);
            if (a5 != null) {
                uk2.a(io.appmetrica.analytics.impl.Uk.f5085e, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(a5.longValue())));
            }
        } catch (java.lang.Throwable unused2) {
        }
    }
}
