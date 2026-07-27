package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768q3 implements InterfaceC0540h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0793r3 f8110a;

    public C0768q3() {
        this(new C0793r3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0742p3 c0742p3) {
        A8 a8 = new A8();
        a8.f5691e = new C0591j8();
        Ii fromModel = this.f8110a.fromModel(c0742p3.f8048b);
        a8.f5691e.f7608a = (C0617k8) fromModel.f6110a;
        a8.f5687a = c0742p3.f8047a;
        return Collections.singletonList(new Ii(a8, new C0561i3(C0561i3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0768q3(C0793r3 c0793r3) {
        this.f8110a = c0793r3;
    }

    public final C0742p3 a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
