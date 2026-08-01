package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C2930gi c2930gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C2380Up.A1O(c2930gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C3117jz();
            case 4:
                return new C3112ju(c2930gi);
            case 5:
                return new C3112ju(c2930gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.instagram.common.viewpoint.core.C3112ju, com.instagram.common.viewpoint.core.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C18167w();
            default:
                return null;
        }
    }
}
