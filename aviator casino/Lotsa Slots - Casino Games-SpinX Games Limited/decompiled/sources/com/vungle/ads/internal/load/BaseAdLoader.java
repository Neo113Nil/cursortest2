package com.vungle.ads.internal.load;

/* compiled from: BaseAdLoader.kt */
@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b&\u0018\u0000 d2\u00020\u0001:\u0001dB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010E\u001a\u00020FJ\b\u0010G\u001a\u00020FH\u0002J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0010\u0010M\u001a\u00020N2\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0012\u0010O\u001a\u0004\u0018\u00010K2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u001dH\u0002J\u0012\u0010S\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u001dH\u0002J!\u0010T\u001a\u00020F2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010U\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0002\bVJ\b\u0010W\u001a\u00020FH\u0002J\u000e\u0010X\u001a\u00020F2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020QJ\b\u0010[\u001a\u00020FH&J\b\u0010\\\u001a\u00020FH\u0002J\u0010\u0010]\u001a\u00020F2\u0006\u0010^\u001a\u00020\u000fH\u0003J\b\u0010_\u001a\u00020FH\u0002J\u001a\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010b\u001a\u00020FH$J\u0012\u0010c\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u001dH\u0016R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u000e\u0010B\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010D¨\u0006e²\u0006\n\u0010f\u001a\u00020gX\u008a\u0084\u0002²\u0006\n\u0010h\u001a\u00020iX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/load/BaseAdLoader;", "", "context", "Landroid/content/Context;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "adAssets", "", "Lcom/vungle/ads/internal/model/AdAsset;", "adLoaderCallback", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "adOptionalDownloadDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "adPreloadToReadyDurationMetric", "getAdRequest", "()Lcom/vungle/ads/internal/load/AdRequest;", "adRequiredDownloadDurationMetric", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "assetDownloadDurationMetric", "assetDownloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getAssetDownloadListener", "()Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getContext", "()Landroid/content/Context;", "downloadCount", "Ljava/util/concurrent/atomic/AtomicLong;", "downloadRequiredAssets", "", "", "fullyDownloaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loadStart", "", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "mainVideoSizeMetric", "Lcom/vungle/ads/SingleValueMetric;", "notifyFailed", "notifySuccess", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "requestToResponseMetric", "requiredAssetDownloaded", "getSdkExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "templateHtmlSizeMetric", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "cancel", "", "downloadAssets", "fileIsValid", "", "file", "Ljava/io/File;", "adAsset", "getAssetPriority", "Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "getDestinationDir", "getErrorInfo", "Lcom/vungle/ads/VungleError;", "adPayload", "getTemplateError", "handleAdMetaData", "metric", "handleAdMetaData$vungle_ads_release", "injectOMSDKIfNeeded", "loadAd", com.ironsource.Vf.b, "error", "onAdLoadReady", com.ironsource.Vf.f6030a, "onDownloadCompleted", "request", "onRequiredDownloadCompleted", "processVmTemplate", "asset", "requestAd", "validateAdMetadata", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseAdLoader {
    private static final java.lang.String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final java.lang.String TAG = "BaseAdLoader";
    private final java.util.List<com.vungle.ads.internal.model.AdAsset> adAssets;
    private com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback;
    private com.vungle.ads.TimeIntervalMetric adOptionalDownloadDurationMetric;
    private com.vungle.ads.TimeIntervalMetric adPreloadToReadyDurationMetric;
    private final com.vungle.ads.internal.load.AdRequest adRequest;
    private com.vungle.ads.TimeIntervalMetric adRequiredDownloadDurationMetric;
    private com.vungle.ads.internal.model.AdPayload advertisement;
    private com.vungle.ads.TimeIntervalMetric assetDownloadDurationMetric;
    private final android.content.Context context;
    private final java.util.concurrent.atomic.AtomicLong downloadCount;
    private final java.util.Set<java.lang.String> downloadRequiredAssets;
    private final com.vungle.ads.internal.downloader.Downloader downloader;
    private java.util.concurrent.atomic.AtomicBoolean fullyDownloaded;
    private long loadStart;
    private com.vungle.ads.internal.util.LogEntry logEntry;
    private com.vungle.ads.SingleValueMetric mainVideoSizeMetric;
    private java.util.concurrent.atomic.AtomicBoolean notifyFailed;
    private java.util.concurrent.atomic.AtomicBoolean notifySuccess;
    private final com.vungle.ads.internal.omsdk.OMInjector omInjector;
    private final com.vungle.ads.internal.util.PathProvider pathProvider;
    private final com.vungle.ads.TimeIntervalMetric requestToResponseMetric;
    private java.util.concurrent.atomic.AtomicBoolean requiredAssetDownloaded;
    private final com.vungle.ads.internal.executor.Executors sdkExecutors;
    private com.vungle.ads.SingleValueMetric templateHtmlSizeMetric;
    private final com.vungle.ads.internal.network.VungleApiClient vungleApiClient;

    public abstract void onAdLoadReady();

    protected abstract void requestAd();

    public BaseAdLoader(android.content.Context context, com.vungle.ads.internal.network.VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.Executors sdkExecutors, com.vungle.ads.internal.omsdk.OMInjector omInjector, com.vungle.ads.internal.downloader.Downloader downloader, com.vungle.ads.internal.util.PathProvider pathProvider, com.vungle.ads.internal.load.AdRequest adRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloader, "downloader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new java.util.concurrent.atomic.AtomicLong(0L);
        this.downloadRequiredAssets = new java.util.LinkedHashSet();
        this.notifySuccess = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.notifyFailed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.adAssets = new java.util.ArrayList();
        this.fullyDownloaded = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.requiredAssetDownloaded = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.requestToResponseMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.mainVideoSizeMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.network.VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final com.vungle.ads.internal.executor.Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final com.vungle.ads.internal.util.PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final com.vungle.ads.internal.load.AdRequest getAdRequest() {
        return this.adRequest;
    }

    /* renamed from: getAdvertisement$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.model.AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final void setAdvertisement$vungle_ads_release(com.vungle.ads.internal.model.AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    /* renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final void setLogEntry$vungle_ads_release(com.vungle.ads.internal.util.LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    private final com.vungle.ads.internal.downloader.AssetDownloadListener getAssetDownloadListener() {
        return new com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1(this);
    }

    public final void loadAd(com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = java.lang.System.currentTimeMillis();
        this.sdkExecutors.getBACKGROUND_EXECUTOR().execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.load.BaseAdLoader.m10433loadAd$lambda0(com.vungle.ads.internal.load.BaseAdLoader.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m10433loadAd$lambda0(com.vungle.ads.internal.load.BaseAdLoader this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestToResponseMetric.markStart();
        this$0.requestAd();
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    private final void downloadAssets() {
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit;
        java.lang.Integer maxDownloadRetryAttempts;
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost((adPayload == null || (adUnit = adPayload.adUnit()) == null || (maxDownloadRetryAttempts = adUnit.getMaxDownloadRetryAttempts()) == null) ? 0 : maxDownloadRetryAttempts.intValue(), 5);
        for (com.vungle.ads.internal.model.AdAsset adAsset : this.adAssets) {
            com.vungle.ads.internal.downloader.DownloadRequest downloadRequest = new com.vungle.ads.internal.downloader.DownloadRequest(getAssetPriority(adAsset), adAsset, this.logEntry, coerceAtMost);
            if (adAsset.isHtmlTemplate()) {
                downloadRequest.startTemplateRecord();
            }
            if (adAsset.getIsRequired()) {
                this.downloadRequiredAssets.add(adAsset.getServerPath());
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    public final void onAdLoadFailed(com.vungle.ads.VungleError error) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        if (this.notifySuccess.get()) {
            return;
        }
        boolean z2 = true;
        if (this.notifyFailed.compareAndSet(false, true)) {
            com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
            if (adPayload != null && adPayload.isNativeTemplateType()) {
                java.util.List<com.vungle.ads.internal.model.AdAsset> list = this.adAssets;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((com.vungle.ads.internal.model.AdAsset) obj).isMainAssets()) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
                java.util.List list2 = (java.util.List) pair.component1();
                java.util.List list3 = (java.util.List) pair.component2();
                java.util.List list4 = list2;
                if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                    java.util.Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (((com.vungle.ads.internal.model.AdAsset) it.next()).isDownloaded()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                java.util.List list5 = list3;
                if (!(list5 instanceof java.util.Collection) || !list5.isEmpty()) {
                    java.util.Iterator it2 = list5.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.vungle.ads.internal.model.AdAsset) it2.next()).isDownloaded()) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z && z2) {
                    this.notifyFailed.set(false);
                    onAdReady();
                    return;
                }
            }
            com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onFailure(error);
            }
        }
    }

    private final void onAdReady() {
        final com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (adPayload.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            java.lang.String valueOf = java.lang.String.valueOf(adPayload.getIndexFilePath());
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "start preloading");
            com.vungle.ads.internal.presenter.WebViewManager.INSTANCE.preloadWebView$vungle_ads_release(this.context, adPayload, this.adRequest.getPlacement(), valueOf, adPayload.getWebViewSettings(), new com.vungle.ads.internal.presenter.PreloadDelegate() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$1$1
                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdReadyToPlay() {
                    com.vungle.ads.TimeIntervalMetric timeIntervalMetric;
                    com.vungle.ads.TimeIntervalMetric timeIntervalMetric2;
                    com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback;
                    timeIntervalMetric = com.vungle.ads.internal.load.BaseAdLoader.this.adPreloadToReadyDurationMetric;
                    timeIntervalMetric.markEnd();
                    com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
                    timeIntervalMetric2 = com.vungle.ads.internal.load.BaseAdLoader.this.adPreloadToReadyDurationMetric;
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, timeIntervalMetric2, com.vungle.ads.internal.load.BaseAdLoader.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                    com.vungle.ads.internal.load.BaseAdLoader.this.onAdLoadReady();
                    adLoaderCallback = com.vungle.ads.internal.load.BaseAdLoader.this.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }

                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdFailedToPlay() {
                    com.vungle.ads.TimeIntervalMetric timeIntervalMetric;
                    com.vungle.ads.TimeIntervalMetric timeIntervalMetric2;
                    com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback;
                    timeIntervalMetric = com.vungle.ads.internal.load.BaseAdLoader.this.adPreloadToReadyDurationMetric;
                    timeIntervalMetric.markEnd();
                    com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
                    timeIntervalMetric2 = com.vungle.ads.internal.load.BaseAdLoader.this.adPreloadToReadyDurationMetric;
                    com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, timeIntervalMetric2, com.vungle.ads.internal.load.BaseAdLoader.this.getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
                    com.vungle.ads.internal.util.Logger.INSTANCE.e("BaseAdLoader", "fail to load ad");
                    com.vungle.ads.internal.load.BaseAdLoader.this.onAdLoadReady();
                    adLoaderCallback = com.vungle.ads.internal.load.BaseAdLoader.this.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }
            }, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            com.vungle.ads.internal.load.AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onSuccess(adPayload);
            }
        }
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        m10434onAdReady$lambda5$lambda4(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.task.JobRunner>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$lambda-5$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.task.JobRunner invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.task.JobRunner.class);
            }
        })).execute(com.vungle.ads.internal.task.ResendTpatJob.INSTANCE.makeJobInfo());
    }

    /* renamed from: onAdReady$lambda-5$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.task.JobRunner m10434onAdReady$lambda5$lambda4(kotlin.Lazy<? extends com.vungle.ads.internal.task.JobRunner> lazy) {
        return lazy.getValue();
    }

    private final boolean fileIsValid(java.io.File file, com.vungle.ads.internal.model.AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final java.io.File getDestinationDir(com.vungle.ads.internal.model.AdPayload advertisement) {
        return this.pathProvider.getDownloadsDirForAd(advertisement.eventId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(com.vungle.ads.internal.model.AdAsset asset, com.vungle.ads.internal.model.AdPayload advertisement) {
        if (advertisement == null || !asset.isDownloaded() || asset.getLocalPath().length() == 0 || !fileIsValid(new java.io.File(asset.getLocalPath()), asset)) {
            return false;
        }
        java.io.File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        com.vungle.ads.internal.util.FileUtility.printDirectoryTree(destinationDir);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() {
        this.adRequiredDownloadDurationMetric.markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (java.lang.String) null, 4, (java.lang.Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDownloadCompleted(com.vungle.ads.internal.load.AdRequest request) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "All download completed " + request);
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.assetDownloadDurationMetric, this.logEntry, (java.lang.String) null, 4, (java.lang.Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.adOptionalDownloadDurationMetric, this.logEntry, (java.lang.String) null, 4, (java.lang.Object) null);
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(com.vungle.ads.internal.load.BaseAdLoader baseAdLoader, com.vungle.ads.internal.model.AdPayload adPayload, com.vungle.ads.SingleValueMetric singleValueMetric, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i & 2) != 0) {
            singleValueMetric = null;
        }
        baseAdLoader.handleAdMetaData$vungle_ads_release(adPayload, singleValueMetric);
    }

    public final void handleAdMetaData$vungle_ads_release(com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.SingleValueMetric metric) {
        java.util.List<java.lang.String> loadAdUrls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        if (advertisement != null) {
            advertisement.recordExpiryWindowStart();
        }
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        com.vungle.ads.internal.util.LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setEventId$vungle_ads_release(advertisement.eventId());
        }
        com.vungle.ads.internal.util.LogEntry logEntry2 = this.logEntry;
        if (logEntry2 != null) {
            logEntry2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        com.vungle.ads.internal.util.LogEntry logEntry3 = this.logEntry;
        if (logEntry3 != null) {
            logEntry3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        com.vungle.ads.internal.util.LogEntry logEntry4 = this.logEntry;
        if (logEntry4 != null) {
            logEntry4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        com.vungle.ads.internal.util.LogEntry logEntry5 = this.logEntry;
        if (logEntry5 != null) {
            logEntry5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        com.vungle.ads.internal.util.LogEntry logEntry6 = this.logEntry;
        if (logEntry6 != null) {
            logEntry6.setPartialDownloadEnabled$vungle_ads_release(java.lang.Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        com.vungle.ads.internal.util.LogEntry logEntry7 = this.logEntry;
        if (logEntry7 != null) {
            logEntry7.setAdoEnabled$vungle_ads_release(java.lang.Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        com.vungle.ads.internal.util.LogEntry logEntry8 = this.logEntry;
        if (logEntry8 != null) {
            logEntry8.setAdPoddingEnabled$vungle_ads_release(java.lang.Boolean.valueOf(advertisement.isAdPoddingEnabled()));
        }
        com.vungle.ads.internal.util.LogEntry logEntry9 = this.logEntry;
        if (logEntry9 != null) {
            logEntry9.setExperiments$vungle_ads_release(advertisement.getExperiments());
        }
        this.requestToResponseMetric.markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.logEntry, (java.lang.String) null, 4, (java.lang.Object) null);
        com.vungle.ads.internal.model.ConfigPayload config = advertisement.getConfig();
        if (config != null) {
            com.vungle.ads.internal.ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.context, config, false, metric);
        }
        com.vungle.ads.VungleError validateAdMetadata = validateAdMetadata(advertisement);
        if (validateAdMetadata != null) {
            onAdLoadFailed(validateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        java.io.File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new com.vungle.ads.AssetWriteError("Invalid directory. " + destinationDir).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        injectOMSDKIfNeeded();
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$handleAdMetaData$$inlined$inject$1
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
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = advertisement.adUnit();
        if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
            java.util.Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                com.vungle.ads.internal.network.TpatSender.sendTpat$default(m10432handleAdMetaData$lambda7(lazy), new com.vungle.ads.internal.network.TpatRequest.Builder((java.lang.String) it.next()).tpatKey(com.vungle.ads.internal.Constants.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    /* renamed from: handleAdMetaData$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10432handleAdMetaData$lambda7(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }

    private final com.vungle.ads.internal.downloader.DownloadRequest.Priority getAssetPriority(com.vungle.ads.internal.model.AdAsset adAsset) {
        if (adAsset.getIsRequired()) {
            return com.vungle.ads.internal.downloader.DownloadRequest.Priority.CRITICAL;
        }
        return com.vungle.ads.internal.downloader.DownloadRequest.Priority.HIGHEST;
    }

    private final void injectOMSDKIfNeeded() {
        com.vungle.ads.internal.model.AdPayload adPayload = this.advertisement;
        if (adPayload == null || !adPayload.omEnabled()) {
            return;
        }
        try {
            this.omInjector.init();
            this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to inject OMSDK: " + e.getMessage());
            new com.vungle.ads.OmSdkJsError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + e.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public com.vungle.ads.VungleError validateAdMetadata(com.vungle.ads.internal.model.AdPayload adPayload) {
        java.lang.Integer sleep;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = adPayload.adUnit();
        if (adUnit != null && (sleep = adUnit.getSleep()) != null) {
            sleep.intValue();
            return getErrorInfo(adPayload);
        }
        java.lang.String referenceId = this.adRequest.getPlacement().getReferenceId();
        com.vungle.ads.internal.model.AdPayload adPayload2 = this.advertisement;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(referenceId, adPayload2 != null ? adPayload2.placementId() : null)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Waterfall request and responses placement don't match ");
            com.vungle.ads.internal.model.AdPayload adPayload3 = this.advertisement;
            sb.append(adPayload3 != null ? adPayload3.placementId() : null);
            sb.append('.');
            return new com.vungle.ads.PlacementMismatchError(sb.toString());
        }
        com.vungle.ads.VungleError templateError = getTemplateError(adPayload);
        if (templateError != null) {
            return templateError;
        }
        if (!adPayload.hasExpired()) {
            java.lang.String eventId = adPayload.eventId();
            if (eventId == null || eventId.length() == 0) {
                return new com.vungle.ads.InvalidEventIdError("Event id is invalid.");
            }
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The ad markup has expired for playback. Ad expiry: ");
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        sb2.append(adUnit2 != null ? adUnit2.getExpiry() : null);
        sb2.append(", device: ");
        sb2.append(java.lang.System.currentTimeMillis());
        return new com.vungle.ads.AdExpiredError(sb2.toString());
    }

    private final com.vungle.ads.VungleError getTemplateError(com.vungle.ads.internal.model.AdPayload adPayload) {
        com.vungle.ads.internal.model.AdPayload.CacheableReplacement cacheableReplacement;
        com.vungle.ads.internal.model.AdPayload.CacheableReplacement cacheableReplacement2;
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = adPayload.adUnit();
        com.vungle.ads.internal.model.AdPayload.TemplateSettings templateSettings = adUnit != null ? adUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new com.vungle.ads.AdResponseEmptyError("Missing template settings");
        }
        java.util.Map<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (adPayload.isNativeTemplateType()) {
            if (((cacheableReplacements == null || (cacheableReplacement2 = cacheableReplacements.get(com.vungle.ads.internal.NativeAdInternal.TOKEN_MAIN_IMAGE)) == null) ? null : cacheableReplacement2.getUrl()) == null) {
                if (((cacheableReplacements == null || (cacheableReplacement = cacheableReplacements.get("MAIN_VIDEO")) == null) ? null : cacheableReplacement.getUrl()) == null) {
                    return new com.vungle.ads.NativeAssetError("Unable to load null main asset.");
                }
            }
            com.vungle.ads.internal.model.AdPayload.CacheableReplacement cacheableReplacement3 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((cacheableReplacement3 != null ? cacheableReplacement3.getUrl() : null) == null) {
                return new com.vungle.ads.NativeAssetError("Unable to load null privacy image.");
            }
        } else {
            com.vungle.ads.internal.model.AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            java.lang.String vmURL = adUnit2 != null ? adUnit2.getVmURL() : null;
            java.lang.String str = vmURL;
            if (str == null || str.length() == 0) {
                return new com.vungle.ads.InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!com.vungle.ads.internal.util.Utils.INSTANCE.isUrlValid(vmURL)) {
                return new com.vungle.ads.InvalidTemplateURLError("Failed to load vm url: " + vmURL);
            }
        }
        if (cacheableReplacements != null) {
            for (java.util.Map.Entry<java.lang.String, com.vungle.ads.internal.model.AdPayload.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                java.lang.String url = entry.getValue().getUrl();
                java.lang.String str2 = url;
                if (str2 == null || str2.length() == 0) {
                    return new com.vungle.ads.InvalidAssetUrlError("None asset URL for " + entry.getKey());
                }
                if (!com.vungle.ads.internal.util.Utils.INSTANCE.isUrlValid(url)) {
                    return new com.vungle.ads.InvalidAssetUrlError("Invalid asset URL " + url);
                }
            }
        }
        return null;
    }

    private final com.vungle.ads.VungleError getErrorInfo(com.vungle.ads.internal.model.AdPayload adPayload) {
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit = adPayload.adUnit();
        java.lang.Integer errorCode = adUnit != null ? adUnit.getErrorCode() : null;
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        java.lang.Integer sleep = adUnit2 != null ? adUnit2.getSleep() : null;
        com.vungle.ads.internal.model.AdPayload.AdUnit adUnit3 = adPayload.adUnit();
        java.lang.String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (adUnit3 != null ? adUnit3.getInfo() : null);
        if ((errorCode != null && errorCode.intValue() == 10001) || ((errorCode != null && errorCode.intValue() == 10002) || ((errorCode != null && errorCode.intValue() == 20001) || ((errorCode != null && errorCode.intValue() == 30001) || (errorCode != null && errorCode.intValue() == 30002))))) {
            com.vungle.ads.internal.protos.Sdk.SDKError.Reason forNumber = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.forNumber(errorCode.intValue());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(errorCode)");
            return new com.vungle.ads.AdPayloadError(forNumber, str);
        }
        return new com.vungle.ads.AdPayloadError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
    }
}
