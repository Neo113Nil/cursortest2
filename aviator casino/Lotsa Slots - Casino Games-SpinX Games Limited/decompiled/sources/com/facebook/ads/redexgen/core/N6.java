package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static com.facebook.ads.redexgen.core.N1 A00;

    public final com.facebook.ads.redexgen.core.N1 A00(final com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.internal.protocol.AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (com.facebook.ads.redexgen.core.N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new com.facebook.ads.redexgen.core.AnonymousClass81();
            case 2:
                if (com.facebook.ads.redexgen.core.C1086Up.A1O(c1636gi)) {
                    return new com.facebook.ads.redexgen.core.AnonymousClass80();
                }
                return new com.facebook.ads.redexgen.core.AnonymousClass81();
            case 3:
                return new com.facebook.ads.redexgen.core.C1823jz();
            case 4:
                return new com.facebook.ads.redexgen.core.C1818ju(c1636gi);
            case 5:
                return new com.facebook.ads.redexgen.core.C1818ju(c1636gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.facebook.ads.redexgen.core.C1818ju, com.facebook.ads.redexgen.core.N1
                    public final com.facebook.ads.internal.protocol.AdPlacementType A8k() {
                        return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new com.facebook.ads.redexgen.core.C05227w();
            default:
                return null;
        }
    }
}
