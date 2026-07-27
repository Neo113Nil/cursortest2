package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(a0 a0Var) {
        P p5 = new P();
        p5.f9982a = a0Var.f10006a;
        p5.f9983b = a0Var.f10007b;
        return p5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p5 = (P) obj;
        return new a0(p5.f9982a, p5.f9983b);
    }

    public final a0 a(P p5) {
        return new a0(p5.f9982a, p5.f9983b);
    }
}
