package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AF implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static java.lang.String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
    public long A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.C5W A02;
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A03;

    public AF(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.C5W c5w) {
        this.A03 = (com.facebook.ads.redexgen.core.InterfaceC2132pF) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC2132pF);
        this.A02 = (com.facebook.ads.redexgen.core.C5W) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c5w);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
        this.A03.A43(interfaceC04675t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        this.A00 = this.A03.AGi(c04565i);
        if (this.A00 == 0) {
            return 0L;
        }
        long j = c04565i.A03;
        java.lang.String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
        strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
        if (j == -1 && this.A00 != -1) {
            c04565i = c04565i.A05(0L, this.A00);
        }
        this.A01 = true;
        this.A02.AGk(c04565i);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() throws java.io.IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.A00 != 0) {
            int read = this.A03.read(bArr, i, i2);
            if (read > 0) {
                this.A02.write(bArr, i, read);
                if (this.A00 != -1) {
                    this.A00 -= read;
                }
            }
            return read;
        }
        java.lang.String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
        strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
        return -1;
    }
}
