package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class He implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    public final java.lang.String a(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(java.lang.String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        return str.getBytes(y1.a.f8486a);
    }
}
