package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final D7 f6841a;

    /* renamed from: b, reason: collision with root package name */
    public final C1006za f6842b;

    public Y() {
        this(new D7(), new C1006za(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Z z3) {
        C0566i8 c0566i8 = new C0566i8();
        c0566i8.f7489b = this.f6841a.fromModel(z3.f6882a);
        On a3 = this.f6842b.a(z3.f6883b);
        c0566i8.f7488a = StringUtils.getUTF8Bytes((String) a3.f6370a);
        return new Ii(c0566i8, new C0561i3(C0561i3.b(a3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(D7 d7, C1006za c1006za) {
        this.f6841a = d7;
        this.f6842b = c1006za;
    }

    public final Z a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
