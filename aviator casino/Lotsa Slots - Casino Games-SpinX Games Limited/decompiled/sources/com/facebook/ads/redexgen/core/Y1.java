package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class Y1 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"kzsYhm9LKsU0BkYF5GBD4cHOfO5I2S", "FiiX6q", "juV27aOscABEXHLMFQmBucT", "1EXxaj", "f1sOyyKe81qkTfSynlEtElAllv4GRKo", "lzeqJRba", "GXB72S", "F9UQYukVDOEwI1lxcupNtKixpZh4OtVr"};
    public static final com.facebook.ads.redexgen.core.Y0 A02 = null;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 86, 3, com.google.common.base.Ascii.ETB, 8, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, 50, kotlin.io.encoding.Base64.padSymbol, 116, 39, 115, 53, 60, 33, 62, 50, 39, 115, 39, 58, 62, 54, 125};
    }

    static {
        A08();
    }

    public static long A00() {
        if (A02 != null) {
            return A02.A5n();
        }
        return java.lang.System.currentTimeMillis();
    }

    public static long A01(long j) {
        return A02(j, java.lang.System.currentTimeMillis());
    }

    public static long A02(long j, long j2) {
        if (j == -1) {
            return -1L;
        }
        return j2 - j;
    }

    public static java.lang.String A03(double d) {
        try {
            return java.lang.String.format(java.util.Locale.US, A04(0, 4, 115), java.lang.Double.valueOf(d));
        } catch (java.lang.Exception e) {
            java.lang.String simpleName = com.facebook.ads.redexgen.core.Y1.class.getSimpleName();
            if (A01[3].length() == 20) {
                java.lang.Exception e2 = new java.lang.RuntimeException();
                throw e2;
            }
            A01[0] = "ylDYykVZ0MQgZWbzvTC4Y0QCoTAruV";
            android.util.Log.e(simpleName, A04(9, 18, 69), e);
            return A04(4, 5, 48);
        }
    }

    public static java.lang.String A05(long j) {
        return java.lang.String.valueOf(A01(j));
    }

    @java.lang.Deprecated
    public static java.lang.String A06(long j) {
        return A03(j / 1000.0d);
    }

    public static java.lang.String A07(long j) {
        return java.lang.Long.toString(j);
    }
}
