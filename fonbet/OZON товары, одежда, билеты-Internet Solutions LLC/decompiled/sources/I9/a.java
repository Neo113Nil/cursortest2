package I9;

import o9.C8660b;

/* loaded from: classes9.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f12002a;

    /* renamed from: b, reason: collision with root package name */
    private j f12003b;

    /* renamed from: c, reason: collision with root package name */
    private g f12004c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12005d;

    a(C8660b c8660b) throws h9.h {
        int g10 = c8660b.g();
        if (g10 < 21 || (g10 & 3) != 1) {
            throw h9.h.a();
        }
        this.f12002a = c8660b;
    }

    private int a(int i11, int i12, int i13) {
        boolean z11 = this.f12005d;
        C8660b c8660b = this.f12002a;
        return z11 ? c8660b.d(i12, i11) : c8660b.d(i11, i12) ? (i13 << 1) | 1 : i13 << 1;
    }

    final void b() {
        int i11 = 0;
        while (true) {
            C8660b c8660b = this.f12002a;
            if (i11 >= c8660b.j()) {
                return;
            }
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < c8660b.g(); i13++) {
                if (c8660b.d(i11, i13) != c8660b.d(i13, i11)) {
                    c8660b.c(i13, i11);
                    c8660b.c(i11, i13);
                }
            }
            i11 = i12;
        }
    }

    final byte[] c() throws h9.h {
        g d11 = d();
        j e11 = e();
        c cVar = c.values()[d11.c()];
        C8660b c8660b = this.f12002a;
        int g10 = c8660b.g();
        cVar.getClass();
        for (int i11 = 0; i11 < g10; i11++) {
            for (int i12 = 0; i12 < g10; i12++) {
                if (cVar.a(i11, i12)) {
                    c8660b.c(i12, i11);
                }
            }
        }
        C8660b a11 = e11.a();
        byte[] bArr = new byte[e11.g()];
        int i13 = g10 - 1;
        boolean z11 = true;
        int i14 = i13;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 > 0) {
            if (i14 == 6) {
                i14--;
            }
            for (int i18 = 0; i18 < g10; i18++) {
                int i19 = z11 ? i13 - i18 : i18;
                for (int i21 = 0; i21 < 2; i21++) {
                    int i22 = i14 - i21;
                    if (!a11.d(i22, i19)) {
                        i16++;
                        i17 <<= 1;
                        if (c8660b.d(i22, i19)) {
                            i17 |= 1;
                        }
                        if (i16 == 8) {
                            bArr[i15] = (byte) i17;
                            i15++;
                            i16 = 0;
                            i17 = 0;
                        }
                    }
                }
            }
            z11 = !z11;
            i14 -= 2;
        }
        if (i15 == e11.g()) {
            return bArr;
        }
        throw h9.h.a();
    }

    final g d() throws h9.h {
        g gVar = this.f12004c;
        if (gVar != null) {
            return gVar;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 6; i13++) {
            i12 = a(i13, 8, i12);
        }
        int a11 = a(8, 7, a(8, 8, a(7, 8, i12)));
        for (int i14 = 5; i14 >= 0; i14--) {
            a11 = a(8, i14, a11);
        }
        int g10 = this.f12002a.g();
        int i15 = g10 - 7;
        for (int i16 = g10 - 1; i16 >= i15; i16--) {
            i11 = a(8, i16, i11);
        }
        for (int i17 = g10 - 8; i17 < g10; i17++) {
            i11 = a(i17, 8, i11);
        }
        g a12 = g.a(a11, i11);
        this.f12004c = a12;
        if (a12 != null) {
            return a12;
        }
        throw h9.h.a();
    }

    final j e() throws h9.h {
        j jVar = this.f12003b;
        if (jVar != null) {
            return jVar;
        }
        int g10 = this.f12002a.g();
        int i11 = (g10 - 17) / 4;
        if (i11 <= 6) {
            return j.h(i11);
        }
        int i12 = g10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = g10 - 9; i16 >= i12; i16--) {
                i14 = a(i16, i15, i14);
            }
        }
        j c11 = j.c(i14);
        if (c11 != null && c11.e() == g10) {
            this.f12003b = c11;
            return c11;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = g10 - 9; i18 >= i12; i18--) {
                i13 = a(i17, i18, i13);
            }
        }
        j c12 = j.c(i13);
        if (c12 == null || c12.e() != g10) {
            throw h9.h.a();
        }
        this.f12003b = c12;
        return c12;
    }

    final void f() {
        if (this.f12004c == null) {
            return;
        }
        c cVar = c.values()[this.f12004c.c()];
        C8660b c8660b = this.f12002a;
        int g10 = c8660b.g();
        cVar.getClass();
        for (int i11 = 0; i11 < g10; i11++) {
            for (int i12 = 0; i12 < g10; i12++) {
                if (cVar.a(i11, i12)) {
                    c8660b.c(i12, i11);
                }
            }
        }
    }

    final void g() {
        this.f12003b = null;
        this.f12004c = null;
        this.f12005d = true;
    }
}
