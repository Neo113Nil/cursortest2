package B0;

import k1.C7459e;
import k1.C7460f;
import k1.C7461g;
import k1.C7465k;
import l1.C7784B;
import l1.C7807Z;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2498o1 {
    public static void a(@NotNull InterfaceC7802U interfaceC7802U, @NotNull Q1.K k11, long j11, long j12, @NotNull Q1.D d11, @NotNull K1.K k12, @NotNull C7784B c7784b, long j13) {
        K1.K k13;
        if (!K1.Q.e(j11)) {
            c7784b.b(j13);
            k13 = k12;
            b(interfaceC7802U, j11, d11, k13, c7784b);
        } else if (!K1.Q.e(j12)) {
            C7807Z m11 = C7807Z.m(k12.k().i().f());
            if (m11.w() == 16) {
                m11 = null;
            }
            long w11 = m11 != null ? m11.w() : C7807Z.f72248b;
            c7784b.b(C7807Z.o(C7807Z.q(w11) * 0.2f, w11));
            k13 = k12;
            b(interfaceC7802U, j12, d11, k13, c7784b);
        } else if (K1.Q.e(k11.e())) {
            k13 = k12;
        } else {
            c7784b.b(j13);
            k13 = k12;
            b(interfaceC7802U, k11.e(), d11, k13, c7784b);
        }
        K1.O.a(interfaceC7802U, k13);
    }

    private static void b(InterfaceC7802U interfaceC7802U, long j11, Q1.D d11, K1.K k11, C7784B c7784b) {
        int originalToTransformed = d11.originalToTransformed(K1.Q.h(j11));
        int originalToTransformed2 = d11.originalToTransformed(K1.Q.g(j11));
        if (originalToTransformed != originalToTransformed2) {
            interfaceC7802U.c(k11.y(originalToTransformed, originalToTransformed2), c7784b);
        }
    }

    public static void c(@NotNull Q1.K k11, @NotNull C2471f1 c2471f1, @NotNull K1.K k12, @NotNull B1.B b11, @NotNull Q1.V v11, boolean z11, @NotNull Q1.D d11) {
        long a11;
        C7460f c7460f;
        if (z11) {
            int originalToTransformed = d11.originalToTransformed(K1.Q.g(k11.e()));
            if (originalToTransformed < k12.k().j().length()) {
                c7460f = k12.d(originalToTransformed);
            } else if (originalToTransformed != 0) {
                c7460f = k12.d(originalToTransformed - 1);
            } else {
                a11 = C2501p1.a(c2471f1.i(), c2471f1.a(), c2471f1.b(), C2501p1.f1895a, 1);
                c7460f = new C7460f(0.0f, 0.0f, 1.0f, (int) (a11 & 4294967295L));
            }
            long y11 = b11.y(P9.a.a(c7460f.n(), c7460f.q()));
            v11.b(C7461g.a(P9.a.a(C7459e.g(y11), C7459e.h(y11)), C7465k.a(c7460f.u(), c7460f.m())));
        }
    }
}
