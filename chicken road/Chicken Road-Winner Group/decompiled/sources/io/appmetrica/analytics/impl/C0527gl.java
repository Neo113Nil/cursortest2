package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527gl implements InterfaceC0540h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0448dj f7388a;

    /* renamed from: b, reason: collision with root package name */
    public final Lf f7389b;

    public C0527gl() {
        this(new C0448dj(), new Lf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0501fl c0501fl) {
        A8 a8 = new A8();
        a8.f5687a = 2;
        a8.f5689c = new C0954x8();
        Ii fromModel = this.f7388a.fromModel(c0501fl.f7298b);
        a8.f5689c.f8612b = (C0928w8) fromModel.f6110a;
        Ii fromModel2 = this.f7389b.fromModel(c0501fl.f7297a);
        a8.f5689c.f8611a = (C0850t8) fromModel2.f6110a;
        return Collections.singletonList(new Ii(a8, new C0561i3(C0561i3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0527gl(C0448dj c0448dj, Lf lf) {
        this.f7388a = c0448dj;
        this.f7389b = lf;
    }

    public final C0501fl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
