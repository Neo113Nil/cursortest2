package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class K implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.M f7503a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(io.appmetrica.analytics.screenshot.impl.J j2) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f7503a.fromModel(j2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f7503a.fromModel((io.appmetrica.analytics.screenshot.impl.J) obj));
    }

    public K(io.appmetrica.analytics.screenshot.impl.M m2) {
        this.f7503a = m2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.J toModel(byte[] bArr) {
        io.appmetrica.analytics.screenshot.impl.S s2;
        try {
            s2 = (io.appmetrica.analytics.screenshot.impl.S) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.screenshot.impl.S(), bArr);
        } catch (java.lang.Throwable unused) {
            s2 = new io.appmetrica.analytics.screenshot.impl.S();
        }
        return this.f7503a.toModel(s2);
    }

    public /* synthetic */ K(io.appmetrica.analytics.screenshot.impl.M m2, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.screenshot.impl.M(null, 1, null) : m2);
    }
}
