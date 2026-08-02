package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class KX {
    public static byte[] A02;
    public final List<C1830or> A00;
    public final H1[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public KX(List<C1830or> list) {
        this.A00 = list;
        this.A01 = new H1[list.size()];
    }

    public final void A02(long j, C4J c4j) {
        GR.A03(j, c4j, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(GY gy, C0545Ke c0545Ke) {
        for (int i = 0; i < i; i++) {
            c0545Ke.A05();
            H1 AJh = gy.AJh(c0545Ke.A03(), 3);
            C1830or c1830or = this.A00.get(i);
            String str = c1830or.A0W;
            C3M.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            C2D A11 = new C2D().A0y(c1830or.A0T != null ? c1830or.A0T : c0545Ke.A04()).A11(str);
            int i2 = c1830or.A0H;
            C2D A10 = A11.A0n(i2).A10(c1830or.A0V);
            int i3 = c1830or.A03;
            AJh.A6W(A10.A0Z(i3).A12(c1830or.A0X).A14());
            this.A01[i] = AJh;
        }
    }
}
