package com.ironsource.adapters.ironsource.nativeAd;

/* loaded from: classes5.dex */
public final class IronSourceNativeAdAdapter extends com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter<com.ironsource.adapters.ironsource.IronSourceAdapter> {
    private com.ironsource.A8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(com.ironsource.adapters.ironsource.IronSourceAdapter adapter) {
        super(adapter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter this$0, org.json.JSONObject config, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            com.ironsource.A8 a2 = com.ironsource.A8.j.a();
            a2.a(new com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdListener(new com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder(a2, this$0.getNativeAdProperties(config)), listener));
            android.app.Activity activity = com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity();
            org.json.JSONObject prepareLoadParams = this$0.prepareLoadParams(config, str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
            a2.a(activity, prepareLoadParams);
            this$0.nativeAd = a2;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            listener.onNativeAdLoadFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "IronSourceAdapter loadNativeAd exception " + e.getMessage()));
        }
    }

    private final org.json.JSONObject prepareLoadParams(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject loadParams = new org.json.JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(com.ironsource.X3.s, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, com.ironsource.mediationsdk.d.b().a(str));
        java.util.HashMap<java.lang.String, java.lang.String> extraParams = getAdapter().getInitParams();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extraParams, "extraParams");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        com.ironsource.A8 a8 = this.nativeAd;
        if (a8 != null) {
            a8.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject config, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new java.util.HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject config, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(final org.json.JSONObject config, org.json.JSONObject jSONObject, final java.lang.String str, final com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        postOnUIThread(new java.lang.Runnable() { // from class: com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0(com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter.this, config, listener, str);
            }
        });
    }
}
