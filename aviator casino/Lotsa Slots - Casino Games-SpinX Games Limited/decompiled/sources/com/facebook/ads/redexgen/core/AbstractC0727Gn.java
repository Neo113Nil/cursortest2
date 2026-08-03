package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0727Gn {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"jnpQs", "68vQr4mYnLI0oxp3WZBPcyc6w04l8sdO", "1OtBqA6VhuQLpqBNtIteBoMpw2BUtlZT", "iBOJpCpDP8DiwQrVeW3OV9Em66L9h1f8", "Xaj0HtPMuTBdCp8NFbjtiHIpdpZCFdAK", "i4DAEtymK6yFJNiO2QALezQZgNrDh5qR", "4Bsy9O0lknqqP9xR2TNdH0U1zi1weR0A", "FgP5ewPOxCae6ADOyhugLxvte5BfjSLb"};
    public static final int[] A02;
    public static final int[] A03;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-10, -10, -8, -43, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, 39, -43, com.google.common.base.Ascii.RS, 35, 40, 42, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, 35, 41, -43, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SYN, 41, com.google.common.base.Ascii.SYN, -13, -13, -11, -46, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 36, -46, 41, 36, 33, 32, com.google.common.base.Ascii.EM, -46, 5, 19, com.google.common.base.Ascii.US, 34, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, 32, com.google.common.base.Ascii.EM, -46, -8, 36, com.google.common.base.Ascii.ETB, 35, 39, com.google.common.base.Ascii.ETB, 32, com.google.common.base.Ascii.NAK, 43, -46, -5, 32, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 42, 5, 37, 39, com.google.common.base.Ascii.EM, 56, 45, 48, com.google.common.base.Ascii.DLE, 41, 32, 51, 43, 32, com.google.common.base.Ascii.RS, 47, 32, com.google.common.base.Ascii.US, -37, 33, 45, com.google.common.base.Ascii.FS, 40, 32, 7, 32, 41, 34, 47, 35, 1, 39, com.google.common.base.Ascii.FS, 34, -37, -8, -37, -20, -8, 17, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CAN, 19, 19, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, 8, 7, -61, 4, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, -61, com.google.common.base.Ascii.DC2, 5, com.google.common.base.Ascii.CR, 8, 6, com.google.common.base.Ascii.ETB, -61, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, 19, 8, -35, -61, 68, 93, 98, 100, 95, 95, 94, 97, 99, 84, 83, com.google.common.base.Ascii.SI, 84, 95, 50, 94, 93, 85, 88, 86, 41, com.google.common.base.Ascii.SI, -19, -16, -76, -31, -82, -76, -80, -82};
    }

    static {
        A05();
        A03 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A02 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(com.facebook.ads.redexgen.core.C04424u c04424u) {
        int A04 = c04424u.A04(5);
        if (A04 == 31) {
            int audioObjectType = c04424u.A04(6);
            return audioObjectType + 32;
        }
        return A04;
    }

    public static int A01(com.facebook.ads.redexgen.core.C04424u c04424u) throws com.facebook.ads.redexgen.core.C3K {
        int A04 = c04424u.A04(4);
        if (A04 == 15) {
            int A012 = c04424u.A01();
            if (A01[0].length() != 5) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[1] = "q0W1UZuAU1h4xSNvnmv6o4fLVDdZ81si";
            strArr[4] = "TmcMI11py7mWue9QV51Oyh4sKPsH3Jhr";
            if (A012 >= 24) {
                int frequencyIndex = c04424u.A04(24);
                return frequencyIndex;
            }
            throw com.facebook.ads.redexgen.core.C3K.A01(A04(0, 28, 60), null);
        }
        if (A04 < 13) {
            int frequencyIndex2 = A03[A04];
            return frequencyIndex2;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A04(28, 41, 57), null);
    }

    public static com.facebook.ads.redexgen.core.C0726Gm A02(com.facebook.ads.redexgen.core.C04424u c04424u, boolean z) throws com.facebook.ads.redexgen.core.C3K {
        int A002 = A00(c04424u);
        int A012 = A01(c04424u);
        int A04 = c04424u.A04(4);
        java.lang.String str = A04(159, 8, 7) + A002;
        if (A002 == 5 || A002 == 29) {
            A012 = A01(c04424u);
            A002 = A00(c04424u);
            if (A002 == 22) {
                A04 = c04424u.A04(4);
            }
        }
        if (z) {
            switch (A002) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(c04424u, A002, A04);
                    int sampleRateHz = A01[0].length();
                    if (sampleRateHz == 5) {
                        java.lang.String[] strArr = A01;
                        strArr[6] = "3cbQZ4WWsbXwvX2zvxOiUlmwqxsyxREi";
                        strArr[3] = "nPAxNfqqgI9TB5NmScWQIj27S1nluV3e";
                        switch (A002) {
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                int A042 = c04424u.A04(2);
                                if (A042 == 2 || A042 == 3) {
                                    throw com.facebook.ads.redexgen.core.C3K.A00(A04(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 22, 118) + A042);
                                }
                                break;
                        }
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw com.facebook.ads.redexgen.core.C3K.A00(A04(106, 31, 42) + A002);
            }
        }
        int channelCount = A02[A04];
        if (channelCount != -1) {
            return new com.facebook.ads.redexgen.core.C0726Gm(A012, channelCount, str);
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(null, null);
    }

    public static com.facebook.ads.redexgen.core.C0726Gm A03(byte[] bArr) throws com.facebook.ads.redexgen.core.C3K {
        return A02(new com.facebook.ads.redexgen.core.C04424u(bArr), false);
    }

    public static void A06(com.facebook.ads.redexgen.core.C04424u c04424u, int i, int i2) {
        boolean frameLengthFlag = c04424u.A0H();
        if (frameLengthFlag) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A04(69, 7, 75), A04(76, 30, 66));
        }
        boolean frameLengthFlag2 = c04424u.A0H();
        if (frameLengthFlag2) {
            if (A01[5].charAt(15) != 's') {
                java.lang.String[] strArr = A01;
                strArr[7] = "v2arTuVBFpHRdd6zD5uQKVaL6J866891";
                strArr[2] = "F7KamgaQFU4osqLd0R7CHRmLJ4QhMqsw";
                c04424u.A09(14);
            }
            throw new java.lang.RuntimeException();
        }
        boolean A0H = c04424u.A0H();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                c04424u.A09(3);
            }
            if (A0H) {
                if (i == 22) {
                    c04424u.A09(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c04424u.A09(3);
                }
                java.lang.String[] strArr2 = A01;
                if (strArr2[1].charAt(21) != strArr2[4].charAt(21)) {
                    java.lang.String[] strArr3 = A01;
                    strArr3[6] = "QrL8Tr8yy4gY8AXmFxmkTTkkR7JmfqMW";
                    strArr3[3] = "IjkFi7C6bNI16jdHGSbHtjLd4dsdDQNH";
                    c04424u.A09(1);
                    return;
                }
                throw new java.lang.RuntimeException();
            }
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public static byte[] A07(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }
}
