package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1001Rh implements com.facebook.ads.internal.api.AudienceNetworkAdsApi {
    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final int getAdFormatForPlacement(java.lang.String str) {
        com.facebook.ads.redexgen.core.WU.A02(this);
        return 0;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final void initialize(android.content.Context context, com.facebook.ads.internal.settings.MultithreadedBundleWrapper initSettings, com.facebook.ads.AudienceNetworkAds.InitListener initListener) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        if (initListener == null) {
            try {
                initListener = new com.facebook.ads.redexgen.core.C1000Rg(this);
            } catch (java.lang.Throwable th) {
                com.facebook.ads.redexgen.core.WU.A00(th, this);
                return;
            }
        }
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final boolean isInitialized() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return false;
        }
        try {
            com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader();
            if (dynamicLoader == null) {
                return false;
            }
            return dynamicLoader.getInitApi().isInitialized();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return false;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
    public final void onContentProviderCreated(android.content.Context context) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
