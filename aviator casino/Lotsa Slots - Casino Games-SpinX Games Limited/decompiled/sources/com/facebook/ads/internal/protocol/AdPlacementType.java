package com.facebook.ads.internal.protocol;

/* loaded from: assets/audience_network/classes2.dex */
public enum AdPlacementType {
    BANNER(A00(74, 6, 36)),
    MEDIUM_RECTANGLE(A00(92, 16, 88)),
    INTERSTITIAL(A00(80, 12, 40)),
    NATIVE(A00(108, 6, 13)),
    NATIVE_BANNER(A00(114, 13, 119)),
    REWARDED_VIDEO(A00(127, 14, 85)),
    UNKNOWN(A00(141, 7, 17));

    public static byte[] A01;
    public static java.lang.String[] A02 = {"CWC1iyAzuHCyWu1B0SYAHTA3miIxyRDu", "FO468KlqU7YYiE83Le7T5pQKY2foYhCa", "4lSmmc8pBcjbV0on62ZikVJFYVLsdMQp", "9H0k66zkYNaHG7pLFG5T73JVLywfdj", "IkTzUK68woTPnHHBk", "q5XpLTEZbHtnyzZXCKIvrGbFL2My8Wb0", "rdQ7fJEKRbVHtvxpiCxMwn5qtJ9qGM1n", "xGvuYGSPJhOX4"};
    public java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(3) != '7') {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "CTk8rnXs6cBCh";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-35, -36, -23, -23, -32, -19, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, 41, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, 17, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SI, -33, -46, -27, -38, -25, -42, -13, -26, -7, -18, -5, -22, 4, -25, -26, -13, -13, -22, -9, 44, com.google.common.base.Ascii.US, 49, com.google.common.base.Ascii.ESC, 44, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 57, 48, 35, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 41, com.google.common.base.Ascii.DLE, 9, 6, 9, 10, com.google.common.base.Ascii.DC2, 9, 5, 4, 17, 17, 8, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, 8, 19, 68, 60, 59, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 68, 54, 73, 60, 58, 75, 56, 69, 62, 67, 60, -6, -19, 0, -11, 2, -15, 100, 87, 106, 95, 108, 91, 85, 88, 87, 100, 100, 91, 104, 70, 57, 75, 53, 70, 56, 57, 56, 51, 74, kotlin.io.encoding.Base64.padSymbol, 56, 57, 67, 5, -2, -5, -2, -1, 7, -2};
    }

    static {
        A01();
    }

    AdPlacementType(java.lang.String str) {
        this.A00 = str;
    }

    public static com.facebook.ads.internal.protocol.AdPlacementType fromString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(java.util.Locale.US));
        } catch (java.lang.Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.A00;
    }
}
