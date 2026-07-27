package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class J9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1039um fromModel(I9 i9) {
        C1039um c1039um = new C1039um();
        if (i9 != null) {
            c1039um.f9419a = i9.f6941a;
        }
        return c1039um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new I9(((C1039um) obj).f9419a);
    }

    public final I9 a(C1039um c1039um) {
        return new I9(c1039um.f9419a);
    }
}
