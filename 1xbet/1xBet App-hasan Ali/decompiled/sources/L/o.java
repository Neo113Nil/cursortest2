package L;

import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class o extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2954k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f2955l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, a4.c cVar) {
        super(2, cVar);
        this.f2955l = pVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        o oVar = new o(this.f2955l, cVar);
        oVar.f2954k = obj;
        return oVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return AbstractC2282w.p((InterfaceC2280u) this.f2954k, null, new n(this.f2955l, null), 3);
    }
}
