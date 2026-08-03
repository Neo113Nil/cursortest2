package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.AdRevenue f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0704t f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Xm f4243d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Um f4244e;

    public E(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2, io.appmetrica.analytics.impl.C0366fn c0366fn, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4240a = adRevenue;
        this.f4241b = z2;
        this.f4242c = c0366fn;
        this.f4243d = new io.appmetrica.analytics.impl.Xm(100, "ad revenue strings", publicLogger);
        this.f4244e = new io.appmetrica.analytics.impl.Um(30720, "ad revenue payload", publicLogger);
    }

    public final h1.C0172d a() {
        io.appmetrica.analytics.impl.C0678s c0678s = new io.appmetrica.analytics.impl.C0678s();
        int i2 = 0;
        for (h1.C0172d c0172d : i1.AbstractC0191j.H(new h1.C0172d(this.f4240a.adNetwork, new io.appmetrica.analytics.impl.C0808x(c0678s)), new h1.C0172d(this.f4240a.adPlacementId, new io.appmetrica.analytics.impl.C0834y(c0678s)), new h1.C0172d(this.f4240a.adPlacementName, new io.appmetrica.analytics.impl.C0860z(c0678s)), new h1.C0172d(this.f4240a.adUnitId, new io.appmetrica.analytics.impl.A(c0678s)), new h1.C0172d(this.f4240a.adUnitName, new io.appmetrica.analytics.impl.B(c0678s)), new h1.C0172d(this.f4240a.precision, new io.appmetrica.analytics.impl.C(c0678s)), new h1.C0172d(this.f4240a.currency.getCurrencyCode(), new io.appmetrica.analytics.impl.D(c0678s)))) {
            java.lang.String str = (java.lang.String) c0172d.f3295a;
            s1.l lVar = (s1.l) c0172d.f3296b;
            io.appmetrica.analytics.impl.Xm xm = this.f4243d;
            xm.getClass();
            java.lang.String a2 = xm.a(str);
            byte[] stringToBytesForProtobuf = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(a2);
            lVar.invoke(stringToBytesForProtobuf2);
            i2 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        java.lang.Integer num = (java.lang.Integer) io.appmetrica.analytics.impl.F.f4277a.get(this.f4240a.adType);
        c0678s.f6776d = num != null ? num.intValue() : 0;
        io.appmetrica.analytics.impl.r rVar = new io.appmetrica.analytics.impl.r();
        java.math.BigDecimal bigDecimal = this.f4240a.adRevenue;
        java.math.BigInteger bigInteger = io.appmetrica.analytics.impl.AbstractC0816x7.f7101a;
        int i3 = -bigDecimal.scale();
        java.math.BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(io.appmetrica.analytics.impl.AbstractC0816x7.f7101a) <= 0 && unscaledValue.compareTo(io.appmetrica.analytics.impl.AbstractC0816x7.f7102b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(java.math.BigInteger.TEN);
            i3++;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(unscaledValue.longValue());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i3);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f6704a = longValue;
        rVar.f6705b = intValue;
        c0678s.f6774b = rVar;
        java.util.Map<java.lang.String, java.lang.String> map = this.f4240a.payload;
        java.lang.String b2 = io.appmetrica.analytics.impl.AbstractC0380gb.b(this.f4242c.a(map != null ? i1.AbstractC0202u.L(map) : new java.util.LinkedHashMap()));
        io.appmetrica.analytics.impl.Um um = this.f4244e;
        um.getClass();
        byte[] stringToBytesForProtobuf3 = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(um.a(b2));
        c0678s.f6783k = stringToBytesForProtobuf3;
        int length = (io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(b2).length - stringToBytesForProtobuf3.length) + i2;
        if (this.f4241b) {
            c0678s.f6773a = "autocollected".getBytes(y1.a.f8486a);
        }
        return new h1.C0172d(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(c0678s), java.lang.Integer.valueOf(length));
    }
}
