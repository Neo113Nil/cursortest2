package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gf implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0693se f4332a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0824xf f4333b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0501l3 f4334c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.If f4335d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f4336e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f4337f;

    public Gf() {
        this(new io.appmetrica.analytics.impl.C0693se(), new io.appmetrica.analytics.impl.C0824xf(), new io.appmetrica.analytics.impl.C0501l3(), new io.appmetrica.analytics.impl.If(), new io.appmetrica.analytics.impl.C0689sa(100), new io.appmetrica.analytics.impl.C0689sa(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(io.appmetrica.analytics.impl.Hf hf) {
        io.appmetrica.analytics.impl.Di di;
        io.appmetrica.analytics.impl.Di di2;
        io.appmetrica.analytics.impl.Di di3;
        io.appmetrica.analytics.impl.Di di4;
        io.appmetrica.analytics.impl.C0558n8 c0558n8 = new io.appmetrica.analytics.impl.C0558n8();
        io.appmetrica.analytics.impl.Mn a2 = this.f4336e.a(hf.f4378a);
        c0558n8.f6475a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a2.f4694a);
        io.appmetrica.analytics.impl.Mn a3 = this.f4337f.a(hf.f4379b);
        c0558n8.f6476b = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a3.f4694a);
        java.util.List<java.lang.String> list = hf.f4380c;
        io.appmetrica.analytics.impl.Di di5 = null;
        if (list != null) {
            di = this.f4334c.fromModel(list);
            c0558n8.f6477c = (io.appmetrica.analytics.impl.C0351f8) di.f4214a;
        } else {
            di = null;
        }
        java.util.Map<java.lang.String, java.lang.String> map = hf.f4381d;
        if (map != null) {
            di2 = this.f4332a.fromModel(map);
            c0558n8.f6478d = (io.appmetrica.analytics.impl.C0506l8) di2.f4214a;
        } else {
            di2 = null;
        }
        io.appmetrica.analytics.impl.C0876zf c0876zf = hf.f4382e;
        if (c0876zf != null) {
            di3 = this.f4333b.fromModel(c0876zf);
            c0558n8.f6479e = (io.appmetrica.analytics.impl.C0532m8) di3.f4214a;
        } else {
            di3 = null;
        }
        io.appmetrica.analytics.impl.C0876zf c0876zf2 = hf.f4383f;
        if (c0876zf2 != null) {
            di4 = this.f4333b.fromModel(c0876zf2);
            c0558n8.f6480f = (io.appmetrica.analytics.impl.C0532m8) di4.f4214a;
        } else {
            di4 = null;
        }
        java.util.List<java.lang.String> list2 = hf.f4384g;
        if (list2 != null) {
            di5 = this.f4335d.fromModel(list2);
            c0558n8.f6481g = (io.appmetrica.analytics.impl.C0584o8[]) di5.f4214a;
        }
        return new io.appmetrica.analytics.impl.Di(c0558n8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(a2, a3, di, di2, di3, di4, di5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public Gf(io.appmetrica.analytics.impl.C0693se c0693se, io.appmetrica.analytics.impl.C0824xf c0824xf, io.appmetrica.analytics.impl.C0501l3 c0501l3, io.appmetrica.analytics.impl.If r4, io.appmetrica.analytics.impl.C0689sa c0689sa, io.appmetrica.analytics.impl.C0689sa c0689sa2) {
        this.f4332a = c0693se;
        this.f4333b = c0824xf;
        this.f4334c = c0501l3;
        this.f4335d = r4;
        this.f4336e = c0689sa;
        this.f4337f = c0689sa2;
    }

    public final io.appmetrica.analytics.impl.Hf a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
