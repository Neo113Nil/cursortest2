package E;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class j0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1211k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G.o f1212l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(G.o oVar, a4.c cVar) {
        super(2, cVar);
        this.f1212l = oVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new j0(this.f1212l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1211k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        this.f1211k = 1;
        G.o oVar2 = this.f1212l;
        oVar2.getClass();
        Object e3 = AbstractC2282w.e(new G.n(oVar2, null), this);
        if (e3 != enumC0510a) {
            e3 = oVar;
        }
        return e3 == enumC0510a ? enumC0510a : oVar;
    }
}
