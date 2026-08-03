package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class K9 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"HuWf33fpJVnWiQs5jgU1coBxnkVs6NRv", "s99wI42TXu9zb6TF", "znB4eml4mMdVjhFim0h8Ic", "vwm3UU3z6IIrXLlJTF572ZAqfrELMHnc", "3Hoi8QCDYq5dLz7zrQI8B3P9CeceMza0", "88mhCIZfB8fBAcvooczZpqGcVMp3sArj", "twULWMK01HtAAxLhlSW3WXsxhxQi2bS3", "0mJGu"};
    public static final java.util.regex.Pattern A04;
    public static final java.util.regex.Pattern A05;
    public static final java.util.regex.Pattern A06;
    public static final java.util.regex.Pattern A07;
    public final int A00;
    public final android.graphics.PointF A01;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{71, 124, 69, 86, 65, 65, 90, 87, 86, 19, 91, 82, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 19, 81, 92, 71, 91, 19, 111, 67, 92, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.ESC, 75, com.google.common.base.Ascii.US, 74, com.google.common.base.Ascii.SUB, 19, 82, 93, 87, 19, 111, 94, 92, 69, 86, com.google.common.base.Ascii.ESC, 75, 2, com.google.common.base.Ascii.US, 74, 2, com.google.common.base.Ascii.US, 75, 1, com.google.common.base.Ascii.US, 74, 1, com.google.common.base.Ascii.SUB, 8, 19, 70, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, 93, 84, 19, 111, 67, 92, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 19, 69, 82, 95, 70, 86, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.GS, 19, 92, 69, 86, 65, 65, 90, 87, 86, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, 45, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.US, 45, 10, 7, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, 80, 49, 8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, 33, 46, 104, com.google.common.base.Ascii.FS, 36, 107, 105, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, 62, 60, 37, 54, com.google.common.base.Ascii.SI, 123, 118, 98, 119, 32, Byte.MAX_VALUE, 118, 98, 119, 32, Byte.MAX_VALUE, 123, 118, 98, 119, 32, 122, Byte.MAX_VALUE, 123, 118, 98, 119, 32, 122, 123, 108, 105, Byte.MAX_VALUE, 118, 98, 119, 32, Byte.MAX_VALUE, 118, 98, 119, 32, 122, 108, com.google.common.base.Ascii.SI, 122, 65, 65, 109, 114, 110, 65, 53, 53, 56, 44, 57, 110, 52, 49, 53, 56, 44, 57, 110, 52, 65, 52, 56, com.google.common.base.Ascii.ETB, 78, 56, 0, 79, 76, 91, 94, 56, 74, 56, 0, 79, 77, 91, 56, com.google.common.base.Ascii.ETB, 78, 70, 97, 50, 65, 68, 103, 71, 48, 51, 70, 103};
    }

    static {
        A05();
        A05 = java.util.regex.Pattern.compile(A03(198, 11, 23));
        java.lang.String A032 = A03(179, 19, 105);
        A07 = java.util.regex.Pattern.compile(com.facebook.ads.redexgen.core.C5C.A0n(A03(157, 22, 16), A032));
        A06 = java.util.regex.Pattern.compile(com.facebook.ads.redexgen.core.C5C.A0n(A03(109, 48, 94), A032));
        A04 = java.util.regex.Pattern.compile(A03(100, 9, 77));
    }

    public K9(int i, android.graphics.PointF pointF) {
        this.A00 = i;
        this.A01 = pointF;
    }

    public static int A00(java.lang.String str) {
        int A01;
        java.util.regex.Matcher matcher = A04.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        if (A03[1].length() == 17) {
            throw new java.lang.RuntimeException();
        }
        A03[2] = "vLvehkH4B3ak8JU9onbvIk";
        A01 = com.facebook.ads.redexgen.core.KC.A01((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(matcher.group(1)));
        return A01;
    }

    public static android.graphics.PointF A01(java.lang.String str) {
        java.lang.String group;
        java.lang.String group2;
        java.util.regex.Matcher matcher = A07.matcher(str);
        java.util.regex.Matcher matcher2 = A06.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A06(A03(82, 18, 115), A03(1, 81, 62) + str + A03(0, 1, 109));
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (find2) {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        } else {
            return null;
        }
        return new android.graphics.PointF(java.lang.Float.parseFloat(((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(group)).trim()), java.lang.Float.parseFloat(((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(group2)).trim()));
    }

    public static com.facebook.ads.redexgen.core.K9 A02(java.lang.String str) {
        int parsedAlignment = -1;
        android.graphics.PointF pointF = null;
        java.util.regex.Matcher matcher = A05.matcher(str);
        while (true) {
            boolean find = matcher.find();
            if (A03[1].length() == 17) {
                break;
            }
            A03[2] = "4wlmcdEyXnPZaqMgrsXq3d";
            if (find) {
                java.lang.String group = matcher.group(1);
                if (A03[1].length() == 17) {
                    break;
                }
                A03[2] = "M6jPqZAMoTJlOEJJxCI750";
                java.lang.String str2 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(group);
                try {
                    android.graphics.PointF position = A01(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (java.lang.RuntimeException unused) {
                }
                try {
                    int A00 = A00(str2);
                    if (A00 != -1) {
                        parsedAlignment = A00;
                    }
                } catch (java.lang.RuntimeException unused2) {
                }
            } else {
                return new com.facebook.ads.redexgen.core.K9(parsedAlignment, pointF);
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static java.lang.String A04(java.lang.String str) {
        return A05.matcher(str).replaceAll(A03(0, 0, 78));
    }
}
