package E;

import A0.C0013b0;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import x.C2566L;
import x.Q0;
import y.C2654j;

/* loaded from: classes.dex */
public final class v0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1351k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2280u f1353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f1354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2654j f1355o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f1356p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(InterfaceC2280u interfaceC2280u, InterfaceC0289e0 interfaceC0289e0, C2654j c2654j, InterfaceC0289e0 interfaceC0289e02, a4.c cVar) {
        super(2, cVar);
        this.f1353m = interfaceC2280u;
        this.f1354n = interfaceC0289e0;
        this.f1355o = c2654j;
        this.f1356p = interfaceC0289e02;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        v0 v0Var = new v0(this.f1353m, this.f1354n, this.f1355o, this.f1356p, cVar);
        v0Var.f1352l = obj;
        return v0Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1351k;
        W3.o oVar = W3.o.f6046a;
        if (i == 0) {
            G4.l.N(obj);
            t0.v vVar = (t0.v) this.f1352l;
            u0 u0Var = new u0(this.f1353m, this.f1354n, this.f1355o, null);
            C0013b0 c0013b0 = new C0013b0(1, this.f1356p);
            this.f1351k = 1;
            C2566L c2566l = Q0.f20706a;
            Object e3 = AbstractC2282w.e(new x.A0(vVar, u0Var, c0013b0, new x.T(vVar), null), this);
            if (e3 != enumC0510a) {
                e3 = oVar;
            }
            if (e3 == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return oVar;
    }
}
