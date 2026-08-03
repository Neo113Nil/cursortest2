package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1908lP implements com.facebook.ads.redexgen.core.LE {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final java.util.List<com.facebook.ads.redexgen.core.C2196qI> A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private java.util.List<com.facebook.ads.redexgen.core.C2196qI> A03(com.facebook.ads.redexgen.core.LD ld) {
        java.lang.String A022;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(ld.A03);
        java.util.List<com.facebook.ads.redexgen.core.C2196qI> list = this.A01;
        while (c04434v.A07() > 0) {
            int A0I = c04434v.A0I();
            int A09 = c04434v.A09() + c04434v.A0I();
            if (A0I == 134) {
                list = new java.util.ArrayList<>();
                int A0I2 = c04434v.A0I() & 31;
                for (int i2 = 0; i2 < A0I2; i2++) {
                    java.lang.String A0W = c04434v.A0W(3);
                    int A0I3 = c04434v.A0I();
                    boolean z = (A0I3 & 128) != 0;
                    if (z) {
                        A022 = A02(19, 19, 47);
                        i = A0I3 & 63;
                    } else {
                        A022 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte A0I4 = (byte) c04434v.A0I();
                    c04434v.A0g(1);
                    java.util.List<byte[]> list2 = null;
                    if (z) {
                        boolean z2 = (A0I4 & com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO) != 0;
                        if (A03[5].length() != 21) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        list2 = com.facebook.ads.redexgen.core.AnonymousClass46.A04(z2);
                    }
                    list.add(new com.facebook.ads.redexgen.core.C03872p().A11(A022).A10(A0W).A0Z(i).A12(list2).A14());
                }
            }
            c04434v.A0f(A09);
        }
        return list;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.EM, -38, 33, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, -39, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.CR, -39, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C1908lP() {
        this(0);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C1908lP(int i) {
        this(i, com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(new com.facebook.ads.redexgen.core.C2196qI[0]));
    }

    public C1908lP(int i, java.util.List<com.facebook.ads.redexgen.core.C2196qI> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private com.facebook.ads.redexgen.core.L9 A00(com.facebook.ads.redexgen.core.LD ld) {
        return new com.facebook.ads.redexgen.core.L9(A03(ld));
    }

    private com.facebook.ads.redexgen.core.LJ A01(com.facebook.ads.redexgen.core.LD ld) {
        return new com.facebook.ads.redexgen.core.LJ(A03(ld));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.LE
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.LH> A5Q() {
        return new android.util.SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.LE
    public final com.facebook.ads.redexgen.core.LH A5V(int i, com.facebook.ads.redexgen.core.LD ld) {
        switch (i) {
            case 2:
            case 128:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1905lM(A01(ld)));
            case 3:
            case 4:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1899lG(ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1909lQ(false, ld.A01));
            case 16:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1904lL(A01(ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1900lH(ld.A01));
            case 21:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1901lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1903lK(A00(ld), A05(1), A05(8)));
            case 36:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1902lJ(A00(ld)));
            case 89:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1906lN(ld.A02));
            case 129:
            case 135:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1915lW(ld.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.C1892l9(new com.facebook.ads.redexgen.core.C1898lF(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1912lT(ld.A01));
            case 257:
                return new com.facebook.ads.redexgen.core.C1892l9(new com.facebook.ads.redexgen.core.C1898lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new com.facebook.ads.redexgen.core.C1897lE(new com.facebook.ads.redexgen.core.C1907lO(ld.A01));
    }
}
