package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0750Hk {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"AQUfun8uWtpAPz6T54JXA8DVdz19i7cg", "A9xQ060X7I53O0IPhfx7pChTdPn89BVs", "HA6OUY8aFXslM4giueBriDg2S", "9RrkKnX7ioGd8UIKmUAG7ayOJ1mW6fCZ", "mjtW7HF4JFIVQBQAuWhSkP1cuiqQ", "mMlJtFouJ3Md3SAWQWV0HJ1iYftjtiDS", "", "7UUPgjEseHhf3IW21ENlLsXr9tr9mert"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0749Hj A06(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C3K {
        A0C(1, c04434v, false);
        int A0F = c04434v.A0F();
        int A0I = c04434v.A0I();
        int A0F2 = c04434v.A0F();
        int A0E = c04434v.A0E();
        if (A0E <= 0) {
            A0E = -1;
        }
        int A0E2 = c04434v.A0E();
        if (A0E2 <= 0) {
            A0E2 = -1;
        }
        int A0E3 = c04434v.A0E();
        if (A0E3 <= 0) {
            A0E3 = -1;
            java.lang.String[] strArr = A01;
            if (strArr[6].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[6] = "";
            strArr2[4] = "hx6vx8O5nOwfxHxHuzSsxOXMbdPf";
        }
        int A0I2 = c04434v.A0I();
        return new com.facebook.ads.redexgen.core.C0749Hj(A0F, A0I, A0F2, A0E, A0E2, A0E3, (int) java.lang.Math.pow(2.0d, A0I2 & 15), (int) java.lang.Math.pow(2.0d, (A0I2 & 240) >> 4), (c04434v.A0I() & 1) > 0, java.util.Arrays.copyOf(c04434v.A0l(), c04434v.A0A()));
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 110);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{107, com.google.common.base.Ascii.EM, 62, 54, 51, 58, 59, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 47, 62, 45, 44, 58, Byte.MAX_VALUE, 9, 48, 45, kotlin.io.encoding.Base64.padSymbol, 54, 44, Byte.MAX_VALUE, 60, 48, 50, 50, 58, 49, 43, 101, Byte.MAX_VALUE, 40, com.google.common.base.Ascii.SI, 7, 2, com.google.common.base.Ascii.VT, 10, 78, com.google.common.base.Ascii.SUB, 1, 78, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.VT, 78, com.google.common.base.Ascii.CAN, 1, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.GS, 78, com.google.common.base.Ascii.RS, 7, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, 118, 126, 111, 122, Byte.MAX_VALUE, 122, 111, 122, 100, 121, 119, 116, 120, 112, 100, 107, 114, 120, 111, 110, 105, 126, 62, 7, com.google.common.base.Ascii.SUB, 10, 1, com.google.common.base.Ascii.ESC, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.FS, 1, 4, 58, 39, 47, 58, 60, 43, 58, 59, Byte.MAX_VALUE, 60, 55, 62, 45, 62, 60, 43, 58, 45, 44, Byte.MAX_VALUE, 120, 41, 48, 45, kotlin.io.encoding.Base64.padSymbol, 54, 44, 120, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 81, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 5, 70, 74, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 5, 71, 74, 74, 78, 5, 81, 74, 5, 86, 81, 68, 87, 81, 5, 82, 76, 81, 77, 5, 126, com.google.common.base.Ascii.NAK, 93, com.google.common.base.Ascii.DLE, 19, 9, 5, com.google.common.base.Ascii.NAK, 93, 17, com.google.common.base.Ascii.SYN, 9, 5, com.google.common.base.Ascii.NAK, 93, 17, com.google.common.base.Ascii.ETB, 120, 5, 68, 81, 5, 62, 35, 43, 62, 56, 47, 62, 63, 123, 51, 62, 58, 63, 62, 41, 123, 47, 34, 43, 62, 123, 107, 97, 98, 98, Byte.MAX_VALUE, 45, 121, 116, 125, 104, 45, 106, Byte.MAX_VALUE, 104, 108, 121, 104, Byte.MAX_VALUE, 45, 121, 101, 108, 99, 45, 60, 45, 99, 98, 121, 45, 105, 104, 110, 98, 105, 108, 111, 97, 104, 55, 45, 97, 117, 102, 106, 110, 105, 96, 39, 101, 110, 115, 39, 102, 97, 115, 98, 117, 39, 106, 104, 99, 98, 116, 39, 105, 104, 115, 39, 116, 98, 115, 39, 102, 116, 39, 98, Byte.MAX_VALUE, 119, 98, 100, 115, 98, 99, 38, 50, 33, 45, 41, 46, 39, 96, 34, 41, 52, 96, 37, 56, 48, 37, 35, 52, 37, 36, 96, 52, 47, 96, 34, 37, 96, 51, 37, 52, 2, 1, 1, 5, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, 78, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, 78, 9, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, 78, com.google.common.base.Ascii.SUB, 6, com.google.common.base.Ascii.SI, 0, 78, 92, 78, 0, 1, com.google.common.base.Ascii.SUB, 78, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, 1, 10, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 2, com.google.common.base.Ascii.VT, 84, 78, 56, 52, 37, 37, 60, 59, 50, 117, 33, 44, 37, 48, 117, 58, 33, kotlin.io.encoding.Base64.padSymbol, 48, 39, 117, 33, kotlin.io.encoding.Base64.padSymbol, 52, 59, 117, 101, 117, 59, 58, 33, 117, 38, 32, 37, 37, 58, 39, 33, 48, 49, 111, 117, 108, 112, 125, Byte.MAX_VALUE, 121, 116, 115, 112, 120, 121, 110, 60, 115, 122, 60, 104, 117, 113, 121, 60, 120, 115, 113, 125, 117, 114, 60, 104, 110, 125, 114, 111, 122, 115, 110, 113, 111, 60, 114, 115, 104, 60, 102, 121, 110, 115, 121, 120, 60, 115, 105, 104, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 65, 91, 86, 71, 87, 102, 75, 66, 87, com.google.common.base.Ascii.DC2, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 83, 70, 87, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.DC2, 70, 90, 83, 92, com.google.common.base.Ascii.DC2, 0, com.google.common.base.Ascii.DC2, 91, 65, com.google.common.base.Ascii.DC2, 92, 93, 70, com.google.common.base.Ascii.DC2, 86, 87, 81, 93, 86, 83, 80, 94, 87, 93, 70, 9, 91, 76, 90, 76, 91, 95, 76, 77, 9, 75, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 90, 9, 68, 92, 90, 93, 9, 75, 76, 9, 83, 76, 91, 70, 9, 72, 79, 93, 76, 91, 9, 68, 72, 89, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, 9, 74, 70, 92, 89, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, 9, 90, 93, 76, 89, 90, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 68, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DLE, 68, com.google.common.base.Ascii.FF, 1, 5, 0, 1, com.google.common.base.Ascii.SYN, 94, 68};
    }

    static {
        A08();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j2));
    }

    public static com.facebook.ads.androidx.media3.common.Metadata A02(java.util.List<java.lang.String> list) {
        java.util.List<java.lang.String> vorbisComments = new java.util.ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            java.lang.String[] A1P = com.facebook.ads.redexgen.core.C5C.A1P(str, A07(0, 1, 56));
            int length = A1P.length;
            java.lang.String A07 = A07(85, 10, 6);
            if (length != 2) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07, A07(1, 32, 49) + str);
            } else {
                java.lang.String[] strArr = A01;
                java.lang.String str2 = strArr[6];
                java.lang.String str3 = strArr[4];
                int i2 = str2.length();
                if (i2 == str3.length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "";
                strArr2[4] = "IFt3u6Tbn0k1mtPtGSJYRwNJh6dv";
                if (A1P[0].equals(A07(63, 22, 85))) {
                    try {
                        vorbisComments.add(com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame.A00(new com.facebook.ads.redexgen.core.C04434v(android.util.Base64.decode(A1P[1], 0))));
                    } catch (java.lang.RuntimeException e) {
                        com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A07, A07(33, 30, 0), e);
                    }
                } else {
                    vorbisComments.add(new com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment(A1P[0], A1P[1]));
                }
            }
        }
        if (vorbisComments.isEmpty()) {
            return null;
        }
        return new com.facebook.ads.androidx.media3.common.Metadata(vorbisComments);
    }

    /* JADX WARN: Incorrect condition in loop: B:50:0x009f */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0026 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.C0746Hg A03(com.facebook.ads.redexgen.core.C0745Hf c0745Hf) throws com.facebook.ads.redexgen.core.C3K {
        long j;
        if (c0745Hf.A02(24) == 5653314) {
            int A02 = c0745Hf.A02(16);
            int lookupType = c0745Hf.A02(24);
            long[] jArr = new long[lookupType];
            boolean A04 = c0745Hf.A04();
            if (!A04) {
                boolean A042 = c0745Hf.A04();
                for (int i = 0; i < entries; i++) {
                    if (A042) {
                        if (c0745Hf.A04()) {
                            int entries = c0745Hf.A02(5);
                            jArr[i] = entries + 1;
                        } else {
                            java.lang.String[] strArr = A01;
                            java.lang.String str = strArr[7];
                            java.lang.String str2 = strArr[0];
                            int dimensions = str.charAt(2);
                            int entries2 = str2.charAt(2);
                            if (dimensions != entries2) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr2 = A01;
                            strArr2[7] = "HkUiXrMYXoP7dmmSwm7TlUKenEWhRSa7";
                            strArr2[0] = "g3UzzRsN8l9NwZbA9Pl4zDU4WOGu2UFV";
                            jArr[i] = 0;
                        }
                    } else {
                        int i2 = c0745Hf.A02(5);
                        java.lang.String[] strArr3 = A01;
                        java.lang.String str3 = strArr3[6];
                        java.lang.String str4 = strArr3[4];
                        int dimensions2 = str3.length();
                        int entries3 = str4.length();
                        if (dimensions2 != entries3) {
                            java.lang.String[] strArr4 = A01;
                            strArr4[3] = "YIXxF7uzVQ2KRDIuTFnKuNVMBeAy43Wm";
                            strArr4[1] = "ZNrvF1xji8SwPYIxx9WGKrLEtje0Ya68";
                            jArr[i] = i2 + 1;
                        } else {
                            A01[2] = "PN1PQj6gHBTdVMYKSOEyBSZrD";
                            jArr[i] = i2 + 1;
                        }
                    }
                }
            } else {
                int i3 = c0745Hf.A02(5);
                int i4 = i3 + 1;
                int i5 = 0;
                while (i5 < entries) {
                    int entries4 = lookupType - i5;
                    int A022 = c0745Hf.A02(A00(entries4));
                    for (int length = 0; length < A022; length++) {
                        int entries5 = jArr.length;
                        if (i5 < entries5) {
                            jArr[i5] = i4;
                            i5++;
                        }
                    }
                    i4++;
                }
            }
            int A023 = c0745Hf.A02(4);
            if (A023 <= 2) {
                if (A023 == 1 || A023 == 2) {
                    c0745Hf.A03(32);
                    c0745Hf.A03(32);
                    int A024 = c0745Hf.A02(4) + 1;
                    c0745Hf.A03(1);
                    if (A023 == 1) {
                        if (A02 == 0) {
                            j = 0;
                        } else {
                            long j2 = lookupType;
                            java.lang.String[] strArr5 = A01;
                            java.lang.String str5 = strArr5[3];
                            java.lang.String str6 = strArr5[1];
                            int dimensions3 = str5.charAt(14);
                            int entries6 = str6.charAt(14);
                            if (dimensions3 != entries6) {
                                throw new java.lang.RuntimeException();
                            }
                            A01[5] = "D9mmqqJmTqnxQ2dihdU3MUH7YK6oq28f";
                            j = A01(j2, A02);
                        }
                    } else {
                        j = lookupType * A02;
                    }
                    int entries7 = (int) (A024 * j);
                    c0745Hf.A03(entries7);
                }
                return new com.facebook.ads.redexgen.core.C0746Hg(A02, lookupType, jArr, A023, A04);
            }
            throw com.facebook.ads.redexgen.core.C3K.A01(A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 42, 0) + A023, null);
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A07(123, 55, 75) + c0745Hf.A01(), null);
    }

    public static com.facebook.ads.redexgen.core.C0747Hh A04(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C3K {
        return A05(c04434v, true, true);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.C0747Hh A05(com.facebook.ads.redexgen.core.C04434v c04434v, boolean z, boolean z2) throws com.facebook.ads.redexgen.core.C3K {
        if (z) {
            A0C(3, c04434v, false);
        }
        int length = (int) c04434v.A0O();
        java.lang.String A0W = c04434v.A0W(length);
        int length2 = A0W.length();
        int i = 7 + 4 + length2;
        long A0O = c04434v.A0O();
        int length3 = (int) A0O;
        java.lang.String[] comments = new java.lang.String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (commentListLen < A0O) {
            long commentListLen = c04434v.A0O();
            int length4 = (int) commentListLen;
            comments[i3] = c04434v.A0W(length4);
            int length5 = comments[i3].length();
            i2 = i2 + 4 + length5;
            i3++;
        }
        if (z2) {
            int length6 = c04434v.A0I();
            if ((length6 & 1) == 0) {
                java.lang.String vendor = A07(283, 30, 46);
                throw com.facebook.ads.redexgen.core.C3K.A01(vendor, null);
            }
        }
        return new com.facebook.ads.redexgen.core.C0747Hh(A0W, comments, i2 + 1);
    }

    public static void A09(int i, com.facebook.ads.redexgen.core.C0745Hf c0745Hf) throws com.facebook.ads.redexgen.core.C3K {
        int i2;
        int A02 = c0745Hf.A02(6) + 1;
        for (int i3 = 0; i3 < A02; i3++) {
            int A022 = c0745Hf.A02(16);
            if (A022 != 0) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A05(A07(85, 10, 6), A07(355, 41, 59) + A022);
            } else {
                if (c0745Hf.A04()) {
                    int A023 = c0745Hf.A02(4);
                    java.lang.String[] strArr = A01;
                    java.lang.String str = strArr[7];
                    java.lang.String str2 = strArr[0];
                    int charAt = str.charAt(2);
                    int mappingsCount = str2.charAt(2);
                    if (charAt != mappingsCount) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[5] = "MSIFAaOSOQQOpmu0PO7aKrLsJb3QFagu";
                    i2 = A023 + 1;
                } else {
                    i2 = 1;
                }
                if (c0745Hf.A04()) {
                    int i4 = c0745Hf.A02(8);
                    int i5 = i4 + 1;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int mappingsCount2 = i - 1;
                        c0745Hf.A03(A00(mappingsCount2));
                        int mappingsCount3 = i - 1;
                        c0745Hf.A03(A00(mappingsCount3));
                    }
                }
                int mappingsCount4 = c0745Hf.A02(2);
                if (mappingsCount4 == 0) {
                    if (i2 > 1) {
                        for (int mappingsCount5 = 0; mappingsCount5 < i; mappingsCount5++) {
                            c0745Hf.A03(4);
                        }
                    }
                    for (int i7 = 0; i7 < i2; i7++) {
                        c0745Hf.A03(8);
                        java.lang.String[] strArr2 = A01;
                        java.lang.String str3 = strArr2[6];
                        java.lang.String str4 = strArr2[4];
                        int length = str3.length();
                        int mappingsCount6 = str4.length();
                        if (length == mappingsCount6) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr3 = A01;
                        strArr3[3] = "W7H2tgam7pgMqyIqKZRQoufJib3tzvKG";
                        strArr3[1] = "g3J7gwvZXejdWYIpZtqDt0lnx57dRd6J";
                        c0745Hf.A03(8);
                        c0745Hf.A03(8);
                    }
                } else {
                    throw com.facebook.ads.redexgen.core.C3K.A01(A07(491, 58, 71), null);
                }
            }
        }
    }

    public static void A0A(com.facebook.ads.redexgen.core.C0745Hf c0745Hf) throws com.facebook.ads.redexgen.core.C3K {
        int A02 = c0745Hf.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int A022 = c0745Hf.A02(16);
            switch (A022) {
                case 0:
                    c0745Hf.A03(8);
                    c0745Hf.A03(16);
                    c0745Hf.A03(16);
                    java.lang.String[] strArr = A01;
                    java.lang.String str = strArr[6];
                    java.lang.String str2 = strArr[4];
                    int floorCount = str.length();
                    if (floorCount == str2.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[2] = "puZWVQ2pTjmoQkTRd3XFOd7V6";
                    c0745Hf.A03(6);
                    c0745Hf.A03(8);
                    int A023 = c0745Hf.A02(4) + 1;
                    for (int floorCount2 = 0; floorCount2 < A023; floorCount2++) {
                        c0745Hf.A03(8);
                    }
                case 1:
                    int j = c0745Hf.A02(5);
                    int i2 = -1;
                    int[] partitionClassList = new int[j];
                    for (int floorCount3 = 0; floorCount3 < j; floorCount3++) {
                        partitionClassList[floorCount3] = c0745Hf.A02(4);
                        if (partitionClassList[floorCount3] > i2) {
                            i2 = partitionClassList[floorCount3];
                        }
                    }
                    int[] iArr = new int[i2 + 1];
                    for (int j2 = 0; j2 < iArr.length; j2++) {
                        iArr[j2] = c0745Hf.A02(3) + 1;
                        int A024 = c0745Hf.A02(2);
                        if (A024 > 0) {
                            c0745Hf.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << A024); floorCount4++) {
                            c0745Hf.A03(8);
                        }
                    }
                    c0745Hf.A03(2);
                    int k = c0745Hf.A02(4);
                    int j3 = 0;
                    int rangeBits = 0;
                    for (int count = 0; count < j; count++) {
                        int idx = partitionClassList[count];
                        java.lang.String[] strArr2 = A01;
                        java.lang.String str3 = strArr2[7];
                        java.lang.String str4 = strArr2[0];
                        int floorCount5 = str3.charAt(2);
                        if (floorCount5 != str4.charAt(2)) {
                            throw new java.lang.RuntimeException();
                        }
                        A01[5] = "4gRGDU2vGyXCYhT5FVmyq5RWvUvygEh7";
                        j3 += iArr[idx];
                        while (rangeBits < j3) {
                            c0745Hf.A03(k);
                            rangeBits++;
                        }
                    }
                default:
                    throw com.facebook.ads.redexgen.core.C3K.A01(A07(199, 41, 99) + A022, null);
            }
        }
    }

    public static void A0B(com.facebook.ads.redexgen.core.C0745Hf c0745Hf) throws com.facebook.ads.redexgen.core.C3K {
        int A02 = c0745Hf.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = c0745Hf.A02(16);
            if (residueCount <= 2) {
                c0745Hf.A03(24);
                c0745Hf.A03(24);
                c0745Hf.A03(24);
                int A022 = c0745Hf.A02(6) + 1;
                c0745Hf.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int residueCount2 = 0;
                    int A023 = c0745Hf.A02(3);
                    if (c0745Hf.A04()) {
                        java.lang.String[] strArr = A01;
                        java.lang.String str = strArr[7];
                        java.lang.String str2 = strArr[0];
                        int residueCount3 = str.charAt(2);
                        if (residueCount3 != str2.charAt(2)) {
                            throw new java.lang.RuntimeException();
                        }
                        A01[5] = "QebxPehykfYMwUhUEUOD533arJF7pEEp";
                        residueCount2 = c0745Hf.A02(5);
                    }
                    iArr[i2] = (residueCount2 * 8) + A023;
                }
                for (int i3 = 0; i3 < A022; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int residueCount4 = iArr[i3];
                        if ((residueCount4 & (1 << i4)) != 0) {
                            c0745Hf.A03(8);
                        }
                    }
                }
            } else {
                throw com.facebook.ads.redexgen.core.C3K.A01(A07(448, 43, 92), null);
            }
        }
    }

    public static boolean A0C(int i, com.facebook.ads.redexgen.core.C04434v c04434v, boolean z) throws com.facebook.ads.redexgen.core.C3K {
        if (c04434v.A07() < 7) {
            if (z) {
                return false;
            }
            throw com.facebook.ads.redexgen.core.C3K.A01(A07(549, 18, 10) + c04434v.A07(), null);
        }
        if (c04434v.A0I() != i) {
            if (z) {
                return false;
            }
            throw com.facebook.ads.redexgen.core.C3K.A01(A07(178, 21, 53) + java.lang.Integer.toHexString(i), null);
        }
        if (c04434v.A0I() != 118 || c04434v.A0I() != 111 || c04434v.A0I() != 114 || c04434v.A0I() != 98 || c04434v.A0I() != 105 || c04434v.A0I() != 115) {
            if (z) {
                return false;
            }
            throw com.facebook.ads.redexgen.core.C3K.A01(A07(95, 28, 49), null);
        }
        return true;
    }

    public static com.facebook.ads.redexgen.core.C0748Hi[] A0D(com.facebook.ads.redexgen.core.C04434v c04434v, int i) throws com.facebook.ads.redexgen.core.C3K {
        A0C(5, c04434v, false);
        int A0I = c04434v.A0I() + 1;
        com.facebook.ads.redexgen.core.C0745Hf c0745Hf = new com.facebook.ads.redexgen.core.C0745Hf(c04434v.A0l());
        int numberOfBooks = c04434v.A09();
        c0745Hf.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0I; numberOfBooks2++) {
            A03(c0745Hf);
        }
        int numberOfBooks3 = c0745Hf.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = c0745Hf.A02(16);
            if (numberOfBooks4 != 0) {
                throw com.facebook.ads.redexgen.core.C3K.A01(A07(396, 52, 114), null);
            }
        }
        A0A(c0745Hf);
        A0B(c0745Hf);
        A09(i, c0745Hf);
        com.facebook.ads.redexgen.core.C0748Hi[] A0E = A0E(c0745Hf);
        if (c0745Hf.A04()) {
            return A0E;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A07(240, 43, 105), null);
    }

    public static com.facebook.ads.redexgen.core.C0748Hi[] A0E(com.facebook.ads.redexgen.core.C0745Hf c0745Hf) {
        int A02 = c0745Hf.A02(6) + 1;
        com.facebook.ads.redexgen.core.C0748Hi[] c0748HiArr = new com.facebook.ads.redexgen.core.C0748Hi[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = c0745Hf.A04();
            int A022 = c0745Hf.A02(16);
            int i = c0745Hf.A02(16);
            c0748HiArr[windowType] = new com.facebook.ads.redexgen.core.C0748Hi(A04, A022, i, c0745Hf.A02(8));
        }
        return c0748HiArr;
    }
}
