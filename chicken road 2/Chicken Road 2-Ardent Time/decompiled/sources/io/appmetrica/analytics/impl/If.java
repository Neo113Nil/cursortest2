package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class If implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0663ra f4452a;

    public If() {
        this(new io.appmetrica.analytics.impl.C0663ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Di fromModel(java.util.List<java.lang.String> list) {
        io.appmetrica.analytics.impl.Mn a2 = this.f4452a.a((java.util.List<java.lang.Object>) list);
        java.util.List list2 = (java.util.List) a2.f4694a;
        io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr = new io.appmetrica.analytics.impl.C0584o8[0];
        if (list2 != null) {
            c0584o8Arr = new io.appmetrica.analytics.impl.C0584o8[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                io.appmetrica.analytics.impl.C0584o8 c0584o8 = new io.appmetrica.analytics.impl.C0584o8();
                c0584o8Arr[i2] = c0584o8;
                c0584o8.f6576a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) list2.get(i2));
            }
        }
        a2.f4695b.getBytesTruncated();
        return new io.appmetrica.analytics.impl.Di(c0584o8Arr, a2.f4695b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public If(io.appmetrica.analytics.impl.C0663ra c0663ra) {
        this.f4452a = c0663ra;
    }

    public final java.util.List<java.lang.String> a(io.appmetrica.analytics.impl.Di di) {
        throw new java.lang.UnsupportedOperationException();
    }
}
