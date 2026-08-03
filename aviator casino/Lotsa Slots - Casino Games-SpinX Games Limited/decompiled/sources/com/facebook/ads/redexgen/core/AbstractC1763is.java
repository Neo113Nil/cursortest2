package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.is, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1763is {
    public static java.lang.String A00;
    public static java.lang.String A01;
    public static byte[] A02;
    public static final java.util.Random A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, com.google.common.base.Ascii.CR, 4, 5, 65, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 65, 19, 4, com.google.common.base.Ascii.NAK, 19, 8, 4, com.google.common.base.Ascii.ETB, 4, 65, 44, 4, 5, 8, 0, 39, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.FF, 0, com.google.common.base.Ascii.NAK, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, com.google.common.base.Ascii.CR, 108, 100, com.google.common.base.Ascii.CR, 107, Byte.MAX_VALUE, 110, com.google.common.base.Ascii.CR, 124, 107, 105, com.google.common.base.Ascii.CR, 65, 72, 91, 72, 65, com.google.common.base.Ascii.CR, 89, 66, com.google.common.base.Ascii.CR, 8, 73, 59, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, 72, 41, 33, 72, 46, 58, 43, 72, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 72, com.google.common.base.Ascii.FS, 7, 72, 89, com.google.common.base.Ascii.FF, 58, 43, Byte.MAX_VALUE, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, Byte.MAX_VALUE, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, Byte.MAX_VALUE, 41, 54, 59, 58, 48, Byte.MAX_VALUE, 59, 42, 45, 62, 43, 54, 48, 49, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 122, 59, 37, 40, 36, 42, 37, 57, 19, com.google.common.base.Ascii.SO, 10, 2, 8, com.google.common.base.Ascii.DC2, 19, 56, 19, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SO, 9, 0, 56, 19, 8, 56, 1, com.google.common.base.Ascii.SO, 9, 3, 56, com.google.common.base.Ascii.DC4, 2, 0, 10, 2, 9, 19, 56, com.google.common.base.Ascii.SO, 9, 56, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 87, 10, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, 84, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.US, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SUB, 84, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, 84, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FS, 10, com.google.common.base.Ascii.CR, 87, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FS, 112, 99, 104, 98, 105, 116, 40, 117, 99, 101, 43, 103, 111, 96, 116, 101, 43, 112, 111, 98, 99, 105, 43, 98, 115, 116, 103, 114, 111, 105, 104, 40, 112, 103, 106, 115, 99, 78, 93, 86, 92, 87, 74, com.google.common.base.Ascii.SYN, 75, 93, 91, com.google.common.base.Ascii.NAK, 89, 81, 94, 74, 91, com.google.common.base.Ascii.NAK, 78, 81, 92, 93, 87, com.google.common.base.Ascii.NAK, 73, 94, 92, com.google.common.base.Ascii.NAK, 84, 93, 78, 93, 84, com.google.common.base.Ascii.SYN, 78, 89, 84, 77, 93, 89, 71, 74, 90, 70};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 37, 109);
        A03 = new java.util.Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((java.lang.Math.pow(2.0d, i - 1) * i2 * 1000.0d) + A03.nextInt(2000));
        }
        return (int) java.lang.Math.min(((i - 1) * 1000) + 500, 5000L);
    }

    public static void A03(com.facebook.ads.redexgen.core.C1792jQ c1792jQ, android.media.MediaFormat mediaFormat) {
        java.lang.String A012 = A01(0, 30, 107);
        java.lang.String A013 = A01(30, 11, 11);
        if (!c1792jQ.A01) {
            return;
        }
        try {
            if (com.facebook.ads.redexgen.core.C1761iq.A02()) {
                if (c1792jQ.A0P && !com.facebook.ads.redexgen.core.C1761iq.A03(mediaFormat.getInteger(A01(290, 5, 36)), mediaFormat.getInteger(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 6, 71)))) {
                    return;
                }
                long j = c1792jQ.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 37, 12), j);
                    com.facebook.ads.redexgen.core.AbstractC1693hd.A01(A013, A01(102, 31, 85), java.lang.Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(252, 38, 50), c1792jQ.A02);
                com.facebook.ads.redexgen.core.AbstractC1693hd.A01(A013, A01(53, 26, 39), java.lang.Integer.valueOf(c1792jQ.A02));
                mediaFormat.setInteger(A01(176, 39, 115), 1);
                com.facebook.ads.redexgen.core.AbstractC1693hd.A00(A013, A01(79, 23, 98));
            }
        } catch (java.lang.ClassCastException e) {
            com.facebook.ads.redexgen.core.AbstractC1693hd.A02(A013, A012, e);
        } catch (java.lang.NullPointerException e2) {
            com.facebook.ads.redexgen.core.AbstractC1693hd.A02(A013, A012, e2);
        }
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C1792jQ c1792jQ, int i, int i2, int i3, int i4) {
        if (c1792jQ.A01 && c1792jQ.A0P && com.facebook.ads.redexgen.core.C1761iq.A03(i, i2) != com.facebook.ads.redexgen.core.C1761iq.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}
