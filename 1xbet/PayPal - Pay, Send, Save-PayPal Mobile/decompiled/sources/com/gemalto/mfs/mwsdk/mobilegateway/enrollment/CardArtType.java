package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public enum CardArtType {
    BANK_LOGO(util.h.xy.bh.b.f950),
    SCHEME_LOGO(util.h.xy.bh.b.f949),
    CARD_BACKGROUND(util.h.xy.bh.b.f951),
    CARD_BACKGROUND_COMBINED(util.h.xy.bh.b.f954),
    CO_BRAND_LOGO(util.h.xy.bh.b.f952),
    CARD_ICON(util.h.xy.bh.b.f955);

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    CardArtType(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
