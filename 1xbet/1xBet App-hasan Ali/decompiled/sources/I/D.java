package I;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;
import p4.InterfaceC2280u;
import u.C2451c;
import u.C2456e0;

/* loaded from: classes.dex */
public final class D extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2391k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2451c f2392l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2393m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C2451c c2451c, long j5, a4.c cVar) {
        super(2, cVar);
        this.f2392l = c2451c;
        this.f2393m = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new D(this.f2392l, this.f2393m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2391k;
        if (i == 0) {
            G4.l.N(obj);
            C1988b c1988b = new C1988b(this.f2393m);
            C2456e0 c2456e0 = G.f2404d;
            this.f2391k = 1;
            if (C2451c.c(this.f2392l, c1988b, c2456e0, null, this, 12) == enumC0510a) {
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
