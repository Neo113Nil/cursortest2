package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292d0 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.W f5682a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0401h6 f5683b;

    public C0292d0() {
        this(new io.appmetrica.analytics.impl.W(new io.appmetrica.analytics.impl.C0832xn()), new io.appmetrica.analytics.impl.C0401h6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.S5 fromModel(io.appmetrica.analytics.impl.C0266c0 c0266c0) {
        io.appmetrica.analytics.impl.S5 s5 = new io.appmetrica.analytics.impl.S5();
        s5.f4950a = this.f5682a.fromModel(c0266c0.f5609a);
        java.lang.String str = c0266c0.f5610b;
        if (str != null) {
            s5.f4951b = str;
        }
        s5.f4952c = this.f5683b.a(c0266c0.f5611c);
        return s5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0292d0(io.appmetrica.analytics.impl.W w2, io.appmetrica.analytics.impl.C0401h6 c0401h6) {
        this.f5682a = w2;
        this.f5683b = c0401h6;
    }

    public final io.appmetrica.analytics.impl.C0266c0 a(io.appmetrica.analytics.impl.S5 s5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
