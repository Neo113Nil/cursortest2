package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727il implements InterfaceC0689h8 {

    /* renamed from: a, reason: collision with root package name */
    public final Lf f8459a;

    /* renamed from: b, reason: collision with root package name */
    public final C0800lg f8460b;

    public C0727il() {
        this(new Lf(), new C0800lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0702hl c0702hl) {
        Ii ii;
        A8 a8 = new A8();
        a8.f6517a = 3;
        a8.f6520d = new C1128y8();
        Ii fromModel = this.f8459a.fromModel(c0702hl.f8338a);
        a8.f6520d.f9594a = (C0999t8) fromModel.f6960a;
        Cg cg = c0702hl.f8339b;
        if (cg != null) {
            ii = this.f8460b.fromModel(cg);
            a8.f6520d.f9595b = (C1051v8) ii.f6960a;
        } else {
            ii = null;
        }
        return Collections.singletonList(new Ii(a8, new C0710i3(C0710i3.b(fromModel, ii))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0727il(Lf lf, C0800lg c0800lg) {
        this.f8459a = lf;
        this.f8460b = c0800lg;
    }

    public final C0702hl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
