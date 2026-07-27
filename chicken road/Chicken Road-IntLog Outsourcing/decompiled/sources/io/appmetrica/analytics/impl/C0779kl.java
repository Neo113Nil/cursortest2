package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779kl implements InterfaceC0689h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0597dj f8637a;

    public C0779kl() {
        this(new C0597dj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0753jl c0753jl) {
        A8 a8 = new A8();
        a8.f6517a = 1;
        a8.f6518b = new C1153z8();
        Ii fromModel = this.f8637a.fromModel(c0753jl.f8555a);
        a8.f6518b.f9624a = (C1077w8) fromModel.f6960a;
        C0710i3 c0710i3 = new C0710i3(C0710i3.b(fromModel));
        fromModel.f6961b.getBytesTruncated();
        return Collections.singletonList(new Ii(a8, c0710i3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0779kl(C0597dj c0597dj) {
        this.f8637a = c0597dj;
    }

    public final C0753jl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
