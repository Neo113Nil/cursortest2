package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0018\u0010\u0016J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u0016J,\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!"}, d2 = {"Lcom/paypal/oslo/downloads/worker/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;", "downloadDao", "Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;", "downloadEngine", "Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;", "notificationManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "p2", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;", "Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadWorker extends androidx.work.CoroutineWorker {
    public static final java.lang.String KEY_DOWNLOAD_ID = "download_id";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.data.dao.DownloadDao getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.downloads.impl.engine.DownloadEngine getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DownloadWorker(@dagger.assisted.Assisted android.content.Context context, @dagger.assisted.Assisted androidx.work.WorkerParameters workerParameters, com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, com.paypal.oslo.downloads.impl.engine.DownloadEngine downloadEngine, com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDao, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerNotificationManager, "");
        this.getHighSpeedVideoFpsRangesFor = downloadDao;
        this.getHighSpeedVideoFpsRanges = downloadEngine;
        this.getHighSpeedVideoSizes = workerNotificationManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleError(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1 downloadWorker$handleError$1;
        int i;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        int i2;
        boolean z2;
        java.lang.String str4 = str;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity2 = downloadEntity;
        com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error2 = error;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1) {
            downloadWorker$handleError$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1) continuation;
            if ((downloadWorker$handleError$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                downloadWorker$handleError$1.getInputFormats -= 2147483648;
                com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1 downloadWorker$handleError$12 = downloadWorker$handleError$1;
                java.lang.Object obj = downloadWorker$handleError$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadWorker$handleError$12.getInputFormats;
                if (i == 0) {
                    if (i == 1) {
                        z2 = downloadWorker$handleError$12.getHighSpeedVideoFpsRanges;
                        i2 = downloadWorker$handleError$12.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error3 = (com.paypal.oslo.downloads.impl.engine.DownloadResult.Error) downloadWorker$handleError$12.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity3 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$handleError$12.getHighSpeedVideoSizes;
                        java.lang.String str5 = (java.lang.String) downloadWorker$handleError$12.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        error2 = error3;
                        downloadEntity2 = downloadEntity3;
                        str4 = str5;
                        str3 = "Download";
                        if (z2) {
                            com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager = downloadWorker.getHighSpeedVideoSizes;
                            java.lang.String fileName = downloadEntity2.getFileName();
                            workerNotificationManager.showRetryPrompt(str4, fileName == null ? str3 : fileName, error2.getError().getMessage(), i2);
                        }
                        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(success);
                        return success;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = downloadWorker$handleError$12.getHighSpeedVideoFpsRanges;
                    int i3 = downloadWorker$handleError$12.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error4 = (com.paypal.oslo.downloads.impl.engine.DownloadResult.Error) downloadWorker$handleError$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity4 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$handleError$12.getHighSpeedVideoSizes;
                    java.lang.String str6 = (java.lang.String) downloadWorker$handleError$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    error2 = error4;
                    downloadEntity2 = downloadEntity4;
                    str4 = str6;
                    str2 = "Download";
                    if (z) {
                        com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager2 = downloadWorker.getHighSpeedVideoSizes;
                        java.lang.String fileName2 = downloadEntity2.getFileName();
                        workerNotificationManager2.showFailed(str4, fileName2 == null ? str2 : fileName2, error2.getError().getMessage());
                    }
                    androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(failure);
                    return failure;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                int retryCount = 3 - downloadEntity.getRetryCount();
                boolean shouldShowNotification = com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldShowNotification(downloadEntity.getConfigJson(), downloadEntity.getTotalBytes());
                if (retryCount > 0) {
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao = downloadWorker.getHighSpeedVideoFpsRangesFor;
                    java.lang.String errorType = com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.getErrorType(error.getError());
                    java.lang.String message = error.getError().getMessage();
                    downloadWorker$handleError$12.Camera2StreamConfigurationMap = str4;
                    downloadWorker$handleError$12.getHighSpeedVideoSizes = downloadEntity2;
                    downloadWorker$handleError$12.getHighResolutionOutputSizeshNQ4ISI = error2;
                    downloadWorker$handleError$12.getHighSpeedVideoFpsRangesFor = retryCount;
                    downloadWorker$handleError$12.getHighSpeedVideoFpsRanges = shouldShowNotification;
                    downloadWorker$handleError$12.getInputFormats = 1;
                    str3 = "Download";
                    if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateStateWithError$default(downloadDao, str, com.paypal.oslo.downloads.impl.DownloadStateValue.WAITING_FOR_RETRY, errorType, message, 0L, downloadWorker$handleError$12, 16, null) != coroutine_suspended) {
                        i2 = retryCount;
                        z2 = shouldShowNotification;
                        if (z2) {
                        }
                        androidx.work.ListenableWorker.Result success2 = androidx.work.ListenableWorker.Result.success();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(success2);
                        return success2;
                    }
                } else {
                    str2 = "Download";
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2 = downloadWorker.getHighSpeedVideoFpsRangesFor;
                    java.lang.String errorType2 = com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.getErrorType(error.getError());
                    java.lang.String message2 = error.getError().getMessage();
                    downloadWorker$handleError$12.Camera2StreamConfigurationMap = str4;
                    downloadWorker$handleError$12.getHighSpeedVideoSizes = downloadEntity2;
                    downloadWorker$handleError$12.getHighResolutionOutputSizeshNQ4ISI = error2;
                    downloadWorker$handleError$12.getHighSpeedVideoFpsRangesFor = retryCount;
                    downloadWorker$handleError$12.getHighSpeedVideoFpsRanges = shouldShowNotification;
                    downloadWorker$handleError$12.getInputFormats = 2;
                    if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.markFailed$default(downloadDao2, str, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, errorType2, message2, 0L, downloadWorker$handleError$12, 16, null) != coroutine_suspended) {
                        z = shouldShowNotification;
                        if (z) {
                        }
                        androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(failure2);
                        return failure2;
                    }
                }
                return coroutine_suspended;
            }
        }
        downloadWorker$handleError$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1(downloadWorker, continuation);
        com.paypal.oslo.downloads.worker.DownloadWorker$handleError$1 downloadWorker$handleError$122 = downloadWorker$handleError$1;
        java.lang.Object obj2 = downloadWorker$handleError$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadWorker$handleError$122.getInputFormats;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleProgress(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress progress, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1 downloadWorker$handleProgress$1;
        int i;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity2;
        com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress progress2;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1) {
            downloadWorker$handleProgress$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1) continuation;
            if ((downloadWorker$handleProgress$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                downloadWorker$handleProgress$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1 downloadWorker$handleProgress$12 = downloadWorker$handleProgress$1;
                java.lang.Object obj = downloadWorker$handleProgress$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadWorker$handleProgress$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Download progress", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", str2), kotlin.TuplesKt.to("downloadedBytes", java.lang.String.valueOf(progress.getProgress().getDownloadedBytes())), kotlin.TuplesKt.to("totalBytes", java.lang.String.valueOf(progress.getProgress().getTotalBytes())), kotlin.TuplesKt.to("percentage", java.lang.String.valueOf(progress.getProgress().getPercentage()))), null, 4, null);
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao = downloadWorker.getHighSpeedVideoFpsRangesFor;
                    long downloadedBytes = progress.getProgress().getDownloadedBytes();
                    long totalBytes = progress.getProgress().getTotalBytes();
                    downloadWorker$handleProgress$12.getHighSpeedVideoFpsRanges = str2;
                    downloadEntity2 = downloadEntity;
                    downloadWorker$handleProgress$12.getHighSpeedVideoSizes = downloadEntity2;
                    progress2 = progress;
                    downloadWorker$handleProgress$12.getHighResolutionOutputSizeshNQ4ISI = progress2;
                    downloadWorker$handleProgress$12.Camera2StreamConfigurationMap = 1;
                    if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateProgress$default(downloadDao, str, downloadedBytes, totalBytes, 0L, downloadWorker$handleProgress$12, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress progress3 = (com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress) downloadWorker$handleProgress$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity3 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$handleProgress$12.getHighSpeedVideoSizes;
                    java.lang.String str3 = (java.lang.String) downloadWorker$handleProgress$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    progress2 = progress3;
                    downloadEntity2 = downloadEntity3;
                    str2 = str3;
                }
                if (com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldShowNotification(downloadEntity2.getConfigJson(), progress2.getProgress().getTotalBytes())) {
                    com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager = downloadWorker.getHighSpeedVideoSizes;
                    java.lang.String fileName = downloadEntity2.getFileName();
                    if (fileName == null) {
                        fileName = "Download";
                    }
                    workerNotificationManager.updateProgress(str2, fileName, progress2.getProgress());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        downloadWorker$handleProgress$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1(downloadWorker, continuation);
        com.paypal.oslo.downloads.worker.DownloadWorker$handleProgress$1 downloadWorker$handleProgress$122 = downloadWorker$handleProgress$1;
        java.lang.Object obj2 = downloadWorker$handleProgress$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadWorker$handleProgress$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldShowNotification(downloadEntity2.getConfigJson(), progress2.getProgress().getTotalBytes())) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleSuccess(com.paypal.oslo.downloads.worker.DownloadWorker downloadWorker, java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, com.paypal.oslo.downloads.impl.engine.DownloadResult.Success success, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$handleSuccess$1 downloadWorker$handleSuccess$1;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity2;
        com.paypal.oslo.downloads.impl.engine.DownloadResult.Success success2;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$handleSuccess$1) {
            downloadWorker$handleSuccess$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$handleSuccess$1) continuation;
            if ((downloadWorker$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                downloadWorker$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = downloadWorker$handleSuccess$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadWorker$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.io.File file = new java.io.File(success.getFilePath());
                    android.content.Context applicationContext = downloadWorker.getApplicationContext();
                    java.lang.String packageName = downloadWorker.getApplicationContext().getPackageName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(packageName);
                    sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.FILE_PROVIDER_AUTHORITY_SUFFIX);
                    java.lang.String obj2 = androidx.core.content.FileProvider.getUriForFile(applicationContext, sb.toString(), file).toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao = downloadWorker.getHighSpeedVideoFpsRangesFor;
                    java.lang.String filePath = success.getFilePath();
                    java.lang.String mimeType = success.getMimeType();
                    long fileSize = success.getFileSize();
                    long fileSize2 = success.getFileSize();
                    downloadWorker$handleSuccess$1.Camera2StreamConfigurationMap = str;
                    downloadWorker$handleSuccess$1.getHighSpeedVideoSizes = downloadEntity;
                    downloadWorker$handleSuccess$1.getHighSpeedVideoFpsRanges = success;
                    downloadWorker$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    downloadWorker$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    str2 = "";
                    if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.markCompleted$default(downloadDao, str, "COMPLETED", filePath, obj2, mimeType, fileSize, fileSize2, 0L, 0L, downloadWorker$handleSuccess$1, 384, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    downloadEntity2 = downloadEntity;
                    success2 = success;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    success2 = (com.paypal.oslo.downloads.impl.engine.DownloadResult.Success) downloadWorker$handleSuccess$1.getHighSpeedVideoFpsRanges;
                    downloadEntity2 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$handleSuccess$1.getHighSpeedVideoSizes;
                    str3 = (java.lang.String) downloadWorker$handleSuccess$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = "";
                }
                if (com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldShowNotification(downloadEntity2.getConfigJson(), success2.getFileSize())) {
                    com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager = downloadWorker.getHighSpeedVideoSizes;
                    java.lang.String fileName = downloadEntity2.getFileName();
                    if (fileName == null) {
                        fileName = "Download";
                    }
                    workerNotificationManager.showCompleted(str3, fileName, success2.getFilePath(), success2.getMimeType());
                }
                androidx.work.ListenableWorker.Result success3 = androidx.work.ListenableWorker.Result.success();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success3, str2);
                return success3;
            }
        }
        downloadWorker$handleSuccess$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$handleSuccess$1(downloadWorker, continuation);
        java.lang.Object obj3 = downloadWorker$handleSuccess$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadWorker$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        if (com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldShowNotification(downloadEntity2.getConfigJson(), success2.getFileSize())) {
        }
        androidx.work.ListenableWorker.Result success32 = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success32, str2);
        return success32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$doWork$1 downloadWorker$doWork$1;
        int i;
        java.lang.String string;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$doWork$1) {
            downloadWorker$doWork$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$doWork$1) continuation;
            if ((downloadWorker$doWork$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                downloadWorker$doWork$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = downloadWorker$doWork$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    string = getInputData().getString("download_id");
                    if (string == null) {
                        downloadEntity = null;
                        if (string != null || downloadEntity == null) {
                            androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
                            return failure;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(downloadEntity.getState(), com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED)) {
                            androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
                            return success;
                        }
                        downloadWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(string);
                        downloadWorker$doWork$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                        downloadWorker$doWork$1.getHighSpeedVideoFpsRangesFor = 2;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(string, downloadEntity, downloadWorker$doWork$1);
                        return highSpeedVideoFpsRanges == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRanges;
                    }
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao = this.getHighSpeedVideoFpsRangesFor;
                    downloadWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI = string;
                    downloadWorker$doWork$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(string);
                    downloadWorker$doWork$1.getHighSpeedVideoSizes = 0;
                    downloadWorker$doWork$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = downloadDao.getById(string, downloadWorker$doWork$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    int i2 = downloadWorker$doWork$1.getHighSpeedVideoSizes;
                    string = (java.lang.String) downloadWorker$doWork$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) obj;
                if (string != null) {
                }
                androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure2, "");
                return failure2;
            }
        }
        downloadWorker$doWork$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = downloadWorker$doWork$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) obj2;
        if (string != null) {
        }
        androidx.work.ListenableWorker.Result failure22 = androidx.work.ListenableWorker.Result.failure();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure22, "");
        return failure22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|56|6|7|8|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r15 != r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateState$default(r1, r13, com.paypal.oslo.downloads.impl.DownloadStateValue.DOWNLOADING, null, 0, r0, 12, null) == r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017d, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Download failed due to IO error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", r13)), null, r15, 4, null);
        r0.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13);
        r0.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14);
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15);
        r0.getHighSpeedVideoSizes = 4;
        r15 = getHighSpeedVideoFpsRangesFor(r13, r14, r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ae, code lost:
    
        if (r15 != r10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b4, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b5, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Download failed due to illegal state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", r13)), null, r15, 4, null);
        r0.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13);
        r0.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14);
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15);
        r0.getHighSpeedVideoSizes = 6;
        r15 = getHighSpeedVideoFpsRangesFor(r13, r14, r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        if (r15 == r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Download failed due to security error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", r13)), null, r15, 4, null);
        r0.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13);
        r0.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14);
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15);
        r0.getHighSpeedVideoSizes = 5;
        r15 = getHighSpeedVideoFpsRangesFor(r13, r14, r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0178, code lost:
    
        if (r15 == r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Download failed due to unexpected error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", r13)), null, r15, 4, null);
        r0.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13);
        r0.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14);
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15);
        r0.getHighSpeedVideoSizes = 7;
        r15 = getHighSpeedVideoFpsRangesFor(r13, r14, r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        if (r15 == r10) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$executeDownload$1 downloadWorker$executeDownload$1;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$executeDownload$1) {
            downloadWorker$executeDownload$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$executeDownload$1) continuation;
            if ((downloadWorker$executeDownload$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                downloadWorker$executeDownload$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = downloadWorker$executeDownload$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (downloadWorker$executeDownload$1.getHighSpeedVideoSizes) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor = str;
                        downloadWorker$executeDownload$1.Camera2StreamConfigurationMap = downloadEntity;
                        downloadWorker$executeDownload$1.getHighSpeedVideoSizes = 1;
                        if (Camera2StreamConfigurationMap(str, downloadEntity, downloadWorker$executeDownload$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao = this.getHighSpeedVideoFpsRangesFor;
                        downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor = str;
                        downloadWorker$executeDownload$1.Camera2StreamConfigurationMap = downloadEntity;
                        downloadWorker$executeDownload$1.getHighSpeedVideoSizes = 2;
                        break;
                    case 1:
                        downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$executeDownload$1.Camera2StreamConfigurationMap;
                        str = (java.lang.String) downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2 = this.getHighSpeedVideoFpsRangesFor;
                        downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor = str;
                        downloadWorker$executeDownload$1.Camera2StreamConfigurationMap = downloadEntity;
                        downloadWorker$executeDownload$1.getHighSpeedVideoSizes = 2;
                        break;
                    case 2:
                        downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$executeDownload$1.Camera2StreamConfigurationMap;
                        str = (java.lang.String) downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor = str;
                        downloadWorker$executeDownload$1.Camera2StreamConfigurationMap = downloadEntity;
                        downloadWorker$executeDownload$1.getHighSpeedVideoSizes = 3;
                        obj = getHighResolutionOutputSizeshNQ4ISI(str, downloadEntity, downloadWorker$executeDownload$1);
                        break;
                    case 3:
                        downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$executeDownload$1.Camera2StreamConfigurationMap;
                        str = (java.lang.String) downloadWorker$executeDownload$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (androidx.work.ListenableWorker.Result) obj;
                    case 4:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (androidx.work.ListenableWorker.Result) obj;
                    case 5:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (androidx.work.ListenableWorker.Result) obj;
                    case 6:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (androidx.work.ListenableWorker.Result) obj;
                    case 7:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (androidx.work.ListenableWorker.Result) obj;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        downloadWorker$executeDownload$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$executeDownload$1(this, continuation);
        java.lang.Object obj2 = downloadWorker$executeDownload$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (downloadWorker$executeDownload$1.getHighSpeedVideoSizes) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldUseForegroundService(downloadEntity.getTotalBytes())) {
            java.lang.String fileName = downloadEntity.getFileName();
            if (fileName == null) {
                fileName = "Download";
            }
            java.lang.Object foreground = setForeground(com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.createForegroundInfo(str, this.getHighSpeedVideoSizes.createProgressNotification(str, fileName)), continuation);
            return foreground == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? foreground : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.work.ListenableWorker$Result, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$1 downloadWorker$processDownload$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$1) {
            downloadWorker$processDownload$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$1) continuation;
            if ((downloadWorker$processDownload$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                downloadWorker$processDownload$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = downloadWorker$processDownload$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadWorker$processDownload$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    ?? failure = androidx.work.ListenableWorker.Result.failure();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
                    objectRef2.element = failure;
                    kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoFpsRanges.execute(downloadEntity, downloadEntity.getDownloadedBytes()), new com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$2(this, str, downloadEntity, objectRef2, null));
                    downloadWorker$processDownload$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    downloadWorker$processDownload$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                    downloadWorker$processDownload$1.getHighSpeedVideoFpsRanges = objectRef2;
                    downloadWorker$processDownload$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.flow.FlowKt.collect(onEach, downloadWorker$processDownload$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) downloadWorker$processDownload$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        downloadWorker$processDownload$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$processDownload$1(this, continuation);
        java.lang.Object obj2 = downloadWorker$processDownload$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadWorker$processDownload$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, java.lang.Exception exc, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1 downloadWorker$handleDownloadException$1;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        java.lang.String str4;
        java.lang.String str5;
        int i2;
        boolean z2;
        java.lang.String str6 = str;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity2 = downloadEntity;
        if (continuation instanceof com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1) {
            downloadWorker$handleDownloadException$1 = (com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1) continuation;
            if ((downloadWorker$handleDownloadException$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                downloadWorker$handleDownloadException$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1 downloadWorker$handleDownloadException$12 = downloadWorker$handleDownloadException$1;
                java.lang.Object obj = downloadWorker$handleDownloadException$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadWorker$handleDownloadException$12.getInputSizeshNQ4ISI;
                if (i == 0) {
                    if (i == 1) {
                        z2 = downloadWorker$handleDownloadException$12.getOutputFormats;
                        i2 = downloadWorker$handleDownloadException$12.Camera2StreamConfigurationMap;
                        str5 = (java.lang.String) downloadWorker$handleDownloadException$12.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity3 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$handleDownloadException$12.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String str7 = (java.lang.String) downloadWorker$handleDownloadException$12.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadEntity2 = downloadEntity3;
                        str6 = str7;
                        str4 = "Download";
                        if (z2) {
                            com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager = this.getHighSpeedVideoSizes;
                            java.lang.String fileName = downloadEntity2.getFileName();
                            workerNotificationManager.showRetryPrompt(str6, fileName != null ? fileName : str4, str5, i2);
                        }
                        androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(success);
                        return success;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = downloadWorker$handleDownloadException$12.getOutputFormats;
                    int i3 = downloadWorker$handleDownloadException$12.Camera2StreamConfigurationMap;
                    str3 = (java.lang.String) downloadWorker$handleDownloadException$12.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity4 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadWorker$handleDownloadException$12.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str8 = (java.lang.String) downloadWorker$handleDownloadException$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    downloadEntity2 = downloadEntity4;
                    str6 = str8;
                    str2 = "Download";
                    if (z) {
                        com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager2 = this.getHighSpeedVideoSizes;
                        java.lang.String fileName2 = downloadEntity2.getFileName();
                        workerNotificationManager2.showFailed(str6, fileName2 != null ? fileName2 : str2, str3);
                    }
                    androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(failure);
                    return failure;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                int retryCount = 3 - downloadEntity.getRetryCount();
                java.lang.String message = exc.getMessage();
                if (message == null) {
                    message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                }
                java.lang.String str9 = message;
                boolean shouldShowNotification = com.paypal.oslo.downloads.worker.WorkerHelper.INSTANCE.shouldShowNotification(downloadEntity.getConfigJson(), downloadEntity.getTotalBytes());
                if (retryCount > 0) {
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao = this.getHighSpeedVideoFpsRangesFor;
                    downloadWorker$handleDownloadException$12.getHighSpeedVideoSizes = str6;
                    downloadWorker$handleDownloadException$12.getHighResolutionOutputSizeshNQ4ISI = downloadEntity2;
                    downloadWorker$handleDownloadException$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exc);
                    downloadWorker$handleDownloadException$12.getHighSpeedVideoFpsRangesFor = str9;
                    downloadWorker$handleDownloadException$12.Camera2StreamConfigurationMap = retryCount;
                    downloadWorker$handleDownloadException$12.getOutputFormats = shouldShowNotification;
                    downloadWorker$handleDownloadException$12.getInputSizeshNQ4ISI = 1;
                    str4 = "Download";
                    if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateStateWithError$default(downloadDao, str, com.paypal.oslo.downloads.impl.DownloadStateValue.WAITING_FOR_RETRY, "UNKNOWN", str9, 0L, downloadWorker$handleDownloadException$12, 16, null) != coroutine_suspended) {
                        str5 = str9;
                        i2 = retryCount;
                        z2 = shouldShowNotification;
                        if (z2) {
                        }
                        androidx.work.ListenableWorker.Result success2 = androidx.work.ListenableWorker.Result.success();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(success2);
                        return success2;
                    }
                } else {
                    str2 = "Download";
                    com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2 = this.getHighSpeedVideoFpsRangesFor;
                    downloadWorker$handleDownloadException$12.getHighSpeedVideoSizes = str6;
                    downloadWorker$handleDownloadException$12.getHighResolutionOutputSizeshNQ4ISI = downloadEntity2;
                    downloadWorker$handleDownloadException$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exc);
                    downloadWorker$handleDownloadException$12.getHighSpeedVideoFpsRangesFor = str9;
                    downloadWorker$handleDownloadException$12.Camera2StreamConfigurationMap = retryCount;
                    downloadWorker$handleDownloadException$12.getOutputFormats = shouldShowNotification;
                    downloadWorker$handleDownloadException$12.getInputSizeshNQ4ISI = 2;
                    if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.markFailed$default(downloadDao2, str, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "UNKNOWN", str9, 0L, downloadWorker$handleDownloadException$12, 16, null) != coroutine_suspended) {
                        str3 = str9;
                        z = shouldShowNotification;
                        if (z) {
                        }
                        androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(failure2);
                        return failure2;
                    }
                }
                return coroutine_suspended;
            }
        }
        downloadWorker$handleDownloadException$1 = new com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1(this, continuation);
        com.paypal.oslo.downloads.worker.DownloadWorker$handleDownloadException$1 downloadWorker$handleDownloadException$122 = downloadWorker$handleDownloadException$1;
        java.lang.Object obj2 = downloadWorker$handleDownloadException$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadWorker$handleDownloadException$122.getInputSizeshNQ4ISI;
        if (i == 0) {
        }
    }
}
