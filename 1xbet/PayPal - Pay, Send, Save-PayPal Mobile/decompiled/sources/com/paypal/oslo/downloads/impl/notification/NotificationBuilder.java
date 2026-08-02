package com.paypal.oslo.downloads.impl.notification;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0015\u0010,\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u00101R\u0015\u0010%\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u00101R\u0015\u0010)\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u00101R\u0015\u00102\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b2\u00101R\u0015\u00103\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b0\u00101R\u0015\u00105\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b4\u00101R\u0015\u00106\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b5\u00101R\u0015\u00104\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00101"}, d2 = {"Lcom/paypal/oslo/downloads/impl/notification/NotificationBuilder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/downloads/api/model/DownloadId;", "downloadId", "", "title", "", "progress", "", "downloadedBytes", "totalBytes", "Landroid/app/Notification;", "buildProgressNotification-tOiKUBg", "(Ljava/lang/String;Ljava/lang/String;IJJ)Landroid/app/Notification;", "buildProgressNotification", "filePath", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "buildCompletionNotification-6HENkBo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;", "buildCompletionNotification", "errorMessage", "buildFailureNotification-Dfu5jCY", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Notification;", "buildFailureNotification", "buildPausedNotification-Dfu5jCY", "(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;", "buildPausedNotification", "retriesRemaining", "buildRetryPromptNotification-6HENkBo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;", "buildRetryPromptNotification", "p0", "Landroidx/core/app/NotificationCompat$Action;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Action;", "p1", "Landroid/app/PendingIntent;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "Landroid/net/Uri;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Landroid/net/Uri;", "getInputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "getOutputFormats", "getOutputMinFrameDuration", "getInputFormats", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationBuilder {
    public static final java.lang.String ACTION_CANCEL = "com.paypal.oslo.downloads.CANCEL";
    public static final java.lang.String ACTION_RESUME = "com.paypal.oslo.downloads.RESUME";
    public static final java.lang.String ACTION_RETRY = "com.paypal.oslo.downloads.RETRY";
    public static final java.lang.String CHANNEL_ID_COMPLETE = "oslo_download_complete";
    public static final java.lang.String CHANNEL_ID_PROGRESS = "oslo_download_progress";
    public static final java.lang.String EXTRA_DOWNLOAD_ID = "download_id";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy getInputFormats;

    @javax.inject.Inject
    public NotificationBuilder(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.m11750$r8$lambda$e0Yaq6yf0BrR19Yo4l7FFds0dY(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.$r8$lambda$7PpXQelmdhc7d_M06K9yg941uV0(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.m11748$r8$lambda$NOFLtG0u1DgQ2ZclD1FQxFInY(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.m11749$r8$lambda$QqiMZeKL6kj6e9_vxKzm1vcDz8(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.$r8$lambda$JNgcYwkGmg7NO7KtsAPoXdZQNG0(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getOutputMinFrameDuration = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.$r8$lambda$1ERrBj9XiU43CXpOpKUOK4nAndQ(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getInputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.$r8$lambda$YtBVshzVV1ZO0jIzU7DIMhy6eXc(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
        this.getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.notification.NotificationBuilder$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.downloads.impl.notification.NotificationBuilder.m11751$r8$lambda$fvDO2h1KqB1LqGR7EqCk69TDac(com.paypal.oslo.downloads.impl.notification.NotificationBuilder.this);
            }
        });
    }

    /* renamed from: buildCompletionNotification-6HENkBo, reason: not valid java name */
    public final android.app.Notification m11752buildCompletionNotification6HENkBo(java.lang.String downloadId, java.lang.String title, java.lang.String filePath, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
        androidx.core.app.NotificationCompat.Builder contentIntent = new androidx.core.app.NotificationCompat.Builder(this.getHighSpeedVideoSizes, CHANNEL_ID_COMPLETE).setContentTitle(title).setContentText((java.lang.String) this.getOutputMinFrameDuration.getValue()).setSmallIcon(android.R.drawable.stat_sys_download_done).setAutoCancel(true).setContentIntent(getHighSpeedVideoFpsRangesFor(filePath, mimeType));
        androidx.core.app.NotificationCompat.Action build = new androidx.core.app.NotificationCompat.Action.Builder(android.R.drawable.ic_menu_view, (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue(), getHighSpeedVideoFpsRangesFor(filePath, mimeType)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        androidx.core.app.NotificationCompat.Builder addAction = contentIntent.addAction(build);
        android.net.Uri Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(filePath);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        if (mimeType == null) {
            mimeType = com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
        }
        intent.setType(mimeType);
        intent.putExtra("android.intent.extra.STREAM", Camera2StreamConfigurationMap);
        intent.addFlags(268435457);
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, (java.lang.String) this.getHighSpeedVideoSizesFor.getValue());
        createChooser.addFlags(268435456);
        androidx.core.app.NotificationCompat.Action build2 = new androidx.core.app.NotificationCompat.Action.Builder(android.R.drawable.ic_menu_share, (java.lang.String) this.getHighSpeedVideoSizesFor.getValue(), android.app.PendingIntent.getActivity(this.getHighSpeedVideoSizes, filePath.hashCode() + 1, createChooser, 201326592)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        android.app.Notification build3 = addAction.addAction(build2).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "");
        return build3;
    }

    /* renamed from: buildFailureNotification-Dfu5jCY, reason: not valid java name */
    public final android.app.Notification m11753buildFailureNotificationDfu5jCY(java.lang.String downloadId, java.lang.String title, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        androidx.core.app.NotificationCompat.Builder contentTitle = new androidx.core.app.NotificationCompat.Builder(this.getHighSpeedVideoSizes, CHANNEL_ID_COMPLETE).setContentTitle(title);
        java.lang.String str = (java.lang.String) this.getInputFormats.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(errorMessage);
        android.app.Notification build = contentTitle.setContentText(sb.toString()).setSmallIcon(android.R.drawable.stat_notify_error).setAutoCancel(true).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    /* renamed from: buildPausedNotification-Dfu5jCY, reason: not valid java name */
    public final android.app.Notification m11754buildPausedNotificationDfu5jCY(java.lang.String downloadId, java.lang.String title, int progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        androidx.core.app.NotificationCompat.Builder ongoing = new androidx.core.app.NotificationCompat.Builder(this.getHighSpeedVideoSizes, CHANNEL_ID_PROGRESS).setContentTitle(title).setContentText((java.lang.String) this.getOutputFormats.getValue()).setSmallIcon(android.R.drawable.ic_media_pause).setProgress(100, progress, false).setOngoing(false);
        android.content.Intent intent = new android.content.Intent(ACTION_RESUME);
        intent.setPackage(this.getHighSpeedVideoSizes.getPackageName());
        intent.putExtra("download_id", downloadId);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this.getHighSpeedVideoSizes, downloadId.hashCode() + 2, intent, 201326592);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(broadcast, "");
        androidx.core.app.NotificationCompat.Action build = new androidx.core.app.NotificationCompat.Action.Builder(android.R.drawable.ic_media_play, (java.lang.String) this.getHighSpeedVideoFpsRangesFor.getValue(), broadcast).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        android.app.Notification build2 = ongoing.addAction(build).addAction(getHighResolutionOutputSizeshNQ4ISI(downloadId)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    /* renamed from: buildRetryPromptNotification-6HENkBo, reason: not valid java name */
    public final android.app.Notification m11756buildRetryPromptNotification6HENkBo(java.lang.String downloadId, java.lang.String title, java.lang.String errorMessage, int retriesRemaining) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        java.lang.String str = retriesRemaining == 1 ? "retry" : "retries";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(errorMessage);
        sb.append(" (");
        sb.append(retriesRemaining);
        sb.append(" ");
        sb.append(str);
        sb.append(" left)");
        androidx.core.app.NotificationCompat.Builder ongoing = new androidx.core.app.NotificationCompat.Builder(this.getHighSpeedVideoSizes, CHANNEL_ID_COMPLETE).setContentTitle(title).setContentText(sb.toString()).setSmallIcon(android.R.drawable.stat_notify_error).setAutoCancel(false).setOngoing(true);
        android.content.Intent intent = new android.content.Intent(ACTION_RETRY);
        intent.setPackage(this.getHighSpeedVideoSizes.getPackageName());
        intent.putExtra("download_id", downloadId);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this.getHighSpeedVideoSizes, downloadId.hashCode() + 1, intent, 201326592);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(broadcast, "");
        androidx.core.app.NotificationCompat.Action build = new androidx.core.app.NotificationCompat.Action.Builder(android.R.drawable.ic_menu_rotate, (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue(), broadcast).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        android.app.Notification build2 = ongoing.addAction(build).addAction(getHighResolutionOutputSizeshNQ4ISI(downloadId)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
        return build2;
    }

    private final android.app.PendingIntent getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1) {
        android.net.Uri Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(p0);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        if (p1 == null) {
            p1 = com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
        }
        intent.setDataAndType(Camera2StreamConfigurationMap, p1);
        intent.addFlags(268435457);
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue());
        createChooser.addFlags(268435456);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this.getHighSpeedVideoSizes, p0.hashCode(), createChooser, 201326592);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "");
        return activity;
    }

    private final android.net.Uri Camera2StreamConfigurationMap(java.lang.String p0) {
        java.io.File file = new java.io.File(p0);
        android.content.Context context = this.getHighSpeedVideoSizes;
        java.lang.String packageName = context.getPackageName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(packageName);
        sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.FILE_PROVIDER_AUTHORITY_SUFFIX);
        android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, sb.toString(), file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriForFile, "");
        return uriForFile;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$1ERrBj9XiU43CXpOpKUOK4nAndQ(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_notification_complete);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$7PpXQelmdhc7d_M06K9yg941uV0(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_action_retry);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$JNgcYwkGmg7NO7KtsAPoXdZQNG0(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_action_share);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$NOFLtG0u1DgQ2ZclD1FQx-FIn-Y, reason: not valid java name */
    public static /* synthetic */ java.lang.String m11748$r8$lambda$NOFLtG0u1DgQ2ZclD1FQxFInY(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_action_resume);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$QqiMZ-eKL6kj6e9_vxKzm1vcDz8, reason: not valid java name */
    public static /* synthetic */ java.lang.String m11749$r8$lambda$QqiMZeKL6kj6e9_vxKzm1vcDz8(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_action_open);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$YtBVshzVV1ZO0jIzU7DIMhy6eXc(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_notification_failed);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$e0Yaq6yf0BrR-19Yo4l7FFds0dY, reason: not valid java name */
    public static /* synthetic */ java.lang.String m11750$r8$lambda$e0Yaq6yf0BrR19Yo4l7FFds0dY(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_action_cancel);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* renamed from: $r8$lambda$fvDO2h1KqB1LqGR7EqCk69T-Dac, reason: not valid java name */
    public static /* synthetic */ java.lang.String m11751$r8$lambda$fvDO2h1KqB1LqGR7EqCk69TDac(com.paypal.oslo.downloads.impl.notification.NotificationBuilder notificationBuilder) {
        java.lang.String string = notificationBuilder.getHighSpeedVideoSizes.getString(com.paypal.oslo.downloads.R.string.core_downloads_notification_paused);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final androidx.core.app.NotificationCompat.Action getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        android.content.Intent intent = new android.content.Intent(ACTION_CANCEL);
        intent.setPackage(this.getHighSpeedVideoSizes.getPackageName());
        intent.putExtra("download_id", p0);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this.getHighSpeedVideoSizes, p0.hashCode(), intent, 201326592);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(broadcast, "");
        androidx.core.app.NotificationCompat.Action build = new androidx.core.app.NotificationCompat.Action.Builder(android.R.drawable.ic_delete, (java.lang.String) this.Camera2StreamConfigurationMap.getValue(), broadcast).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    /* renamed from: buildProgressNotification-tOiKUBg, reason: not valid java name */
    public final android.app.Notification m11755buildProgressNotificationtOiKUBg(java.lang.String downloadId, java.lang.String title, int progress, long downloadedBytes, long totalBytes) {
        java.lang.String formatBytes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        if (totalBytes > 0) {
            java.lang.String formatBytes2 = com.paypal.oslo.downloads.impl.util.ByteFormattersKt.formatBytes(downloadedBytes);
            java.lang.String formatBytes3 = com.paypal.oslo.downloads.impl.util.ByteFormattersKt.formatBytes(totalBytes);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(progress);
            sb.append("% - ");
            sb.append(formatBytes2);
            sb.append(" / ");
            sb.append(formatBytes3);
            formatBytes = sb.toString();
        } else {
            formatBytes = com.paypal.oslo.downloads.impl.util.ByteFormattersKt.formatBytes(downloadedBytes);
        }
        android.app.Notification build = new androidx.core.app.NotificationCompat.Builder(this.getHighSpeedVideoSizes, CHANNEL_ID_PROGRESS).setContentTitle(title).setContentText(formatBytes).setSmallIcon(android.R.drawable.stat_sys_download).setProgress(100, progress, totalBytes <= 0).setOngoing(true).setOnlyAlertOnce(true).addAction(getHighResolutionOutputSizeshNQ4ISI(downloadId)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
