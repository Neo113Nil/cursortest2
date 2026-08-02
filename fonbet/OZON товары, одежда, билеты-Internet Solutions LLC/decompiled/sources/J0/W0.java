package J0;

import S0.InterfaceC3967k;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W0 {
    private static final float a(long j11, float f7, long j12, long j13) {
        long f11 = C7811b0.f(C7807Z.o(f7, j11), j13);
        float h11 = C7811b0.h(C7811b0.f(j12, f11)) + 0.05f;
        float h12 = C7811b0.h(f11) + 0.05f;
        return Math.max(h11, h12) / Math.min(h11, h12);
    }

    @NotNull
    public static final I0.j1 b(@NotNull C3339s c3339s, InterfaceC3967k interfaceC3967k) {
        long h11 = c3339s.h();
        long a11 = c3339s.a();
        interfaceC3967k.o(1102762072);
        long a12 = C3343t.a(c3339s, a11);
        if (a12 == 16) {
            a12 = ((C7807Z) interfaceC3967k.m(C3363y.a())).w();
        }
        interfaceC3967k.k();
        long o11 = C7807Z.o(Bl0.k0.r(interfaceC3967k), a12);
        boolean s11 = interfaceC3967k.s(h11) | interfaceC3967k.s(a11) | interfaceC3967k.s(o11);
        Object C11 = interfaceC3967k.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            long h12 = c3339s.h();
            float a13 = a(h11, 0.4f, o11, a11);
            float a14 = a(h11, 0.2f, o11, a11);
            float f7 = 0.4f;
            if (a13 < 4.5f) {
                if (a14 < 4.5f) {
                    f7 = 0.2f;
                } else {
                    float f11 = 0.4f;
                    float f12 = 0.2f;
                    float f13 = 0.4f;
                    for (int i11 = 0; i11 < 7; i11++) {
                        float a15 = (a(h11, f13, o11, a11) / 4.5f) - 1.0f;
                        if (0.0f <= a15 && a15 <= 0.01f) {
                            break;
                        }
                        if (a15 < 0.0f) {
                            f11 = f13;
                        } else {
                            f12 = f13;
                        }
                        f13 = (f11 + f12) / 2.0f;
                    }
                    f7 = f13;
                }
            }
            C11 = new I0.j1(h12, C7807Z.o(f7, h11));
            interfaceC3967k.x(C11);
        }
        return (I0.j1) C11;
    }
}
