package G;

import c4.AbstractC0548i;
import java.util.concurrent.atomic.AtomicReference;
import p4.AbstractC2282w;
import p4.C2285z;
import p4.InterfaceC2280u;
import p4.U;

/* loaded from: classes.dex */
public final class n extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1739k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f1740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, a4.c cVar) {
        super(2, cVar);
        this.f1740l = oVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        n nVar = new n(this.f1740l, cVar);
        nVar.f1739k = obj;
        return nVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f1739k;
        o oVar = this.f1740l;
        U u5 = (U) oVar.f1741a.getAndSet(null);
        AtomicReference atomicReference = oVar.f1741a;
        C2285z p5 = AbstractC2282w.p(interfaceC2280u, null, new m(u5, oVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, p5)) {
                z3 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z3 = false;
                break;
            }
        }
        return Boolean.valueOf(z3);
    }
}
