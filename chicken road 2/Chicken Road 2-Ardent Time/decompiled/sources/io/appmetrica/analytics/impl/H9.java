package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class H9 extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I9 f4375b;

    public H9(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.coreutils.internal.time.TimeProvider timeProvider) {
        super(x4);
        this.f4375b = new io.appmetrica.analytics.impl.I9(x4, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        long optLong;
        io.appmetrica.analytics.impl.I9 i9 = this.f4375b;
        io.appmetrica.analytics.impl.B9 b9 = i9.f4449a.t().f5910B;
        java.lang.Long valueOf = b9 != null ? java.lang.Long.valueOf(b9.f4105a) : null;
        if (valueOf != null) {
            io.appmetrica.analytics.impl.C0833xo c0833xo = i9.f4449a.t;
            synchronized (c0833xo) {
                optLong = c0833xo.f7123a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = i9.f4450b.currentTimeMillis();
                i9.f4449a.t.a(optLong);
            }
            if (i9.f4450b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                io.appmetrica.analytics.impl.A9 a9 = (io.appmetrica.analytics.impl.A9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.A9(), p5.getValueBytes());
                int i2 = a9.f4043a;
                java.lang.String str = new java.lang.String(a9.f4044b, y1.a.f8486a);
                java.lang.String str2 = this.f4375b.f4449a.f5257c.k().get(java.lang.Integer.valueOf(i2));
                if (str2 != null) {
                    try {
                        if (io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.isEqualTo(new org.json.JSONObject(str), new org.json.JSONObject(str2))) {
                            this.f4907a.f5267m.info("Ignoring attribution of type `" + io.appmetrica.analytics.impl.K9.a(i2) + "` with value `" + str + "` since it is not new", new java.lang.Object[0]);
                            return true;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                io.appmetrica.analytics.impl.I9 i92 = this.f4375b;
                java.util.Map<java.lang.Integer, java.lang.String> k2 = i92.f4449a.f5257c.k();
                k2.put(java.lang.Integer.valueOf(i2), str);
                i92.f4449a.f5257c.b(k2);
                this.f4907a.f5267m.info("Handling attribution of type `" + io.appmetrica.analytics.impl.K9.a(i2) + '`', new java.lang.Object[0]);
                return false;
            }
        }
        this.f4907a.f5267m.info("Ignoring attribution since out of collecting interval", new java.lang.Object[0]);
        return true;
    }
}
