package com.paypal.oslo.downloads.worker;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/downloads/worker/DownloadWorkScheduler;", "", "Landroidx/work/WorkManager;", "workManager", "<init>", "(Landroidx/work/WorkManager;)V", "Lcom/paypal/oslo/downloads/api/model/DownloadId;", "downloadId", "Lcom/paypal/oslo/downloads/api/model/DownloadConfig;", "config", "Lcom/paypal/oslo/downloads/api/model/DownloadPriority;", "priority", "", "isUserInitiated", "Ljava/util/UUID;", "scheduleDownload-6HENkBo", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/DownloadConfig;Lcom/paypal/oslo/downloads/api/model/DownloadPriority;Z)Ljava/util/UUID;", "scheduleDownload", "", "cancelDownload-3wgKXB0", "(Ljava/lang/String;)V", "cancelDownload", "cancelAllDownloads", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/work/WorkManager;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadWorkScheduler {
    public static final long INITIAL_BACKOFF_SECONDS = 30;
    public static final java.lang.String TAG_DOWNLOAD = "oslo_download";
    public static final java.lang.String TAG_PRIORITY_PREFIX = "priority_";
    public static final java.lang.String WORK_NAME_PREFIX = "download_";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.work.WorkManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DownloadWorkScheduler(androidx.work.WorkManager workManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = workManager;
    }

    /* renamed from: scheduleDownload-6HENkBo$default, reason: not valid java name */
    public static /* synthetic */ java.util.UUID m11757scheduleDownload6HENkBo$default(com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler, java.lang.String str, com.paypal.oslo.downloads.api.model.DownloadConfig downloadConfig, com.paypal.oslo.downloads.api.model.DownloadPriority downloadPriority, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            downloadPriority = com.paypal.oslo.downloads.api.model.DownloadPriority.NORMAL;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return downloadWorkScheduler.m11759scheduleDownload6HENkBo(str, downloadConfig, downloadPriority, z);
    }

    /* renamed from: cancelDownload-3wgKXB0, reason: not valid java name */
    public final void m11758cancelDownload3wgKXB0(java.lang.String downloadId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        this.getHighResolutionOutputSizeshNQ4ISI.cancelUniqueWork(WORK_NAME_PREFIX.concat(java.lang.String.valueOf(downloadId)));
    }

    public final void cancelAllDownloads() {
        this.getHighResolutionOutputSizeshNQ4ISI.cancelAllWorkByTag(TAG_DOWNLOAD);
    }

    /* renamed from: scheduleDownload-6HENkBo, reason: not valid java name */
    public final java.util.UUID m11759scheduleDownload6HENkBo(java.lang.String downloadId, com.paypal.oslo.downloads.api.model.DownloadConfig config, com.paypal.oslo.downloads.api.model.DownloadPriority priority, boolean isUserInitiated) {
        androidx.work.OneTimeWorkRequest build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
        androidx.work.Constraints build2 = new androidx.work.Constraints.Builder().setRequiredNetworkType(config.getRequiresWifi() ? androidx.work.NetworkType.UNMETERED : androidx.work.NetworkType.CONNECTED).setRequiresCharging(config.getRequiresCharging()).setRequiresBatteryNotLow(config.getRequiresSufficientBattery()).setRequiresStorageNotLow(true).build();
        if (isUserInitiated && android.os.Build.VERSION.SDK_INT >= 31 && !config.getRequiresCharging() && !config.getRequiresSufficientBattery()) {
            androidx.work.OneTimeWorkRequest.Builder expedited = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.downloads.worker.DownloadWorker.class).setExpedited(androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            kotlin.Pair[] pairArr = {kotlin.TuplesKt.to("download_id", downloadId)};
            androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
            kotlin.Pair pair = pairArr[0];
            builder.put((java.lang.String) pair.getFirst(), pair.getSecond());
            build = expedited.setInputData(builder.build()).setConstraints(build2).setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS).addTag(TAG_DOWNLOAD).addTag(TAG_PRIORITY_PREFIX.concat(java.lang.String.valueOf(priority.name()))).build();
        } else {
            androidx.work.OneTimeWorkRequest.Builder builder2 = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.downloads.worker.DownloadWorker.class);
            kotlin.Pair[] pairArr2 = {kotlin.TuplesKt.to("download_id", downloadId)};
            androidx.work.Data.Builder builder3 = new androidx.work.Data.Builder();
            kotlin.Pair pair2 = pairArr2[0];
            builder3.put((java.lang.String) pair2.getFirst(), pair2.getSecond());
            build = builder2.setInputData(builder3.build()).setConstraints(build2).setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS).addTag(TAG_DOWNLOAD).addTag(TAG_PRIORITY_PREFIX.concat(java.lang.String.valueOf(priority.name()))).build();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.enqueueUniqueWork(WORK_NAME_PREFIX.concat(java.lang.String.valueOf(downloadId)), androidx.work.ExistingWorkPolicy.KEEP, build);
        return build.getId();
    }
}
