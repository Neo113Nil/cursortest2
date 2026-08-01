package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2776eD extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C2926ge A00;

    public C2776eD(C2926ge c2926ge) {
        this.A00 = c2926ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
