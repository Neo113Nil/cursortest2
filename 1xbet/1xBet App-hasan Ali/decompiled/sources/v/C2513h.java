package v;

import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import y.C2651g;
import y.C2652h;
import y.C2654j;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2513h extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2503A f20246k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2513h(C2503A c2503a, a4.c cVar) {
        super(2, cVar);
        this.f20246k = c2503a;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2513h(this.f20246k, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C2513h c2513h = (C2513h) create((InterfaceC2280u) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        c2513h.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        C2503A c2503a = this.f20246k;
        C2651g c2651g = c2503a.f20130L;
        if (c2651g != null) {
            C2652h c2652h = new C2652h(c2651g);
            C2654j c2654j = c2503a.f20121A;
            if (c2654j != null) {
                AbstractC2282w.p(c2503a.k0(), null, new C2507b(c2654j, c2652h, null), 3);
            }
            c2503a.f20130L = null;
        }
        return W3.o.f6046a;
    }
}
