package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609p7 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0512le f6637a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0609p7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0583o7 fromModel(io.appmetrica.analytics.impl.C0660r7 c0660r7) {
        io.appmetrica.analytics.impl.C0583o7 c0583o7 = new io.appmetrica.analytics.impl.C0583o7();
        java.lang.Long l2 = c0660r7.f6721a;
        if (l2 != null) {
            c0583o7.f6572a = l2.longValue();
        }
        java.lang.Long l3 = c0660r7.f6722b;
        if (l3 != null) {
            c0583o7.f6573b = l3.longValue();
        }
        java.lang.Boolean bool = c0660r7.f6723c;
        if (bool != null) {
            c0583o7.f6574c = this.f6637a.fromModel(bool).intValue();
        }
        return c0583o7;
    }

    public C0609p7(io.appmetrica.analytics.impl.C0512le c0512le) {
        this.f6637a = c0512le;
    }

    public /* synthetic */ C0609p7(io.appmetrica.analytics.impl.C0512le c0512le, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.impl.C0512le() : c0512le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0660r7 toModel(io.appmetrica.analytics.impl.C0583o7 c0583o7) {
        io.appmetrica.analytics.impl.C0583o7 c0583o72 = new io.appmetrica.analytics.impl.C0583o7();
        long j2 = c0583o7.f6572a;
        java.lang.Long valueOf = java.lang.Long.valueOf(j2);
        if (j2 == c0583o72.f6572a) {
            valueOf = null;
        }
        long j3 = c0583o7.f6573b;
        return new io.appmetrica.analytics.impl.C0660r7(valueOf, j3 != c0583o72.f6573b ? java.lang.Long.valueOf(j3) : null, this.f6637a.a(c0583o7.f6574c));
    }
}
