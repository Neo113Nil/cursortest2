package com.vungle.ads.internal.load;

/* compiled from: RealtimeAdLoader.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0018\u0010\u0014\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¨\u0006\u0018²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/load/RealtimeAdLoader;", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "context", "Landroid/content/Context;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "onAdLoadReady", "", "requestAd", "sendWinNotification", com.ironsource.C3232q2.x, "", "", "vungle-ads_release", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class RealtimeAdLoader extends com.vungle.ads.internal.load.BaseAdLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeAdLoader(android.content.Context context, com.vungle.ads.internal.network.VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.Executors sdkExecutors, com.vungle.ads.internal.omsdk.OMInjector omInjector, com.vungle.ads.internal.downloader.Downloader downloader, com.vungle.ads.internal.util.PathProvider pathProvider, com.vungle.ads.internal.load.AdRequest adRequest) {
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
        com.vungle.ads.internal.model.BidPayload adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new com.vungle.ads.InvalidBidPayloadError().setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        if (com.vungle.ads.internal.ConfigManager.INSTANCE.rtaDebuggingEnabled()) {
            try {
                java.lang.String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                com.vungle.ads.internal.util.Logger.INSTANCE.d("RTA_DEBUGGER", java.lang.String.valueOf(decodedAdsResponse));
                com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
                final android.content.Context context = getContext();
                kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.load.RealtimeAdLoader$requestAd$$inlined$inject$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.vungle.ads.internal.network.VungleApiClient invoke() {
                        return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.VungleApiClient.class);
                    }
                });
                if (decodedAdsResponse != null) {
                    new com.vungle.ads.internal.load.RTADebugger(m10440requestAd$lambda0(lazy)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.vungle.ads.internal.model.AdPayload ad = adMarkup.getAd();
        java.lang.Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || ad == null) {
            onAdLoadFailed(new com.vungle.ads.AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
        } else {
            handleAdMetaData$vungle_ads_release(ad, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }

    /* renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.VungleApiClient m10440requestAd$lambda0(kotlin.Lazy<com.vungle.ads.internal.network.VungleApiClient> lazy) {
        return lazy.getValue();
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
        com.vungle.ads.internal.model.AdPayload advertisement$vungle_ads_release = getAdvertisement();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    private final void sendWinNotification(java.util.List<java.lang.String> notifications) {
        if (notifications == null || !notifications.isEmpty()) {
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context = getContext();
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.load.RealtimeAdLoader$sendWinNotification$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.network.TpatSender invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.TpatSender.class);
                }
            });
            if (notifications != null) {
                java.util.Iterator<T> it = notifications.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.TpatSender.sendTpat$default(m10441sendWinNotification$lambda2(lazy), new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(com.vungle.ads.internal.Constants.WIN_NOTIFICATION).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    /* renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10441sendWinNotification$lambda2(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }
}
