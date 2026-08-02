package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class EH {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1785o6 A01(EC ec, List<? extends EE>[] listArr) {
        C00731h c00731h = new C00731h();
        int i = 0;
        loop0: while (true) {
            boolean z = false;
            if (i >= ec.A02()) {
                C1667mA A06 = ec.A06();
                for (int i2 = 0; i2 < A06.A01; i2++) {
                    C1796oH A05 = A06.A05(i2);
                    int[] iArr = new int[A05.A01];
                    Arrays.fill(iArr, 0);
                    c00731h.A04(new C1786o7(A05, false, iArr, new boolean[A05.A01]));
                }
                return new C1785o6(c00731h.A05());
            }
            C1667mA A07 = ec.A07(i);
            List<? extends EE> list = listArr[i];
            int i3 = 0;
            while (i3 < A07.A01) {
                C1796oH A052 = A07.A05(i3);
                int A053 = ec.A05(i, i3, z);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z2 = A053 != 0;
                int[] iArr2 = new int[A052.A01];
                boolean[] zArr = new boolean[A052.A01];
                for (int i4 = 0; i4 < A052.A01; i4++) {
                    iArr2[i4] = ec.A04(i, i3, i4);
                    boolean z3 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i5 = 0;
                    while (true) {
                        if (i5 < list.size()) {
                            EE ee = list.get(i5);
                            if (ee.A9D().equals(A052) && ee.A9y(i4) != -1) {
                                z3 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    zArr[i4] = z3;
                }
                c00731h.A04(new C1786o7(A052, z2, iArr2, zArr));
                i3++;
                z = false;
            }
            i++;
        }
        throw new RuntimeException();
    }

    public static C1785o6 A00(EC ec, EE[] eeArr) {
        List A01;
        List[] listArr = new List[eeArr.length];
        for (int i = 0; i < eeArr.length; i++) {
            EE ee = eeArr[i];
            if (ee != null) {
                A01 = AbstractC0297Am.A04(ee);
            } else {
                A01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = A01;
        }
        return A01(ec, listArr);
    }
}
