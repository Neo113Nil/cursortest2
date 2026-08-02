package N;

import P.C0301k0;
import P.C0305m0;
import P.InterfaceC0289e0;
import P.S0;
import a.AbstractC0444a;
import h0.C1991e;
import k4.AbstractC2036a;
import u.t0;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3677l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f3678m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3679n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f, InterfaceC0289e0 interfaceC0289e0) {
        super(1);
        this.f3678m = f;
        this.f3679n = interfaceC0289e0;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f3677l) {
            case 0:
                long j5 = ((C1991e) obj).f17204a;
                float d5 = C1991e.d(j5);
                float f = this.f3678m;
                float f5 = d5 * f;
                float b3 = C1991e.b(j5) * f;
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) this.f3679n;
                if (C1991e.d(((C1991e) interfaceC0289e0.getValue()).f17204a) != f5 || C1991e.b(((C1991e) interfaceC0289e0.getValue()).f17204a) != b3) {
                    interfaceC0289e0.setValue(new C1991e(AbstractC0444a.d(f5, b3)));
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                t0 t0Var = (t0) this.f3679n;
                if (!t0Var.g()) {
                    C0301k0 c0301k0 = t0Var.f19942g;
                    if (((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c == Long.MIN_VALUE) {
                        c0301k0.h(longValue);
                        ((C0305m0) t0Var.f19937a.f2693a).setValue(Boolean.TRUE);
                    }
                    long j6 = longValue - ((S0) Z.l.u(c0301k0.f4479l, c0301k0)).f4395c;
                    float f6 = this.f3678m;
                    if (f6 != 0.0f) {
                        j6 = AbstractC2036a.V(j6 / f6);
                    }
                    t0Var.o(j6);
                    t0Var.h(j6, f6 == 0.0f);
                }
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t0 t0Var, float f) {
        super(1);
        this.f3679n = t0Var;
        this.f3678m = f;
    }
}
