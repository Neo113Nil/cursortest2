package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1152Xi {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 50, 48, 115, 59, 60, 62, 56, 63, 50, 50, 54, 115, 54, 60, 41, 60, 51, 60};
    }

    public static android.content.pm.PackageInfo A00(com.facebook.ads.redexgen.core.T8 t8) {
        return A01(t8, A02(0, 19, 49));
    }

    public static android.content.pm.PackageInfo A01(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        android.content.pm.PackageManager packageManager;
        if (android.text.TextUtils.isEmpty(str) || (packageManager = t8.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        } catch (java.lang.RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo = A01(t8, str);
        return packageInfo != null;
    }
}
