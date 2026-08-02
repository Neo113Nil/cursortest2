package O7;

import Hj0.C3147d;
import Qi.C3878b;
import Ui.C4069c;
import WZ.t;
import WZ.x;
import java.util.Arrays;
import java.util.Map;
import je.C7373c0;
import je.K0;
import kotlin.jvm.internal.Intrinsics;
import m3.C8050C;
import zi.C11125b;

/* loaded from: classes9.dex */
public final class h implements Ib.b {
    public static final K0 a(K0 k02) {
        return C7373c0.a(k02, false);
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(int i11, int i12, byte[] bArr) {
        while (i11 < i12 && bArr[i11] != 71) {
            i11++;
        }
        return i11;
    }

    public static int d(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static void e(C11125b c11125b, C3878b c3878b) {
        c11125b.f109069c = c3878b;
    }

    public static void f(C11125b c11125b, Oi.b bVar) {
        c11125b.f109068b = bVar;
    }

    public static void g(C4069c c4069c, Ti.i iVar) {
        c4069c.f27741j = iVar;
    }

    public static void h(C11125b c11125b, Ti.i iVar) {
        c11125b.f109067a = iVar;
    }

    public static void i(C4069c c4069c, C3147d c3147d) {
        c4069c.f27740i = c3147d;
    }

    public static boolean j(int i11, byte[] bArr, int i12, int i13) {
        int i14 = 0;
        for (int i15 = -4; i15 <= 4; i15++) {
            int i16 = (i15 * 188) + i13;
            if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                i14 = 0;
            } else {
                i14++;
                if (i14 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static t k(Map map, Long l11) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return x.b(map, l11, null);
    }

    public static long l(C8050C c8050c, int i11, int i12) {
        c8050c.R(i11);
        if (c8050c.a() < 5) {
            return -9223372036854775807L;
        }
        int p11 = c8050c.p();
        if ((8388608 & p11) != 0 || ((2096896 & p11) >> 8) != i12 || (p11 & 32) == 0 || c8050c.E() < 7 || c8050c.a() < 7 || (c8050c.E() & 16) != 16) {
            return -9223372036854775807L;
        }
        c8050c.n(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static int m(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }
}
