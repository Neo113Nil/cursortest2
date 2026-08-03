package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1659h5 implements com.facebook.ads.redexgen.core.OB {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};

    @javax.annotation.Nullable
    public com.facebook.ads.NativeAd.NativeOptions A00;
    public com.facebook.ads.redexgen.core.S6 A01;
    public com.facebook.ads.redexgen.core.C1636gi A02;
    public final com.facebook.ads.NativeAdBase.MediaCacheFlag A03;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[6].length() == 1) {
                throw new java.lang.RuntimeException();
            }
            A05[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
            i4++;
        }
    }

    public static void A04() {
        A04 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A04();
    }

    public C1659h5(@javax.annotation.Nullable com.facebook.ads.redexgen.core.S6 s6, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag, com.facebook.ads.NativeAd.NativeOptions nativeOptions) {
        this.A00 = nativeOptions;
        this.A01 = s6;
        this.A02 = c1636gi;
        this.A03 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.core.OB
    public final void ADp(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        com.facebook.ads.redexgen.core.WT.A00(new com.facebook.ads.redexgen.core.C1662h8(this, c1108Vm));
    }

    @Override // com.facebook.ads.redexgen.core.OB
    public final void AEy(java.util.List<com.facebook.ads.redexgen.core.C1818ju> list) {
        com.facebook.ads.redexgen.core.C1042Sx manager = new com.facebook.ads.redexgen.core.C1042Sx(this.A02);
        java.lang.String firstRequestId = A03(6, 7, 23);
        for (com.facebook.ads.redexgen.core.C1818ju c1818ju : list) {
            if (A03(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1818ju.A0G();
            }
            if (this.A03.equals(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1818ju.A0E().A0I() != null) {
                    manager.A0c(new com.facebook.ads.redexgen.core.C1040Sv(c1818ju.A0E().A0I().getUrl(), c1818ju.A0E().A0I().getHeight(), c1818ju.A0E().A0I().getWidth(), c1818ju.A0G(), A03(0, 6, 32)));
                }
                if (c1818ju.A0E().A0H() != null) {
                    manager.A0c(new com.facebook.ads.redexgen.core.C1040Sv(c1818ju.A0E().A0H().getUrl(), c1818ju.A0E().A0H().getHeight(), c1818ju.A0E().A0H().getWidth(), c1818ju.A0G(), A03(0, 6, 32)));
                }
                if (!android.text.TextUtils.isEmpty(c1818ju.A0E().A0e())) {
                    manager.A0b(new com.facebook.ads.redexgen.core.C1038St(c1818ju.A0E().A0e(), c1818ju.A0G(), A03(0, 6, 32), c1818ju.A0E().A0D()));
                }
            }
        }
        manager.A0X(new com.facebook.ads.redexgen.core.C1660h6(this, list), new com.facebook.ads.redexgen.core.C1035Sq(firstRequestId, A03(0, 6, 32)));
    }
}
