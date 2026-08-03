package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ed implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Dd f4262a = new io.appmetrica.analytics.impl.Dd();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f4263b = i1.AbstractC0202u.G(new h1.C0172d(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource.UNKNOWN, 0), new h1.C0172d(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.V5 fromModel(io.appmetrica.analytics.impl.Kd kd) {
        io.appmetrica.analytics.impl.V5 v5 = new io.appmetrica.analytics.impl.V5();
        v5.f5128f = 1;
        io.appmetrica.analytics.impl.U5 u5 = new io.appmetrica.analytics.impl.U5();
        u5.f5057a = kd.f4541a;
        io.appmetrica.analytics.impl.Y5 y5 = new io.appmetrica.analytics.impl.Y5();
        java.lang.Integer num = (java.lang.Integer) f4263b.get(kd.f4542b.f4376a);
        if (num != null) {
            y5.f5325a = num.intValue();
        }
        java.lang.String str = kd.f4542b.f4377b;
        if (str == null) {
            str = "";
        }
        y5.f5326b = str;
        u5.f5058b = y5;
        v5.f5129g = u5;
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final io.appmetrica.analytics.impl.Kd a(io.appmetrica.analytics.impl.V5 v5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
