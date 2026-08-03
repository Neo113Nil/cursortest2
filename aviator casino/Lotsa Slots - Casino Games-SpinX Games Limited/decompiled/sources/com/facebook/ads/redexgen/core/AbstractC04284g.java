package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC04284g {
    public static int A00;
    public static com.facebook.ads.redexgen.core.InterfaceC04274f A01;
    public static boolean A02;
    public static byte[] A03;
    public static java.lang.String[] A04 = {"pjC", "Ar4G3OSxcgl2D", "AarUE2nt7cnp4GdKoelKCQn2Jt4OXyEc", "B5uTmPcht7q4WCzfelpVRln9dVKzTr9W", "36fORse15dXsGKgrcWq47HxFqRHPKtSm", "Eh56lsHHP32qxPGDjQKhG4rai7NSZl8p", "QN71kq8063jCyPpsf", "zuMcuSAj79dOj6A3T"};
    public static final java.lang.Object A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A04[1].length() == 28) {
                throw new java.lang.RuntimeException();
            }
            A04[0] = "EwS";
            copyOfRange[i4] = (byte) (i5 - 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-58, -65, Byte.MAX_VALUE, -107, -107, 4, 4, 4, 4, -8, 17, com.google.common.base.Ascii.SO, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, 17, -21, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, -24, com.google.common.base.Ascii.ESC, 6, 8, 19, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, 17, -61, -53, 17, com.google.common.base.Ascii.DC2, -61, 17, 8, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, -52};
    }

    static {
        A03();
        A05 = new java.lang.Object();
        A00 = 0;
        A02 = true;
        A01 = com.facebook.ads.redexgen.core.InterfaceC04274f.A00;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String A01(java.lang.String str, java.lang.Throwable th) {
        java.lang.String A022 = A02(th);
        if (!android.text.TextUtils.isEmpty(A022)) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
            java.lang.String A002 = A00(2, 3, 2);
            java.lang.StringBuilder append2 = append.append(A002);
            java.lang.String throwableString = A00(1, 1, 66);
            return append2.append(A022.replace(throwableString, A002)).append('\n').toString();
        }
        return str;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String A02(java.lang.Throwable th) {
        synchronized (A05) {
            if (th == null) {
                return null;
            }
            if (A0B(th)) {
                return A00(9, 33, 48);
            }
            if (!A02) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace(A00(0, 1, 74), A00(5, 4, 113));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A04(java.lang.String str, java.lang.String str2) {
        synchronized (A05) {
            int i = A00;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A05(java.lang.String str, java.lang.String str2) {
        synchronized (A05) {
            if (A00 <= 3) {
                A01.A6H(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A06(java.lang.String str, java.lang.String str2) {
        synchronized (A05) {
            if (A00 <= 1) {
                A01.A9t(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A07(java.lang.String str, java.lang.String str2) {
        synchronized (A05) {
            if (A00 <= 2) {
                A01.AKm(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A08(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        A05(str, A01(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A09(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        A06(str, A01(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A0A(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        A07(str, A01(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static boolean A0B(java.lang.Throwable th) {
        while (th != null) {
            if (th instanceof java.net.UnknownHostException) {
                java.lang.String[] strArr = A04;
                if (strArr[3].charAt(22) != strArr[2].charAt(22)) {
                    throw new java.lang.RuntimeException();
                }
                A04[1] = "Bi";
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
