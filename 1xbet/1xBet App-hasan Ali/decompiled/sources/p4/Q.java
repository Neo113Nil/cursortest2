package p4;

import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class Q extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f18760k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O3.l f18761l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(O3.l lVar, a4.c cVar) {
        super(2, cVar);
        this.f18761l = lVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        Q q5 = new Q(this.f18761l, cVar);
        q5.f18760k = obj;
        return q5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        G4.l.N(obj);
        a4.h i5 = ((InterfaceC2280u) this.f18760k).i();
        O3.l lVar = this.f18761l;
        try {
            l0 l0Var = new l0();
            l0Var.f18804p = AbstractC2282w.m(AbstractC2282w.j(i5), true, l0Var);
            try {
                do {
                    atomicIntegerFieldUpdater = l0.f18802q;
                    i = atomicIntegerFieldUpdater.get(l0Var);
                    if (i != 0) {
                        if (i != 2 && i != 3) {
                            l0.n(i);
                            throw null;
                        }
                    }
                    return lVar.invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(l0Var, i, 0));
                return lVar.invoke();
            } finally {
                l0Var.m();
            }
        } catch (InterruptedException e3) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e3);
        }
    }
}
