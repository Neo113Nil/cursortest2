package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class CZ implements com.facebook.ads.redexgen.core.InterfaceC1618gQ {
    public static boolean A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"HV3bjOQFG6hG19mK6btv5ZItymBNR4jb", "f8frJPlJVlZQfTmtqYpYtimfJzE", "snhVz6l74gACRZpxcVOl8ZhDE", "ioIXRoWDB2y5rIxXUVMK", "pJOGedThy6U23H0Dqr8MrVjxKTkAUTUw", "Z2sPBilUji", "eoagJWSpw9dhQ5uILEfDMJsGfxbL2OXR", "ioOrVGKFmPeoWtk9SUaiMK94AxkbTfSp"};
    public static final com.facebook.ads.redexgen.core.InterfaceC1616gO A06;
    public static final java.lang.String A07;
    public long A00 = 0;
    public final com.facebook.ads.redexgen.core.InterfaceC1617gP A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1623gV A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            java.lang.String[] strArr = A05;
            if (strArr[2].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[6] = "SjioWZFjItKuhqld4sWZUQTfHHPQcsy5";
            strArr2[4] = "wEt2AMMlWwKWRpacJrxPlGBsPjvVn5Jo";
            copyOfRange[i4] = (byte) (i5 - 117);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        if (A05[0].charAt(9) == 'h') {
            throw new java.lang.RuntimeException();
        }
        A05[7] = "NMMzHy25EZUbJzWBlBjuS5XjO6LPkHkX";
        A04 = new byte[]{-8, 33, 36, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, 32, com.google.common.base.Ascii.EM, -46, 32, com.google.common.base.Ascii.ETB, 42, 38, -46, 37, 43, 32, com.google.common.base.Ascii.NAK, -46, 19, 38, -46, -47, -27, -10, -17, -92, -27, -9, -92, -14, -13, -92, -9, -3, -14, -25, -20, -10, -13, -14, -19, -2, -27, -8, -19, -13, -14, -92, -9, -25, -20, -23, -24, -7, -16, -23, -24, -78, -92, -48, -27, -9, -8, -92, -9, -3, -14, -25, -92, -27, -8, -92, -87, -24, -78, -92, -46, -23, -4, -8, -92, -9, -3, -14, -25, -92, -27, -8, -92, -87, -24, -78, com.google.common.base.Ascii.SO, 39, 32, 32, 43, -37, 33, 42, 45, -37, -32, com.google.common.base.Ascii.US, -37, 40, 36, 39, 39, 36, 46, -23, 3, 2, -26, 9, 2, -38, -3, 2, -3, 7, -4, -7, -8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1618gQ
    public final synchronized void A6b(int i) {
        long A5m = this.A02.A5m() + (i * 1000000 * (A03 ? 1 : 1000));
        if (this.A00 == 0 || this.A00 > A5m) {
            this.A00 = A5m;
            notifyAll();
        }
    }

    static {
        A02();
        A07 = com.facebook.ads.redexgen.core.CZ.class.getSimpleName();
        A06 = new com.facebook.ads.redexgen.core.Ca();
        A03 = false;
    }

    public CZ(com.facebook.ads.redexgen.core.InterfaceC1617gP interfaceC1617gP, com.facebook.ads.redexgen.core.InterfaceC1623gV interfaceC1623gV) {
        this.A01 = interfaceC1617gP;
        this.A02 = interfaceC1623gV;
        java.lang.Thread scheduler = new java.lang.Thread(new com.facebook.ads.redexgen.core.RunnableC1619gR(this));
        scheduler.start();
    }

    private void A01() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                } else {
                    long A5m = this.A02.A5m();
                    if (A5m < this.A00) {
                        int millisToSleep = (int) ((this.A00 - A5m) / 1000000);
                        if (millisToSleep >= 1) {
                            java.lang.String.format(java.util.Locale.US, A00(92, 20, 70), java.lang.Integer.valueOf(millisToSleep));
                            try {
                                long current = millisToSleep;
                                this.A02.AK4(this, current);
                            } catch (java.lang.InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A01.AIo();
                    long A5m2 = this.A02.A5m();
                    if (0 != 0) {
                        throw new java.lang.NullPointerException(A00(112, 13, 31));
                    }
                    synchronized (this) {
                        if (this.A00 < A5m2) {
                            java.lang.String.format(java.util.Locale.US, A00(21, 71, 15), java.lang.Long.valueOf(A5m2), java.lang.Long.valueOf(this.A00));
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void A03(com.facebook.ads.redexgen.core.CZ cz) {
        cz.A01();
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1618gQ
    public final synchronized void A6c() {
        this.A00 = this.A02.A5m();
        java.lang.String str = A00(0, 21, 61) + this.A00;
        notifyAll();
    }
}
