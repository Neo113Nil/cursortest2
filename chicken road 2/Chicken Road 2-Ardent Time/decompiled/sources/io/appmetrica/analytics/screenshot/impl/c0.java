package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class c0 implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.P fromModel(io.appmetrica.analytics.screenshot.impl.a0 a0Var) {
        io.appmetrica.analytics.screenshot.impl.P p2 = new io.appmetrica.analytics.screenshot.impl.P();
        p2.f7514a = a0Var.f7538a;
        p2.f7515b = a0Var.f7539b;
        return p2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        io.appmetrica.analytics.screenshot.impl.P p2 = (io.appmetrica.analytics.screenshot.impl.P) obj;
        return new io.appmetrica.analytics.screenshot.impl.a0(p2.f7514a, p2.f7515b);
    }

    public final io.appmetrica.analytics.screenshot.impl.a0 a(io.appmetrica.analytics.screenshot.impl.P p2) {
        return new io.appmetrica.analytics.screenshot.impl.a0(p2.f7514a, p2.f7515b);
    }
}
