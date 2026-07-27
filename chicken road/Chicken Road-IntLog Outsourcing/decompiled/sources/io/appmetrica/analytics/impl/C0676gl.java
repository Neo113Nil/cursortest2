package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676gl implements InterfaceC0689h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0597dj f8290a;

    /* renamed from: b, reason: collision with root package name */
    public final Lf f8291b;

    public C0676gl() {
        this(new C0597dj(), new Lf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0650fl c0650fl) {
        A8 a8 = new A8();
        a8.f6517a = 2;
        a8.f6519c = new C1103x8();
        Ii fromModel = this.f8290a.fromModel(c0650fl.f8193b);
        a8.f6519c.f9571b = (C1077w8) fromModel.f6960a;
        Ii fromModel2 = this.f8291b.fromModel(c0650fl.f8192a);
        a8.f6519c.f9570a = (C0999t8) fromModel2.f6960a;
        return Collections.singletonList(new Ii(a8, new C0710i3(C0710i3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0676gl(C0597dj c0597dj, Lf lf) {
        this.f8290a = c0597dj;
        this.f8291b = lf;
    }

    public final C0650fl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
