package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1150Xg {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static java.lang.String A01(long j) {
        java.lang.String sb;
        java.lang.String A002 = A00(0, 0, 78);
        if (j < 1000) {
            sb = j + A002;
        } else {
            java.lang.String A003 = A00(0, 4, 79);
            if (j < 1000000) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String formattedNumber = java.lang.String.format(java.util.Locale.US, A003, java.lang.Double.valueOf(j / 1000.0d));
                java.lang.StringBuilder append = sb2.append(formattedNumber);
                java.lang.String formattedNumber2 = A00(8, 1, 55);
                sb = append.append(formattedNumber2).toString();
            } else if (j < 1000000000) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.String formattedNumber3 = java.lang.String.format(java.util.Locale.US, A003, java.lang.Double.valueOf(j / 1000000.0d));
                java.lang.StringBuilder append2 = sb3.append(formattedNumber3);
                java.lang.String formattedNumber4 = A00(9, 1, 46);
                sb = append2.append(formattedNumber4).toString();
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                java.lang.String formattedNumber5 = java.lang.String.format(java.util.Locale.US, A003, java.lang.Double.valueOf(j / 1.0E9d));
                java.lang.StringBuilder append3 = sb4.append(formattedNumber5);
                java.lang.String formattedNumber6 = A00(7, 1, 67);
                sb = append3.append(formattedNumber6).toString();
            }
        }
        java.lang.String A004 = A00(4, 3, 1);
        if (sb.contains(A004)) {
            return sb.replace(A004, A002);
        }
        return sb;
    }
}
