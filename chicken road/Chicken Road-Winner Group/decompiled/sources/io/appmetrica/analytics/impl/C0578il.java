package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578il implements InterfaceC0540h8 {

    /* renamed from: a, reason: collision with root package name */
    public final Lf f7548a;

    /* renamed from: b, reason: collision with root package name */
    public final C0651lg f7549b;

    public C0578il() {
        this(new Lf(), new C0651lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0553hl c0553hl) {
        Ii ii;
        A8 a8 = new A8();
        a8.f5687a = 3;
        a8.f5690d = new C0979y8();
        Ii fromModel = this.f7548a.fromModel(c0553hl.f7434a);
        a8.f5690d.f8635a = (C0850t8) fromModel.f6110a;
        Cg cg = c0553hl.f7435b;
        if (cg != null) {
            ii = this.f7549b.fromModel(cg);
            a8.f5690d.f8636b = (C0902v8) ii.f6110a;
        } else {
            ii = null;
        }
        return Collections.singletonList(new Ii(a8, new C0561i3(C0561i3.b(fromModel, ii))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0578il(Lf lf, C0651lg c0651lg) {
        this.f7548a = lf;
        this.f7549b = c0651lg;
    }

    public final C0553hl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
