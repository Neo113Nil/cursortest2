package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1011Rr implements com.facebook.ads.internal.api.InitApi {
    @Override // com.facebook.ads.internal.api.InitApi
    public final void initialize(android.content.Context context, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i) {
        com.facebook.ads.redexgen.core.U2.A0H(com.facebook.ads.redexgen.core.C1009Rp.A09(context), multithreadedBundleWrapper, initListener, i);
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final boolean isInitialized() {
        return com.facebook.ads.redexgen.core.U2.A0I();
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onAdLoadInvoked(android.content.Context context) {
        com.facebook.ads.redexgen.core.U2.A08(com.facebook.ads.redexgen.core.C1009Rp.A09(context));
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onContentProviderCreated(android.content.Context context) {
        com.facebook.ads.redexgen.core.U2.A09(com.facebook.ads.redexgen.core.C1009Rp.A09(context));
    }
}
