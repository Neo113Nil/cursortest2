package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.C2268h;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class v0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public x4.c f19960k;

    /* renamed from: l, reason: collision with root package name */
    public C2452c0 f19961l;

    /* renamed from: m, reason: collision with root package name */
    public int f19962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19963n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(C2452c0 c2452c0, a4.c cVar) {
        super(2, cVar);
        this.f19963n = c2452c0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new v0(this.f19963n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [W3.e, java.lang.Object] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        x4.c cVar;
        C2452c0 c2452c0;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19962m;
        if (i == 0) {
            G4.l.N(obj);
            C2452c0 c2452c02 = this.f19963n;
            c2452c02.getClass();
            ((Z.s) y0.f19969a.getValue()).d(c2452c02, l0.f19860o, c2452c02.f19774g);
            cVar = c2452c02.f19776j;
            this.f19960k = cVar;
            this.f19961l = c2452c02;
            this.f19962m = 1;
            if (cVar.c(this) == enumC0510a) {
                return enumC0510a;
            }
            c2452c0 = c2452c02;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2452c0 = this.f19961l;
            cVar = this.f19960k;
            G4.l.N(obj);
        }
        try {
            c2452c0.f19772d = c2452c0.f();
            C2268h c2268h = c2452c0.i;
            if (c2268h != null) {
                c2268h.resumeWith(c2452c0.f());
            }
            c2452c0.i = null;
            cVar.d(null);
            return W3.o.f6046a;
        } catch (Throwable th) {
            cVar.d(null);
            throw th;
        }
    }
}
