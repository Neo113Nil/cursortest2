package com.paypal.oslo.downloads.worker.notification;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager;", "", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/downloads/impl/notification/NotificationBuilder;", "notificationBuilder", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/downloads/impl/notification/NotificationBuilder;)V", "", "downloadId", "fileName", "Landroid/app/Notification;", "createProgressNotification", "(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "progress", "", "updateProgress", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/DownloadProgress;)V", "filePath", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "showCompleted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "errorMessage", "showFailed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "showPaused", "(Ljava/lang/String;Ljava/lang/String;I)V", "retriesRemaining", "showRetryPrompt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "cancelNotification", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/downloads/impl/notification/NotificationBuilder;", "Landroid/app/NotificationManager;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/app/NotificationManager;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkerNotificationManager {
    private static final com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager.Companion Companion = new com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager.Companion(null);

    @java.lang.Deprecated
    public static final int NOTIFICATION_COMPLETED_OFFSET = 1;

    @java.lang.Deprecated
    public static final int NOTIFICATION_FAILED_OFFSET = 2;

    @java.lang.Deprecated
    public static final int NOTIFICATION_PAUSED_OFFSET = 3;

    @java.lang.Deprecated
    public static final int NOTIFICATION_RETRY_PROMPT_OFFSET = 4;
    private final android.app.NotificationManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.notification.NotificationBuilder getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public WorkerNotificationManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationBuilder, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = notificationBuilder;
        java.lang.Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        this.getHighResolutionOutputSizeshNQ4ISI = notificationManager;
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.CHANNEL_ID_PROGRESS, context.getString(com.paypal.oslo.downloads.R.string.core_downloads_channel_progress_name), 2);
        notificationChannel.setDescription(context.getString(com.paypal.oslo.downloads.R.string.core_downloads_channel_progress_desc));
        notificationChannel.setShowBadge(false);
        android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.CHANNEL_ID_COMPLETE, context.getString(com.paypal.oslo.downloads.R.string.core_downloads_channel_complete_name), 3);
        notificationChannel2.setDescription(context.getString(com.paypal.oslo.downloads.R.string.core_downloads_channel_complete_desc));
        notificationManager.createNotificationChannels(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.app.NotificationChannel[]{notificationChannel, notificationChannel2}));
    }

    public final android.app.Notification createProgressNotification(java.lang.String downloadId, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        return this.getHighSpeedVideoSizes.m11755buildProgressNotificationtOiKUBg(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(downloadId), fileName, 0, 0L, -1L);
    }

    public final void updateProgress(java.lang.String downloadId, java.lang.String fileName, com.paypal.oslo.downloads.api.model.DownloadProgress progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "");
        this.getHighResolutionOutputSizeshNQ4ISI.notify(downloadId.hashCode(), this.getHighSpeedVideoSizes.m11755buildProgressNotificationtOiKUBg(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(downloadId), fileName, kotlin.ranges.RangesKt.coerceAtLeast(progress.getPercentage(), 0), progress.getDownloadedBytes(), progress.getTotalBytes()));
    }

    public static /* synthetic */ void showCompleted$default(com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        workerNotificationManager.showCompleted(str, str2, str3, str4);
    }

    public final void showCompleted(java.lang.String downloadId, java.lang.String fileName, java.lang.String filePath, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode());
        this.getHighResolutionOutputSizeshNQ4ISI.notify(downloadId.hashCode() + 1, this.getHighSpeedVideoSizes.m11752buildCompletionNotification6HENkBo(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(downloadId), fileName, filePath, mimeType));
    }

    public final void showFailed(java.lang.String downloadId, java.lang.String fileName, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode());
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode() + 4);
        this.getHighResolutionOutputSizeshNQ4ISI.notify(downloadId.hashCode() + 2, this.getHighSpeedVideoSizes.m11753buildFailureNotificationDfu5jCY(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(downloadId), fileName, errorMessage));
    }

    public final void showPaused(java.lang.String downloadId, java.lang.String fileName, int progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode());
        this.getHighResolutionOutputSizeshNQ4ISI.notify(downloadId.hashCode() + 3, this.getHighSpeedVideoSizes.m11754buildPausedNotificationDfu5jCY(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(downloadId), fileName, progress));
    }

    public final void showRetryPrompt(java.lang.String downloadId, java.lang.String fileName, java.lang.String errorMessage, int retriesRemaining) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode());
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode() + 4);
        this.getHighResolutionOutputSizeshNQ4ISI.notify(downloadId.hashCode() + 4, this.getHighSpeedVideoSizes.m11756buildRetryPromptNotification6HENkBo(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(downloadId), fileName, errorMessage, retriesRemaining));
    }

    public final void cancelNotification(java.lang.String downloadId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode());
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode() + 1);
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode() + 2);
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode() + 3);
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(downloadId.hashCode() + 4);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/worker/notification/WorkerNotificationManager$Companion;", "", "<init>", "()V", "", "NOTIFICATION_COMPLETED_OFFSET", com.visa.cbp.getEncExpo.warmup, "NOTIFICATION_FAILED_OFFSET", "NOTIFICATION_PAUSED_OFFSET", "NOTIFICATION_RETRY_PROMPT_OFFSET"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
