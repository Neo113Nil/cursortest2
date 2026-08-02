package B0;

import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public final class d2 {
    public static int a(int i11, int i12) {
        if (i11 != 1) {
            if (i11 == 3) {
                return i12 == 32 ? 4 : 0;
            }
            if (i11 != 65534) {
                return 0;
            }
        }
        int i13 = m3.N.f74289a;
        return m3.N.C(i12, ByteOrder.LITTLE_ENDIAN);
    }

    public static void b(I7.a aVar, String str) {
        if (aVar == null) {
            throw new NullPointerException(str);
        }
    }
}
