package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network.dex */
public final class MU {
    public static MP A00;

    public final MP A00(final C1153dL c1153dL, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (MT.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C7L();
            case 2:
                if (U7.A1N(c1153dL)) {
                    return new C7K();
                }
                return new C7L();
            case 3:
                return new C1454iS();
            case 4:
                return new C1449iN(c1153dL);
            case 5:
                return new C1449iN(c1153dL) { // from class: com.facebook.ads.redexgen.X.7F
                    @Override // com.instagram.common.viewpoint.core.C1449iN, com.instagram.common.viewpoint.core.MP
                    public final AdPlacementType A8c() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C7B();
            default:
                return null;
        }
    }
}
