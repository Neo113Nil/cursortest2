package com.paypal.oslo.downloads.impl.notification;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/downloads/impl/notification/DownloadActionHandler;", "", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;", "notificationManager", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "dispatchers", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;)V", "Landroid/content/Intent;", "intent", "Lkotlin/Function0;", "Landroid/content/BroadcastReceiver$PendingResult;", "pendingResultProvider", "", "handleIntent", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function0;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DownloadActionHandler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.di.DownloadDispatchers getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.DownloadManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DownloadActionHandler(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerNotificationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDispatchers, "");
        this.getHighSpeedVideoFpsRanges = downloadManager;
        this.Camera2StreamConfigurationMap = workerNotificationManager;
        this.getHighSpeedVideoSizes = downloadDispatchers;
    }

    public final boolean handleIntent(android.content.Intent intent, kotlin.jvm.functions.Function0<? extends android.content.BroadcastReceiver.PendingResult> pendingResultProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingResultProvider, "");
        java.lang.String stringExtra = intent.getStringExtra("download_id");
        if (stringExtra == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "DownloadActionHandler received intent without download ID", null, null, 6, null);
            return false;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.downloads.LoggerKt.log, "DownloadActionHandler received action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", intent.getAction()), kotlin.TuplesKt.to("downloadId", stringExtra)), null, 4, null);
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1468652010) {
                if (hashCode != -1035354167) {
                    if (hashCode == -310492308 && action.equals(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.ACTION_RETRY)) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.getHighSpeedVideoSizes.getDispatcher())), null, null, new com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleRetry$1(this, stringExtra, pendingResultProvider.invoke(), null), 3, null);
                        return true;
                    }
                } else if (action.equals(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.ACTION_RESUME)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.getHighSpeedVideoSizes.getDispatcher())), null, null, new com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleResume$1(this, stringExtra, pendingResultProvider.invoke(), null), 3, null);
                    return true;
                }
            } else if (action.equals(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.ACTION_CANCEL)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.getHighSpeedVideoSizes.getDispatcher())), null, null, new com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleCancel$1(this, stringExtra, pendingResultProvider.invoke(), null), 3, null);
                return true;
            }
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Unknown action received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", intent.getAction())), null, 4, null);
        return false;
    }
}
