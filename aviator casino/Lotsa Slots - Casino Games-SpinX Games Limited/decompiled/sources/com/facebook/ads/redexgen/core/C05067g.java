package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05067g extends com.facebook.ads.redexgen.core.AbstractC1771j0 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FS, 17, 9};
    }

    static {
        A03();
    }

    public C05067g(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O7 o7) {
        super(c1636gi, o7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> A01(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A00(36, 5, 12), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(java.util.List<java.lang.String> trackingUrls, java.util.Map<java.lang.String, java.lang.String> extraData) {
        if (trackingUrls != null) {
            boolean isEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (isEmpty) {
                return;
            }
            java.util.Iterator<java.lang.String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new com.facebook.ads.redexgen.core.AsyncTaskC1607gF(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0P() {
        com.facebook.ads.redexgen.core.C1818ju c1818ju = (com.facebook.ads.redexgen.core.C1818ju) this.A01;
        if (c1818ju.A0R()) {
            com.facebook.ads.redexgen.core.N2 n2 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (n2 != null) {
                this.A07.A0B(c1818ju);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0R(com.facebook.ads.redexgen.core.N1 n1, com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1065Tu c1065Tu, com.facebook.ads.redexgen.core.O8 o8) {
        com.facebook.ads.redexgen.core.C1818ju c1818ju = (com.facebook.ads.redexgen.core.C1818ju) n1;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C1768ix c1768ix = new com.facebook.ads.redexgen.core.C1768ix(this, o8, c1818ju, currentTimeMillis, c1065Tu);
        A0H().postDelayed(c1768ix, c1067Tw.A05().A05());
        c1818ju.A0L(this.A0B, new com.facebook.ads.redexgen.core.C1767iw(this, c1768ix, currentTimeMillis, c1065Tu), this.A09, o8, com.facebook.ads.redexgen.core.UK.A0K());
    }
}
