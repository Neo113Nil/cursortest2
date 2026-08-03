package com.facebook.ads.redexgen.core;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1831k7 {
    public static java.lang.String[] A00 = {"lKk5JaLmUx95KK", "mYuNW", "CjAKdLXppofA1D702KwO", "uXJpTDaVRtNVAp70rLVfm", "1hSAC5HvnjUxrHV2J", "HaqnzSsBrGrjOCqNCVI", "GKVrteGYxon0I6T9VCiXJnLEHrJ03INP", "n4WaWuAzWRB0VbcGBeRJywBcIsl3WCc7"};

    public static int A00(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static java.lang.String A01(java.lang.String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (A02(string.charAt(i))) {
                char[] chars = string.toCharArray();
                while (i < length) {
                    char c = chars[i];
                    if (A02(c)) {
                        int length2 = c ^ ' ';
                        chars[i] = (char) length2;
                    }
                    i++;
                }
                java.lang.String valueOf = java.lang.String.valueOf(chars);
                int i2 = A00[5].length();
                if (i2 == 28) {
                    throw new java.lang.RuntimeException();
                }
                A00[5] = "jxLLbSZUx5pXLcCA85YTs8Y";
                return valueOf;
            }
            i++;
        }
        return string;
    }

    public static boolean A02(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean A03(java.lang.CharSequence s1, java.lang.CharSequence s2) {
        int length = s1.length();
        if (s1 == s2) {
            return true;
        }
        int length2 = s2.length();
        if (length != length2) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = s1.charAt(i);
            char charAt2 = s2.charAt(i);
            if (charAt != charAt2) {
                int A002 = A00(charAt);
                if (A00[6].charAt(27) != '0') {
                    throw new java.lang.RuntimeException();
                }
                A00[6] = "1S1N8LGAQqFvlHlBSY2lJ7CUB7v0Wvcl";
                if (A002 < 26) {
                    int length3 = A00(charAt2);
                    if (A002 == length3) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
