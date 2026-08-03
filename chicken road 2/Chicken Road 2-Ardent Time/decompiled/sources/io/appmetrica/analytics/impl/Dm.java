package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dm implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0753um fromModel(io.appmetrica.analytics.impl.Cm cm) {
        io.appmetrica.analytics.impl.C0753um c0753um = new io.appmetrica.analytics.impl.C0753um();
        c0753um.f6934a = cm.f4184a;
        return c0753um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        return new io.appmetrica.analytics.impl.Cm(((io.appmetrica.analytics.impl.C0753um) obj).f6934a);
    }

    public final io.appmetrica.analytics.impl.Cm a(io.appmetrica.analytics.impl.C0753um c0753um) {
        return new io.appmetrica.analytics.impl.Cm(c0753um.f6934a);
    }
}
