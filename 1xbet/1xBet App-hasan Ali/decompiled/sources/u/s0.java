package u;

import P.AbstractC0329z;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class s0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public float f19931k;

    /* renamed from: l, reason: collision with root package name */
    public int f19932l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0 f19934n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, a4.c cVar) {
        super(2, cVar);
        this.f19934n = t0Var;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        s0 s0Var = new s0(this.f19934n, cVar);
        s0Var.f19933m = obj;
        return s0Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        float i;
        InterfaceC2280u interfaceC2280u;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.f19932l;
        if (i5 == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u2 = (InterfaceC2280u) this.f19933m;
            i = AbstractC2453d.i(interfaceC2280u2.i());
            interfaceC2280u = interfaceC2280u2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f19931k;
            interfaceC2280u = (InterfaceC2280u) this.f19933m;
            G4.l.N(obj);
        }
        while (AbstractC2282w.o(interfaceC2280u)) {
            N.e eVar = new N.e(this.f19934n, i);
            this.f19933m = interfaceC2280u;
            this.f19931k = i;
            this.f19932l = 1;
            if (AbstractC0329z.q(getContext()).n(eVar, this) == enumC0510a) {
                return enumC0510a;
            }
        }
        return W3.o.f6046a;
    }
}
