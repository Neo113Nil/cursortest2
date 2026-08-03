package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824xf implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Y f7109a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0850yf f7110b;

    public C0824xf() {
        this(new io.appmetrica.analytics.impl.Y(), new io.appmetrica.analytics.impl.C0850yf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(io.appmetrica.analytics.impl.C0876zf c0876zf) {
        int i2;
        io.appmetrica.analytics.impl.C0532m8 c0532m8 = new io.appmetrica.analytics.impl.C0532m8();
        io.appmetrica.analytics.impl.Di fromModel = this.f7109a.fromModel(c0876zf.f7185a);
        c0532m8.f6413a = (io.appmetrica.analytics.impl.C0274c8) fromModel.f4214a;
        io.appmetrica.analytics.impl.Mn a2 = this.f7110b.a(c0876zf.f7186b);
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) a2.f4694a)) {
            i2 = 0;
        } else {
            c0532m8.f6414b = new io.appmetrica.analytics.impl.C0274c8[((java.util.List) a2.f4694a).size()];
            i2 = 0;
            for (int i3 = 0; i3 < ((java.util.List) a2.f4694a).size(); i3++) {
                io.appmetrica.analytics.impl.Di fromModel2 = this.f7109a.fromModel((io.appmetrica.analytics.impl.Z) ((java.util.List) a2.f4694a).get(i3));
                c0532m8.f6414b[i3] = (io.appmetrica.analytics.impl.C0274c8) fromModel2.f4214a;
                i2 += fromModel2.f4215b.getBytesTruncated();
            }
        }
        return new io.appmetrica.analytics.impl.Di(c0532m8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(fromModel, a2, new io.appmetrica.analytics.impl.C0217a3(i2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0824xf(io.appmetrica.analytics.impl.Y y2, io.appmetrica.analytics.impl.C0850yf c0850yf) {
        this.f7109a = y2;
        this.f7110b = c0850yf;
    }

    public final io.appmetrica.analytics.impl.C0876zf a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
