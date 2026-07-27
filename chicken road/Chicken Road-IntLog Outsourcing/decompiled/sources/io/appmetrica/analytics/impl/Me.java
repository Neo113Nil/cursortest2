package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class Me implements Converter {
    public final String a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        return str.getBytes(B4.a.f287a);
    }
}
