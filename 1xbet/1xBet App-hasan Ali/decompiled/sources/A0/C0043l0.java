package A0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.C2268h;
import r0.AbstractC2346c;

/* renamed from: A0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043l0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f529k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0046m0 f531m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043l0(C0046m0 c0046m0, a4.c cVar) {
        super(2, cVar);
        this.f531m = c0046m0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0043l0 c0043l0 = new C0043l0(this.f531m, cVar);
        c0043l0.f530l = obj;
        return c0043l0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((C0043l0) create((Z0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f529k;
        if (i == 0) {
            G4.l.N(obj);
            Z0 z02 = (Z0) this.f530l;
            this.f530l = z02;
            C0046m0 c0046m0 = this.f531m;
            this.f529k = 1;
            C2268h c2268h = new C2268h(1, AbstractC2346c.v(this));
            c2268h.r();
            P0.x xVar = c0046m0.f534l;
            P0.r rVar = xVar.f4682a;
            rVar.c();
            xVar.f4683b.set(new P0.C(xVar, rVar));
            c2268h.t(new C0028g0(3, z02, c0046m0));
            if (c2268h.q() == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        throw new D2.e();
    }
}
