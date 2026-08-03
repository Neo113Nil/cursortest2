package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1809jl extends com.facebook.ads.redexgen.core.N3 {
    public static byte[] A06;
    public static final java.lang.String A07;
    public com.facebook.ads.redexgen.core.C1811jn A00;
    public com.facebook.ads.redexgen.core.EnumC1110Vp A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.VA A04;
    public final com.facebook.ads.redexgen.core.AbstractC1282ay A05;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = com.facebook.ads.redexgen.core.C1809jl.class.getSimpleName();
    }

    public C1809jl(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1282ay abstractC1282ay, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.N4 n4, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp) {
        super(c1636gi, n4, c1581fp);
        this.A04 = va;
        this.A05 = abstractC1282ay;
        this.A03 = c1636gi;
        this.A01 = enumC1110Vp;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String adPlacementType;
        if (this.A00 != null && !android.text.TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            com.facebook.ads.redexgen.core.AbstractC0920Oa.A02(this.A00.A05(), com.facebook.ads.redexgen.core.AbstractC1156Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (com.facebook.ads.redexgen.core.C1086Up.A1A(this.A03)) {
                if (this.A01 == com.facebook.ads.redexgen.core.EnumC1110Vp.A09) {
                    adPlacementType = com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString();
                }
                com.facebook.ads.redexgen.core.C1132Wl A00 = com.facebook.ads.redexgen.core.C1132Wl.A00(this.A03);
                java.lang.String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!android.text.TextUtils.isEmpty(this.A00.A03())) {
                com.facebook.ads.redexgen.core.Y4.A00(new com.facebook.ads.redexgen.core.C1810jm(this));
            }
        }
    }

    public final void A0A(com.facebook.ads.redexgen.core.C1811jn c1811jn) {
        this.A00 = c1811jn;
    }
}
