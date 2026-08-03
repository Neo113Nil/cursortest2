package com.vungle.ads.internal.load;

/* compiled from: BaseAdLoader.kt */
@kotlin.Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"com/vungle/ads/internal/load/BaseAdLoader$assetDownloadListener$1", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "partialDownloadRecorded", "", "onError", "", "error", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "onProgress", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "onStart", "onSuccess", "file", "Ljava/io/File;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseAdLoader$assetDownloadListener$1 implements com.vungle.ads.internal.downloader.AssetDownloadListener {
    private boolean partialDownloadRecorded;
    final /* synthetic */ com.vungle.ads.internal.load.BaseAdLoader this$0;

    BaseAdLoader$assetDownloadListener$1(com.vungle.ads.internal.load.BaseAdLoader baseAdLoader) {
        this.this$0 = baseAdLoader;
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onStart(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        com.vungle.ads.internal.util.Logger.INSTANCE.w("BaseAdLoader", "onStart called: " + downloadRequest.getAsset().getServerPath());
        downloadRequest.startPartialDownloadRecord();
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onProgress(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress progress, com.vungle.ads.internal.downloader.DownloadRequest downloadRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        final com.vungle.ads.internal.model.AdAsset asset = downloadRequest.getAsset();
        java.lang.Integer percentage = asset.getPercentage();
        com.vungle.ads.internal.util.Logger.INSTANCE.d("BaseAdLoader", "Download progress: " + progress + " url: " + asset.getServerPath());
        if (this.partialDownloadRecorded || percentage == null || progress.getProgressPercent() < percentage.intValue()) {
            return;
        }
        this.partialDownloadRecorded = true;
        if (new kotlin.ranges.IntRange(1, 99).contains(percentage.intValue())) {
            downloadRequest.stopPartialDownloadRecord();
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w("BaseAdLoader", "Download progress: hit chunk percentage=" + percentage + " for url: " + asset.getServerPath());
        if (asset.getIsRequired()) {
            com.vungle.ads.internal.executor.VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
            final com.vungle.ads.internal.load.BaseAdLoader baseAdLoader = this.this$0;
            background_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1.m10436onProgress$lambda0(com.vungle.ads.internal.load.BaseAdLoader.this, asset);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProgress$lambda-0, reason: not valid java name */
    public static final void m10436onProgress$lambda0(com.vungle.ads.internal.load.BaseAdLoader this$0, com.vungle.ads.internal.model.AdAsset adAsset) {
        java.util.Set set;
        java.util.Set set2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adAsset, "$adAsset");
        set = this$0.downloadRequiredAssets;
        set.remove(adAsset.getServerPath());
        set2 = this$0.downloadRequiredAssets;
        if (set2.isEmpty()) {
            atomicBoolean = this$0.requiredAssetDownloaded;
            if (atomicBoolean.get()) {
                this$0.onRequiredDownloadCompleted();
            } else {
                this$0.onAdLoadFailed(new com.vungle.ads.AssetRequestError("Failed to download required assets."));
                this$0.cancel();
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onError(final com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError error, final com.vungle.ads.internal.downloader.DownloadRequest downloadRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        com.vungle.ads.internal.util.Logger.INSTANCE.e("BaseAdLoader", "onError called: " + error);
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final com.vungle.ads.internal.load.BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1.m10435onError$lambda1(com.vungle.ads.internal.downloader.DownloadRequest.this, baseAdLoader, this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError$lambda-1, reason: not valid java name */
    public static final void m10435onError$lambda1(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.load.BaseAdLoader this$0, com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1 this$1, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError downloadError) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicLong atomicLong;
        java.util.Set set;
        java.util.Set set2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$1, "this$1");
        com.vungle.ads.internal.model.AdAsset asset = downloadRequest.getAsset();
        if (asset.isPrivacyIcon()) {
            java.io.File injectPrivacyIcon = com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector.INSTANCE.injectPrivacyIcon(this$0.getPathProvider().getVmDir());
            if (injectPrivacyIcon != null && injectPrivacyIcon.exists()) {
                this$1.onSuccess(injectPrivacyIcon, downloadRequest);
                return;
            }
            new com.vungle.ads.PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        asset.setStatus(com.vungle.ads.internal.model.AdAsset.Status.DOWNLOAD_FAILED);
        atomicBoolean = this$0.fullyDownloaded;
        atomicBoolean.set(false);
        if (asset.getIsRequired()) {
            atomicBoolean2 = this$0.requiredAssetDownloaded;
            atomicBoolean2.set(false);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to download assets ");
        sb.append(asset.getServerPath());
        sb.append(". error: ");
        sb.append(downloadError);
        sb.append(" errorType=");
        sb.append(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.classifyNetworkError(downloadError != null ? downloadError.getCause() : null));
        sb.append(" proxyEnabled=");
        sb.append(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.isProxyEnabled(this$0.getContext()));
        sb.append(" privateDns=");
        sb.append(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.getPrivateDnsInfo(this$0.getContext()));
        sb.append(" network=");
        sb.append(com.vungle.ads.internal.platform.DeviceCheckUtils.INSTANCE.getActiveNetworkType(this$0.getContext()));
        new com.vungle.ads.AssetRequestError(sb.toString()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (asset.getIsRequired()) {
            set = this$0.downloadRequiredAssets;
            set.remove(downloadRequest.getAsset().getServerPath());
            set2 = this$0.downloadRequiredAssets;
            if (set2.isEmpty()) {
                this$0.onAdLoadFailed(new com.vungle.ads.AssetRequestError("Error: Failed to download required assets."));
                this$0.cancel();
                return;
            }
        }
        atomicLong = this$0.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            this$0.onAdLoadFailed(new com.vungle.ads.AssetRequestError("Error: Failed to download assets."));
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onSuccess(final java.io.File file, final com.vungle.ads.internal.downloader.DownloadRequest downloadRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor background_executor = this.this$0.getSdkExecutors().getBACKGROUND_EXECUTOR();
        final com.vungle.ads.internal.load.BaseAdLoader baseAdLoader = this.this$0;
        background_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1.m10437onSuccess$lambda2(file, this, downloadRequest, baseAdLoader);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-2, reason: not valid java name */
    public static final void m10437onSuccess$lambda2(java.io.File file, com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1 this$0, com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.load.BaseAdLoader this$1) {
        com.vungle.ads.SingleValueMetric singleValueMetric;
        com.vungle.ads.SingleValueMetric singleValueMetric2;
        java.util.concurrent.atomic.AtomicLong atomicLong;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.Set set;
        java.util.Set set2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        boolean processVmTemplate;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean3;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean4;
        com.vungle.ads.SingleValueMetric singleValueMetric3;
        com.vungle.ads.SingleValueMetric singleValueMetric4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "$file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (!file.exists()) {
            this$0.onError(new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(-1, new java.io.IOException("Downloaded file not found!"), com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        com.vungle.ads.internal.model.AdAsset asset = downloadRequest.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(com.vungle.ads.internal.model.AdAsset.Status.DOWNLOAD_SUCCESS);
        java.lang.Integer percentage = asset.getPercentage();
        if (percentage == null || percentage.intValue() == 0 || percentage.intValue() == 100) {
            downloadRequest.stopPartialDownloadRecord();
        }
        if (asset.isHtmlTemplate()) {
            downloadRequest.stopTemplateRecord();
            singleValueMetric3 = this$1.templateHtmlSizeMetric;
            singleValueMetric3.setValue(java.lang.Long.valueOf(file.length()));
            com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
            singleValueMetric4 = this$1.templateHtmlSizeMetric;
            analyticsClient.logMetric$vungle_ads_release(singleValueMetric4, this$1.getLogEntry(), asset.getServerPath());
        } else if (asset.isMainVideo()) {
            singleValueMetric = this$1.mainVideoSizeMetric;
            singleValueMetric.setValue(java.lang.Long.valueOf(file.length()));
            com.vungle.ads.AnalyticsClient analyticsClient2 = com.vungle.ads.AnalyticsClient.INSTANCE;
            singleValueMetric2 = this$1.mainVideoSizeMetric;
            analyticsClient2.logMetric$vungle_ads_release(singleValueMetric2, this$1.getLogEntry(), asset.getServerPath());
        }
        com.vungle.ads.internal.model.AdPayload advertisement = this$1.getAdvertisement();
        if (advertisement != null) {
            advertisement.updateAdAssetPath(asset.getAdIdentifier(), file);
        }
        if (asset.isHtmlTemplate()) {
            processVmTemplate = this$1.processVmTemplate(asset, this$1.getAdvertisement());
            if (!processVmTemplate) {
                atomicBoolean3 = this$1.fullyDownloaded;
                atomicBoolean3.set(false);
                if (asset.getIsRequired()) {
                    atomicBoolean4 = this$1.requiredAssetDownloaded;
                    atomicBoolean4.set(false);
                }
            }
        }
        if (asset.getIsRequired()) {
            set = this$1.downloadRequiredAssets;
            set.remove(asset.getServerPath());
            set2 = this$1.downloadRequiredAssets;
            if (set2.isEmpty()) {
                atomicBoolean2 = this$1.requiredAssetDownloaded;
                if (atomicBoolean2.get()) {
                    this$1.onRequiredDownloadCompleted();
                } else {
                    this$1.onAdLoadFailed(new com.vungle.ads.AssetRequestError("Failed to download required assets."));
                    this$1.cancel();
                    return;
                }
            }
        }
        atomicLong = this$1.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            atomicBoolean = this$1.fullyDownloaded;
            if (atomicBoolean.get()) {
                this$1.onDownloadCompleted(this$1.getAdRequest());
            } else {
                this$1.onAdLoadFailed(new com.vungle.ads.AssetRequestError("Failed to download assets."));
            }
        }
    }
}
