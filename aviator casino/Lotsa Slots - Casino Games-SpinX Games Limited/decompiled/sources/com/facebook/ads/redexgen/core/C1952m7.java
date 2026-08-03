package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Rename the class for A/B Testing")
/* renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1952m7 implements com.facebook.ads.redexgen.core.H9 {
    public static byte[] A0Z;
    public static java.lang.String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final com.facebook.ads.redexgen.core.HD A0b;
    public static final com.facebook.ads.redexgen.core.C2196qI A0c;
    public static final byte[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public com.facebook.ads.redexgen.core.C04434v A0D;
    public com.facebook.ads.redexgen.core.HA A0E;
    public com.facebook.ads.redexgen.core.JA A0F;
    public boolean A0G;
    public boolean A0H;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd[] A0I;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd[] A0J;
    public final int A0K;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.JA> A0L;
    public final com.facebook.ads.redexgen.core.C04434v A0M;
    public final com.facebook.ads.redexgen.core.C04434v A0N;
    public final com.facebook.ads.redexgen.core.C04434v A0O;
    public final com.facebook.ads.redexgen.core.C04434v A0P;
    public final com.facebook.ads.redexgen.core.C04434v A0Q;
    public final com.facebook.ads.redexgen.core.AnonymousClass53 A0R;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd A0S;
    public final com.facebook.ads.redexgen.core.I0 A0T;
    public final com.facebook.ads.redexgen.core.JO A0U;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.C1959mE> A0V;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.J9> A0W;
    public final java.util.List<com.facebook.ads.redexgen.core.C2196qI> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(com.facebook.ads.redexgen.core.JA ja, int i, int i2, com.facebook.ads.redexgen.core.C04434v c04434v, int i3) throws com.facebook.ads.redexgen.core.C3K {
        int i4;
        int i5 = i3;
        c04434v.A0f(8);
        int A00 = com.facebook.ads.redexgen.core.AbstractC0785Iu.A00(c04434v.A0C());
        com.facebook.ads.redexgen.core.JO jo = ja.A05.A03;
        com.facebook.ads.redexgen.core.JQ jq = ja.A09;
        com.facebook.ads.redexgen.core.J1 j1 = (com.facebook.ads.redexgen.core.J1) com.facebook.ads.redexgen.core.C5C.A0f(jq.A06);
        jq.A0C[i] = c04434v.A0L();
        jq.A0E[i] = jq.A04;
        if ((A00 & 1) != 0) {
            long[] jArr = jq.A0E;
            jArr[i] = jArr[i] + c04434v.A0C();
        }
        boolean z = (A00 & 4) != 0;
        int i6 = j1.A01;
        if (z) {
            i6 = c04434v.A0C();
        }
        boolean z2 = (A00 & 256) != 0;
        boolean z3 = (A00 & 512) != 0;
        boolean z4 = (A00 & 1024) != 0;
        boolean z5 = (A00 & 2048) != 0;
        long j = A0a(jo) ? ((long[]) com.facebook.ads.redexgen.core.C5C.A0f(jo.A09))[0] : 0L;
        int[] iArr = jq.A0B;
        long[] jArr2 = jq.A0D;
        boolean[] zArr = jq.A0G;
        boolean z6 = jo.A03 == 2 && (i2 & 1) != 0;
        int i7 = i5 + jq.A0C[i];
        long j2 = jo.A06;
        long j3 = jq.A05;
        while (i5 < i7) {
            if (z2) {
                i4 = c04434v.A0C();
                if (A0a[5].length() == 30) {
                    throw new java.lang.RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                i4 = j1.A00;
            }
            int A002 = A00(i4);
            int A003 = A00(z3 ? c04434v.A0C() : j1.A03);
            int A0C = z4 ? c04434v.A0C() : (i5 == 0 && z) ? i6 : j1.A01;
            jArr2[i5] = com.facebook.ads.redexgen.core.C5C.A0U(((z5 ? c04434v.A0C() : 0) + j3) - j, 1000000L, j2);
            if (!jq.A09) {
                jArr2[i5] = jArr2[i5] + ja.A05.A02;
            }
            iArr[i5] = A003;
            zArr[i5] = ((A0C >> 16) & 1) == 0 && (!z6 || i5 == 0);
            j3 += A002;
            i5++;
        }
        jq.A05 = j3;
        return i7;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.util.Pair<java.lang.Long, com.facebook.ads.redexgen.core.C1992my> A05(com.facebook.ads.redexgen.core.C04434v c04434v, long j) throws com.facebook.ads.redexgen.core.C3K {
        long A0R;
        long A0R2;
        c04434v.A0f(8);
        int A01 = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(c04434v.A0C());
        c04434v.A0g(4);
        long A0Q = c04434v.A0Q();
        if (A01 == 0) {
            A0R = c04434v.A0Q();
            A0R2 = j + c04434v.A0Q();
        } else {
            A0R = c04434v.A0R();
            A0R2 = j + c04434v.A0R();
        }
        long A0U = com.facebook.ads.redexgen.core.C5C.A0U(A0R, 1000000L, A0Q);
        c04434v.A0g(2);
        int A0M = c04434v.A0M();
        int[] iArr = new int[A0M];
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        long[] jArr3 = new long[A0M];
        long j2 = A0U;
        for (int i = 0; i < A0M; i++) {
            int A0C = c04434v.A0C();
            if ((Integer.MIN_VALUE & A0C) != 0) {
                throw com.facebook.ads.redexgen.core.C3K.A01(A0A(756, 28, 79), null);
            }
            long A0Q2 = c04434v.A0Q();
            iArr[i] = Integer.MAX_VALUE & A0C;
            jArr[i] = A0R2;
            jArr3[i] = j2;
            A0R += A0Q2;
            j2 = com.facebook.ads.redexgen.core.C5C.A0U(A0R, 1000000L, A0Q);
            jArr2[i] = j2 - jArr3[i];
            c04434v.A0g(4);
            A0R2 += iArr[i];
        }
        return android.util.Pair.create(java.lang.Long.valueOf(A0U), new com.facebook.ads.redexgen.core.C1992my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.JA A09(com.facebook.ads.redexgen.core.C04434v c04434v, android.util.SparseArray<com.facebook.ads.redexgen.core.JA> sparseArray, boolean z) {
        c04434v.A0f(8);
        int A00 = com.facebook.ads.redexgen.core.AbstractC0785Iu.A00(c04434v.A0C());
        com.facebook.ads.redexgen.core.JA valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(c04434v.A0C());
        if (valueAt == null) {
            java.lang.String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0R = c04434v.A0R();
            valueAt.A09.A04 = A0R;
            valueAt.A09.A03 = A0R;
        }
        com.facebook.ads.redexgen.core.J1 j1 = valueAt.A04;
        valueAt.A09.A06 = new com.facebook.ads.redexgen.core.J1((A00 & 2) != 0 ? c04434v.A0C() - 1 : j1.A02, (A00 & 8) != 0 ? c04434v.A0C() : j1.A00, (A00 & 16) != 0 ? c04434v.A0C() : j1.A03, (A00 & 32) != 0 ? c04434v.A0C() : j1.A01);
        return valueAt;
    }

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0Z, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, kotlin.io.encoding.Base64.padSymbol, 33, 40, 109, 46, 34, 56, 35, 57, 47, com.google.common.base.Ascii.SUB, 1, 3, 78, com.google.common.base.Ascii.GS, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, 78, 2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, 78, com.google.common.base.Ascii.SUB, 6, com.google.common.base.Ascii.SI, 0, 78, 6, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, 78, 2, com.google.common.base.Ascii.VT, 0, 9, com.google.common.base.Ascii.SUB, 6, 78, 70, com.google.common.base.Ascii.ESC, 0, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, 1, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 10, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, com.google.common.base.Ascii.GS, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, kotlin.io.encoding.Base64.padSymbol, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, com.google.common.base.Ascii.SO, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, com.google.common.base.Ascii.US, 113, 126, 115, com.google.common.base.Ascii.US, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 2, com.google.common.base.Ascii.DC4, 5, 81, 5, com.google.common.base.Ascii.RS, 81, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 3, 8, 1, 5, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 81, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.DLE, 81, 6, com.google.common.base.Ascii.DLE, 2, 81, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.DC4, 95, 120, 81, 81, 68, 82, 67, com.google.common.base.Ascii.ETB, 67, 88, com.google.common.base.Ascii.ETB, 82, 89, 83, com.google.common.base.Ascii.ETB, 88, 81, com.google.common.base.Ascii.ETB, 90, 83, 86, 67, com.google.common.base.Ascii.ETB, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 86, 68, com.google.common.base.Ascii.ETB, 89, 82, 80, 86, 67, 94, 65, 82, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, 34, 49, 38, 38, kotlin.io.encoding.Base64.padSymbol, 48, kotlin.io.encoding.Base64.padSymbol, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, kotlin.io.encoding.Base64.padSymbol, 59, 58, com.google.common.base.Ascii.SYN, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, kotlin.io.encoding.Base64.padSymbol, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, com.google.common.base.Ascii.EM, 10, 80, 3, 17, com.google.common.base.Ascii.GS, 0, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 80, 19, com.google.common.base.Ascii.US, 5, com.google.common.base.Ascii.RS, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, kotlin.io.encoding.Base64.padSymbol, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, Byte.MAX_VALUE, 78, 118, 116, 109, 109, 116, 115, 122, kotlin.io.encoding.Base64.padSymbol, 124, 105, 114, 112, kotlin.io.encoding.Base64.padSymbol, 106, 116, 105, 117, kotlin.io.encoding.Base64.padSymbol, 113, 120, 115, 122, 105, 117, kotlin.io.encoding.Base64.padSymbol, 35, kotlin.io.encoding.Base64.padSymbol, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, kotlin.io.encoding.Base64.padSymbol, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, kotlin.io.encoding.Base64.padSymbol, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, kotlin.io.encoding.Base64.padSymbol, 60, 104, 114, com.google.common.base.Ascii.ETB, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, Byte.MAX_VALUE, 108, 41, Byte.MAX_VALUE, 104, 101, 124, 108, 51, 41, 35, com.google.common.base.Ascii.CAN, 19, com.google.common.base.Ascii.SO, 6, 19, com.google.common.base.Ascii.NAK, 2, 19, com.google.common.base.Ascii.DC2, 86, 5, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, 86, 19, com.google.common.base.Ascii.CAN, 2, 4, com.google.common.base.Ascii.SI, 86, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, 3, com.google.common.base.Ascii.CAN, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 4, 66, 75, 81, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 4, com.google.common.base.Ascii.FF, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.CR, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, Byte.MAX_VALUE, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, com.google.common.base.Ascii.SYN, 65, com.google.common.base.Ascii.DC4, 84, 73, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC4, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(com.facebook.ads.redexgen.core.C04434v c04434v, android.net.Uri uri) {
        java.lang.String str;
        java.lang.String str2;
        long j;
        long A0U;
        long A0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c04434v.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new java.lang.RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int A01 = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(c04434v.A0C());
        long j2 = -9223372036854775807L;
        switch (A01) {
            case 0:
                str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04434v.A0U());
                str2 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04434v.A0U());
                long A0Q2 = c04434v.A0Q();
                j2 = com.facebook.ads.redexgen.core.C5C.A0U(c04434v.A0Q(), 1000000L, A0Q2);
                j = this.A0C != -9223372036854775807L ? this.A0C + j2 : -9223372036854775807L;
                A0U = com.facebook.ads.redexgen.core.C5C.A0U(c04434v.A0Q(), 1000L, A0Q2);
                A0Q = c04434v.A0Q();
                break;
            case 1:
                long A0Q3 = c04434v.A0Q();
                j = com.facebook.ads.redexgen.core.C5C.A0U(c04434v.A0R(), 1000000L, A0Q3);
                A0U = com.facebook.ads.redexgen.core.C5C.A0U(c04434v.A0Q(), 1000L, A0Q3);
                A0Q = c04434v.A0Q();
                str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04434v.A0U());
                str2 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04434v.A0U());
                break;
            default:
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0A(204, 22, 75), A0A(645, 35, 24) + A01);
                return;
        }
        byte[] bArr = new byte[c04434v.A07()];
        c04434v.A0k(bArr, 0, c04434v.A07());
        int i = 0;
        com.facebook.ads.redexgen.core.C04434v c04434v2 = new com.facebook.ads.redexgen.core.C04434v(this.A0T.A01(new com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage(str, str2, A0U, A0Q, bArr)));
        int A07 = c04434v2.A07();
        com.facebook.ads.redexgen.core.InterfaceC0743Hd[] interfaceC0743HdArr = this.A0J;
        int length = interfaceC0743HdArr.length;
        int i2 = 0;
        while (i2 < length) {
            com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd = interfaceC0743HdArr[i2];
            c04434v2.A0f(i);
            interfaceC0743Hd.AKf(uri);
            interfaceC0743Hd.AIr(c04434v2, A07);
            i2++;
            i = 0;
        }
        if (j == -9223372036854775807L) {
            this.A0W.addLast(new com.facebook.ads.redexgen.core.J9(j2, true, A07));
            this.A03 += A07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new com.facebook.ads.redexgen.core.J9(j, false, A07));
            this.A03 += A07;
            return;
        }
        if (this.A0R != null) {
            com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53 = this.A0R;
            if (A0a[1].length() != 3) {
                java.lang.String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                j = anonymousClass53.A05(j);
            } else {
                j = anonymousClass53.A05(j);
            }
        }
        if (this.A0A != -9223372036854775807L && !com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A11)) {
            j = this.A0A;
        }
        com.facebook.ads.redexgen.core.InterfaceC0743Hd[] interfaceC0743HdArr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new java.lang.RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd2 : interfaceC0743HdArr2) {
            interfaceC0743Hd2.AIu(j, 1, A07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(com.facebook.ads.redexgen.core.C1959mE c1959mE, android.util.SparseArray<com.facebook.ads.redexgen.core.JA> sparseArray, boolean z, int i, byte[] bArr) throws com.facebook.ads.redexgen.core.C3K {
        com.facebook.ads.redexgen.core.JA A09 = A09(((com.facebook.ads.redexgen.core.C1958mD) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c1959mE.A07(1952868452))).A00, sparseArray, z);
        if (A09 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.JQ jq = A09.A09;
        long j = jq.A05;
        boolean z2 = jq.A09;
        A09.A08();
        A09.A06 = true;
        com.facebook.ads.redexgen.core.C1958mD A07 = c1959mE.A07(1952867444);
        if (A07 == null || (i & 2) != 0) {
            jq.A05 = j;
            java.lang.String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            jq.A09 = z2;
        } else {
            jq.A05 = A03(A07.A00);
            jq.A09 = true;
        }
        A0S(c1959mE, A09, i);
        com.facebook.ads.redexgen.core.JO jo = A09.A05.A03;
        java.lang.Object A01 = com.facebook.ads.redexgen.core.AbstractC04203y.A01(jq.A06);
        java.lang.String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        com.facebook.ads.redexgen.core.JP A00 = jo.A00(((com.facebook.ads.redexgen.core.J1) A01).A02);
        com.facebook.ads.redexgen.core.C1958mD A072 = c1959mE.A07(1935763834);
        if (A072 != null) {
            A0V((com.facebook.ads.redexgen.core.JP) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A00), A072.A00, jq);
        }
        com.facebook.ads.redexgen.core.C1958mD A073 = c1959mE.A07(1935763823);
        if (A073 != null) {
            A0I(A073.A00, jq);
        }
        com.facebook.ads.redexgen.core.C1958mD A074 = c1959mE.A07(1936027235);
        if (A074 != null) {
            A0J(A074.A00, jq);
        }
        A0T(c1959mE, A00 != null ? A00.A02 : null, jq);
        int size = c1959mE.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.C1958mD c1958mD = c1959mE.A02.get(i2);
            if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 == 1970628964) {
                A0K(c1958mD.A00, jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(com.facebook.ads.redexgen.core.C1959mE c1959mE, java.lang.String str, com.facebook.ads.redexgen.core.JQ jq) throws com.facebook.ads.redexgen.core.C3K {
        com.facebook.ads.redexgen.core.C04434v c04434v = null;
        com.facebook.ads.redexgen.core.C04434v c04434v2 = null;
        for (int i = 0; i < c1959mE.A02.size(); i++) {
            com.facebook.ads.redexgen.core.C1958mD c1958mD = c1959mE.A02.get(i);
            com.facebook.ads.redexgen.core.C04434v c04434v3 = c1958mD.A00;
            if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 == 1935828848) {
                c04434v3.A0f(12);
                if (c04434v3.A0C() == 1936025959) {
                    c04434v = c04434v3;
                }
            } else if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 == 1936158820) {
                c04434v3.A0f(12);
                if (c04434v3.A0C() == 1936025959) {
                    c04434v2 = c04434v3;
                }
            }
        }
        if (c04434v == null || c04434v2 == null) {
            return;
        }
        c04434v.A0f(8);
        int A01 = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(c04434v.A0C());
        c04434v.A0g(4);
        if (A01 == 1) {
            c04434v.A0g(4);
        }
        if (c04434v.A0C() != 1) {
            throw com.facebook.ads.redexgen.core.C3K.A00(A0A(126, 39, 73));
        }
        c04434v2.A0f(8);
        int A012 = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(c04434v2.A0C());
        c04434v2.A0g(4);
        if (A012 == 1) {
            if (c04434v2.A0Q() == 0) {
                throw com.facebook.ads.redexgen.core.C3K.A00(A0A(784, 55, 110));
            }
        } else if (A012 >= 2) {
            c04434v2.A0g(4);
        }
        if (c04434v2.A0Q() != 1) {
            throw com.facebook.ads.redexgen.core.C3K.A00(A0A(165, 39, 18));
        }
        c04434v2.A0g(1);
        int A0I = c04434v2.A0I();
        int i2 = (A0I & 240) >> 4;
        int i3 = A0I & 15;
        boolean z = c04434v2.A0I() == 1;
        if (z) {
            int A0I2 = c04434v2.A0I();
            byte[] bArr = new byte[16];
            c04434v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (A0I2 == 0) {
                int A0I3 = c04434v2.A0I();
                bArr2 = new byte[A0I3];
                c04434v2.A0k(bArr2, 0, A0I3);
            }
            jq.A08 = true;
            jq.A07 = new com.facebook.ads.redexgen.core.JP(z, str, A0I2, bArr, i2, i3, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(com.facebook.ads.redexgen.core.JP jp, com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.JQ jq) throws com.facebook.ads.redexgen.core.C3K {
        int i = jp.A00;
        c04434v.A0f(8);
        if ((com.facebook.ads.redexgen.core.AbstractC0785Iu.A00(c04434v.A0C()) & 1) == 1) {
            c04434v.A0g(8);
        }
        int A0I = c04434v.A0I();
        int A0L = c04434v.A0L();
        if (A0L > jq.A00) {
            throw com.facebook.ads.redexgen.core.C3K.A01(A0A(514, 18, 58) + A0L + A0A(40, 38, 7) + jq.A00, null);
        }
        int i2 = 0;
        if (A0I == 0) {
            boolean[] zArr = jq.A0F;
            if (A0a[1].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i3 = 0; i3 < A0L; i3++) {
                int A0I2 = c04434v.A0I();
                i2 += A0I2;
                zArr[i3] = A0I2 > i;
            }
        } else {
            i2 = 0 + (A0I * A0L);
            java.util.Arrays.fill(jq.A0F, 0, A0L, A0I > i);
        }
        java.util.Arrays.fill(jq.A0F, A0L, jq.A00, false);
        if (i2 > 0) {
            jq.A02(i2);
        }
    }

    static {
        A0D();
        A0b = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.m8
            @Override // com.facebook.ads.redexgen.core.HD
            public final com.facebook.ads.redexgen.core.H9[] A5N() {
                return com.facebook.ads.redexgen.core.C1952m7.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
                return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, com.google.common.base.Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new com.facebook.ads.redexgen.core.C03872p().A11(A0A(839, 18, 77)).A14();
    }

    public C1952m7() {
        this(0);
    }

    public C1952m7(int i) {
        this(i, null);
    }

    public C1952m7(int i, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        this(i, anonymousClass53, null, java.util.Collections.emptyList());
    }

    public C1952m7(int i, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.JO jo, java.util.List<com.facebook.ads.redexgen.core.C2196qI> list) {
        this(i, anonymousClass53, jo, list, null);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C1952m7(int i, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.JO jo, java.util.List<com.facebook.ads.redexgen.core.C2196qI> list, com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0R = anonymousClass53;
        this.A0U = jo;
        this.A0X = java.util.Collections.unmodifiableList(list);
        this.A0S = interfaceC0743Hd;
        this.A0T = new com.facebook.ads.redexgen.core.I0();
        this.A0M = new com.facebook.ads.redexgen.core.C04434v(16);
        this.A0P = new com.facebook.ads.redexgen.core.C04434v(com.facebook.ads.redexgen.core.HS.A03);
        this.A0O = new com.facebook.ads.redexgen.core.C04434v(5);
        this.A0N = new com.facebook.ads.redexgen.core.C04434v();
        this.A0Y = new byte[16];
        this.A0Q = new com.facebook.ads.redexgen.core.C04434v(this.A0Y);
        this.A0V = new java.util.ArrayDeque<>();
        this.A0W = new java.util.ArrayDeque<>();
        this.A0L = new android.util.SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = com.facebook.ads.redexgen.core.HA.A00;
        this.A0J = new com.facebook.ads.redexgen.core.InterfaceC0743Hd[0];
        this.A0I = new com.facebook.ads.redexgen.core.InterfaceC0743Hd[0];
    }

    public static int A00(int i) throws com.facebook.ads.redexgen.core.C3K {
        if (i >= 0) {
            return i;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A0A(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 27, 67) + i, null);
    }

    public static long A02(com.facebook.ads.redexgen.core.C04434v c04434v) {
        c04434v.A0f(8);
        int fullAtom = c04434v.A0C();
        return com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(fullAtom) == 0 ? c04434v.A0Q() : c04434v.A0R();
    }

    public static long A03(com.facebook.ads.redexgen.core.C04434v c04434v) {
        c04434v.A0f(8);
        int fullAtom = c04434v.A0C();
        int version = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(fullAtom);
        return version == 1 ? c04434v.A0R() : c04434v.A0Q();
    }

    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.J1> A04(com.facebook.ads.redexgen.core.C04434v c04434v) {
        c04434v.A0f(12);
        int defaultSampleDescriptionIndex = c04434v.A0C();
        int trackId = c04434v.A0C();
        int defaultSampleFlags = c04434v.A0C();
        int defaultSampleSize = c04434v.A0C();
        int defaultSampleDuration = c04434v.A0C();
        return android.util.Pair.create(java.lang.Integer.valueOf(defaultSampleDescriptionIndex), new com.facebook.ads.redexgen.core.J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static com.facebook.ads.androidx.media3.common.DrmInitData A06(java.util.List<com.facebook.ads.redexgen.core.C1958mD> list) {
        java.util.ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.C1958mD c1958mD = list.get(i);
            int leafChildrenSize = ((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                byte[] A0l = c1958mD.A00.A0l();
                java.util.UUID A02 = com.facebook.ads.redexgen.core.JH.A02(A0l);
                if (A02 == null) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new com.facebook.ads.androidx.media3.common.DrmInitData.SchemeData(A02, A0A(897, 9, 66), A0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.facebook.ads.androidx.media3.common.DrmInitData(arrayList);
    }

    private com.facebook.ads.redexgen.core.J1 A07(android.util.SparseArray<com.facebook.ads.redexgen.core.J1> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.facebook.ads.redexgen.core.J1) com.facebook.ads.redexgen.core.AbstractC04203y.A01(sparseArray.get(i));
    }

    public static com.facebook.ads.redexgen.core.JA A08(android.util.SparseArray<com.facebook.ads.redexgen.core.JA> sparseArray) {
        boolean z;
        boolean z2;
        com.facebook.ads.redexgen.core.JA ja = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.JA valueAt = sparseArray.valueAt(i);
            z = valueAt.A06;
            if (z || valueAt.A01 != valueAt.A05.A01) {
                z2 = valueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new java.lang.RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z2 || valueAt.A02 != valueAt.A09.A01) {
                    long nextSampleOffset = valueAt.A05();
                    if (nextSampleOffset < j) {
                        ja = valueAt;
                        j = nextSampleOffset;
                    }
                }
            }
        }
        return ja;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new com.facebook.ads.redexgen.core.InterfaceC0743Hd[2];
        int i = 0;
        if (this.A0S != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0S;
            i = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i + 1;
            this.A0J[i] = this.A0E.AKS(100, 5);
            i = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (com.facebook.ads.redexgen.core.InterfaceC0743Hd[]) com.facebook.ads.redexgen.core.C5C.A1I(this.A0J, i);
        for (com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd : this.A0J) {
            interfaceC0743Hd.A6e(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new com.facebook.ads.redexgen.core.InterfaceC0743Hd[nextExtraTrackId3];
        int i2 = 0;
        while (i2 < nextExtraTrackId) {
            int i3 = nextExtraTrackId + 1;
            com.facebook.ads.redexgen.core.InterfaceC0743Hd AKS = this.A0E.AKS(nextExtraTrackId, 3);
            AKS.A6e(this.A0X.get(i2));
            this.A0I[i2] = AKS;
            i2++;
            nextExtraTrackId = i3;
        }
    }

    private void A0E(long j) {
        while (!this.A0W.isEmpty()) {
            com.facebook.ads.redexgen.core.J9 removeFirst = this.A0W.removeFirst();
            this.A03 -= removeFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long j2 = removeFirst.A01;
            if (removeFirst.A02) {
                j2 += j;
            }
            if (this.A0R != null) {
                j2 = this.A0R.A05(j2);
            }
            for (com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd : this.A0J) {
                interfaceC0743Hd.AIu(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws com.facebook.ads.redexgen.core.C3K {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(com.facebook.ads.redexgen.core.C04434v c04434v, int i, com.facebook.ads.redexgen.core.JQ jq) throws com.facebook.ads.redexgen.core.C3K {
        c04434v.A0f(i + 8);
        int fullAtom = c04434v.A0C();
        int flags = com.facebook.ads.redexgen.core.AbstractC0785Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c04434v.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = jq.A0F;
                int fullAtom4 = jq.A00;
                java.util.Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = jq.A00;
            if (sampleCount == fullAtom5) {
                java.util.Arrays.fill(jq.A0F, 0, sampleCount, z);
                int fullAtom6 = c04434v.A07();
                jq.A02(fullAtom6);
                jq.A04(c04434v);
                return;
            }
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = jq.A00;
            throw com.facebook.ads.redexgen.core.C3K.A01(append.append(fullAtom7).toString(), null);
        }
        throw com.facebook.ads.redexgen.core.C3K.A00(A0A(com.facebook.internal.FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 56, 30));
    }

    public static void A0I(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.JQ jq) throws com.facebook.ads.redexgen.core.C3K {
        c04434v.A0f(8);
        int flags = c04434v.A0C();
        int fullAtom = com.facebook.ads.redexgen.core.AbstractC0785Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c04434v.A0g(8);
        }
        int A0L = c04434v.A0L();
        if (A0L == 1) {
            int entryCount = com.facebook.ads.redexgen.core.AbstractC0785Iu.A01(flags);
            jq.A03 += entryCount == 0 ? c04434v.A0Q() : c04434v.A0R();
            return;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A0A(727, 29, 60) + A0L, null);
    }

    public static void A0J(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.JQ jq) throws com.facebook.ads.redexgen.core.C3K {
        A0G(c04434v, 0, jq);
    }

    public static void A0K(com.facebook.ads.redexgen.core.C04434v c04434v, com.facebook.ads.redexgen.core.JQ jq, byte[] bArr) throws com.facebook.ads.redexgen.core.C3K {
        c04434v.A0f(8);
        c04434v.A0k(bArr, 0, 16);
        if (!java.util.Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c04434v, 16, jq);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        int i = ((int) this.A07) - this.A00;
        com.facebook.ads.redexgen.core.C04434v c04434v = this.A0D;
        if (c04434v != null) {
            interfaceC1987ms.readFully(c04434v.A0l(), 8, i);
            A0U(new com.facebook.ads.redexgen.core.C1958mD(this.A01, c04434v), interfaceC1987ms.A8n(), interfaceC1987ms.A9P());
        } else {
            interfaceC1987ms.AK3(i);
        }
        A0F(interfaceC1987ms.A8n());
    }

    private void A0M(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.JA ja = null;
        long j = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.JA nextTrackBundle = this.A0L.valueAt(i);
            com.facebook.ads.redexgen.core.JQ jq = nextTrackBundle.A09;
            if (jq.A0A && jq.A03 < j) {
                j = jq.A03;
                ja = this.A0L.valueAt(i);
            }
        }
        if (ja == null) {
            this.A02 = 3;
            return;
        }
        int A8n = (int) (j - interfaceC1987ms.A8n());
        if (A8n >= 0) {
            interfaceC1987ms.AK3(A8n);
            ja.A09.A05(interfaceC1987ms);
            return;
        }
        throw com.facebook.ads.redexgen.core.C3K.A01(A0A(384, 39, 59), null);
    }

    private void A0N(com.facebook.ads.redexgen.core.C1959mE c1959mE) throws com.facebook.ads.redexgen.core.C3K {
        if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1959mE).A00 == 1836019574) {
            A0P(c1959mE);
            return;
        }
        if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1959mE).A00 == 1836019558) {
            A0O(c1959mE);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        com.facebook.ads.redexgen.core.C1959mE peek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new java.lang.RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        peek.A08(c1959mE);
    }

    private void A0O(com.facebook.ads.redexgen.core.C1959mE c1959mE) throws com.facebook.ads.redexgen.core.C3K {
        A0Q(c1959mE, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        com.facebook.ads.androidx.media3.common.DrmInitData A06 = A06(c1959mE.A02);
        if (A06 != null) {
            int i = this.A0L.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(A06);
            }
        }
        long j = this.A0B;
        if (A0a[5].length() != 30) {
            java.lang.String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j != -9223372036854775807L) {
                int size = this.A0L.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.facebook.ads.redexgen.core.JA valueAt = this.A0L.valueAt(i2);
                    long j2 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        valueAt.A0A(j2);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException();
    }

    private void A0P(com.facebook.ads.redexgen.core.C1959mE c1959mE) throws com.facebook.ads.redexgen.core.C3K {
        com.facebook.ads.redexgen.core.AbstractC04203y.A0A(this.A0U == null, A0A(680, 20, 8));
        com.facebook.ads.androidx.media3.common.DrmInitData A06 = A06(c1959mE.A02);
        com.facebook.ads.redexgen.core.C1959mE c1959mE2 = (com.facebook.ads.redexgen.core.C1959mE) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c1959mE.A06(1836475768));
        android.util.SparseArray<com.facebook.ads.redexgen.core.J1> sparseArray = new android.util.SparseArray<>();
        long j = -9223372036854775807L;
        int size = c1959mE2.A02.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.C1958mD c1958mD = c1959mE2.A02.get(i);
            if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 == 1953654136) {
                android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.J1> A04 = A04(c1958mD.A00);
                java.lang.Object obj = A04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new java.lang.RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((java.lang.Integer) obj).intValue(), (com.facebook.ads.redexgen.core.J1) A04.second);
            } else if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 == 1835362404) {
                j = A02(c1958mD.A00);
            }
        }
        java.util.List<com.facebook.ads.redexgen.core.JR> A0O = com.facebook.ads.redexgen.core.J0.A0O(c1959mE, new com.facebook.ads.redexgen.core.HK(), j, A06, (this.A0K & 16) != 0, false, new com.facebook.ads.redexgen.core.InterfaceC1847kO() { // from class: com.facebook.ads.redexgen.X.m9
            @Override // com.facebook.ads.redexgen.core.InterfaceC1847kO
            public final java.lang.Object A4B(java.lang.Object obj2) {
                return com.facebook.ads.redexgen.core.C1952m7.this.A0c((com.facebook.ads.redexgen.core.JO) obj2);
            }
        });
        int size2 = A0O.size();
        if (this.A0L.size() == 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                com.facebook.ads.redexgen.core.JR jr = A0O.get(i2);
                com.facebook.ads.redexgen.core.JO jo = jr.A03;
                this.A0L.put(jo.A00, new com.facebook.ads.redexgen.core.JA(this.A0E.AKS(i2, jo.A03), jr, A07(sparseArray, jo.A00)));
                this.A08 = java.lang.Math.max(this.A08, jo.A04);
            }
            this.A0E.A6O();
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A0L.size() == size2);
        for (int i3 = 0; i3 < size2; i3++) {
            com.facebook.ads.redexgen.core.JR jr2 = A0O.get(i3);
            com.facebook.ads.redexgen.core.JO jo2 = jr2.A03;
            this.A0L.get(jo2.A00).A0C(jr2, A07(sparseArray, jo2.A00));
        }
    }

    public static void A0Q(com.facebook.ads.redexgen.core.C1959mE c1959mE, android.util.SparseArray<com.facebook.ads.redexgen.core.JA> sparseArray, boolean z, int i, byte[] bArr) throws com.facebook.ads.redexgen.core.C3K {
        int size = c1959mE.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.C1959mE child = c1959mE.A01.get(i2);
            int i3 = ((com.facebook.ads.redexgen.core.AbstractC0785Iu) child).A00;
            if (i3 == 1953653094) {
                A0R(child, sparseArray, z, i, bArr);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0S(com.facebook.ads.redexgen.core.C1959mE c1959mE, com.facebook.ads.redexgen.core.JA ja, int i) throws com.facebook.ads.redexgen.core.C3K {
        int i2 = 0;
        int leafChildrenSize = 0;
        java.util.List<com.facebook.ads.redexgen.core.C1958mD> list = c1959mE.A02;
        int i3 = list.size();
        int i4 = 0;
        while (totalSampleCount != 30) {
            A0a[1] = "g5KWW";
            if (i4 < i3) {
                com.facebook.ads.redexgen.core.C1958mD c1958mD = list.get(i4);
                int trunCount = ((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00;
                if (trunCount == 1953658222) {
                    com.facebook.ads.redexgen.core.C04434v c04434v = c1958mD.A00;
                    c04434v.A0f(12);
                    int trunCount2 = c04434v.A0L();
                    if (trunCount2 > 0) {
                        leafChildrenSize += trunCount2;
                        i2++;
                    }
                }
                i4++;
            } else {
                ja.A02 = 0;
                ja.A00 = 0;
                ja.A01 = 0;
                ja.A09.A03(i2, leafChildrenSize);
                int i5 = 0;
                int trunCount3 = 0;
                for (int trunIndex = 0; trunIndex < i3; trunIndex++) {
                    com.facebook.ads.redexgen.core.C1958mD c1958mD2 = list.get(trunIndex);
                    int totalSampleCount = ((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD2).A00;
                    if (totalSampleCount == 1953658222) {
                        trunCount3 = A01(ja, i5, i, c1958mD2.A00, trunCount3);
                        i5++;
                    }
                }
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(com.facebook.ads.redexgen.core.C1958mD c1958mD, long j, android.net.Uri uri) throws com.facebook.ads.redexgen.core.C3K {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c1958mD);
            return;
        }
        if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 == 1936286840) {
            android.util.Pair<java.lang.Long, com.facebook.ads.redexgen.core.C1992my> A05 = A05(c1958mD.A00, j);
            java.lang.Long l = (java.lang.Long) A05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new java.lang.RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l.longValue();
            this.A0E.AJ7((com.facebook.ads.redexgen.core.HY) A05.second);
            this.A0G = true;
            return;
        }
        if (((com.facebook.ads.redexgen.core.AbstractC0785Iu) c1958mD).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c1958mD.A00, uri);
    }

    public static boolean A0W(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r4 != 1937013298) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4 == 1937007471) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r4 == 1668232756) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r4 == 1937011571) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r4 == 1952867444) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r4 == 1952868452) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r4 == 1953196132) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r4 == 1953654136) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r4 == 1953658222) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r4 == 1886614376) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r4 == 1935763834) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        if (r4 == 1935763823) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r4 == 1936027235) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (r4 == 1970628964) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (r4 == 1935828848) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r4 == 1936158820) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if (r4 == 1701606260) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r4 == 1835362404) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        if (r4 != 1701671783) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        if (r4 != 1937013298) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0X(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1937011827 && i != 1668576371 && i != 1937011555) {
            if (A0a[1].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0a;
            strArr[4] = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel";
            strArr[6] = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0";
            if (i != 1937011578) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[7] = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj";
                } else {
                    A0a[0] = "AuC";
                }
            }
        }
        return true;
    }

    private boolean A0Y(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        int trackCount;
        int i;
        if (this.A00 == 0) {
            com.facebook.ads.redexgen.core.C04434v c04434v = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC1987ms.AHR(c04434v.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int A0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = A0C;
                }
            }
            throw new java.lang.RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC1987ms.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long A8O = interfaceC1987ms.A8O();
            if (A8O == -1 && !this.A0V.isEmpty()) {
                A8O = this.A0V.peek().A00;
            }
            if (A8O != -1) {
                long A8n = A8O - interfaceC1987ms.A8n();
                int trackCount2 = this.A00;
                this.A07 = A8n + trackCount2;
            }
        }
        if (this.A07 >= this.A00) {
            long A8n2 = interfaceC1987ms.A8n() - this.A00;
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AJ7(new com.facebook.ads.redexgen.core.C1982mn(this.A08, A8n2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                android.util.SparseArray<com.facebook.ads.redexgen.core.JA> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i = 0;
                }
                while (i < trackCount) {
                    com.facebook.ads.redexgen.core.JQ jq = this.A0L.valueAt(i).A09;
                    jq.A02 = A8n2;
                    jq.A03 = A8n2;
                    jq.A04 = A8n2;
                    i++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + A8n2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long A8n3 = (interfaceC1987ms.A8n() + this.A07) - 8;
                this.A0V.push(new com.facebook.ads.redexgen.core.C1959mE(this.A01, A8n3));
                if (this.A07 == this.A00) {
                    A0F(A8n3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw com.facebook.ads.redexgen.core.C3K.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    com.facebook.ads.redexgen.core.C04434v c04434v2 = new com.facebook.ads.redexgen.core.C04434v((int) this.A07);
                    com.facebook.ads.redexgen.core.C04434v atomData = this.A0M;
                    java.lang.System.arraycopy(atomData.A0l(), 0, c04434v2.A0l(), 0, 8);
                    this.A0D = c04434v2;
                    this.A02 = 1;
                } else {
                    throw com.facebook.ads.redexgen.core.C3K.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw com.facebook.ads.redexgen.core.C3K.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw com.facebook.ads.redexgen.core.C3K.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AK3(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0246, code lost:
    
        throw com.facebook.ads.redexgen.core.C3K.A01(A0A(423, 35, 125), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b8, code lost:
    
        if (r9.equals(r10) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ba, code lost:
    
        r11 = r11 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0303, code lost:
    
        if (r9.equals(r10) != false) goto L91;
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0Z(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        int AIp;
        com.facebook.ads.redexgen.core.JA ja = this.A0F;
        java.lang.Throwable th = null;
        if (ja == null) {
            android.util.SparseArray<com.facebook.ads.redexgen.core.JA> sparseArray = this.A0L;
            if (A0a[0].length() == 3) {
                A0a[0] = "dJt";
                ja = A08(sparseArray);
                if (ja == null) {
                    int A8n = (int) (this.A09 - interfaceC1987ms.A8n());
                    if (A0a[3].charAt(19) != 'e') {
                        A0a[5] = "OgjcUdmzkFJtvCkNjJUwSL6BC";
                    } else {
                        java.lang.String[] strArr = A0a;
                        strArr[4] = "drajDSJT48ogOqJP7e4ZIkjylQBmqc38";
                        strArr[6] = "jG2fRwUYgKH0Z3F7iVLG52YSPeKVDlpp";
                    }
                } else {
                    int A05 = (int) (ja.A05() - interfaceC1987ms.A8n());
                    if (A05 < 0) {
                        com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0A(204, 22, 75), A0A(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 40, 13));
                        A05 = 0;
                    }
                    interfaceC1987ms.AK3(A05);
                    this.A0F = ja;
                }
            }
            throw new java.lang.RuntimeException();
        }
        int i = 4;
        int i2 = 1;
        if (this.A02 == 3) {
            this.A06 = ja.A03();
            if (ja.A01 < ja.A03) {
                interfaceC1987ms.AK3(this.A06);
                ja.A09();
                if (!ja.A0D()) {
                    this.A0F = null;
                }
                this.A02 = 3;
                return true;
            }
            if (ja.A05.A03.A02 == 1) {
                this.A06 -= 8;
                interfaceC1987ms.AK3(8);
            }
            if (A0A(878, 9, 31).equals(ja.A05.A03.A07.A0W)) {
                this.A04 = ja.A04(this.A06, 7);
                com.facebook.ads.redexgen.core.AbstractC0734Gu.A07(this.A06, this.A0Q);
                ja.A08.AIr(this.A0Q, 7);
                this.A04 += 7;
            } else {
                this.A04 = ja.A04(this.A06, 0);
            }
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        com.facebook.ads.redexgen.core.JO jo = ja.A05.A03;
        if (A0a[1].length() != 3) {
            A0a[7] = "UjEa6ysv1gVuBQ9NSSQbVZdjDRxN5dgX";
            com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd = ja.A08;
            long A06 = ja.A06();
            if (this.A0R != null) {
                com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53 = this.A0R;
                if (A0a[7].charAt(28) != 'N') {
                    A0a[2] = "ZxJoJWsimIFBA6WXS2a50b6K01MwI4cU";
                    A06 = anonymousClass53.A05(A06);
                } else {
                    A06 = anonymousClass53.A05(A06);
                }
            }
            if (jo.A01 == 0) {
                while (this.A04 < this.A06) {
                    this.A04 += interfaceC0743Hd.AIp(interfaceC1987ms, this.A06 - this.A04, false);
                }
            } else {
                byte[] A0l = this.A0O.A0l();
                A0l[0] = 0;
                A0l[1] = 0;
                A0l[2] = 0;
                int i3 = jo.A01 + 1;
                int i4 = 4 - jo.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC1987ms.readFully(A0l, i4, i3);
                        this.A0O.A0f(0);
                        int A0C = this.A0O.A0C();
                        if (A0C >= i2) {
                            this.A05 = A0C - 1;
                            this.A0P.A0f(0);
                            interfaceC0743Hd.AIr(this.A0P, i);
                            interfaceC0743Hd.AIr(this.A0O, i2);
                            if (A0a[5].length() == 30) {
                                throw new java.lang.RuntimeException();
                            }
                            A0a[7] = "3HbOupLLxbWrXLbfJiyKVwL3oOoB4yeP";
                            this.A0H = this.A0I.length > 0 && com.facebook.ads.redexgen.core.HS.A0I(jo.A07.A0W, A0l[i]);
                            this.A04 += 5;
                            this.A06 += i4;
                            i2 = 1;
                        } else {
                            throw com.facebook.ads.redexgen.core.C3K.A01(A0A(266, 18, 117), th);
                        }
                    } else {
                        if (this.A0H) {
                            this.A0N.A0d(this.A05);
                            interfaceC1987ms.readFully(this.A0N.A0l(), 0, this.A05);
                            interfaceC0743Hd.AIr(this.A0N, this.A05);
                            AIp = this.A05;
                            int A02 = com.facebook.ads.redexgen.core.HS.A02(this.A0N.A0l(), this.A0N.A0A());
                            this.A0N.A0f(A0A(887, 10, 116).equals(jo.A07.A0W) ? 1 : 0);
                            this.A0N.A0e(A02);
                            com.facebook.ads.redexgen.core.H3.A03(A06, this.A0N, this.A0I);
                        } else {
                            AIp = interfaceC0743Hd.AIp(interfaceC1987ms, this.A05, false);
                        }
                        this.A04 += AIp;
                        this.A05 -= AIp;
                        th = null;
                        i = 4;
                        i2 = 1;
                    }
                }
            }
            int A022 = ja.A02();
            com.facebook.ads.redexgen.core.C0741Hb c0741Hb = null;
            com.facebook.ads.redexgen.core.JP A07 = ja.A07();
            if (A07 != null) {
                c0741Hb = A07.A01;
            }
            if (!com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A1L) && this.A0F != null) {
                java.lang.String str = this.A0F.A05.A03.A07.A0W;
                java.lang.String A0A = A0A(857, 21, 115);
                if (A0a[7].charAt(28) != 'N') {
                    A0a[2] = "aQkaLsEF9G127UYNPtKAhcOp5GPMu7GC";
                }
            }
            long j = A06;
            interfaceC0743Hd.AIu(A06, A022, this.A06, 0, c0741Hb);
            this.A0A = j;
            A0E(j);
            if (!ja.A0D()) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[2] = "Oznva4TpQIm3xwCXLn5zZ8MtjPilTYJm";
                    this.A0F = null;
                } else {
                    java.lang.String[] strArr2 = A0a;
                    strArr2[4] = "tQydpv41IRe8SJWpvpJnsmPT1e9HbOAv";
                    strArr2[6] = "ocIdfF7b9GnVk3ZHQkLuHXJpp6hE4I0I";
                    this.A0F = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        throw new java.lang.RuntimeException();
    }

    public static boolean A0a(com.facebook.ads.redexgen.core.JO jo) {
        if (jo.A08 == null || jo.A08.length != 1 || jo.A09 == null) {
            return false;
        }
        if (jo.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = com.facebook.ads.redexgen.core.C5C.A0U(jo.A08[0] + jo.A09[0], 1000000L, jo.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new java.lang.RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= jo.A04;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A0b() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1951m6()};
    }

    public final com.facebook.ads.redexgen.core.JO A0c(com.facebook.ads.redexgen.core.JO jo) {
        return jo;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A0E = ha;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new com.facebook.ads.redexgen.core.JA(ha.AKS(0, this.A0U.A03), new com.facebook.ads.redexgen.core.JR(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new com.facebook.ads.redexgen.core.J1(0, 0, 0, 0)));
            this.A0E.A6O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC1987ms)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0L(interfaceC1987ms);
                    break;
                case 2:
                    A0M(interfaceC1987ms);
                    break;
                default:
                    if (!A0Z(interfaceC1987ms)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            this.A0L.valueAt(i).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        return com.facebook.ads.redexgen.core.JM.A01(interfaceC1987ms);
    }
}
