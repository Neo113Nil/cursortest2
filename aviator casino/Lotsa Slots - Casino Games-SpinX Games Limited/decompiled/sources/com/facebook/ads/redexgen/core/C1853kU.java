package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1853kU implements com.facebook.ads.redexgen.core.C5W {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"ZvdLZTVfwuIBTQP4GzYBT5X", "wbAZGHQ6rgrE49QWGCHGfuBznSfuy1uN", "V6XwnsY6foGeZeUf6zKrOXNqPWCT5H6x", "YVOcTVGnehAK6q3v9MTNJvITraIKZiNA", "KHrBPZHANML419JBBjaM9uFMM5JItkLu", "1WIXy5Awt7B4E86DpiV0tl9iGx9sIFx0", "LtMYCkXqs5nSRMey4EGdy6S", "9S3XCAL9m1K226khzcMpmZ28hR6Taq7A"};
    public long A00;
    public long A01;
    public long A02;
    public com.facebook.ads.redexgen.core.C04565i A03;
    public com.facebook.ads.redexgen.core.C0883Mo A04;
    public java.io.File A05;
    public java.io.OutputStream A06;
    public final int A07;
    public final long A08;
    public final com.facebook.ads.redexgen.core.MP A09;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{86, 116, 118, 125, 112, 81, 116, 97, 116, 70, 124, 123, 126, 32, 52, 39, 33, 43, 35, 40, 50, com.google.common.base.Ascii.NAK, 47, 60, 35, 102, 47, 53, 102, 36, 35, 42, 41, 49, 102, 50, 46, 35, 102, 43, 47, 40, 47, 43, 51, 43, 102, 52, 35, 37, 41, 43, 43, 35, 40, 34, 35, 34, 102, 48, 39, 42, 51, 35, 102, 41, 32, 102, 116, 118, Byte.MAX_VALUE, 113, 119, 115, 116, 104, 102, com.google.common.base.Ascii.DC2, 46, 47, 53, 102, 43, 39, 63, 102, 37, 39, 51, 53, 35, 102, 54, 41, 41, 52, 102, 37, 39, 37, 46, 35, 102, 54, 35, 52, 32, 41, 52, 43, 39, 40, 37, 35, 104, 35, 55, 36, 34, 40, 32, 43, 49, com.google.common.base.Ascii.SYN, 44, 63, 32, 101, 40, 48, 54, 49, 101, 39, 32, 101, 53, 42, 54, 44, 49, 44, 51, 32, 101, 42, 55, 101, 6, 107, 9, 0, com.google.common.base.Ascii.VT, 2, 17, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, 0, 17, 107};
    }

    static {
        A02();
    }

    public C1853kU(com.facebook.ads.redexgen.core.MP mp, long j, int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A0A(j > 0 || j == -1, A00(115, 48, 72));
        if (j != -1 && j < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A00(0, 13, 24), A00(13, 102, 75));
        }
        this.A09 = (com.facebook.ads.redexgen.core.MP) com.facebook.ads.redexgen.core.AbstractC04203y.A01(mp);
        this.A08 = j == -1 ? Long.MAX_VALUE : j;
        this.A07 = i;
    }

    /* JADX WARN: Finally extract failed */
    private void A01() throws java.io.IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            com.facebook.ads.redexgen.core.C5C.A10(this.A06);
            this.A06 = null;
            java.io.File file = (java.io.File) com.facebook.ads.redexgen.core.C5C.A0f(this.A05);
            this.A05 = null;
            java.lang.String[] strArr = A0B;
            if (strArr[7].charAt(29) == strArr[2].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0B;
            strArr2[0] = "UqCq1nJSNUsM2UdGgnorxCQ";
            strArr2[6] = "6grM2eqzP4bpAc7X7xQexiC";
            if (1 != 0) {
                this.A09.A55(file, this.A02);
            } else {
                file.delete();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.C5C.A10(this.A06);
            this.A06 = null;
            java.io.File fileToCommit = (java.io.File) com.facebook.ads.redexgen.core.C5C.A0f(this.A05);
            this.A05 = null;
            if (0 != 0) {
                this.A09.A55(fileToCommit, this.A02);
            } else {
                fileToCommit.delete();
            }
            throw th;
        }
    }

    private void A03(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        this.A05 = this.A09.AK8((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(c04565i.A08), c04565i.A04 + this.A00, c04565i.A03 != -1 ? java.lang.Math.min(c04565i.A03 - this.A00, this.A01) : -1L);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new com.facebook.ads.redexgen.core.C0883Mo(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.C5W
    public final void AGk(com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C1855kW {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04565i.A08);
        if (c04565i.A03 == -1 && c04565i.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = c04565i;
        this.A01 = c04565i.A06(4) ? this.A08 : Long.MAX_VALUE;
        this.A00 = 0L;
        try {
            A03(c04565i);
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1855kW(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5W
    public final void close() throws com.facebook.ads.redexgen.core.C1855kW {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1855kW(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5W
    public final void write(byte[] bArr, int i, int i2) throws com.facebook.ads.redexgen.core.C1855kW {
        com.facebook.ads.redexgen.core.C04565i c04565i = this.A03;
        if (c04565i == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(c04565i);
                }
                int min = (int) java.lang.Math.min(i2 - i3, this.A01 - this.A02);
                ((java.io.OutputStream) com.facebook.ads.redexgen.core.C5C.A0f(this.A06)).write(bArr, i + i3, min);
                i3 += min;
                this.A02 += min;
                this.A00 += min;
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.C1855kW(e);
            }
        }
    }
}
