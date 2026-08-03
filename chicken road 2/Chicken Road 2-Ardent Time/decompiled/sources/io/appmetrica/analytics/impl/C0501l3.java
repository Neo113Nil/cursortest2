package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501l3 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0663ra f6322a;

    public C0501l3() {
        this(new io.appmetrica.analytics.impl.C0663ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(java.util.List<java.lang.String> list) {
        io.appmetrica.analytics.impl.Mn a2 = this.f6322a.a((java.util.List<java.lang.Object>) list);
        io.appmetrica.analytics.impl.C0351f8 c0351f8 = new io.appmetrica.analytics.impl.C0351f8();
        c0351f8.f5876a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.util.List<java.lang.String>) a2.f4694a);
        io.appmetrica.analytics.impl.InterfaceC0243b3 interfaceC0243b3 = a2.f4695b;
        int i2 = ((io.appmetrica.analytics.impl.C0554n4) interfaceC0243b3).f5453a;
        return new io.appmetrica.analytics.impl.Di(c0351f8, interfaceC0243b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0501l3(io.appmetrica.analytics.impl.C0663ra c0663ra) {
        this.f6322a = c0663ra;
    }

    public final java.util.List<java.lang.String> a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
