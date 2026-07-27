package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class J9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0890um fromModel(I9 i9) {
        C0890um c0890um = new C0890um();
        if (i9 != null) {
            c0890um.f8466a = i9.f6092a;
        }
        return c0890um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new I9(((C0890um) obj).f8466a);
    }

    public final I9 a(C0890um c0890um) {
        return new I9(c0890um.f8466a);
    }
}
