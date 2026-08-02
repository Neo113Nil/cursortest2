package I0;

import B0.C2471f1;
import B0.EnumC2526y0;
import B0.R1;
import I0.X0;
import K1.C3422b;
import S0.InterfaceC3978p0;
import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class d1 extends AbstractC7737t implements Function0<C7459e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W0 f11481b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.q> f11482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d1(W0 w02, InterfaceC3978p0<Z1.q> interfaceC3978p0) {
        super(0);
        this.f11481b = w02;
        this.f11482c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7459e invoke() {
        long j11;
        long j12;
        R1 j13;
        B0.O0 H11;
        C2471f1 v11;
        C3422b j14;
        long e11 = this.f11482c.getValue().e();
        W0 w02 = this.f11481b;
        C7459e w11 = w02.w();
        if (w11 != null) {
            long n11 = w11.n();
            C3422b J11 = w02.J();
            if (J11 != null && J11.length() != 0) {
                EnumC2526y0 y11 = w02.y();
                int i11 = y11 == null ? -1 : X0.d.f11427a[y11.ordinal()];
                if (i11 != -1) {
                    if (i11 == 1 || i11 == 2) {
                        long e12 = w02.K().e();
                        int i12 = K1.Q.f15010c;
                        j12 = e12 >> 32;
                    } else {
                        if (i11 != 3) {
                            throw new Sc.o();
                        }
                        long e13 = w02.K().e();
                        int i13 = K1.Q.f15010c;
                        j12 = e13 & 4294967295L;
                    }
                    int i14 = (int) j12;
                    B0.O0 H12 = w02.H();
                    if (H12 != null && (j13 = H12.j()) != null && (H11 = w02.H()) != null && (v11 = H11.v()) != null && (j14 = v11.j()) != null) {
                        int e14 = kotlin.ranges.h.e(w02.F().originalToTransformed(i14), 0, j14.length());
                        float g10 = C7459e.g(j13.i(n11));
                        K1.K e15 = j13.e();
                        int p11 = e15.p(e14);
                        float r11 = e15.r(p11);
                        float s11 = e15.s(p11);
                        float d11 = kotlin.ranges.h.d(g10, Math.min(r11, s11), Math.max(r11, s11));
                        if (Z1.q.c(e11, 0L) || Math.abs(g10 - d11) <= ((int) (e11 >> 32)) / 2) {
                            float u11 = e15.u(p11);
                            j11 = P9.a.a(d11, ((e15.l(p11) - u11) / 2) + u11);
                            return C7459e.a(j11);
                        }
                    }
                }
            }
        }
        j11 = 9205357640488583168L;
        return C7459e.a(j11);
    }
}
