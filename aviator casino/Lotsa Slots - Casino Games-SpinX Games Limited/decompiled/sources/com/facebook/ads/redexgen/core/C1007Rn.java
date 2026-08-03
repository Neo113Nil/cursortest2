package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1007Rn implements com.facebook.ads.internal.api.BidderTokenProviderApi {
    public final com.facebook.ads.redexgen.core.C1033So A00 = new com.facebook.ads.redexgen.core.C1033So();

    public final com.facebook.ads.redexgen.core.C1033So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final java.lang.String getBidderToken(android.content.Context context) {
        return this.A00.A06(com.facebook.ads.redexgen.core.C1009Rp.A09(context));
    }
}
