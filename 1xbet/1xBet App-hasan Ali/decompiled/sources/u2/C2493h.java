package u2;

import P.AbstractC0329z;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import s4.AbstractC2377n;
import s4.C2376m;

/* renamed from: u2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2493h extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19997k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2497l f19998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2493h(C2497l c2497l, a4.c cVar) {
        super(2, cVar);
        this.f19998l = c2497l;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2493h(this.f19998l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2493h) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19997k;
        if (i == 0) {
            G4.l.N(obj);
            C2497l c2497l = this.f19998l;
            C2496k z3 = AbstractC0329z.z(new O3.l(13, c2497l));
            C2491f c2491f = new C2491f(c2497l, null);
            int i5 = AbstractC2377n.f19289a;
            t4.n nVar = new t4.n(new C2376m(c2491f, null), z3, a4.i.f6649k, -2, r4.a.f19106k);
            C2492g c2492g = new C2492g(c2497l);
            this.f19997k = 1;
            if (nVar.a(c2492g, this) == enumC0510a) {
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
