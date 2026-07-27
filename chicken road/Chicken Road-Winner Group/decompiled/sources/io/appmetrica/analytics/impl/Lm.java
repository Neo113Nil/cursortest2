package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Lm implements ProtobufConverter {
    public final C1018zm a(Km km) {
        C1018zm c1018zm = new C1018zm();
        c1018zm.f8713a = km.f6196a;
        return c1018zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C1018zm c1018zm = new C1018zm();
        c1018zm.f8713a = ((Km) obj).f6196a;
        return c1018zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Km(((C1018zm) obj).f8713a);
    }

    public final Km a(C1018zm c1018zm) {
        return new Km(c1018zm.f8713a);
    }
}
