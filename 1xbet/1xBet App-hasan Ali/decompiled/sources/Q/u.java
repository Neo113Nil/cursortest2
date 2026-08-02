package Q;

import I.C0160m;
import P.AbstractC0317t;
import P.C0280a;
import P.InterfaceC0284c;
import P.O0;
import P.P0;
import Q2.C0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final u f4845c = new u(1, 0, 2);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        C0280a c0280a;
        int c5;
        int d5 = c0160m.d(0);
        if (p02.f4377n != 0) {
            AbstractC0317t.c("Cannot move a group while inserting");
        }
        boolean z3 = true;
        if (!(d5 >= 0)) {
            AbstractC0317t.c("Parameter offset is out of bounds");
        }
        if (d5 == 0) {
            return;
        }
        int i = p02.f4383t;
        int i5 = p02.f4385v;
        int i6 = p02.f4384u;
        int i7 = i;
        while (d5 > 0) {
            i7 += p02.f4367b[(p02.r(i7) * 5) + 3];
            if (i7 > i6) {
                AbstractC0317t.c("Parameter offset is out of bounds");
            }
            d5--;
        }
        int i8 = p02.f4367b[(p02.r(i7) * 5) + 3];
        int g5 = p02.g(p02.f4367b, p02.r(p02.f4383t));
        int g6 = p02.g(p02.f4367b, p02.r(i7));
        int i9 = i7 + i8;
        int g7 = p02.g(p02.f4367b, p02.r(i9));
        int i10 = g7 - g6;
        p02.w(i10, Math.max(p02.f4383t - 1, 0));
        p02.v(i8);
        int[] iArr = p02.f4367b;
        int r5 = p02.r(i9) * 5;
        X3.l.s0(p02.r(i) * 5, r5, (i8 * 5) + r5, iArr, iArr);
        if (i10 > 0) {
            Object[] objArr = p02.f4368c;
            int h3 = p02.h(g6 + i10);
            System.arraycopy(objArr, h3, objArr, g5, p02.h(g7 + i10) - h3);
        }
        int i11 = g6 + i10;
        int i12 = i11 - g5;
        int i13 = p02.f4374k;
        int i14 = p02.f4375l;
        int length = p02.f4368c.length;
        int i15 = p02.f4376m;
        int i16 = i + i8;
        int i17 = i;
        while (i17 < i16) {
            boolean z5 = z3;
            int r6 = p02.r(i17);
            int i18 = i17;
            iArr[(r6 * 5) + 4] = P0.i(P0.i(p02.g(iArr, r6) - i12, i15 < r6 ? 0 : i13, i14, length), p02.f4374k, p02.f4375l, p02.f4368c.length);
            i17 = i18 + 1;
            z3 = z5;
            i12 = i12;
            i13 = i13;
        }
        int i19 = i9 + i8;
        int p5 = p02.p();
        int b3 = O0.b(p02.f4369d, i9, p5);
        ArrayList arrayList = new ArrayList();
        if (b3 >= 0) {
            while (b3 < p02.f4369d.size() && (c5 = p02.c((c0280a = (C0280a) p02.f4369d.get(b3)))) >= i9 && c5 < i19) {
                arrayList.add(c0280a);
            }
        }
        int i20 = i - i9;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            C0280a c0280a2 = (C0280a) arrayList.get(i21);
            int c6 = p02.c(c0280a2) + i20;
            if (c6 >= p02.f4371g) {
                c0280a2.f4439a = -(p5 - c6);
            } else {
                c0280a2.f4439a = c6;
            }
            p02.f4369d.add(O0.b(p02.f4369d, c6, p5), c0280a2);
        }
        if (p02.H(i9, i8)) {
            AbstractC0317t.c("Unexpectedly removed anchors");
        }
        p02.m(i5, p02.f4384u, i);
        if (i10 > 0) {
            p02.I(i11, i10, i9 - 1);
        }
    }
}
