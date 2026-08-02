package Q;

import I.C0160m;
import P.AbstractC0317t;
import P.C0280a;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;

/* renamed from: Q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345j extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final C0345j f4831c = new C0345j(0, 2, 1);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        int i;
        X.f fVar = (X.f) c0160m.e(0);
        int c5 = p02.c((C0280a) c0160m.e(1));
        if (!(p02.f4383t < c5)) {
            AbstractC0317t.c("Check failed");
        }
        G4.l.I(p02, interfaceC0284c, c5);
        int i5 = p02.f4383t;
        int i6 = p02.f4385v;
        while (i6 >= 0 && !p02.x(i6)) {
            i6 = p02.D(p02.f4367b, i6);
        }
        int i7 = i6 + 1;
        int i8 = 0;
        while (i7 < i5) {
            if (p02.u(i5, i7)) {
                if (p02.x(i7)) {
                    i8 = 0;
                }
                i7++;
            } else {
                i8 += p02.x(i7) ? 1 : p02.f4367b[(p02.r(i7) * 5) + 1] & 67108863;
                i7 += p02.t(i7);
            }
        }
        while (true) {
            i = p02.f4383t;
            if (i >= c5) {
                break;
            }
            if (p02.u(c5, i)) {
                int i9 = p02.f4383t;
                if (i9 < p02.f4384u && (p02.f4367b[(p02.r(i9) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0284c.c(p02.C(p02.f4383t));
                    i8 = 0;
                }
                p02.O();
            } else {
                i8 += p02.K();
            }
        }
        if (i != c5) {
            AbstractC0317t.c("Check failed");
        }
        fVar.f6057a = i8;
    }
}
