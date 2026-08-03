package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cl implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Z5 fromModel(io.appmetrica.analytics.impl.Dl dl) {
        io.appmetrica.analytics.impl.Z5 z5 = new io.appmetrica.analytics.impl.Z5();
        z5.f5377a = (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dl.f4230a, z5.f5377a);
        z5.f5378b = (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dl.f4231b, z5.f5378b);
        z5.f5379c = ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dl.f4232c, java.lang.Integer.valueOf(z5.f5379c))).intValue();
        z5.f5382f = ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dl.f4233d, java.lang.Integer.valueOf(z5.f5382f))).intValue();
        z5.f5380d = (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dl.f4234e, z5.f5380d);
        z5.f5381e = ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(dl.f4235f, java.lang.Boolean.valueOf(z5.f5381e))).booleanValue();
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final io.appmetrica.analytics.impl.Dl a(io.appmetrica.analytics.impl.Z5 z5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
