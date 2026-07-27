package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942r3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Lf f9130a;

    /* renamed from: b, reason: collision with root package name */
    public final D7 f9131b;

    /* renamed from: c, reason: collision with root package name */
    public final Cf f9132c;

    /* renamed from: d, reason: collision with root package name */
    public final C0800lg f9133d;

    public C0942r3() {
        this(new Lf(), new D7(), new Cf(), new C0800lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(C0968s3 c0968s3) {
        Ii ii;
        C0766k8 c0766k8 = new C0766k8();
        Ii fromModel = this.f9130a.fromModel(c0968s3.f9224a);
        c0766k8.f8607a = (C0999t8) fromModel.f6960a;
        c0766k8.f8609c = this.f9131b.fromModel(c0968s3.f9225b);
        Ii fromModel2 = this.f9132c.fromModel(c0968s3.f9226c);
        c0766k8.f8610d = (C0973s8) fromModel2.f6960a;
        Cg cg = c0968s3.f9227d;
        if (cg != null) {
            ii = this.f9133d.fromModel(cg);
            c0766k8.f8608b = (C1051v8) ii.f6960a;
        } else {
            ii = null;
        }
        return new Ii(c0766k8, new C0710i3(C0710i3.b(fromModel, fromModel2, ii)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0942r3(Lf lf, D7 d7, Cf cf, C0800lg c0800lg) {
        this.f9130a = lf;
        this.f9131b = d7;
        this.f9132c = cf;
        this.f9133d = c0800lg;
    }

    public final C0968s3 a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
