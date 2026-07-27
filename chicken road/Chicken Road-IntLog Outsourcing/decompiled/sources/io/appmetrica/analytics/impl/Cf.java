package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class Cf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f6631a;

    /* renamed from: b, reason: collision with root package name */
    public final Df f6632b;

    public Cf() {
        this(new Y(), new Df(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Ef ef) {
        int i2;
        C0973s8 c0973s8 = new C0973s8();
        Ii fromModel = this.f6631a.fromModel(ef.f6749a);
        c0973s8.f9240a = (C0715i8) fromModel.f6960a;
        On a6 = this.f6632b.a(ef.f6750b);
        if (AbstractC0860no.a((Collection) a6.f7230a)) {
            i2 = 0;
        } else {
            c0973s8.f9241b = new C0715i8[((List) a6.f7230a).size()];
            i2 = 0;
            for (int i3 = 0; i3 < ((List) a6.f7230a).size(); i3++) {
                Ii fromModel2 = this.f6631a.fromModel((Z) ((List) a6.f7230a).get(i3));
                c0973s8.f9241b[i3] = (C0715i8) fromModel2.f6960a;
                i2 += fromModel2.f6961b.getBytesTruncated();
            }
        }
        return new Ii(c0973s8, new C0710i3(C0710i3.b(fromModel, a6, new C0710i3(i2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Cf(Y y5, Df df) {
        this.f6631a = y5;
        this.f6632b = df;
    }

    public final Ef a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
