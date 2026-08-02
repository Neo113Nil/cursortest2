package t;

import P.AbstractC0329z;
import P.C0318t0;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import u.t0;
import u2.C2496k;

/* loaded from: classes.dex */
public final class p extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19400k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t0 f19402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f19403n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t0 t0Var, InterfaceC0289e0 interfaceC0289e0, a4.c cVar) {
        super(2, cVar);
        this.f19402m = t0Var;
        this.f19403n = interfaceC0289e0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        p pVar = new p(this.f19402m, this.f19403n, cVar);
        pVar.f19401l = obj;
        return pVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((C0318t0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19400k;
        if (i == 0) {
            G4.l.N(obj);
            C0318t0 c0318t0 = (C0318t0) this.f19401l;
            t0 t0Var = this.f19402m;
            C2496k z3 = AbstractC0329z.z(new o(t0Var, 0));
            H1.q qVar = new H1.q(c0318t0, t0Var, this.f19403n);
            this.f19400k = 1;
            if (z3.a(qVar, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
