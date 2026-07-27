package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class Cf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f5796a;

    /* renamed from: b, reason: collision with root package name */
    public final Df f5797b;

    public Cf() {
        this(new Y(), new Df(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Ef ef) {
        int i3;
        C0824s8 c0824s8 = new C0824s8();
        Ii fromModel = this.f5796a.fromModel(ef.f5908a);
        c0824s8.f8293a = (C0566i8) fromModel.f6110a;
        On a3 = this.f5797b.a(ef.f5909b);
        if (AbstractC0711no.a((Collection) a3.f6370a)) {
            i3 = 0;
        } else {
            c0824s8.f8294b = new C0566i8[((List) a3.f6370a).size()];
            i3 = 0;
            for (int i4 = 0; i4 < ((List) a3.f6370a).size(); i4++) {
                Ii fromModel2 = this.f5796a.fromModel((Z) ((List) a3.f6370a).get(i4));
                c0824s8.f8294b[i4] = (C0566i8) fromModel2.f6110a;
                i3 += fromModel2.f6111b.getBytesTruncated();
            }
        }
        return new Ii(c0824s8, new C0561i3(C0561i3.b(fromModel, a3, new C0561i3(i3))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Cf(Y y, Df df) {
        this.f5796a = y;
        this.f5797b = df;
    }

    public final Ef a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
