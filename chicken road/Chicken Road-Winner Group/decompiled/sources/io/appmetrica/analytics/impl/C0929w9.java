package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929w9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0877u9 fromModel(C0903v9 c0903v9) {
        C0877u9 c0877u9 = new C0877u9();
        String str = c0903v9.f8504a;
        if (str != null) {
            c0877u9.f8413a = str.getBytes();
        }
        return c0877u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0903v9 toModel(C0877u9 c0877u9) {
        return new C0903v9(new String(c0877u9.f8413a));
    }
}
