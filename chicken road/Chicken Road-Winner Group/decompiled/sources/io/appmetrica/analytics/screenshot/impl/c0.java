package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(a0 a0Var) {
        P p3 = new P();
        p3.f9001a = a0Var.f9025a;
        p3.f9002b = a0Var.f9026b;
        return p3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p3 = (P) obj;
        return new a0(p3.f9001a, p3.f9002b);
    }

    public final a0 a(P p3) {
        return new a0(p3.f9001a, p3.f9002b);
    }
}
