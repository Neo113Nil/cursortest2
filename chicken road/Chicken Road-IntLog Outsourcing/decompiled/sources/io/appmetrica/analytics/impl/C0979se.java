package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979se implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i2;
        if (bool == null) {
            i2 = -1;
        } else if (bool.equals(Boolean.TRUE)) {
            i2 = 1;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new C1.b();
            }
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i2) {
        if (i2 != -1) {
            if (i2 == 0) {
                return Boolean.FALSE;
            }
            if (i2 == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
