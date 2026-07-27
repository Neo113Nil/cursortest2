package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651lg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0448dj f7811a;

    /* renamed from: b, reason: collision with root package name */
    public final C1006za f7812b;

    /* renamed from: c, reason: collision with root package name */
    public final C1006za f7813c;

    public C0651lg() {
        this(new C0448dj(), new C1006za(100), new C1006za(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Cg cg) {
        Ii ii;
        C0902v8 c0902v8 = new C0902v8();
        On a3 = this.f7812b.a(cg.f5798a);
        c0902v8.f8501a = StringUtils.getUTF8Bytes((String) a3.f6370a);
        On a4 = this.f7813c.a(cg.f5799b);
        c0902v8.f8502b = StringUtils.getUTF8Bytes((String) a4.f6370a);
        C0551hj c0551hj = cg.f5800c;
        if (c0551hj != null) {
            ii = this.f7811a.fromModel(c0551hj);
            c0902v8.f8503c = (C0928w8) ii.f6110a;
        } else {
            ii = null;
        }
        return new Ii(c0902v8, new C0561i3(C0561i3.b(a3, a4, ii)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0651lg(C0448dj c0448dj, C1006za c1006za, C1006za c1006za2) {
        this.f7811a = c0448dj;
        this.f7812b = c1006za;
        this.f7813c = c1006za2;
    }

    public final Cg a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
