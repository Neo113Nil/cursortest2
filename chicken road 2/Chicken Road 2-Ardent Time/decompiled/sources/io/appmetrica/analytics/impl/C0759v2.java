package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759v2 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.V1 fromModel(io.appmetrica.analytics.impl.C0811x2 c0811x2) {
        io.appmetrica.analytics.impl.V1 v12 = new io.appmetrica.analytics.impl.V1();
        io.appmetrica.analytics.impl.EnumC0785w2 enumC0785w2 = c0811x2.f7073a;
        if (enumC0785w2 != null) {
            int ordinal = enumC0785w2.ordinal();
            if (ordinal == 0) {
                v12.f5112a = 6;
            } else if (ordinal == 1) {
                v12.f5112a = 1;
            } else if (ordinal == 2) {
                v12.f5112a = 2;
            } else if (ordinal == 3) {
                v12.f5112a = 3;
            } else if (ordinal == 4) {
                v12.f5112a = 4;
            } else if (ordinal != 5) {
                v12.f5112a = 0;
            } else {
                v12.f5112a = 5;
            }
        }
        java.lang.Boolean bool = c0811x2.f7074b;
        if (bool != null) {
            if (bool.booleanValue()) {
                v12.f5113b = 1;
            } else {
                v12.f5113b = 0;
            }
        }
        return v12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0811x2 toModel(io.appmetrica.analytics.impl.V1 v12) {
        io.appmetrica.analytics.impl.EnumC0785w2 enumC0785w2;
        java.lang.Boolean bool = null;
        switch (v12.f5112a) {
            case 1:
                enumC0785w2 = io.appmetrica.analytics.impl.EnumC0785w2.ACTIVE;
                break;
            case 2:
                enumC0785w2 = io.appmetrica.analytics.impl.EnumC0785w2.WORKING_SET;
                break;
            case 3:
                enumC0785w2 = io.appmetrica.analytics.impl.EnumC0785w2.FREQUENT;
                break;
            case 4:
                enumC0785w2 = io.appmetrica.analytics.impl.EnumC0785w2.RARE;
                break;
            case 5:
                enumC0785w2 = io.appmetrica.analytics.impl.EnumC0785w2.RESTRICTED;
                break;
            case 6:
                enumC0785w2 = io.appmetrica.analytics.impl.EnumC0785w2.EXEMPTED;
                break;
            default:
                enumC0785w2 = null;
                break;
        }
        int i2 = v12.f5113b;
        if (i2 == 0) {
            bool = java.lang.Boolean.FALSE;
        } else if (i2 == 1) {
            bool = java.lang.Boolean.TRUE;
        }
        return new io.appmetrica.analytics.impl.C0811x2(enumC0785w2, bool);
    }
}
