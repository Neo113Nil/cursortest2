package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0682Et {
    public static java.lang.String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C2151pY A01(com.facebook.ads.redexgen.core.C0677Eo c0677Eo, java.util.List<? extends com.facebook.ads.redexgen.core.InterfaceC0679Eq>[] listArr) {
        com.facebook.ads.redexgen.core.C2K c2k = new com.facebook.ads.redexgen.core.C2K();
        int i = 0;
        loop0: while (true) {
            boolean z = false;
            if (i >= c0677Eo.A02()) {
                com.facebook.ads.redexgen.core.C2026nW A06 = c0677Eo.A06();
                for (int i2 = 0; i2 < A06.A01; i2++) {
                    com.facebook.ads.redexgen.core.C2159pg A05 = A06.A05(i2);
                    int[] iArr = new int[A05.A01];
                    java.util.Arrays.fill(iArr, 0);
                    c2k.A04(new com.facebook.ads.redexgen.core.C2152pZ(A05, false, iArr, new boolean[A05.A01]));
                }
                return new com.facebook.ads.redexgen.core.C2151pY(c2k.A05());
            }
            com.facebook.ads.redexgen.core.C2026nW A07 = c0677Eo.A07(i);
            java.util.List<? extends com.facebook.ads.redexgen.core.InterfaceC0679Eq> list = listArr[i];
            int i3 = 0;
            while (i3 < A07.A01) {
                com.facebook.ads.redexgen.core.C2159pg A052 = A07.A05(i3);
                int A053 = c0677Eo.A05(i, i3, z);
                java.lang.String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                java.lang.String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z2 = A053 != 0;
                int[] iArr2 = new int[A052.A01];
                boolean[] zArr = new boolean[A052.A01];
                for (int i4 = 0; i4 < A052.A01; i4++) {
                    iArr2[i4] = c0677Eo.A04(i, i3, i4);
                    boolean z3 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    java.lang.String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i5 = 0;
                    while (true) {
                        if (i5 < list.size()) {
                            com.facebook.ads.redexgen.core.InterfaceC0679Eq interfaceC0679Eq = list.get(i5);
                            if (interfaceC0679Eq.A9L().equals(A052) && interfaceC0679Eq.AA6(i4) != -1) {
                                z3 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    zArr[i4] = z3;
                }
                c2k.A04(new com.facebook.ads.redexgen.core.C2152pZ(A052, z2, iArr2, zArr));
                i3++;
                z = false;
            }
            i++;
        }
        throw new java.lang.RuntimeException();
    }

    public static com.facebook.ads.redexgen.core.C2151pY A00(com.facebook.ads.redexgen.core.C0677Eo c0677Eo, com.facebook.ads.redexgen.core.InterfaceC0679Eq[] interfaceC0679EqArr) {
        java.util.List A01;
        java.util.List[] listArr = new java.util.List[interfaceC0679EqArr.length];
        for (int i = 0; i < interfaceC0679EqArr.length; i++) {
            com.facebook.ads.redexgen.core.InterfaceC0679Eq interfaceC0679Eq = interfaceC0679EqArr[i];
            if (interfaceC0679Eq != null) {
                A01 = com.facebook.ads.redexgen.core.BP.A04(interfaceC0679Eq);
            } else {
                A01 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = A01;
        }
        return A01(c0677Eo, listArr);
    }
}
