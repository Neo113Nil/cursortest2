package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891g implements io.appmetrica.analytics.coreapi.internal.data.Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.N fromModel(io.appmetrica.analytics.screenshot.impl.C0889e c0889e) {
        io.appmetrica.analytics.screenshot.impl.N n2 = new io.appmetrica.analytics.screenshot.impl.N();
        n2.f7508a = c0889e.f7547a;
        return n2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        return new io.appmetrica.analytics.screenshot.impl.C0889e(((io.appmetrica.analytics.screenshot.impl.N) obj).f7508a);
    }

    public final io.appmetrica.analytics.screenshot.impl.C0889e a(io.appmetrica.analytics.screenshot.impl.N n2) {
        return new io.appmetrica.analytics.screenshot.impl.C0889e(n2.f7508a);
    }
}
