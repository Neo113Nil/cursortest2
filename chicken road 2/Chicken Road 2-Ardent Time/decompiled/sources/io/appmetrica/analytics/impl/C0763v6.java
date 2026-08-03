package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763v6 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Eg f6949a;

    public C0763v6() {
        this(new io.appmetrica.analytics.impl.Eg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.X5 fromModel(io.appmetrica.analytics.impl.C0737u6 c0737u6) {
        io.appmetrica.analytics.impl.X5 fromModel = this.f6949a.fromModel(c0737u6.f6881a);
        fromModel.f5287g = 1;
        io.appmetrica.analytics.impl.W5 w5 = new io.appmetrica.analytics.impl.W5();
        fromModel.f5288h = w5;
        w5.f5190a = io.appmetrica.analytics.coreutils.internal.StringUtils.correctIllFormedString(c0737u6.f6882b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0763v6(io.appmetrica.analytics.impl.Eg eg) {
        this.f6949a = eg;
    }

    public final io.appmetrica.analytics.impl.C0737u6 a(io.appmetrica.analytics.impl.X5 x5) {
        throw new java.lang.UnsupportedOperationException();
    }
}
