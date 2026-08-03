package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Bl implements io.appmetrica.analytics.coreapi.internal.data.ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cl f4133a = new io.appmetrica.analytics.impl.Cl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Z5[] fromModel(java.util.List<io.appmetrica.analytics.impl.Dl> list) {
        io.appmetrica.analytics.impl.Z5[] z5Arr = new io.appmetrica.analytics.impl.Z5[list.size()];
        java.util.Iterator<io.appmetrica.analytics.impl.Dl> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            z5Arr[i2] = this.f4133a.fromModel(it.next());
            i2++;
        }
        return z5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.util.List<io.appmetrica.analytics.impl.Dl> a(io.appmetrica.analytics.impl.Z5[] z5Arr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
