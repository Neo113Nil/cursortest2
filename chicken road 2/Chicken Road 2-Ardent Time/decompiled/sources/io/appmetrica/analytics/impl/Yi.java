package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yi implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0693se f5347a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0501l3 f5348b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f5349c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f5350d;

    public Yi() {
        this(new io.appmetrica.analytics.impl.C0693se(), new io.appmetrica.analytics.impl.C0501l3(), new io.appmetrica.analytics.impl.C0689sa(100), new io.appmetrica.analytics.impl.C0689sa(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(io.appmetrica.analytics.impl.C0285cj c0285cj) {
        io.appmetrica.analytics.impl.Di di;
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = new io.appmetrica.analytics.impl.C0636q8();
        io.appmetrica.analytics.impl.Mn a2 = this.f5349c.a(c0285cj.f5663a);
        c0636q8.f6679a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a2.f4694a);
        java.util.List<java.lang.String> list = c0285cj.f5664b;
        io.appmetrica.analytics.impl.Di di2 = null;
        if (list != null) {
            di = this.f5348b.fromModel(list);
            c0636q8.f6680b = (io.appmetrica.analytics.impl.C0351f8) di.f4214a;
        } else {
            di = null;
        }
        io.appmetrica.analytics.impl.Mn a3 = this.f5350d.a(c0285cj.f5665c);
        c0636q8.f6681c = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a3.f4694a);
        java.util.Map<java.lang.String, java.lang.String> map = c0285cj.f5666d;
        if (map != null) {
            di2 = this.f5347a.fromModel(map);
            c0636q8.f6682d = (io.appmetrica.analytics.impl.C0506l8) di2.f4214a;
        }
        return new io.appmetrica.analytics.impl.Di(c0636q8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(a2, di, a3, di2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public Yi(io.appmetrica.analytics.impl.C0693se c0693se, io.appmetrica.analytics.impl.C0501l3 c0501l3, io.appmetrica.analytics.impl.C0689sa c0689sa, io.appmetrica.analytics.impl.C0689sa c0689sa2) {
        this.f5347a = c0693se;
        this.f5348b = c0501l3;
        this.f5349c = c0689sa;
        this.f5350d = c0689sa2;
    }

    public final io.appmetrica.analytics.impl.C0285cj a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
