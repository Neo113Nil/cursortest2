package E;

import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class J extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1050k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0.v f1051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.O f1053n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(t0.v vVar, InterfaceC0104i0 interfaceC0104i0, I.O o5, a4.c cVar) {
        super(2, cVar);
        this.f1051l = vVar;
        this.f1052m = interfaceC0104i0;
        this.f1053n = o5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        J j5 = new J(this.f1051l, this.f1052m, this.f1053n, cVar);
        j5.f1050k = obj;
        return j5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        J j5 = (J) create((InterfaceC2280u) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        j5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f1050k;
        t0.v vVar = this.f1051l;
        AbstractC2282w.p(interfaceC2280u, null, new H(vVar, this.f1052m, null), 1);
        AbstractC2282w.p(interfaceC2280u, null, new I(vVar, this.f1053n, null), 1);
        return W3.o.f6046a;
    }
}
