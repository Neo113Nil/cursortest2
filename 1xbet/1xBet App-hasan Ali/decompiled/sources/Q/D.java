package Q;

import I.C0160m;
import P.AbstractC0317t;
import P.C0326x0;
import P.H0;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;

/* loaded from: classes.dex */
public final class D extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final D f4803c = new D(1, 0, 2);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        int d5 = c0160m.d(0);
        int i = p02.f4385v;
        int M5 = p02.M(p02.f4367b, p02.r(i));
        int g5 = p02.g(p02.f4367b, p02.r(i + 1));
        for (int max = Math.max(M5, g5 - d5); max < g5; max++) {
            Object obj = p02.f4368c[p02.h(max)];
            if (obj instanceof H0) {
                c02.d((H0) obj);
            } else if (obj instanceof C0326x0) {
                ((C0326x0) obj).d();
            }
        }
        if (!(d5 > 0)) {
            AbstractC0317t.c("Check failed");
        }
        int i5 = p02.f4385v;
        int M6 = p02.M(p02.f4367b, p02.r(i5));
        int g6 = p02.g(p02.f4367b, p02.r(i5 + 1)) - d5;
        if (g6 < M6) {
            AbstractC0317t.c("Check failed");
        }
        p02.I(g6, d5, i5);
        int i6 = p02.i;
        if (i6 >= M6) {
            p02.i = i6 - d5;
        }
    }
}
