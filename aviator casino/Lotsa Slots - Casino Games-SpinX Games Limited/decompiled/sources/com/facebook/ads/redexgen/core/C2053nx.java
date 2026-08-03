package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2053nx implements com.facebook.ads.redexgen.core.CH {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public com.facebook.ads.redexgen.core.CG A00;
    public final com.facebook.ads.redexgen.core.AbstractC04013d A01;
    public final com.facebook.ads.redexgen.core.C04565i A02;
    public final com.facebook.ads.redexgen.core.C8B A03;
    public final com.facebook.ads.redexgen.core.C0873Me A04;
    public final java.util.concurrent.Executor A05;
    public volatile com.facebook.ads.redexgen.core.AbstractRunnableFutureC04464y<java.lang.Void, java.io.IOException> A06;
    public volatile boolean A07;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
            i4++;
        }
    }

    public static void A02() {
        A08 = new byte[]{com.google.common.base.Ascii.US, 34, 34, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, 17, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FF, -1, 7, 9, com.google.common.base.Ascii.DLE, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.CH
    public final void A63(com.facebook.ads.redexgen.core.CG cg) throws java.io.IOException, java.lang.InterruptedException {
        this.A00 = cg;
        if (0 != 0) {
            throw new java.lang.NullPointerException(A01(0, 3, 122));
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new com.facebook.ads.redexgen.core.C2054ny(this);
                if (0 != 0) {
                    throw new java.lang.NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z = true;
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable th = (java.lang.Throwable) com.facebook.ads.redexgen.core.AbstractC04203y.A01(e.getCause());
                    if (0 == 0) {
                        if (th instanceof java.io.IOException) {
                            throw ((java.io.IOException) th);
                        }
                        com.facebook.ads.redexgen.core.C5C.A11(th);
                        throw null;
                    }
                }
            } catch (java.lang.Throwable th2) {
                ((com.facebook.ads.redexgen.core.AbstractRunnableFutureC04464y) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new java.lang.NullPointerException(A01(10, 6, 86));
            }
        }
        ((com.facebook.ads.redexgen.core.AbstractRunnableFutureC04464y) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new java.lang.NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2053nx(com.facebook.ads.redexgen.core.C2185q7 c2185q7, com.facebook.ads.redexgen.core.C1852kT c1852kT, java.util.concurrent.Executor executor) {
        this.A05 = (java.util.concurrent.Executor) com.facebook.ads.redexgen.core.AbstractC04203y.A01(executor);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2185q7.A03);
        this.A02 = new com.facebook.ads.redexgen.core.C04535f().A06(c2185q7.A03.A00).A08(c2185q7.A03.A04).A02(4).A09();
        this.A03 = c1852kT.A07();
        this.A04 = new com.facebook.ads.redexgen.core.C0873Me(this.A03, this.A02, null, new com.facebook.ads.redexgen.core.InterfaceC0872Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.facebook.ads.redexgen.core.InterfaceC0872Md
            public final void AFX(long j, long j2, long j3) {
                com.facebook.ads.redexgen.core.C2053nx.this.A03(j, j2, j3);
            }
        });
        this.A01 = c1852kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j, long j2, long j3) {
        float f;
        if (this.A00 == null) {
            return;
        }
        if (j == -1 || j == 0) {
            f = -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        this.A00.AFW(j, j2, f);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.core.CH
    public final void cancel() {
        this.A07 = true;
        com.facebook.ads.redexgen.core.AbstractRunnableFutureC04464y<java.lang.Void, java.io.IOException> abstractRunnableFutureC04464y = this.A06;
        if (abstractRunnableFutureC04464y != null) {
            abstractRunnableFutureC04464y.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
