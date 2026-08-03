package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1808jk extends com.facebook.ads.redexgen.core.N3 {
    public static byte[] A02;

    @javax.annotation.Nullable
    public final com.facebook.ads.redexgen.core.C1806ji A00;
    public final com.facebook.ads.redexgen.core.VA A01;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C1808jk(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.N4 n4, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1806ji c1806ji) {
        super(c1636gi, n4, c1581fp);
        this.A01 = va;
        this.A00 = c1806ji;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.A00 != null && !android.text.TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            com.facebook.ads.redexgen.core.AbstractC0920Oa.A02(this.A00.A0a(), com.facebook.ads.redexgen.core.AbstractC1156Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (com.facebook.ads.redexgen.core.C1086Up.A1A(this.A02)) {
                java.lang.String adPlacementType = com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString();
                com.facebook.ads.redexgen.core.C1132Wl A00 = com.facebook.ads.redexgen.core.C1132Wl.A00(this.A02);
                java.lang.String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
