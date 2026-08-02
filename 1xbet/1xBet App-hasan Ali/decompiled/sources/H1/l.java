package H1;

import G1.C0140k;
import P.InterfaceC0289e0;
import c4.AbstractC0548i;
import java.util.List;
import java.util.Set;
import p4.InterfaceC2280u;
import s4.M;

/* loaded from: classes.dex */
public final class l extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2223k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f2224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z.p f2225m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC0289e0 interfaceC0289e0, o oVar, Z.p pVar, a4.c cVar) {
        super(2, cVar);
        this.f2223k = interfaceC0289e0;
        this.f2224l = oVar;
        this.f2225m = pVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new l(this.f2223k, this.f2224l, this.f2225m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((InterfaceC2280u) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        lVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        for (C0140k c0140k : (Set) this.f2223k.getValue()) {
            o oVar = this.f2224l;
            if (!((List) ((M) oVar.b().f1920e.f19316k).getValue()).contains(c0140k) && !this.f2225m.contains(c0140k)) {
                oVar.b().b(c0140k);
            }
        }
        return W3.o.f6046a;
    }
}
