package com.vungle.ads.internal.load;

/* compiled from: DefaultAdLoader.kt */
@kotlin.Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/vungle/ads/internal/load/DefaultAdLoader$fetchAdMetadata$1", "Lcom/vungle/ads/internal/network/Callback;", "Lcom/vungle/ads/internal/model/AdPayload;", "onFailure", "", "call", "Lcom/vungle/ads/internal/network/Call;", "t", "", "onResponse", com.ironsource.Ve.n, "Lcom/vungle/ads/internal/network/Response;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultAdLoader$fetchAdMetadata$1 implements com.vungle.ads.internal.network.Callback<com.vungle.ads.internal.model.AdPayload> {
    final /* synthetic */ com.vungle.ads.internal.model.Placement $placement;
    final /* synthetic */ com.vungle.ads.internal.load.DefaultAdLoader this$0;

    DefaultAdLoader$fetchAdMetadata$1(com.vungle.ads.internal.load.DefaultAdLoader defaultAdLoader, com.vungle.ads.internal.model.Placement placement) {
        this.this$0 = defaultAdLoader;
        this.$placement = placement;
    }

    @Override // com.vungle.ads.internal.network.Callback
    public void onResponse(com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> call, final com.vungle.ads.internal.network.Response<com.vungle.ads.internal.model.AdPayload> response) {
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final com.vungle.ads.internal.load.DefaultAdLoader defaultAdLoader = this.this$0;
        final com.vungle.ads.internal.model.Placement placement = this.$placement;
        background_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1.m10439onResponse$lambda0(com.vungle.ads.internal.load.DefaultAdLoader.this, placement, response);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResponse$lambda-0, reason: not valid java name */
    public static final void m10439onResponse$lambda0(com.vungle.ads.internal.load.DefaultAdLoader this$0, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.network.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "$placement");
        if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
            this$0.onAdLoadFailed(new com.vungle.ads.AdRetryError().setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
            return;
        }
        if (response != null && !response.isSuccessful()) {
            this$0.onAdLoadFailed(new com.vungle.ads.APIFailedStatusCodeError(this$0.getApiErrorPrefix() + " API: " + response.code()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.model.AdPayload adPayload = response != null ? (com.vungle.ads.internal.model.AdPayload) response.body() : null;
        if ((adPayload != null ? adPayload.adUnit() : null) == null) {
            this$0.onAdLoadFailed(new com.vungle.ads.AdResponseEmptyError(this$0.getApiErrorPrefix() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
            return;
        }
        this$0.handleAdMetaData$vungle_ads_release(adPayload, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
    }

    @Override // com.vungle.ads.internal.network.Callback
    public void onFailure(com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> call, final java.lang.Throwable t) {
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final com.vungle.ads.internal.load.DefaultAdLoader defaultAdLoader = this.this$0;
        background_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1.m10438onFailure$lambda1(com.vungle.ads.internal.load.DefaultAdLoader.this, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFailure$lambda-1, reason: not valid java name */
    public static final void m10438onFailure$lambda1(com.vungle.ads.internal.load.DefaultAdLoader this$0, java.lang.Throwable th) {
        com.vungle.ads.VungleError retrofitToVungleError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        retrofitToVungleError = this$0.retrofitToVungleError(th);
        this$0.onAdLoadFailed(retrofitToVungleError.setLogEntry$vungle_ads_release(this$0.getLogEntry()).logError$vungle_ads_release());
    }
}
