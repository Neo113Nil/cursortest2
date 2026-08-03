package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1510eg {
    public static byte[] A09;
    public final com.facebook.ads.redexgen.core.C0673Ek A02;
    public final com.facebook.ads.redexgen.core.C1740iS A05;
    public final java.lang.String A06;
    public final java.util.Map<java.lang.String, java.lang.String> A07;
    public final boolean A08;
    public final com.facebook.ads.redexgen.core.E7 A04 = new com.facebook.ads.redexgen.core.E7() { // from class: com.facebook.ads.redexgen.X.4R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4F c4f) {
            java.lang.String str;
            com.facebook.ads.redexgen.core.C1740iS c1740iS;
            str = com.facebook.ads.redexgen.core.C1510eg.this.A06;
            com.facebook.ads.redexgen.core.C1741iT c1741iT = new com.facebook.ads.redexgen.core.C1741iT(str, c4f.A03(), c4f.A01(), c4f.A02());
            if (c4f.A00() >= 0.05d) {
                c1741iT.A06(c4f.A01());
            }
            com.facebook.ads.redexgen.core.C1510eg.A00(com.facebook.ads.redexgen.core.C1510eg.this);
            c1740iS = com.facebook.ads.redexgen.core.C1510eg.this.A05;
            c1740iS.A04(c1741iT);
        }
    };
    public final com.facebook.ads.redexgen.core.EA A03 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.4Q
        public static java.lang.String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
            boolean z;
            z = com.facebook.ads.redexgen.core.C1510eg.this.A08;
            if (z) {
                com.facebook.ads.redexgen.core.C1510eg c1510eg = com.facebook.ads.redexgen.core.C1510eg.this;
                java.lang.String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c1510eg.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, com.google.common.base.Ascii.SI, -2, 10, 2, -4, 0, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, 17, -90, -78, -95, -83, -91, -77};
    }

    public C1510eg(com.facebook.ads.redexgen.core.C0673Ek c0673Ek, java.lang.String str, boolean z, java.util.Map<java.lang.String, java.lang.String> map) {
        this.A06 = str;
        this.A02 = c0673Ek;
        this.A07 = map;
        this.A08 = z;
        this.A05 = new com.facebook.ads.redexgen.core.C1740iS(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.C1510eg c1510eg) {
        int i = c1510eg.A01;
        c1510eg.A01 = i + 1;
        return i;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A06() {
        java.lang.String A01 = com.facebook.ads.redexgen.core.C1740iS.A01(this.A05.A03());
        java.util.HashMap hashMap = new java.util.HashMap();
        if (this.A07 != null) {
            hashMap.putAll(this.A07);
        }
        if (A01 == null) {
            A01 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A01);
        hashMap.put(A02(11, 11, 126), java.lang.String.valueOf(this.A01));
        int i = this.A00 + 1;
        this.A00 = i;
        hashMap.put(A02(0, 11, 8), java.lang.String.valueOf(i));
        return hashMap;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
