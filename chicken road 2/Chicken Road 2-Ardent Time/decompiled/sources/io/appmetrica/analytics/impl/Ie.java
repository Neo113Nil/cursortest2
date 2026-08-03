package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ie implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.T5[] fromModel(java.util.Map<java.lang.String, java.lang.String> map) {
        int size = map.size();
        io.appmetrica.analytics.impl.T5[] t5Arr = new io.appmetrica.analytics.impl.T5[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            t5Arr[i3] = new io.appmetrica.analytics.impl.T5();
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            io.appmetrica.analytics.impl.T5 t5 = t5Arr[i2];
            java.lang.String key = entry.getKey();
            java.nio.charset.Charset charset = y1.a.f8486a;
            t5.f5001a = key.getBytes(charset);
            t5Arr[i2].f5002b = entry.getValue().getBytes(charset);
            i2++;
        }
        return t5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.util.Map<java.lang.String, java.lang.String> a(io.appmetrica.analytics.impl.T5[] t5Arr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
