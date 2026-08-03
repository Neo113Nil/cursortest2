package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1482eD extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1632ge A00;

    public C1482eD(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
