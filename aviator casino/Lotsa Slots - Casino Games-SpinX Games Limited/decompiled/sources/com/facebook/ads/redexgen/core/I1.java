package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class I1 implements com.facebook.ads.redexgen.core.InterfaceC1274aq {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5F A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.NAK, 19, 5, com.google.common.base.Ascii.DC2, 63, com.google.common.base.Ascii.SO, 1, com.google.common.base.Ascii.SYN, 9, 7, 1, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 63, 9, 1, 2};
    }

    static {
        A01();
    }

    public I1(com.facebook.ads.redexgen.core.C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF7(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        com.facebook.ads.redexgen.core.C1265ah c1265ah2;
        this.A00.A0Q = false;
        c1265ah = this.A00.A0F;
        c1265ah.setProgress(100);
        c1265ah2 = this.A00.A0F;
        com.facebook.ads.redexgen.core.YB.A0O(c1265ah2, 8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AF9(java.lang.String str) {
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        com.facebook.ads.redexgen.core.M6 m6;
        boolean z;
        int i;
        this.A00.A0Q = true;
        c1265ah = this.A00.A0F;
        com.facebook.ads.redexgen.core.YB.A0O(c1265ah, 0);
        m6 = this.A00.A0E;
        m6.setUrl(str);
        z = this.A00.A0P;
        if (!z) {
            com.facebook.ads.redexgen.core.C5F c5f = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i = c5f.A02;
            if (i > 1) {
                this.A00.A0P = true;
                this.A00.A0i(A00(0, 19, 3));
            }
        }
        com.facebook.ads.redexgen.core.C5F.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFY(int i) {
        boolean z;
        com.facebook.ads.redexgen.core.C1265ah c1265ah;
        z = this.A00.A0Q;
        if (z) {
            c1265ah = this.A00.A0F;
            c1265ah.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFb(java.lang.String str) {
        com.facebook.ads.redexgen.core.M6 m6;
        m6 = this.A00.A0E;
        m6.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274aq
    public final void AFe() {
        ((com.facebook.ads.redexgen.core.AbstractC0775Ij) this.A00).A0B.ADJ(14);
    }
}
