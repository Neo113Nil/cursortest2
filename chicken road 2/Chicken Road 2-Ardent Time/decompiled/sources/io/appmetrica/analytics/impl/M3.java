package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M3 extends io.appmetrica.analytics.impl.P5 {

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashMap f4638q;

    /* renamed from: r, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Xm f4639r;

    /* renamed from: s, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Um f4640s;
    public io.appmetrica.analytics.impl.Um t;

    /* renamed from: u, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Z2 f4641u;

    /* renamed from: v, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Xm f4642v;

    public M3(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4638q = new java.util.HashMap();
        a(publicLogger);
    }

    public static io.appmetrica.analytics.impl.P5 b(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", 0);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = 5376;
        p5.a(str, str2);
        return p5;
    }

    public static io.appmetrica.analytics.impl.P5 n() {
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", 0);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = 5632;
        return p5;
    }

    public static io.appmetrica.analytics.impl.P5 o() {
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", 0);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        p5.f4816d = 40961;
        return p5;
    }

    public final void a(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.impl.L3 l3) {
        if (io.appmetrica.analytics.coreutils.internal.StringUtils.equalsNullSafety(str, str2)) {
            this.f4638q.remove(l3);
        } else {
            this.f4638q.put(l3, java.lang.Integer.valueOf(io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes(str).length - io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes(str2).length));
        }
        java.util.Iterator it = this.f4638q.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((java.lang.Integer) it.next()).intValue();
        }
        this.f4819g = i2;
    }

    @Override // io.appmetrica.analytics.impl.P5
    public final void c(java.lang.String str) {
        io.appmetrica.analytics.impl.Xm xm = this.f4642v;
        xm.getClass();
        this.f4820h = xm.a(str);
    }

    public final java.lang.String d(java.lang.String str) {
        io.appmetrica.analytics.impl.Xm xm = this.f4639r;
        xm.getClass();
        java.lang.String a2 = xm.a(str);
        a(str, a2, io.appmetrica.analytics.impl.L3.NAME);
        return a2;
    }

    public final java.lang.String e(java.lang.String str) {
        io.appmetrica.analytics.impl.Um um = this.f4640s;
        um.getClass();
        java.lang.String a2 = um.a(str);
        a(str, a2, io.appmetrica.analytics.impl.L3.VALUE);
        return a2;
    }

    public final io.appmetrica.analytics.impl.M3 f(java.lang.String str) {
        io.appmetrica.analytics.impl.Um um = this.t;
        um.getClass();
        java.lang.String a2 = um.a(str);
        a(str, a2, io.appmetrica.analytics.impl.L3.VALUE);
        this.f4814b = a2;
        return this;
    }

    public final java.util.HashMap<io.appmetrica.analytics.impl.L3, java.lang.Integer> p() {
        return this.f4638q;
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(java.lang.String str) {
        this.f4813a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(java.lang.String str) {
        this.f4814b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public M3(java.lang.String str, int i2, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this("", str, i2, publicLogger);
    }

    public M3(java.lang.String str, java.lang.String str2, int i2, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this(str, str2, i2, 0, publicLogger);
    }

    public M3(java.lang.String str, java.lang.String str2, int i2, int i3, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4638q = new java.util.HashMap();
        a(publicLogger);
        this.f4814b = e(str);
        this.f4813a = d(str2);
        setType(i2);
        setCustomType(i3);
    }

    public final io.appmetrica.analytics.impl.M3 a(java.util.HashMap<io.appmetrica.analytics.impl.L3, java.lang.Integer> hashMap) {
        this.f4638q = hashMap;
        return this;
    }

    public final void a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4639r = new io.appmetrica.analytics.impl.Xm(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f4640s = new io.appmetrica.analytics.impl.Um(245760, "event value", publicLogger);
        this.t = new io.appmetrica.analytics.impl.Um(1024000, "event extended value", publicLogger);
        this.f4641u = new io.appmetrica.analytics.impl.Z2(245760, "event value bytes", publicLogger);
        this.f4642v = new io.appmetrica.analytics.impl.Xm(200, "user profile id", publicLogger);
    }

    public M3(byte[] bArr, java.lang.String str, int i2, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4638q = new java.util.HashMap();
        a(publicLogger);
        a(bArr);
        this.f4813a = d(str);
        setType(i2);
    }

    public final void a(byte[] bArr) {
        io.appmetrica.analytics.impl.Z2 z2 = this.f4641u;
        z2.getClass();
        byte[] a2 = z2.a(bArr);
        io.appmetrica.analytics.impl.L3 l3 = io.appmetrica.analytics.impl.L3.VALUE;
        if (bArr.length != a2.length) {
            this.f4638q.put(l3, java.lang.Integer.valueOf(bArr.length - a2.length));
        } else {
            this.f4638q.remove(l3);
        }
        java.util.Iterator it = this.f4638q.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((java.lang.Integer) it.next()).intValue();
        }
        this.f4819g = i2;
        super.setValueBytes(a2);
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.C0444io c0444io) {
        io.appmetrica.analytics.impl.P5 o2 = o();
        o2.setValue(new java.lang.String(android.util.Base64.encode(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(c0444io), 0)));
        return o2;
    }

    public static io.appmetrica.analytics.impl.M3 a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.Oi oi) {
        int i2;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(publicLogger);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        m3.f4816d = 40976;
        io.appmetrica.analytics.impl.Mi mi = new io.appmetrica.analytics.impl.Mi();
        mi.f4683b = oi.f4777a.currency.getCurrencyCode().getBytes();
        mi.f4687f = oi.f4777a.priceMicros;
        mi.f4684c = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(new io.appmetrica.analytics.impl.Xm(200, "revenue productID", oi.f4781e).a(oi.f4777a.productID));
        mi.f4682a = ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(oi.f4777a.quantity, 1)).intValue();
        io.appmetrica.analytics.impl.Um um = oi.f4778b;
        java.lang.String str = oi.f4777a.payload;
        um.getClass();
        mi.f4685d = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(um.a(str));
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(oi.f4777a.receipt)) {
            io.appmetrica.analytics.impl.Hi hi = new io.appmetrica.analytics.impl.Hi();
            java.lang.String str2 = (java.lang.String) oi.f4779c.a(oi.f4777a.receipt.data);
            i2 = !io.appmetrica.analytics.coreutils.internal.StringUtils.equalsNullSafety(oi.f4777a.receipt.data, str2) ? oi.f4777a.receipt.data.length() : 0;
            java.lang.String str3 = (java.lang.String) oi.f4780d.a(oi.f4777a.receipt.signature);
            hi.f4389a = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(str2);
            hi.f4390b = io.appmetrica.analytics.coreutils.internal.StringUtils.stringToBytesForProtobuf(str3);
            mi.f4686e = hi;
        } else {
            i2 = 0;
        }
        android.util.Pair pair = new android.util.Pair(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(mi), java.lang.Integer.valueOf(i2));
        m3.f4814b = m3.e(new java.lang.String(android.util.Base64.encode((byte[]) pair.first, 0)));
        m3.f4819g = ((java.lang.Integer) pair.second).intValue();
        return m3;
    }

    public static io.appmetrica.analytics.impl.M3 a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.E e2) {
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(publicLogger);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        m3.f4816d = 40977;
        h1.C0172d a2 = e2.a();
        m3.f4814b = m3.e(new java.lang.String(android.util.Base64.encode((byte[]) a2.f3295a, 0)));
        m3.f4819g = ((java.lang.Integer) a2.f3296b).intValue();
        return m3;
    }
}
