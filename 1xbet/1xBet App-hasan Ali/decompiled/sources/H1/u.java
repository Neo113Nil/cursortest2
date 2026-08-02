package H1;

import G1.C0140k;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.C2444O;
import u.C2452c0;
import u.Z;
import u.t0;

/* loaded from: classes.dex */
public final class u extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2247k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f2248l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f2249m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0140k f2250n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(float f, C2452c0 c2452c0, C0140k c0140k, a4.c cVar) {
        super(2, cVar);
        this.f2248l = f;
        this.f2249m = c2452c0;
        this.f2250n = c0140k;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new u(this.f2248l, this.f2249m, this.f2250n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r3.t(r5, r3.f19770b.getValue(), r8) == r0) goto L29;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a5;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2247k;
        W3.o oVar = W3.o.f6046a;
        C2452c0 c2452c0 = this.f2249m;
        float f = this.f2248l;
        if (i == 0) {
            G4.l.N(obj);
            if (f > 0.0f) {
                this.f2247k = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                return oVar;
            }
            G4.l.N(obj);
        }
        if (f == 0.0f) {
            this.f2247k = 2;
            t0 t0Var = c2452c0.f19773e;
            if (t0Var != null) {
                Object value = c2452c0.f19771c.getValue();
                C0140k c0140k = this.f2250n;
                if (!kotlin.jvm.internal.l.a(value, c0140k) || !kotlin.jvm.internal.l.a(c2452c0.f19770b.getValue(), c0140k)) {
                    a5 = C2444O.a(c2452c0.f19777k, new Z(null, c0140k, c2452c0, t0Var), this);
                }
            }
            a5 = oVar;
            if (a5 == enumC0510a) {
                return enumC0510a;
            }
        }
        return oVar;
    }
}
