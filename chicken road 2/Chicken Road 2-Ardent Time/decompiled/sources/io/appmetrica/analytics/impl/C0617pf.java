package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617pf implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer fromModel(io.appmetrica.analytics.impl.S7 s7) {
        int ordinal = s7.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.S7 toModel(java.lang.Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return io.appmetrica.analytics.impl.S7.f4954c;
        }
        if (intValue == 2) {
            return io.appmetrica.analytics.impl.S7.f4956e;
        }
        if (intValue != 3) {
            return io.appmetrica.analytics.impl.S7.f4953b;
        }
        return io.appmetrica.analytics.impl.S7.f4955d;
    }
}
