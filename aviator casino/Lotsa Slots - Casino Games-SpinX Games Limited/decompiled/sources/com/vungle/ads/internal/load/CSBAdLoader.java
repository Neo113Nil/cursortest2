package com.vungle.ads.internal.load;

/* compiled from: CSBAdLoader.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/load/CSBAdLoader;", "Lcom/vungle/ads/internal/load/DefaultAdLoader;", "context", "Landroid/content/Context;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "getAdCall", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "getApiErrorPrefix", "validateAdMetadata", "Lcom/vungle/ads/VungleError;", "adPayload", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class CSBAdLoader extends com.vungle.ads.internal.load.DefaultAdLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSBAdLoader(android.content.Context context, com.vungle.ads.internal.network.VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.Executors sdkExecutors, com.vungle.ads.internal.omsdk.OMInjector omInjector, com.vungle.ads.internal.downloader.Downloader downloader, com.vungle.ads.internal.util.PathProvider pathProvider, com.vungle.ads.internal.load.AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloader, "downloader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.DefaultAdLoader
    public com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> getAdCall(java.lang.String placement, com.vungle.ads.VungleAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return getVungleApiClient().requestCSBAd(placement, adSize, getAdRequest().getCsbData());
    }

    @Override // com.vungle.ads.internal.load.DefaultAdLoader
    public java.lang.String getApiErrorPrefix() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public com.vungle.ads.VungleError validateAdMetadata(com.vungle.ads.internal.model.AdPayload adPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        com.vungle.ads.VungleError validateAdMetadata = super.validateAdMetadata(adPayload);
        if (validateAdMetadata == null) {
            return adPayload.getCSBResponse() == null ? new com.vungle.ads.AdResponseEmptyError("CSB response is missing from ad payload") : null;
        }
        return validateAdMetadata;
    }
}
