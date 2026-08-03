package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764v7 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    public final java.math.BigDecimal a(io.appmetrica.analytics.impl.C0377g8 c0377g8) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0377g8 fromModel(java.math.BigDecimal bigDecimal) {
        java.math.BigInteger bigInteger = io.appmetrica.analytics.impl.AbstractC0816x7.f7101a;
        int i2 = -bigDecimal.scale();
        java.math.BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(io.appmetrica.analytics.impl.AbstractC0816x7.f7101a) <= 0 && unscaledValue.compareTo(io.appmetrica.analytics.impl.AbstractC0816x7.f7102b) >= 0) {
                io.appmetrica.analytics.impl.C0790w7 c0790w7 = new io.appmetrica.analytics.impl.C0790w7(java.lang.Long.valueOf(unscaledValue.longValue()).longValue(), java.lang.Integer.valueOf(i2).intValue());
                io.appmetrica.analytics.impl.C0377g8 c0377g8 = new io.appmetrica.analytics.impl.C0377g8();
                c0377g8.f5965a = c0790w7.f7003a;
                c0377g8.f5966b = c0790w7.f7004b;
                return c0377g8;
            }
            unscaledValue = unscaledValue.divide(java.math.BigInteger.TEN);
            i2++;
        }
    }
}
