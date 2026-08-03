package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class FK<T extends com.facebook.ads.redexgen.core.FL> extends android.os.Handler implements java.lang.Runnable {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"YmYVw2S8DUZhSIJBKV9mYTBB1tKcIZso", "NDdcnO0NsMMFHF2bezmvYcIUkVZ5OtU8", "8rmJYKaybwW0Gr1XfrD6wU0k3D4t0vPA", "YmCBBtrMVj6S7IBVYd0tuHNRqLOHp", "BNlgZVMbySVAlN8KpxiSIEQEMbKarpeH", "QLj0CyLyWcLoHh5we5tUZrDrecYjAsKC", "eBbXtTNPiPKoehNQThYFNgHDUWIcJfTE", "1Eh"};
    public boolean A00;
    public int A01;
    public com.facebook.ads.redexgen.core.FI<T> A02;
    public java.io.IOException A03;
    public java.lang.Thread A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final T A08;
    public volatile boolean A09;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2001n7 A0A;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Customized to support load retries")
    private void A02() {
        com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb interfaceExecutorC0690Fb;
        com.facebook.ads.redexgen.core.FK fk;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.A02.AEi(this.A08, elapsedRealtime, elapsedRealtime - this.A07, this.A01);
        this.A03 = null;
        interfaceExecutorC0690Fb = this.A0A.A02;
        fk = this.A0A.A00;
        interfaceExecutorC0690Fb.execute((java.lang.Runnable) com.facebook.ads.redexgen.core.AbstractC04203y.A01(fk));
    }

    public static void A04() {
        A0B = new byte[]{-122, -87, -101, -98, -114, -101, -83, -91, -99, -61, -62, -99, -76, -101, -77, -69, -67, -64, -57, 110, -77, -64, -64, -67, -64, 110, -70, -67, -81, -78, -73, -68, -75, 110, -63, -62, -64, -77, -81, -69, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, -12, 1, 1, -2, 1, -81, -5, -2, -16, -13, -8, -3, -10, -81, 2, 3, 1, -12, -16, -4, 5, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, 40, 32, com.google.common.base.Ascii.NAK, 19, 36, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, -48, com.google.common.base.Ascii.NAK, 40, 19, com.google.common.base.Ascii.NAK, 32, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, -48, com.google.common.base.Ascii.CAN, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, -48, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, 17, com.google.common.base.Ascii.DC4, -48, 19, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 32, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 36, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, -63, -38, -47, -28, -36, -47, -49, -32, -47, -48, -116, -47, -28, -49, -47, -36, -32, -43, -37, -38, -116, -40, -37, -51, -48, -43, -38, -45, -116, -33, -32, -34, -47, -51, -39, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SO, 17, -25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("enableContinueLoadingLogging is custom")
    public final void handleMessage(android.os.Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        java.lang.String[] strArr = A0C;
        if (strArr[3].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        A0C[6] = "QgUPNZuYIqR5G6UUc33KVEWLFVIzbhR6";
        try {
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
        if (this.A09) {
            return;
        }
        if (message.what == 0) {
            A02();
            this.A00 = false;
            return;
        }
        if (message.what == 3) {
            throw ((java.lang.Error) message.obj);
        }
        A03();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.A07;
        com.facebook.ads.redexgen.core.FI fi = (com.facebook.ads.redexgen.core.FI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A02);
        if (this.A05) {
            fi.AEc(this.A08, elapsedRealtime, j2, false);
            return;
        }
        switch (message.what) {
            case 1:
                try {
                    fi.AEe(this.A08, elapsedRealtime, j2);
                    return;
                } catch (java.lang.RuntimeException e) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A08(A01(0, 8, 0), A01(71, 44, 118), e);
                    this.A0A.A01 = new com.facebook.ads.redexgen.core.FP(e);
                    return;
                }
            case 2:
                this.A03 = (java.io.IOException) message.obj;
                this.A01++;
                com.facebook.ads.redexgen.core.FJ AEf = fi.AEf(this.A08, elapsedRealtime, j2, this.A03, this.A01);
                i = AEf.A00;
                if (i == 3) {
                    this.A0A.A01 = this.A03;
                    return;
                }
                i2 = AEf.A00;
                if (i2 != 2) {
                    i3 = AEf.A00;
                    if (i3 == 1) {
                        this.A01 = 1;
                    }
                    this.A00 = true;
                    j = AEf.A01;
                    A06(j != -9223372036854775807L ? AEf.A01 : A00());
                    return;
                }
                return;
            default:
                return;
        }
        com.facebook.ads.redexgen.core.WU.A00(th, this);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public FK(com.facebook.ads.redexgen.core.C2001n7 c2001n7, android.os.Looper looper, T loadable, com.facebook.ads.redexgen.core.FI<T> fi, int i, long j) {
        super(looper);
        this.A0A = c2001n7;
        this.A08 = loadable;
        this.A02 = fi;
        this.A06 = i;
        this.A07 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D36993743 Customized Hero Retry Delay Values")
    private long A00() {
        return com.facebook.ads.redexgen.core.AbstractC1763is.A00(this.A01, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    private void A03() {
        this.A0A.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A05(int i) throws java.io.IOException {
        if (this.A03 == null || this.A01 <= i) {
        } else {
            throw this.A03;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A06(long j) {
        com.facebook.ads.redexgen.core.FK fk;
        fk = this.A0A.A00;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(fk == null);
        this.A0A.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    public final void A07(boolean z) {
        this.A09 = z;
        this.A03 = null;
        if (hasMessages(0)) {
            this.A05 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.A05 = true;
                this.A08.A4r();
                java.lang.Thread thread = this.A04;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            ((com.facebook.ads.redexgen.core.FI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A02)).AEc(this.A08, elapsedRealtime, elapsedRealtime - this.A07, true);
            this.A02 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FK != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.FL> */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this) {
                            z = !this.A05;
                            this.A04 = java.lang.Thread.currentThread();
                        }
                        if (z) {
                            com.facebook.ads.redexgen.core.AnonymousClass54.A02(A01(androidx.compose.material.TextFieldImplKt.AnimationDuration, 5, 115) + this.A08.getClass().getSimpleName());
                            try {
                                this.A08.AAr();
                            } finally {
                                com.facebook.ads.redexgen.core.AnonymousClass54.A00();
                            }
                        }
                        synchronized (this) {
                            this.A04 = null;
                            java.lang.Thread.interrupted();
                        }
                        if (!this.A09) {
                            sendEmptyMessage(1);
                        }
                    } catch (java.lang.Throwable th) {
                        com.facebook.ads.redexgen.core.WU.A00(th, this);
                    }
                } catch (java.lang.Error e) {
                    if (!this.A09) {
                        com.facebook.ads.redexgen.core.AbstractC04284g.A08(A01(0, 8, 0), A01(40, 31, 85), e);
                        obtainMessage(3, e).sendToTarget();
                    }
                    throw e;
                }
            } catch (java.lang.Exception e2) {
                if (!this.A09) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A08(A01(0, 8, 0), A01(115, 35, 50), e2);
                    obtainMessage(2, new com.facebook.ads.redexgen.core.FP(e2)).sendToTarget();
                }
            }
        } catch (java.io.IOException e3) {
            if (!this.A09) {
                obtainMessage(2, e3).sendToTarget();
            }
        } catch (java.lang.OutOfMemoryError e4) {
            if (!this.A09) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A01(0, 8, 0), A01(8, 32, 20), e4);
                obtainMessage(2, new com.facebook.ads.redexgen.core.FP(e4)).sendToTarget();
            }
        }
    }
}
