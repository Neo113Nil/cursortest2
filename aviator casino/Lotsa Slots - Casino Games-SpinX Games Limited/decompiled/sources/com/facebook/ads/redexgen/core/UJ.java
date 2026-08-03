package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class UJ {
    public static java.lang.String A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A03;
    public static final java.util.concurrent.atomic.AtomicBoolean A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, -10, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 19, -18, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, -23, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.FF, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, -64, -54, -63, -83, -53, -42, -46, -29, -26, -65, -63, -67, -68, -67, -86, -55, -59, -39, -42, -78, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 57, 79, 62, 69, 60, 60, 54, 79, 76, 79, 80, 88, 79, -9, 57, 69, 67, 4, 60, 55, 57, 59, 56, 69, 69, 65, 4, 55, 58, 73, 4, 63, 68, 74, 59, 72, 68, 55, 66, 4, 75, 55, 52, 50, 59, 50, 63, 54, 48, com.google.common.base.Ascii.EM, 37, 37, 33, -33, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, 37, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, 9, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, -20, -22, -36, -23, -42, -40, -34, -36, -27, -21, -42, -29, -40, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, 41, 38, 35, 58, 45, 41, 59};
    }

    static {
        A07();
        A00 = A00(80, 7, 107);
        A04 = new java.util.concurrent.atomic.AtomicBoolean();
        A03 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.T8 t8) {
        return android.webkit.WebSettings.getDefaultUserAgent(t8);
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.T8 t8) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.facebook.ads.redexgen.core.UI(t8));
        for (int i = 0; i < 3; i++) {
            com.facebook.ads.redexgen.core.Y4.A00(futureTask);
            try {
                return (java.lang.String) futureTask.get();
            } catch (java.lang.Throwable th) {
                A08(t8, th);
                android.os.SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1059To c1059To) {
        java.lang.String A07 = c1059To.A07();
        if (android.text.TextUtils.isEmpty(A07) && !A04.getAndSet(true)) {
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = t8.A08();
            int i = com.facebook.ads.redexgen.core.AbstractC1048Td.A1Z;
            java.lang.String bundle = A00(73, 7, 122);
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(bundle);
            java.lang.String bundle2 = A00(116, 7, 87);
            A08.ABC(bundle2, i, c1049Te);
        }
        return A07;
    }

    public static java.lang.String A04(com.facebook.ads.redexgen.core.T8 t8, boolean z) {
        if (t8 == null) {
            return A00;
        }
        if (z) {
            return java.lang.System.getProperty(A00(123, 10, 59));
        }
        java.lang.String str = A03.get();
        if (str != null) {
            return str;
        }
        long spUserAgentRefresh = com.facebook.ads.redexgen.core.AbstractC1085Uo.A01(t8);
        java.lang.String A002 = A00(143, 23, 1);
        java.lang.String A003 = A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 10, 52);
        java.lang.String A004 = A00(88, 28, 96);
        if (spUserAgentRefresh > 0) {
            android.content.SharedPreferences sharedPreferences = t8.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A004, t8), 0);
            java.lang.String string = sharedPreferences.getString(A003, null);
            long j = sharedPreferences.getLong(A002, 0L);
            if (!android.text.TextUtils.isEmpty(string) && java.lang.System.currentTimeMillis() - j < spUserAgentRefresh) {
                A03.set(string);
                java.lang.String[] strArr = A02;
                java.lang.String str2 = strArr[6];
                java.lang.String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        java.lang.String str3 = null;
        try {
            str3 = A01(t8);
            A03.set(str3);
        } catch (java.lang.Throwable t) {
            A08(t8, t);
        }
        if (str3 == null) {
            str3 = A02(t8);
        }
        if (str3 == null) {
            return A00;
        }
        if (spUserAgentRefresh > 0) {
            android.content.SharedPreferences sharedPreferences2 = t8.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A004, t8), 0);
            sharedPreferences2.edit().putString(A003, A03.get()).apply();
            sharedPreferences2.edit().putLong(A002, java.lang.System.currentTimeMillis()).apply();
        }
        return str3;
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.C1059To c1059To, com.facebook.ads.redexgen.core.T8 t8) {
        if (com.facebook.ads.redexgen.core.AbstractC1085Uo.A04(t8)) {
            return A00(63, 5, 5) + A03(t8, c1059To) + A00(39, 6, 61) + c1059To.A06() + A00(45, 6, 61) + c1059To.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static java.lang.String A06(com.facebook.ads.redexgen.core.C1059To c1059To, com.facebook.ads.redexgen.core.T8 t8, boolean z) {
        return A04(t8, z) + A00(0, 38, 50) + t8.A05().A9S() + A00(57, 6, 26) + com.facebook.ads.redexgen.core.C1059To.A04 + A00(38, 1, 85) + A05(c1059To, t8) + A00(68, 5, 13) + t8.A05().A9T() + A00(51, 6, 8) + java.util.Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A08(com.facebook.ads.redexgen.core.T8 t8, java.lang.Throwable th) {
        t8.A08().ABC(A00(166, 8, 78), com.facebook.ads.redexgen.core.AbstractC1048Td.A2i, new com.facebook.ads.redexgen.core.C1049Te(th));
    }
}
