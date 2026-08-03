package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class TT implements java.lang.Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final com.facebook.ads.redexgen.core.C1632ge A00;
    public final com.facebook.ads.redexgen.core.InterfaceC1045Ta A01;
    public final java.lang.Thread.UncaughtExceptionHandler A02;
    public final java.util.Map<java.lang.String, java.lang.String> A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, com.google.common.base.Ascii.DC2, 7, 7, 9, -10, 8, com.google.common.base.Ascii.CR, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public TT(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.TS ts) {
        this(uncaughtExceptionHandler, c1632ge, ts, com.facebook.ads.redexgen.core.AbstractC1046Tb.A00());
    }

    public TT(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.TS ts, com.facebook.ads.redexgen.core.InterfaceC1045Ta interfaceC1045Ta) {
        this.A02 = uncaughtExceptionHandler;
        if (c1632ge != null) {
            this.A00 = c1632ge;
            this.A03 = ts.A97(c1632ge);
            this.A01 = interfaceC1045Ta;
            return;
        }
        throw new java.lang.IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            android.os.Process.killProcess(android.os.Process.myPid());
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.System.exit(10);
        } catch (java.lang.Throwable unused2) {
        }
    }

    private void A03(java.lang.Thread thread, java.lang.Throwable th) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            java.lang.String A03 = com.facebook.ads.redexgen.core.AbstractC1163Xt.A03(this.A00, th);
            if (!android.text.TextUtils.isEmpty(A03)) {
                java.lang.String stackTraceString = A00(17, 16, 7);
                if (A03.contains(stackTraceString)) {
                    java.util.Map<java.lang.String, java.lang.String> A02 = new com.facebook.ads.redexgen.core.TR(A03, this.A03).A02();
                    java.lang.String A00 = A00(38, 7, 100);
                    java.lang.String stackTraceString2 = A00(33, 5, 111);
                    A02.put(A00, stackTraceString2);
                    java.lang.Throwable A002 = com.facebook.ads.redexgen.core.WP.A00();
                    java.lang.String A003 = A00(45, 12, 73);
                    if (A002 == th) {
                        java.lang.String stackTraceString3 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString3);
                    } else {
                        java.lang.String stackTraceString4 = A00(0, 1, 81);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AL7(new com.facebook.ads.redexgen.core.C1052Th(this.A00.A09().A01(), this.A00.A09().A02(), A02), this.A00);
                    if (com.facebook.ads.redexgen.core.C1086Up.A2A(this.A00)) {
                        com.facebook.ads.redexgen.core.C1086Up.A0e(this.A00);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        A03(thread, th);
    }
}
