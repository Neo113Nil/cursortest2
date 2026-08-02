package O0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.InterfaceC3999a;
import l1.C7807Z;
import m0.G;
import m0.T0;
import org.jetbrains.annotations.NotNull;
import t0.C9713b;
import t0.C9717f;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final T0<Float> f19806a = new T0<>(15, G.b(), 2);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19807b = 0;

    public static final T0 a(t0.n nVar) {
        if ((nVar instanceof t0.j) || (!(nVar instanceof C9717f) && !(nVar instanceof C9713b))) {
            return f19806a;
        }
        return new T0(45, G.b(), 2);
    }

    public static final T0 b(t0.n nVar) {
        boolean z11 = nVar instanceof t0.j;
        T0<Float> t02 = f19806a;
        return (z11 || (nVar instanceof C9717f) || !(nVar instanceof C9713b)) ? t02 : new T0(150, G.b(), 2);
    }

    @InterfaceC3999a
    @NotNull
    public static final f c(boolean z11, float f7, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        InterfaceC3978p0 l11 = n1.l(C7807Z.m(j11), interfaceC3967k);
        boolean z12 = true;
        boolean z13 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.p(z11)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !interfaceC3967k.q(f7)) && (i11 & 48) != 32) {
            z12 = false;
        }
        boolean z14 = z13 | z12;
        Object C11 = interfaceC3967k.C();
        if (z14 || C11 == InterfaceC3967k.a.a()) {
            C11 = new f(z11, f7, l11);
            interfaceC3967k.x(C11);
        }
        return (f) C11;
    }
}
