package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512le implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer fromModel(java.lang.Boolean bool) {
        int i2;
        if (bool == null) {
            i2 = -1;
        } else if (bool.equals(java.lang.Boolean.TRUE)) {
            i2 = 1;
        } else {
            if (!bool.equals(java.lang.Boolean.FALSE)) {
                throw new E1.A();
            }
            i2 = 0;
        }
        return java.lang.Integer.valueOf(i2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ java.lang.Object toModel(java.lang.Object obj) {
        return a(((java.lang.Number) obj).intValue());
    }

    public final java.lang.Boolean a(int i2) {
        if (i2 != -1) {
            if (i2 == 0) {
                return java.lang.Boolean.FALSE;
            }
            if (i2 == 1) {
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }
}
