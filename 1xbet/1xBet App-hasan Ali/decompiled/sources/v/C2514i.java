package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import x.A0;
import x.C2566L;
import x.Q0;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2514i extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20249k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20250l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2503A f20251m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2514i(C2503A c2503a, a4.c cVar) {
        super(2, cVar);
        this.f20251m = c2503a;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2514i c2514i = new C2514i(this.f20251m, cVar);
        c2514i.f20250l = obj;
        return c2514i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2514i) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20249k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        t0.v vVar = (t0.v) this.f20250l;
        this.f20249k = 1;
        C2503A c2503a = this.f20251m;
        c2503a.getClass();
        C2530z c2530z = new C2530z(c2503a, null);
        t0.F f = new t0.F(2, c2503a);
        C2566L c2566l = Q0.f20706a;
        Object e3 = AbstractC2282w.e(new A0(vVar, c2530z, f, new x.T(vVar), null), this);
        if (e3 != enumC0510a) {
            e3 = oVar;
        }
        if (e3 != enumC0510a) {
            e3 = oVar;
        }
        return e3 == enumC0510a ? enumC0510a : oVar;
    }
}
