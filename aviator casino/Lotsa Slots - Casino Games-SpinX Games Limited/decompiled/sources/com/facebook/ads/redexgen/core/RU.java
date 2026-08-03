package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class RU extends java.lang.Thread {
    public static byte[] A07;
    public static final java.lang.String A08;
    public final int A00;
    public final android.os.Handler A01;
    public final com.facebook.ads.redexgen.core.RW A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final java.lang.Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, com.google.common.base.Ascii.FF, 96, 111, 115, com.google.common.base.Ascii.FF, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, com.google.common.base.Ascii.US, 4, com.google.common.base.Ascii.SO};
    }

    static {
        A02();
        A08 = com.facebook.ads.redexgen.core.RU.class.getName();
    }

    public RU(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.RW rw) {
        this(c1636gi, rw, com.facebook.ads.redexgen.core.C1086Up.A08(c1636gi));
    }

    public RU(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.RW rw, int i) {
        this.A01 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A04 = new com.facebook.ads.redexgen.core.RT(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i;
        this.A03 = c1636gi;
        this.A02 = rw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z = interval == 0;
                this.A05 = j;
                if (z) {
                    this.A01.post(this.A04);
                }
                try {
                    java.lang.Thread.sleep(j);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !android.os.Debug.isDebuggerConnected()) {
                        java.lang.String A03 = this.A02.A03();
                        if (A03 != null) {
                            this.A03.A08().ABC(A01(15, 7, 8), com.facebook.ads.redexgen.core.AbstractC1048Td.A1D, new com.facebook.ads.redexgen.core.C1049Te(this.A02.A04(A03)));
                        }
                        this.A06 = true;
                    }
                } catch (java.lang.InterruptedException unused) {
                    com.facebook.ads.internal.api.BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
