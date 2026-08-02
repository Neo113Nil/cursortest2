package Q;

import I.C0160m;
import P.AbstractC0317t;
import P.C0280a;
import P.H0;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;
import r.C2322H;

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340e extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final C0340e f4826c = new C0340e(0, 2, 1);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        C0280a c0280a = (C0280a) c0160m.e(0);
        Object e3 = c0160m.e(1);
        if (e3 instanceof H0) {
            H0 h02 = (H0) e3;
            ((R.e) c02.f4906e).c(h02);
            ((C2322H) c02.f4905d).a(h02);
        }
        if (p02.f4377n != 0) {
            AbstractC0317t.c("Can only append a slot if not current inserting");
        }
        int i = p02.i;
        int i5 = p02.f4373j;
        int c5 = p02.c(c0280a);
        int g5 = p02.g(p02.f4367b, p02.r(c5 + 1));
        p02.i = g5;
        p02.f4373j = g5;
        p02.w(1, c5);
        if (i >= g5) {
            i++;
            i5++;
        }
        p02.f4368c[g5] = e3;
        p02.i = i;
        p02.f4373j = i5;
    }
}
