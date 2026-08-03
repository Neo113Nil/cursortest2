package com.vungle.ads.internal.load;

/* compiled from: DefaultAdLoader.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/load/DefaultAdLoader;", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "context", "Landroid/content/Context;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "fetchAdMetadata", "", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "getAdCall", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", "", "getApiErrorPrefix", "onAdLoadReady", "requestAd", "retrofitToVungleError", "Lcom/vungle/ads/VungleError;", "throwable", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultAdLoader extends com.vungle.ads.internal.load.BaseAdLoader {
    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAdLoader(android.content.Context context, com.vungle.ads.internal.network.VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.Executors sdkExecutors, com.vungle.ads.internal.omsdk.OMInjector omInjector, com.vungle.ads.internal.downloader.Downloader downloader, com.vungle.ads.internal.util.PathProvider pathProvider, com.vungle.ads.internal.load.AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloader, "downloader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    protected void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    public com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> getAdCall(java.lang.String placement, com.vungle.ads.VungleAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return getVungleApiClient().requestAd(placement, adSize);
    }

    public java.lang.String getApiErrorPrefix() {
        return "ads";
    }

    protected void fetchAdMetadata(com.vungle.ads.VungleAdSize adSize, com.vungle.ads.internal.model.Placement placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        if (getVungleApiClient().checkIsRetryAfterActive(placement.getReferenceId())) {
            onAdLoadFailed(new com.vungle.ads.AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> adCall = getAdCall(placement.getReferenceId(), adSize);
        if (adCall == null) {
            onAdLoadFailed(new com.vungle.ads.NetworkUnreachable(getApiErrorPrefix() + " is null").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        adCall.enqueue(new com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1(this, placement));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.VungleError retrofitToVungleError(java.lang.Throwable throwable) {
        if (throwable instanceof java.net.SocketTimeoutException) {
            return new com.vungle.ads.NetworkTimeoutError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getApiErrorPrefix());
        sb.append(" request fail: ");
        sb.append(throwable != null ? throwable.getMessage() : null);
        return new com.vungle.ads.NetworkUnreachable(sb.toString());
    }
}
