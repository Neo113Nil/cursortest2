package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(C1173e c1173e) {
        N n6 = new N();
        n6.f9976a = c1173e.f10015a;
        return n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1173e(((N) obj).f9976a);
    }

    public final C1173e a(N n6) {
        return new C1173e(n6.f9976a);
    }
}
