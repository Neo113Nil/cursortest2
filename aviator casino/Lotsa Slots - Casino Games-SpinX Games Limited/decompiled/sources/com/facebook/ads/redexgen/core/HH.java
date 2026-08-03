package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class HH {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, com.google.common.base.Ascii.SI, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, com.google.common.base.Ascii.ESC, 93, 73, 90, 86, 94, com.google.common.base.Ascii.ESC, 95, 84, 94, 72, com.google.common.base.Ascii.ESC, 85, 84, 79, com.google.common.base.Ascii.ESC, 72, 79, 90, 73, 79, com.google.common.base.Ascii.ESC, 76, 82, 79, 83, com.google.common.base.Ascii.ESC, 72, 66, 85, 88, com.google.common.base.Ascii.ESC, 88, 84, 95, 94, com.google.common.base.Ascii.NAK};
    }

    static {
        A08();
    }

    public static int A00(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        interfaceC1987ms.AIl();
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(2);
        interfaceC1987ms.AGt(c04434v.A0l(), 0, 2);
        int syncCode = c04434v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC1987ms.AIl();
            return syncCode;
        }
        interfaceC1987ms.AIl();
        throw com.facebook.ads.redexgen.core.C3K.A01(A06(34, 42, 75), null);
    }

    public static com.facebook.ads.androidx.media3.common.Metadata A01(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, boolean z) throws java.io.IOException {
        com.facebook.ads.redexgen.core.IE id3FramePredicate;
        if (z) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = com.facebook.ads.redexgen.core.C9U.A03;
        }
        com.facebook.ads.androidx.media3.common.Metadata A002 = new com.facebook.ads.redexgen.core.HM().A00(interfaceC1987ms, id3FramePredicate);
        if (A002 == null || A002.A02() == 0) {
            return null;
        }
        return A002;
    }

    public static com.facebook.ads.androidx.media3.common.Metadata A02(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, boolean z) throws java.io.IOException {
        interfaceC1987ms.AIl();
        long A8i = interfaceC1987ms.A8i();
        com.facebook.ads.androidx.media3.common.Metadata A012 = A01(interfaceC1987ms, z);
        interfaceC1987ms.AK3((int) (interfaceC1987ms.A8i() - A8i));
        return A012;
    }

    public static com.facebook.ads.redexgen.core.HI A03(com.facebook.ads.redexgen.core.C04434v c04434v) {
        c04434v.A0g(1);
        int A0K = c04434v.A0K();
        int length = c04434v.A09();
        long j = length + A0K;
        int i = A0K / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A0P = c04434v.A0P();
            if (A0P == -1) {
                jArr = java.util.Arrays.copyOf(jArr, i2);
                jArr2 = java.util.Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A0P;
            jArr2[i2] = c04434v.A0P();
            c04434v.A0g(2);
            i2++;
        }
        int length2 = c04434v.A09();
        c04434v.A0g((int) (j - length2));
        return new com.facebook.ads.redexgen.core.HI(jArr, jArr2);
    }

    public static com.facebook.ads.redexgen.core.HI A04(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, int i) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(i);
        interfaceC1987ms.readFully(c04434v.A0l(), 0, i);
        return A03(c04434v);
    }

    public static com.facebook.ads.redexgen.core.HJ A05(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        byte[] bArr = new byte[38];
        interfaceC1987ms.readFully(bArr, 0, 38);
        return new com.facebook.ads.redexgen.core.HJ(bArr, 4);
    }

    public static java.util.List<java.lang.String> A07(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, int i) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(i);
        interfaceC1987ms.readFully(c04434v.A0l(), 0, i);
        c04434v.A0g(4);
        return java.util.Arrays.asList(com.facebook.ads.redexgen.core.AbstractC0750Hk.A05(c04434v, false, false).A02);
    }

    public static void A09(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(4);
        interfaceC1987ms.readFully(c04434v.A0l(), 0, 4);
        if (c04434v.A0Q() == 1716281667) {
        } else {
            throw com.facebook.ads.redexgen.core.C3K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(4);
        interfaceC1987ms.AGt(c04434v.A0l(), 0, 4);
        return c04434v.A0Q() == 1716281667;
    }

    public static boolean A0B(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HG hg) throws java.io.IOException {
        interfaceC1987ms.AIl();
        com.facebook.ads.redexgen.core.C04424u c04424u = new com.facebook.ads.redexgen.core.C04424u(new byte[4]);
        interfaceC1987ms.AGt(c04424u.A00, 0, 4);
        boolean A0H = c04424u.A0H();
        int A04 = c04424u.A04(7);
        int A042 = c04424u.A04(24) + 4;
        if (A04 == 0) {
            com.facebook.ads.redexgen.core.HJ A05 = A05(interfaceC1987ms);
            java.lang.String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            hg.A00 = A05;
        } else {
            com.facebook.ads.redexgen.core.HJ hj = hg.A00;
            if (hj != null) {
                if (A04 != 3) {
                    if (A04 == 4) {
                        hg.A00 = hj.A0B(A07(interfaceC1987ms, A042));
                    } else if (A04 == 6) {
                        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(A042);
                        interfaceC1987ms.readFully(c04434v.A0l(), 0, A042);
                        c04434v.A0g(4);
                        com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame pictureFrame = com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame.A00(c04434v);
                        hg.A00 = hj.A0A(com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC1987ms.AK3(A042);
                    }
                } else {
                    hg.A00 = hj.A09(A04(interfaceC1987ms, A042));
                }
            } else {
                throw new java.lang.IllegalArgumentException();
            }
        }
        return A0H;
    }
}
