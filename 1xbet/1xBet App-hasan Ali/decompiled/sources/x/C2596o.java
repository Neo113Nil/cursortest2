package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2596o extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20834k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2600q f20835l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.d0 f20836m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.e f20837n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2596o(C2600q c2600q, v.d0 d0Var, i4.e eVar, a4.c cVar) {
        super(2, cVar);
        this.f20835l = c2600q;
        this.f20836m = d0Var;
        this.f20837n = eVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2596o(this.f20835l, this.f20836m, this.f20837n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2596o) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20834k;
        if (i == 0) {
            G4.l.N(obj);
            C2600q c2600q = this.f20835l;
            v.g0 g0Var = c2600q.f20850c;
            C2598p c2598p = c2600q.f20849b;
            C2594n c2594n = new C2594n(c2600q, this.f20837n, null);
            this.f20834k = 1;
            g0Var.getClass();
            if (AbstractC2282w.e(new v.f0(this.f20836m, g0Var, c2594n, c2598p, null), this) == enumC0510a) {
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
