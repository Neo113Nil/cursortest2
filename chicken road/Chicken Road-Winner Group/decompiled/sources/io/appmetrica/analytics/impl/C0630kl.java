package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630kl implements InterfaceC0540h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0448dj f7717a;

    public C0630kl() {
        this(new C0448dj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0604jl c0604jl) {
        A8 a8 = new A8();
        a8.f5687a = 1;
        a8.f5688b = new C1004z8();
        Ii fromModel = this.f7717a.fromModel(c0604jl.f7638a);
        a8.f5688b.f8664a = (C0928w8) fromModel.f6110a;
        C0561i3 c0561i3 = new C0561i3(C0561i3.b(fromModel));
        fromModel.f6111b.getBytesTruncated();
        return Collections.singletonList(new Ii(a8, c0561i3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0630kl(C0448dj c0448dj) {
        this.f7717a = c0448dj;
    }

    public final C0604jl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
