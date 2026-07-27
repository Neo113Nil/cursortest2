package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Hm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0993ym fromModel(Gm gm) {
        C0993ym c0993ym = new C0993ym();
        c0993ym.f8645a = gm.f6002a;
        return c0993ym;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gm(((C0993ym) obj).f8645a);
    }

    public final Gm a(C0993ym c0993ym) {
        return new Gm(c0993ym.f8645a);
    }
}
