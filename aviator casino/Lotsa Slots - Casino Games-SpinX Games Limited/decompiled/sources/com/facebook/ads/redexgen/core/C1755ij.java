package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1755ij implements com.facebook.ads.redexgen.core.U3 {
    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A79() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A7N() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final com.facebook.ads.redexgen.core.TM A7m(com.facebook.ads.redexgen.core.T8 t8) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A8W() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A9G() {
        if (com.facebook.ads.AdSettings.getTestAdType() != com.facebook.ads.AdSettings.TestAdType.DEFAULT) {
            return com.facebook.ads.AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final boolean AAa() {
        return com.facebook.ads.AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final boolean AAg() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.Boolean AAk() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final boolean isTestMode(android.content.Context context) {
        return com.facebook.ads.AdSettings.isTestMode(context);
    }
}
