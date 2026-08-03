package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385gg implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yi f5987a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f5988b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f5989c;

    public C0385gg() {
        this(new io.appmetrica.analytics.impl.Yi(), new io.appmetrica.analytics.impl.C0689sa(100), new io.appmetrica.analytics.impl.C0689sa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(io.appmetrica.analytics.impl.C0825xg c0825xg) {
        io.appmetrica.analytics.impl.Di di;
        io.appmetrica.analytics.impl.C0610p8 c0610p8 = new io.appmetrica.analytics.impl.C0610p8();
        io.appmetrica.analytics.impl.Mn a2 = this.f5988b.a(c0825xg.f7111a);
        c0610p8.f6639a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a2.f4694a);
        io.appmetrica.analytics.impl.Mn a3 = this.f5989c.a(c0825xg.f7112b);
        c0610p8.f6640b = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a3.f4694a);
        io.appmetrica.analytics.impl.C0285cj c0285cj = c0825xg.f7113c;
        if (c0285cj != null) {
            di = this.f5987a.fromModel(c0285cj);
            c0610p8.f6641c = (io.appmetrica.analytics.impl.C0636q8) di.f4214a;
        } else {
            di = null;
        }
        return new io.appmetrica.analytics.impl.Di(c0610p8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(a2, a3, di)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0385gg(io.appmetrica.analytics.impl.Yi yi, io.appmetrica.analytics.impl.C0689sa c0689sa, io.appmetrica.analytics.impl.C0689sa c0689sa2) {
        this.f5987a = yi;
        this.f5988b = c0689sa;
        this.f5989c = c0689sa2;
    }

    public final io.appmetrica.analytics.impl.C0825xg a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
