package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032uf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Y7 y7) {
        int ordinal = y7.ordinal();
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
    public final Y7 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return Y7.f7730c;
        }
        if (intValue == 2) {
            return Y7.f7732e;
        }
        if (intValue != 3) {
            return Y7.f7729b;
        }
        return Y7.f7731d;
    }
}
