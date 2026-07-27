package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917q3 implements InterfaceC0689h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0942r3 f9048a;

    public C0917q3() {
        this(new C0942r3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0891p3 c0891p3) {
        A8 a8 = new A8();
        a8.f6521e = new C0740j8();
        Ii fromModel = this.f9048a.fromModel(c0891p3.f8983b);
        a8.f6521e.f8523a = (C0766k8) fromModel.f6960a;
        a8.f6517a = c0891p3.f8982a;
        return Collections.singletonList(new Ii(a8, new C0710i3(C0710i3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0917q3(C0942r3 c0942r3) {
        this.f9048a = c0942r3;
    }

    public final C0891p3 a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
