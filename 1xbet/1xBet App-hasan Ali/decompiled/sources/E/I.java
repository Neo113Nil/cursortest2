package E;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import x.O0;
import x.Q0;

/* loaded from: classes.dex */
public final class I extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1043k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0.v f1044l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.O f1045m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(t0.v vVar, I.O o5, a4.c cVar) {
        super(2, cVar);
        this.f1044l = vVar;
        this.f1045m = o5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new I(this.f1044l, this.f1045m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1043k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        C0110o c0110o = new C0110o(this.f1045m, 1);
        this.f1043k = 1;
        Object e3 = AbstractC2282w.e(new O0(this.f1044l, Q0.f20706a, c0110o, null), this);
        if (e3 != enumC0510a) {
            e3 = oVar;
        }
        return e3 == enumC0510a ? enumC0510a : oVar;
    }
}
