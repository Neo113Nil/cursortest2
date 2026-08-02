package N3;

import m3.C8050C;

/* renamed from: N3.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3655f {
    public static void a(long j11, C8050C c8050c, M[] mArr) {
        int i11;
        while (true) {
            if (c8050c.a() <= 1) {
                return;
            }
            int i12 = 0;
            while (true) {
                if (c8050c.a() == 0) {
                    i11 = -1;
                    break;
                }
                int E11 = c8050c.E();
                i12 += E11;
                if (E11 != 255) {
                    i11 = i12;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (c8050c.a() == 0) {
                    i13 = -1;
                    break;
                }
                int E12 = c8050c.E();
                i13 += E12;
                if (E12 != 255) {
                    break;
                }
            }
            int f7 = c8050c.f() + i13;
            if (i13 == -1 || i13 > c8050c.a()) {
                m3.s.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                f7 = c8050c.i();
            } else if (i11 == 4 && i13 >= 8) {
                int E13 = c8050c.E();
                int L11 = c8050c.L();
                int p11 = L11 == 49 ? c8050c.p() : 0;
                int E14 = c8050c.E();
                if (L11 == 47) {
                    c8050c.S(1);
                }
                boolean z11 = E13 == 181 && (L11 == 49 || L11 == 47) && E14 == 3;
                if (L11 == 49) {
                    z11 &= p11 == 1195456820;
                }
                if (z11) {
                    b(j11, c8050c, mArr);
                }
            }
            c8050c.R(f7);
        }
    }

    public static void b(long j11, C8050C c8050c, M[] mArr) {
        int E11 = c8050c.E();
        if ((E11 & 64) != 0) {
            c8050c.S(1);
            int i11 = (E11 & 31) * 3;
            int f7 = c8050c.f();
            for (M m11 : mArr) {
                c8050c.R(f7);
                m11.e(i11, c8050c);
                G10.a.h(j11 != -9223372036854775807L);
                m11.b(j11, 1, i11, 0, null);
            }
        }
    }
}
