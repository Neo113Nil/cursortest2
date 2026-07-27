package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class D2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0605e2 fromModel(F2 f22) {
        C0605e2 c0605e2 = new C0605e2();
        E2 e22 = f22.f6769a;
        if (e22 != null) {
            int ordinal = e22.ordinal();
            if (ordinal == 1) {
                c0605e2.f8081a = 1;
            } else if (ordinal == 2) {
                c0605e2.f8081a = 2;
            } else if (ordinal == 3) {
                c0605e2.f8081a = 3;
            } else if (ordinal == 4) {
                c0605e2.f8081a = 4;
            } else if (ordinal == 5) {
                c0605e2.f8081a = 5;
            }
        }
        Boolean bool = f22.f6770b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c0605e2.f8082b = 1;
            } else {
                c0605e2.f8082b = 0;
            }
        }
        return c0605e2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F2 toModel(C0605e2 c0605e2) {
        E2 e22;
        int i2 = c0605e2.f8081a;
        Boolean bool = null;
        if (i2 == 1) {
            e22 = E2.ACTIVE;
        } else if (i2 == 2) {
            e22 = E2.WORKING_SET;
        } else if (i2 == 3) {
            e22 = E2.FREQUENT;
        } else if (i2 != 4) {
            e22 = i2 != 5 ? null : E2.RESTRICTED;
        } else {
            e22 = E2.RARE;
        }
        int i3 = c0605e2.f8082b;
        if (i3 == 0) {
            bool = Boolean.FALSE;
        } else if (i3 == 1) {
            bool = Boolean.TRUE;
        }
        return new F2(e22, bool);
    }
}
