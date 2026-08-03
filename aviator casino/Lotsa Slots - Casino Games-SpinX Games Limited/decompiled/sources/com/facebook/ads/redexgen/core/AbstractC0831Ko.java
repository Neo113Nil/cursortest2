package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0831Ko {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"rzG5nsHyiLOWX8UOWspYPJE0qk8", "zzN7h9kZ1110Ms84Vk8TxNIxLbkfn1bs", "Ea1csqz6uGTsOrOcIglVsCF", "HzbrV2YdC0QyP2mr3Tf3UtzOp", "wDtYJLWcmo8biPQhT7PXhiXa0nvGQfME", "EfdNeKI6mNZbvmHLu3zFEqD29", "z9B2Nu2EMki8SlMmHuJ5tm0bMARcwAxE", "Vyy1RSqHmZDwxzuj6K"};
    public static final java.util.regex.Pattern A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{115, 108, 48, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, 1, com.google.common.base.Ascii.DLE, 17, 85, 34, 48, 55, 35, 33, 33, 91, 85, 50, com.google.common.base.Ascii.SUB, 1, 85, 76, 121, 110, Byte.MAX_VALUE, 121, 114, 104, 125, 123, 121, 111, 60, 113, 105, 111, 104, 60, 121, 114, 120, 60, 107, 117, 104, 116, 60, 57, 87, 69, 66, 86, 84, 84, 121, com.google.common.base.Ascii.VT, 74, 90, 91, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 60, 79, 52, com.google.common.base.Ascii.GS, 73, 58, 62, kotlin.io.encoding.Base64.padSymbol, 43, 48};
    }

    static {
        A03();
        A02 = java.util.regex.Pattern.compile(A02(58, 15, 19));
    }

    public static float A00(java.lang.String str) throws java.lang.NumberFormatException {
        if (str.endsWith(A02(0, 1, 81))) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException(A02(23, 27, 27));
    }

    public static long A01(java.lang.String str) throws java.lang.NumberFormatException {
        long j = 0;
        java.lang.String[] subparts = com.facebook.ads.redexgen.core.C5C.A1P(str, A02(56, 2, 34));
        for (java.lang.String str2 : com.facebook.ads.redexgen.core.C5C.A1O(subparts[0], A02(1, 1, 81))) {
            long j2 = 60 * j;
            if (A01[0].length() != 27) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] parts = A01;
            parts[2] = "6AHxBA9eqgTuoeEClHZkEfjq11VkmmF";
            long value = java.lang.Long.parseLong(str2);
            j = j2 + value;
        }
        long j3 = j * 1000;
        if (subparts.length == 2) {
            long value2 = java.lang.Long.parseLong(subparts[1]);
            j3 += value2;
        }
        return 1000 * j3;
    }

    public static void A04(com.facebook.ads.redexgen.core.C04434v c04434v) throws com.facebook.ads.redexgen.core.C3K {
        int A09 = c04434v.A09();
        if (A05(c04434v)) {
            return;
        }
        c04434v.A0f(A09);
        throw com.facebook.ads.redexgen.core.C3K.A01(A02(2, 21, 114) + c04434v.A0T(), null);
    }

    public static boolean A05(com.facebook.ads.redexgen.core.C04434v c04434v) {
        java.lang.String A0T = c04434v.A0T();
        if (A0T != null) {
            java.lang.String line = A02(50, 6, 7);
            if (A0T.startsWith(line)) {
                return true;
            }
        }
        return false;
    }
}
