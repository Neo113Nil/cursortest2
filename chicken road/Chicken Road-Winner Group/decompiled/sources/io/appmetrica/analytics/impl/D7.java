package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class D7 implements ProtobufConverter {
    public final BigDecimal a(C0669m8 c0669m8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0669m8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = F7.f5935a;
        int i3 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f5935a) <= 0 && unscaledValue.compareTo(F7.f5936b) >= 0) {
                Long valueOf = Long.valueOf(unscaledValue.longValue());
                Integer valueOf2 = Integer.valueOf(i3);
                E7 e7 = new E7(valueOf2.intValue(), valueOf.longValue());
                C0669m8 c0669m8 = new C0669m8();
                c0669m8.f7849a = e7.f5900a;
                c0669m8.f7850b = e7.f5901b;
                return c0669m8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i3++;
        }
    }
}
