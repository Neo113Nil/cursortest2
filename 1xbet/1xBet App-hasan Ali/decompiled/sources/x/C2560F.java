package x;

import A0.C0022e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* renamed from: x.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2560F extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20626k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20628m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2560F(C2589k0 c2589k0, a4.c cVar) {
        super(2, cVar);
        this.f20628m = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2560F c2560f = new C2560F(this.f20628m, cVar);
        c2560f.f20627l = obj;
        return c2560f;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2560F) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20626k;
        if (i == 0) {
            G4.l.N(obj);
            t0.v vVar = (t0.v) this.f20627l;
            u0.c cVar = new u0.c();
            C2589k0 c2589k0 = this.f20628m;
            C2558D c2558d = new C2558D(c2589k0, vVar, new E.w0(4, c2589k0, cVar), new i0.K(13, cVar, c2589k0), new C2559E(c2589k0, 0), new C2559E(c2589k0, 1), new C0022e0(18, cVar, c2589k0), null);
            this.f20626k = 1;
            if (AbstractC2282w.e(c2558d, this) == enumC0510a) {
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
