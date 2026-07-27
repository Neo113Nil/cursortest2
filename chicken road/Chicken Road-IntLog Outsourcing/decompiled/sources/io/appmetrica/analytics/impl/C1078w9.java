package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078w9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1026u9 fromModel(C1052v9 c1052v9) {
        C1026u9 c1026u9 = new C1026u9();
        String str = c1052v9.f9459a;
        if (str != null) {
            c1026u9.f9365a = str.getBytes();
        }
        return c1026u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1052v9 toModel(C1026u9 c1026u9) {
        return new C1052v9(new String(c1026u9.f9365a));
    }
}
