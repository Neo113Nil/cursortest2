package t4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import s4.InterfaceC2368e;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0548i f19624o;

    /* JADX WARN: Multi-variable type inference failed */
    public n(i4.f fVar, InterfaceC2368e interfaceC2368e, a4.h hVar, int i, r4.a aVar) {
        super(interfaceC2368e, hVar, i, aVar);
        this.f19624o = (AbstractC0548i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c4.i, i4.f] */
    @Override // t4.g
    public final g e(a4.h hVar, int i, r4.a aVar) {
        return new n(this.f19624o, this.f19610n, hVar, i, aVar);
    }

    @Override // t4.i
    public final Object h(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        Object e3 = AbstractC2282w.e(new m(this, interfaceC2369f, null), cVar);
        return e3 == EnumC0510a.f7289k ? e3 : W3.o.f6046a;
    }
}
