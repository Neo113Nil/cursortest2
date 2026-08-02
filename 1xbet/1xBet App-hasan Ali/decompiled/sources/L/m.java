package L;

import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class m extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2950k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f2951l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, a4.c cVar) {
        super(2, cVar);
        this.f2951l = pVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        m mVar = new m(this.f2951l, cVar);
        mVar.f2950k = obj;
        return mVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f2950k;
        p pVar = this.f2951l;
        AbstractC2282w.p(interfaceC2280u, null, new j(pVar, null), 3);
        AbstractC2282w.p(interfaceC2280u, null, new k(pVar, null), 3);
        return AbstractC2282w.p(interfaceC2280u, null, new l(pVar, null), 3);
    }
}
