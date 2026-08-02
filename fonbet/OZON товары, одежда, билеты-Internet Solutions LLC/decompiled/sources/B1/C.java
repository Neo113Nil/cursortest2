package B1;

import D1.AbstractC2810k0;
import k1.C7459e;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C {
    @NotNull
    public static final C7460f a(@NotNull B b11) {
        B w11 = b11.w();
        return w11 != null ? w11.K(b11, true) : new C7460f(0.0f, 0.0f, (int) (b11.a() >> 32), (int) (b11.a() & 4294967295L));
    }

    @NotNull
    public static final C7460f b(@NotNull B b11) {
        C7460f c7460f;
        B c11 = c(b11);
        float a11 = (int) (c11.a() >> 32);
        float a12 = (int) (c11.a() & 4294967295L);
        C7460f K11 = c(b11).K(b11, true);
        float n11 = K11.n();
        if (n11 < 0.0f) {
            n11 = 0.0f;
        }
        if (n11 > a11) {
            n11 = a11;
        }
        float q11 = K11.q();
        if (q11 < 0.0f) {
            q11 = 0.0f;
        }
        if (q11 > a12) {
            q11 = a12;
        }
        float o11 = K11.o();
        if (o11 < 0.0f) {
            o11 = 0.0f;
        }
        if (o11 <= a11) {
            a11 = o11;
        }
        float h11 = K11.h();
        float f7 = h11 >= 0.0f ? h11 : 0.0f;
        if (f7 <= a12) {
            a12 = f7;
        }
        if (n11 == a11 || q11 == a12) {
            c7460f = C7460f.f70279e;
            return c7460f;
        }
        long u11 = c11.u(P9.a.a(n11, q11));
        long u12 = c11.u(P9.a.a(a11, q11));
        long u13 = c11.u(P9.a.a(a11, a12));
        long u14 = c11.u(P9.a.a(n11, a12));
        float g10 = C7459e.g(u11);
        float g11 = C7459e.g(u12);
        float g12 = C7459e.g(u14);
        float g13 = C7459e.g(u13);
        float min = Math.min(g10, Math.min(g11, Math.min(g12, g13)));
        float max = Math.max(g10, Math.max(g11, Math.max(g12, g13)));
        float h12 = C7459e.h(u11);
        float h13 = C7459e.h(u12);
        float h14 = C7459e.h(u14);
        float h15 = C7459e.h(u13);
        return new C7460f(min, Math.min(h12, Math.min(h13, Math.min(h14, h15))), max, Math.max(h12, Math.max(h13, Math.max(h14, h15))));
    }

    @NotNull
    public static final B c(@NotNull B b11) {
        B b12;
        B w11 = b11.w();
        while (true) {
            B b13 = w11;
            b12 = b11;
            b11 = b13;
            if (b11 == null) {
                break;
            }
            w11 = b11.w();
        }
        AbstractC2810k0 abstractC2810k0 = b12 instanceof AbstractC2810k0 ? (AbstractC2810k0) b12 : null;
        if (abstractC2810k0 == null) {
            return b12;
        }
        AbstractC2810k0 g22 = abstractC2810k0.g2();
        while (true) {
            AbstractC2810k0 abstractC2810k02 = g22;
            AbstractC2810k0 abstractC2810k03 = abstractC2810k0;
            abstractC2810k0 = abstractC2810k02;
            if (abstractC2810k0 == null) {
                return abstractC2810k03;
            }
            g22 = abstractC2810k0.g2();
        }
    }
}
