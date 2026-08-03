package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0764v7 f5316a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f5317b;

    public Y() {
        this(new io.appmetrica.analytics.impl.C0764v7(), new io.appmetrica.analytics.impl.C0689sa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(io.appmetrica.analytics.impl.Z z2) {
        io.appmetrica.analytics.impl.C0274c8 c0274c8 = new io.appmetrica.analytics.impl.C0274c8();
        c0274c8.f5639b = this.f5316a.fromModel(z2.f5367a);
        io.appmetrica.analytics.impl.Mn a2 = this.f5317b.a(z2.f5368b);
        c0274c8.f5638a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a2.f4694a);
        return new io.appmetrica.analytics.impl.Di(c0274c8, new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(a2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public Y(io.appmetrica.analytics.impl.C0764v7 c0764v7, io.appmetrica.analytics.impl.C0689sa c0689sa) {
        this.f5316a = c0764v7;
        this.f5317b = c0689sa;
    }

    public final io.appmetrica.analytics.impl.Z a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
