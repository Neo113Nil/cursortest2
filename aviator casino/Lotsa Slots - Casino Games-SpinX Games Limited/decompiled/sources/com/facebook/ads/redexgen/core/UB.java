package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class UB {
    public static java.lang.String A00;
    public static com.facebook.ads.redexgen.core.XT A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final java.util.Map<java.lang.String, java.lang.Integer> A04;
    public static final java.util.concurrent.atomic.AtomicInteger A05;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, com.google.common.base.Ascii.ETB};
    }

    static {
        A05();
        A00 = null;
        A05 = new java.util.concurrent.atomic.AtomicInteger(0);
        A04 = new java.util.HashMap();
    }

    public static synchronized com.facebook.ads.redexgen.core.XT A00(com.facebook.ads.redexgen.core.T8 t8) {
        com.facebook.ads.redexgen.core.XT xt;
        synchronized (com.facebook.ads.redexgen.core.UB.class) {
            if (A01 == null) {
                A01 = com.facebook.ads.redexgen.core.XU.A00(t8);
            }
            xt = A01;
        }
        return xt;
    }

    public static java.lang.Integer A01(java.lang.String str) {
        synchronized (A04) {
            java.lang.Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> params) {
        java.lang.String str2;
        if (A0A(t8)) {
            str2 = com.facebook.ads.redexgen.core.C1133Wn.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            java.lang.String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(com.facebook.ads.redexgen.core.T8 t8, boolean z) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(t8);
        try {
            android.content.SharedPreferences A002 = com.facebook.ads.redexgen.core.WN.A00(t8);
            com.facebook.ads.redexgen.core.C1059To c1059To = new com.facebook.ads.redexgen.core.C1059To(t8);
            java.lang.String str = android.os.Build.FINGERPRINT + A02(0, 1, 19) + c1059To.A06();
            A00 = A002.getString(str, null);
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.facebook.ads.redexgen.core.UA(t8, c1059To, A002, str));
            java.util.concurrent.Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (java.lang.Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(com.facebook.ads.redexgen.core.T8 t8, boolean z, java.lang.String str) {
        if (A0A(t8)) {
            A09(t8, z, str);
        } else {
            A07(t8, z);
        }
    }

    public static void A09(com.facebook.ads.redexgen.core.T8 t8, boolean z, java.lang.String str) {
        if (str == null) {
            str = t8.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(t8);
        com.facebook.ads.redexgen.core.C1133Wn c1133Wn = new com.facebook.ads.redexgen.core.C1133Wn(t8, str);
        try {
            c1133Wn.A06();
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.facebook.ads.redexgen.core.U9(c1133Wn, str));
            java.util.concurrent.Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (java.lang.Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(com.facebook.ads.redexgen.core.T8 t8) {
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            boolean A2t = com.facebook.ads.redexgen.core.C1086Up.A2t(t8);
            if (A03[4].charAt(29) == 'E') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!A2t) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(java.lang.String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
