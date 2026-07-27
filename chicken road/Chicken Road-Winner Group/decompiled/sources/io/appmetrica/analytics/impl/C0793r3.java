package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793r3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Lf f8187a;

    /* renamed from: b, reason: collision with root package name */
    public final D7 f8188b;

    /* renamed from: c, reason: collision with root package name */
    public final Cf f8189c;

    /* renamed from: d, reason: collision with root package name */
    public final C0651lg f8190d;

    public C0793r3() {
        this(new Lf(), new D7(), new Cf(), new C0651lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(C0819s3 c0819s3) {
        Ii ii;
        C0617k8 c0617k8 = new C0617k8();
        Ii fromModel = this.f8187a.fromModel(c0819s3.f8278a);
        c0617k8.f7688a = (C0850t8) fromModel.f6110a;
        c0617k8.f7690c = this.f8188b.fromModel(c0819s3.f8279b);
        Ii fromModel2 = this.f8189c.fromModel(c0819s3.f8280c);
        c0617k8.f7691d = (C0824s8) fromModel2.f6110a;
        Cg cg = c0819s3.f8281d;
        if (cg != null) {
            ii = this.f8190d.fromModel(cg);
            c0617k8.f7689b = (C0902v8) ii.f6110a;
        } else {
            ii = null;
        }
        return new Ii(c0617k8, new C0561i3(C0561i3.b(fromModel, fromModel2, ii)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0793r3(Lf lf, D7 d7, Cf cf, C0651lg c0651lg) {
        this.f8187a = lf;
        this.f8188b = d7;
        this.f8189c = cf;
        this.f8190d = c0651lg;
    }

    public final C0819s3 a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
