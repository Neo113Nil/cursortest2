package E0;

import B0.R1;
import K1.C3433m;
import K1.H;
import android.graphics.PointF;
import androidx.compose.ui.platform.c2;
import k1.C7459e;
import k1.C7460f;

/* loaded from: classes8.dex */
public final class Z {
    public static final long a(long j11, CharSequence charSequence) {
        int i11 = K1.Q.f15010c;
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (4294967295L & j11);
        int codePointBefore = i12 > 0 ? Character.codePointBefore(charSequence, i12) : 10;
        int codePointAt = i13 < charSequence.length() ? Character.codePointAt(charSequence, i13) : 10;
        if (r(codePointBefore) && (q(codePointAt) || p(codePointAt))) {
            do {
                i12 -= Character.charCount(codePointBefore);
                if (i12 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, i12);
            } while (r(codePointBefore));
            return K1.S.a(i12, i13);
        }
        if (!r(codePointAt)) {
            return j11;
        }
        if (!q(codePointBefore) && !p(codePointBefore)) {
            return j11;
        }
        do {
            i13 += Character.charCount(codePointAt);
            if (i13 == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i13);
        } while (r(codePointAt));
        return K1.S.a(i12, i13);
    }

    public static final int b(B0.O0 o02, long j11, c2 c2Var) {
        K1.K e11;
        C3433m v11;
        R1 j12 = o02.j();
        if (j12 == null || (e11 = j12.e()) == null || (v11 = e11.v()) == null) {
            return -1;
        }
        return m(v11, j11, o02.i(), c2Var);
    }

    public static final int c(Z0 z02, long j11, c2 c2Var) {
        C3433m v11;
        K1.K f7 = z02.f();
        if (f7 == null || (v11 = f7.v()) == null) {
            return -1;
        }
        return m(v11, j11, z02.i(), c2Var);
    }

    public static final long d(K1.K k11, long j11, long j12, B1.B b11, c2 c2Var) {
        long j13;
        long j14;
        if (k11 == null || b11 == null) {
            j13 = K1.Q.f15009b;
            return j13;
        }
        long t2 = b11.t(j11);
        long t11 = b11.t(j12);
        int l11 = l(k11.v(), t2, c2Var);
        int l12 = l(k11.v(), t11, c2Var);
        if (l11 != -1) {
            if (l12 != -1) {
                l11 = Math.min(l11, l12);
            }
            l12 = l11;
        } else if (l12 == -1) {
            j14 = K1.Q.f15009b;
            return j14;
        }
        float l13 = (k11.l(l12) + k11.u(l12)) / 2;
        return k11.v().y(new C7460f(Math.min(C7459e.g(t2), C7459e.g(t11)), l13 - 0.1f, Math.max(C7459e.g(t2), C7459e.g(t11)), l13 + 0.1f), 0, H.a.a());
    }

    public static final long g(B0.O0 o02, C7460f c7460f, C7460f c7460f2, int i11, K1.G g10) {
        long j11;
        long j12;
        long n11 = n(o02, c7460f, i11, g10);
        if (K1.Q.e(n11)) {
            j12 = K1.Q.f15009b;
            return j12;
        }
        long n12 = n(o02, c7460f2, i11, g10);
        if (K1.Q.e(n12)) {
            j11 = K1.Q.f15009b;
            return j11;
        }
        int i12 = (int) (n11 >> 32);
        int i13 = (int) (n12 & 4294967295L);
        return K1.S.a(Math.min(i12, i12), Math.max(i13, i13));
    }

    public static final long h(Z0 z02, C7460f c7460f, C7460f c7460f2, int i11, K1.G g10) {
        long j11;
        long j12;
        long o11 = o(z02, c7460f, i11, g10);
        if (K1.Q.e(o11)) {
            j12 = K1.Q.f15009b;
            return j12;
        }
        long o12 = o(z02, c7460f2, i11, g10);
        if (K1.Q.e(o12)) {
            j11 = K1.Q.f15009b;
            return j11;
        }
        int i12 = (int) (o11 >> 32);
        int i13 = (int) (o12 & 4294967295L);
        return K1.S.a(Math.min(i12, i12), Math.max(i13, i13));
    }

    public static final boolean i(K1.K k11, int i11) {
        int p11 = k11.p(i11);
        if (i11 == k11.t(p11) || i11 == K1.K.o(k11, p11)) {
            if (k11.x(i11) == k11.c(i11)) {
                return false;
            }
        } else if (k11.c(i11) == k11.c(i11 - 1)) {
            return false;
        }
        return true;
    }

    public static final long j(int i11, CharSequence charSequence) {
        int i12 = i11;
        while (i12 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i12);
            if (!q(codePointBefore)) {
                break;
            }
            i12 -= Character.charCount(codePointBefore);
        }
        while (i11 < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i11);
            if (!q(codePointAt)) {
                break;
            }
            i11 += Character.charCount(codePointAt);
        }
        return K1.S.a(i12, i11);
    }

    public static final long k(PointF pointF) {
        return P9.a.a(pointF.x, pointF.y);
    }

    private static final int l(C3433m c3433m, long j11, c2 c2Var) {
        float c11 = c2Var != null ? c2Var.c() : 0.0f;
        int o11 = c3433m.o(C7459e.h(j11));
        if (C7459e.h(j11) < c3433m.s(o11) - c11 || C7459e.h(j11) > c3433m.k(o11) + c11 || C7459e.g(j11) < (-c11) || C7459e.g(j11) > c3433m.z() + c11) {
            return -1;
        }
        return o11;
    }

    private static final int m(C3433m c3433m, long j11, B1.B b11, c2 c2Var) {
        long t2;
        int l11;
        if (b11 == null || (l11 = l(c3433m, (t2 = b11.t(j11)), c2Var)) == -1) {
            return -1;
        }
        return c3433m.t(C7459e.b(t2, (c3433m.k(l11) + c3433m.s(l11)) / 2.0f, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(B0.O0 o02, C7460f c7460f, int i11, K1.G g10) {
        long j11;
        K1.K e11;
        R1 j12 = o02.j();
        C3433m v11 = (j12 == null || (e11 = j12.e()) == null) ? null : e11.v();
        B1.B i12 = o02.i();
        if (v11 != null && i12 != null) {
            return v11.y(c7460f.A(i12.t(0L)), i11, g10);
        }
        j11 = K1.Q.f15009b;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(Z0 z02, C7460f c7460f, int i11, K1.G g10) {
        long j11;
        K1.K f7 = z02.f();
        C3433m v11 = f7 != null ? f7.v() : null;
        B1.B i12 = z02.i();
        if (v11 != null && i12 != null) {
            return v11.y(c7460f.A(i12.t(0L)), i11, g10);
        }
        j11 = K1.Q.f15009b;
        return j11;
    }

    private static final boolean p(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean q(int i11) {
        return Character.isWhitespace(i11) || i11 == 160;
    }

    private static final boolean r(int i11) {
        int type;
        return (!q(i11) || (type = Character.getType(i11)) == 14 || type == 13 || i11 == 10) ? false : true;
    }
}
