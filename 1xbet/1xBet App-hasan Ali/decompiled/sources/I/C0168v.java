package I;

import E.InterfaceC0104i0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import e2.C1930k;
import z0.AbstractC2749f;

/* renamed from: I.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168v extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2533k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1930k f2535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f2536n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168v(C1930k c1930k, InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(2, cVar);
        this.f2535m = c1930k;
        this.f2536n = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0168v c0168v = new C0168v(this.f2535m, this.f2536n, cVar);
        c0168v.f2534l = obj;
        return c0168v;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0168v) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2533k;
        if (i == 0) {
            G4.l.N(obj);
            t0.v vVar = (t0.v) this.f2534l;
            t0.H h3 = (t0.H) vVar;
            h3.getClass();
            C0167u c0167u = new C0167u(this.f2535m, new B.K(AbstractC2749f.v(h3).J), this.f2536n, null);
            this.f2533k = 1;
            if (v.r.b(vVar, c0167u, this) == enumC0510a) {
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
