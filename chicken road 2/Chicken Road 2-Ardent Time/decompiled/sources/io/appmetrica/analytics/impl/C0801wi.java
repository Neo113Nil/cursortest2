package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801wi {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.F4 f7025a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Sn f7026b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0853yi f7027c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0602p0 f7028d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Pl f7029e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yj f7030f;

    public C0801wi(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Sn sn, io.appmetrica.analytics.impl.F4 f4, io.appmetrica.analytics.impl.Yj yj) {
        this(c0602p0, sn, f4, yj, new io.appmetrica.analytics.impl.C0853yi(c0602p0, yj));
    }

    public final void a(io.appmetrica.analytics.impl.C0774vh c0774vh) {
        io.appmetrica.analytics.impl.Fh fh = c0774vh.f6978e;
        io.appmetrica.analytics.impl.Pl pl = this.f7029e;
        if (pl != null) {
            fh.f4368b.setUuid(((io.appmetrica.analytics.impl.Ol) pl).g());
        } else {
            fh.getClass();
        }
        this.f7027c.a(c0774vh);
    }

    public final void b(java.lang.String str) {
        io.appmetrica.analytics.impl.Bf bf = this.f7025a.f4367a;
        synchronized (bf) {
            bf.f4123a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C0801wi(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Sn sn, io.appmetrica.analytics.impl.F4 f4, io.appmetrica.analytics.impl.Yj yj, io.appmetrica.analytics.impl.C0853yi c0853yi) {
        this.f7028d = c0602p0;
        this.f7025a = f4;
        this.f7026b = sn;
        this.f7030f = yj;
        this.f7027c = c0853yi;
    }

    public final void a(io.appmetrica.analytics.impl.Ol ol) {
        this.f7029e = ol;
        this.f7025a.f4368b.setUuid(ol.g());
    }

    public final void a(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
            this.f7025a.f4368b.setLocationTracking(bool.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool2)) {
            this.f7025a.f4368b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool3)) {
            this.f7025a.f4368b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        io.appmetrica.analytics.impl.P5 a2 = io.appmetrica.analytics.impl.P5.a();
        io.appmetrica.analytics.impl.F4 f4 = this.f7025a;
        a(a(a2, f4), f4, 1, (java.util.Map) null);
    }

    public final void a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.Fh fh, int i2, java.util.Map map) {
        java.lang.String str;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        this.f7028d.b();
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(map)) {
            p5.setValue(io.appmetrica.analytics.impl.AbstractC0380gb.b(map));
            a(p5, fh);
        }
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str = fh.f4296f;
        }
        a(new io.appmetrica.analytics.impl.C0774vh(p5, false, i2, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str)));
    }

    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.Fh fh) {
        if (io.appmetrica.analytics.impl.AbstractC0792w9.f7005a.contains(java.lang.Integer.valueOf(p5.f4816d))) {
            p5.f4815c = fh.d();
        }
        return p5;
    }

    public final void a(java.util.List list) {
        io.appmetrica.analytics.impl.Bf bf = this.f7025a.f4367a;
        synchronized (bf) {
            bf.f4123a.put("PROCESS_CFG_CUSTOM_HOSTS", io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list) ? null : new org.json.JSONArray((java.util.Collection) list).toString());
        }
    }

    public final void a(java.util.HashMap hashMap) {
        io.appmetrica.analytics.impl.Bf bf = this.f7025a.f4367a;
        synchronized (bf) {
            bf.f4123a.put("PROCESS_CFG_CLIDS", io.appmetrica.analytics.impl.AbstractC0380gb.b(hashMap));
        }
    }

    public final void a(java.lang.String str) {
        io.appmetrica.analytics.impl.Bf bf = this.f7025a.f4367a;
        synchronized (bf) {
            bf.f4123a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final io.appmetrica.analytics.impl.C0774vh a(io.appmetrica.analytics.impl.Qn qn, io.appmetrica.analytics.impl.Fh fh) {
        java.lang.String str;
        java.lang.String str2;
        this.f7028d.b();
        io.appmetrica.analytics.impl.Sn sn = this.f7026b;
        sn.getClass();
        io.appmetrica.analytics.impl.Gn gn = qn.f4873a;
        if (gn == null) {
            str = "";
        } else {
            str = (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(gn.f4353a, "");
        }
        byte[] fromModel = sn.f4983a.fromModel(qn);
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.f4368b.getApiKey());
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(fromModel, str, 5891, orCreatePublicLogger);
        m3.f4815c = fh.d();
        java.util.HashMap hashMap = m3.f4638q;
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str2 = fh.f4296f;
        }
        return new io.appmetrica.analytics.impl.C0774vh(m3, true, 1, hashMap, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str2));
    }
}
