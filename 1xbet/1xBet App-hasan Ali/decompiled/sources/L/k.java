package L;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.AbstractC2453d;
import u.AbstractC2478z;
import u.C2451c;
import u.z0;

/* loaded from: classes.dex */
public final class k extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2946k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f2947l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, a4.c cVar) {
        super(2, cVar);
        this.f2947l = pVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new k(this.f2947l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2946k;
        if (i == 0) {
            G4.l.N(obj);
            C2451c c2451c = this.f2947l.f2961g;
            Float f = new Float(1.0f);
            z0 m5 = AbstractC2453d.m(225, 2, AbstractC2478z.f19970a);
            this.f2946k = 1;
            if (C2451c.c(c2451c, f, m5, null, this, 12) == enumC0510a) {
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
