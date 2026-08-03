package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HF {
    public static java.lang.String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c04434v.A0I() + 1;
            case 7:
                int A0M = c04434v.A0M();
                java.lang.String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new java.lang.RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return A0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HJ hj) throws java.io.IOException {
        interfaceC1987ms.AIl();
        boolean z = true;
        interfaceC1987ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC1987ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        interfaceC1987ms.A47(2);
        int i = z ? 7 : 6;
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(i);
        c04434v.A0e(com.facebook.ads.redexgen.core.HB.A00(interfaceC1987ms, c04434v.A0l(), 0, i));
        interfaceC1987ms.AIl();
        com.facebook.ads.redexgen.core.HE he = new com.facebook.ads.redexgen.core.HE();
        boolean isBlockSizeVariable = A08(c04434v, hj, z, he);
        if (isBlockSizeVariable) {
            return he.A00;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(null, null);
    }

    public static boolean A02(int i, com.facebook.ads.redexgen.core.HJ hj) {
        if (i == 0) {
            return true;
        }
        int i2 = hj.A01;
        if (A00[7].length() == 8) {
            throw new java.lang.RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i == i2;
    }

    public static boolean A03(int i, com.facebook.ads.redexgen.core.HJ hj) {
        if (i <= 7) {
            return i == hj.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new java.lang.RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i <= 10 && hj.A02 == 2;
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        int A0I = c04434v.A0I();
        int crc = c04434v.A09();
        return A0I == com.facebook.ads.redexgen.core.C5C.A0J(c04434v.A0l(), i, crc + (-1), 0);
    }

    public static boolean A05(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.HJ hj, int i) {
        int A002 = A00(c04434v, i);
        if (A002 != -1) {
            int blockSizeSamples = hj.A03;
            if (A002 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.HJ hj, int i) {
        int sampleRate = hj.A07;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == hj.A08;
        }
        if (i == 12) {
            return c04434v.A0I() * 1000 == sampleRate;
        }
        if (i > 14) {
            return false;
        }
        int expectedSampleRate = c04434v.A0M();
        if (i == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.HJ hj, int i, com.facebook.ads.redexgen.core.HE he) {
        int A09 = c04434v.A09();
        long A0Q = c04434v.A0Q();
        long frameHeaderBytes = A0Q >>> 16;
        if (frameHeaderBytes != i) {
            return false;
        }
        int blockSizeKey = (int) ((A0Q >> 8) & 15);
        long frameHeaderBytes2 = A0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((A0Q >> 4) & 15), hj) && A02(frameStartPosition, hj) && !(((A0Q & 1) > 1L ? 1 : ((A0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c04434v, hj, (((A0Q >>> 16) & 1) > 1L ? 1 : (((A0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, he) && A05(c04434v, hj, (int) ((A0Q >> 12) & 15)) && A06(c04434v, hj, blockSizeKey) && A04(c04434v, A09);
    }

    public static boolean A08(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.HJ hj, boolean z, com.facebook.ads.redexgen.core.HE he) {
        long utf8Value;
        try {
            long A0S = c04434v.A0S();
            if (z) {
                utf8Value = A0S;
            } else {
                long utf8Value2 = hj.A03;
                utf8Value = utf8Value2 * A0S;
            }
            he.A00 = utf8Value;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HJ hj, int i, com.facebook.ads.redexgen.core.HE he) throws java.io.IOException {
        long A8i = interfaceC1987ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC1987ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC1987ms.AIl();
            interfaceC1987ms.A47((int) (A8i - interfaceC1987ms.A8n()));
            return false;
        }
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(16);
        java.lang.System.arraycopy(bArr, 0, c04434v.A0l(), 0, 2);
        byte[] frameStartBytes = c04434v.A0l();
        c04434v.A0e(com.facebook.ads.redexgen.core.HB.A00(interfaceC1987ms, frameStartBytes, 2, 14));
        interfaceC1987ms.AIl();
        interfaceC1987ms.A47((int) (A8i - interfaceC1987ms.A8n()));
        return A07(c04434v, hj, i, he);
    }
}
