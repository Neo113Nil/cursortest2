package H1;

import A0.C0019d0;
import G1.C0140k;
import P.C0297i0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.AbstractC2453d;
import u.C2444O;
import u.C2452c0;
import u.U;
import u.t0;
import u.z0;

/* loaded from: classes.dex */
public final class v extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2251k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f2253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0140k f2254n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t0 f2255o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C2452c0 c2452c0, C0140k c0140k, t0 t0Var, a4.c cVar) {
        super(2, cVar);
        this.f2253m = c2452c0;
        this.f2254n = c0140k;
        this.f2255o = t0Var;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        v vVar = new v(this.f2253m, this.f2254n, this.f2255o, cVar);
        vVar.f2252l = obj;
        return vVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r0 == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2251k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i == 1) {
                G4.l.N(obj);
                return oVar;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f2252l;
        C2452c0 c2452c0 = this.f2253m;
        Object value = c2452c0.f19771c.getValue();
        C0140k c0140k = this.f2254n;
        if (!kotlin.jvm.internal.l.a(value, c0140k)) {
            this.f2251k = 1;
            t0 t0Var = c2452c0.f19773e;
            if (t0Var != null) {
                obj2 = C2444O.a(c2452c0.f19777k, new U(null, c0140k, c2452c0, t0Var), this);
            }
            obj2 = oVar;
            return obj2 == enumC0510a ? enumC0510a : oVar;
        }
        long longValue = ((Number) this.f2255o.f19946l.getValue()).longValue() / 1000000;
        C0297i0 c0297i0 = c2452c0.f19775h;
        float h3 = c0297i0.h();
        z0 m5 = AbstractC2453d.m((int) (c0297i0.h() * longValue), 6, null);
        C0019d0 c0019d0 = new C0019d0(interfaceC2280u, c2452c0, c0140k, 4);
        this.f2251k = 2;
        if (AbstractC2453d.c(h3, 0.0f, m5, c0019d0, this, 4) == enumC0510a) {
        }
    }
}
