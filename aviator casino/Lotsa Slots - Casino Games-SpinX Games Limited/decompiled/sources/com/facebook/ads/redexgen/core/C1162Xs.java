package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1162Xs extends java.io.Writer {
    public static java.lang.String[] A03 = {"sr30eG8QqeA9PTnBv5Bt4hnZqAQxDLuJ", "ps2O52LB4Fk5tPEI", "b0E7ZBCk8ZgliqiBFiLr9fpcu", "ecf9I9JqHAeutuSgOmpZliCU4Q5JYn9j", "xrLrW173V2mkM", "oulCgqQ5su5pKYGJ0eYJOoBckMcEv73q", "45k95lrmWFpsS3hCtOsWilPKXmnWWUvV", "gCGLfpIuPcjj9nzv"};
    public int A00;
    public char[] A01 = new char[1024];
    public final com.facebook.ads.redexgen.core.InterfaceC1161Xr A02;

    public C1162Xs(com.facebook.ads.redexgen.core.InterfaceC1161Xr interfaceC1161Xr) {
        this.A02 = interfaceC1161Xr;
    }

    private void A00() {
        this.A02.AH8(new java.lang.String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            java.lang.String[] strArr = A03;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[4];
            int length = str.length();
            int i5 = str2.length();
            if (length == i5) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[2] = "vRRDkAC7ww5dnR4MiguJ90FB5";
            strArr2[4] = "BIleT5EfDSeSU";
            if (i3 < i4) {
                if (cArr[i3] != '\n') {
                    int i6 = this.A00;
                    int i7 = this.A01.length;
                    if (i6 != i7) {
                        this.A01[this.A00] = cArr[i3];
                        int i8 = this.A00;
                        this.A00 = i8 + 1;
                        i3++;
                    }
                }
                A00();
                i3++;
            } else {
                return;
            }
        }
    }
}
