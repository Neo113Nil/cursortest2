package com.paypal.oslo.core.pushnotification.data.rendering;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B6\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J7\u0010%\u001a\u00020\u0012*\u00020#2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010'R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001f\u0010+\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u0010!\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010/"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationRendererImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationChannelManager;", "channelManager", "", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomViewRenderer;", "Lkotlin/jvm/JvmSuppressWildcards;", "customViewRenderers", "Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;", "openWebDeeplinkNormalizer", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationChannelManager;Ljava/util/Set;Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;)V", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "", "show", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;)Larrow/core/Either;", "", "notificationId", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/String;)V", "cancelAll", "()V", "Landroidx/core/app/NotificationCompat$Builder;", "p0", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;", "p1", "p2", "", "getHighSpeedVideoSizes", "(Landroidx/core/app/NotificationCompat$Builder;Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;)Z", "Landroid/content/Intent;", "p3", "getHighSpeedVideoFpsRangesFor", "(Landroid/content/Intent;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationChannelManager;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationRendererImpl implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer {
    private static final com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl.Companion Companion = new com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String KEY_ACTION_DEEPLINK = "deeplink";

    @java.lang.Deprecated
    public static final java.lang.String KEY_CONTENT_DEEPLINK = "oslo_deeplink";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager getHighSpeedVideoFpsRanges;
    private final java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.app.NotificationManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public NotificationRendererImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager notificationChannelManager, java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer> set, com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer openWebDeeplinkNormalizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationChannelManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openWebDeeplinkNormalizer, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoFpsRanges = notificationChannelManager;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        this.Camera2StreamConfigurationMap = openWebDeeplinkNormalizer;
        java.lang.Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoSizes = (android.app.NotificationManager) systemService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(8:(3:112|113|(24:115|116|117|(1:119)|39|(8:42|43|44|(8:56|57|(2:69|70)|59|60|61|62|63)(1:46)|47|(2:54|55)(2:51|52)|53|40)|81|82|(1:84)|85|86|87|88|89|90|91|92|93|94|(1:96)(1:104)|97|(1:99)(1:103)|100|101)(2:121|122))(1:35)|93|94|(0)(0)|97|(0)(0)|100|101)|87|88|89|90|91|92) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0450, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038b A[Catch: Exception -> 0x0458, TryCatch #4 {Exception -> 0x0458, blocks: (B:63:0x026f, B:47:0x0333, B:49:0x0339, B:53:0x034e, B:46:0x02cd, B:82:0x037d, B:84:0x038b, B:85:0x039a), top: B:62:0x026f }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0429  */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.paypal.oslo.core.pushnotification.domain.notification.NotificationData] */
    @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError, kotlin.Unit> show(com.paypal.oslo.core.pushnotification.domain.notification.NotificationData data) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress progress;
        int i3;
        android.app.PendingIntent activity;
        char c;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String str9 = data.getMetadata().get("MID");
        if (str9 == null) {
            str9 = data.getMetadata().get("content_id");
        }
        java.lang.String str10 = str9;
        java.lang.String str11 = data.getMetadata().get("CID");
        java.lang.String str12 = "campaign_id";
        if (str11 == null) {
            str11 = data.getMetadata().get("campaign_id");
        }
        java.lang.String str13 = str11;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
        kotlin.Pair pair = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
        java.lang.String str14 = com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER;
        com.paypal.android.logger.Logger.d$default(logger, "Showing notification", kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str10), kotlin.TuplesKt.to("campaign_id", str13)), null, 4, null);
        if (!androidx.core.app.NotificationManagerCompat.from(this.getHighSpeedVideoFpsRangesFor).areNotificationsEnabled()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Notification permission not granted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str10), kotlin.TuplesKt.to("campaign_id", str13)), null, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.PermissionDenied.INSTANCE);
        }
        if (kotlin.text.StringsKt.isBlank(data.getTitle())) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.InvalidData("Title cannot be blank"));
        }
        try {
            java.lang.String orCreateChannelId = this.getHighSpeedVideoFpsRanges.getOrCreateChannelId(data.getChannel());
            androidx.core.app.NotificationCompat.Builder contentText = new androidx.core.app.NotificationCompat.Builder(this.getHighSpeedVideoFpsRangesFor, orCreateChannelId).setContentTitle(data.getTitle()).setContentText(data.getBody());
            java.lang.String smallIcon = data.getSmallIcon();
            java.lang.String str15 = smallIcon;
            if (str15 == null || kotlin.text.StringsKt.isBlank(str15)) {
                i2 = this.getHighSpeedVideoFpsRangesFor.getApplicationInfo().icon;
            } else {
                i2 = this.getHighSpeedVideoFpsRangesFor.getResources().getIdentifier(smallIcon, "drawable", this.getHighSpeedVideoFpsRangesFor.getPackageName());
                if (i2 == 0) {
                    i2 = this.getHighSpeedVideoFpsRangesFor.getApplicationInfo().icon;
                }
            }
            androidx.core.app.NotificationCompat.Builder priority = contentText.setSmallIcon(i2).setAutoCancel(data.getAutoCancel()).setOngoing(data.getOngoing()).setPriority(com.paypal.oslo.core.pushnotification.data.rendering.NotificationCompatExtensionsKt.toCompat(data.getPriority()));
            android.content.Intent launchIntentForPackage = this.getHighSpeedVideoFpsRangesFor.getPackageManager().getLaunchIntentForPackage(this.getHighSpeedVideoFpsRangesFor.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new android.content.Intent();
                launchIntentForPackage.setPackage(this.getHighSpeedVideoFpsRangesFor.getPackageName());
            }
            android.content.Intent intent = launchIntentForPackage;
            ?? r3 = data;
            try {
                getHighSpeedVideoFpsRangesFor(intent, r3, data.getMetadata().get("oslo_deeplink"), "content", null);
                intent.putExtra(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                intent.putExtra("metadata", new java.util.HashMap(data.getMetadata()));
                int i5 = 335544320;
                intent.addFlags(335544320);
                android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(this.getHighSpeedVideoFpsRangesFor, data.getId().hashCode(), intent, 201326592);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "");
                androidx.core.app.NotificationCompat.Builder contentIntent = priority.setContentIntent(activity2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentIntent, "");
                com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customViews = data.getCustomViews();
                try {
                    try {
                        try {
                            if (customViews != null) {
                                try {
                                    if (customViews instanceof com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template) {
                                        if (!getHighSpeedVideoSizes(contentIntent, (com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template) customViews, data)) {
                                        }
                                        for (com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction notificationAction : data.getActions()) {
                                            try {
                                                str6 = str12;
                                                if (notificationAction.getOpensApp()) {
                                                    try {
                                                        android.content.Intent launchIntentForPackage2 = this.getHighSpeedVideoFpsRangesFor.getPackageManager().getLaunchIntentForPackage(this.getHighSpeedVideoFpsRangesFor.getPackageName());
                                                        if (launchIntentForPackage2 == null) {
                                                            try {
                                                                launchIntentForPackage2 = new android.content.Intent();
                                                                launchIntentForPackage2.setPackage(this.getHighSpeedVideoFpsRangesFor.getPackageName());
                                                            } catch (java.lang.Exception e) {
                                                                e = e;
                                                                str = str10;
                                                                str3 = str13;
                                                                str4 = str14;
                                                                str2 = str6;
                                                                i = 3;
                                                                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                                                                kotlin.Pair pair2 = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                                                kotlin.Pair pair3 = kotlin.TuplesKt.to(str4, str);
                                                                kotlin.Pair pair4 = kotlin.TuplesKt.to(str2, str3);
                                                                kotlin.Pair[] pairArr = new kotlin.Pair[i];
                                                                pairArr[0] = pair2;
                                                                pairArr[1] = pair3;
                                                                pairArr[2] = pair4;
                                                                java.lang.Exception exc = e;
                                                                com.paypal.android.logger.Logger.e$default(logger2, "Failed to show notification", kotlin.collections.MapsKt.mapOf(pairArr), null, exc, 4, null);
                                                                return arrow.core.EitherKt.left(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown(exc));
                                                            }
                                                        }
                                                        android.content.Intent intent2 = launchIntentForPackage2;
                                                        str7 = str13;
                                                        str5 = str10;
                                                        str8 = str14;
                                                        i3 = i5;
                                                        try {
                                                            getHighSpeedVideoFpsRangesFor(intent2, data, notificationAction.getMetadata().get("deeplink"), "action", notificationAction.getId());
                                                            intent2.putExtra(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                                            intent2.putExtra("metadata", new java.util.HashMap(data.getMetadata()));
                                                            intent2.putExtra("action_id", notificationAction.getId());
                                                            intent2.putExtra(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_ACTION_METADATA, new java.util.HashMap(notificationAction.getMetadata()));
                                                            intent2.addFlags(i3);
                                                            android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
                                                            java.lang.String id = data.getId();
                                                            java.lang.String id2 = notificationAction.getId();
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            sb.append(id);
                                                            sb.append(id2);
                                                            activity = android.app.PendingIntent.getActivity(context, sb.toString().hashCode(), intent2, 201326592);
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "");
                                                            c = 0;
                                                        } catch (java.lang.Exception e2) {
                                                            e = e2;
                                                            str2 = str6;
                                                            str4 = str8;
                                                            str3 = str7;
                                                            str = str5;
                                                            i = 3;
                                                            com.paypal.android.logger.Logger logger22 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                                                            kotlin.Pair pair22 = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                                            kotlin.Pair pair32 = kotlin.TuplesKt.to(str4, str);
                                                            kotlin.Pair pair42 = kotlin.TuplesKt.to(str2, str3);
                                                            kotlin.Pair[] pairArr2 = new kotlin.Pair[i];
                                                            pairArr2[0] = pair22;
                                                            pairArr2[1] = pair32;
                                                            pairArr2[2] = pair42;
                                                            java.lang.Exception exc2 = e;
                                                            com.paypal.android.logger.Logger.e$default(logger22, "Failed to show notification", kotlin.collections.MapsKt.mapOf(pairArr2), null, exc2, 4, null);
                                                            return arrow.core.EitherKt.left(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown(exc2));
                                                        }
                                                    } catch (java.lang.Exception e3) {
                                                        e = e3;
                                                        str5 = str10;
                                                        str7 = str13;
                                                        str8 = str14;
                                                        str2 = str6;
                                                        str4 = str8;
                                                        str3 = str7;
                                                        str = str5;
                                                        i = 3;
                                                        com.paypal.android.logger.Logger logger222 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                                                        kotlin.Pair pair222 = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                                        kotlin.Pair pair322 = kotlin.TuplesKt.to(str4, str);
                                                        kotlin.Pair pair422 = kotlin.TuplesKt.to(str2, str3);
                                                        kotlin.Pair[] pairArr22 = new kotlin.Pair[i];
                                                        pairArr22[0] = pair222;
                                                        pairArr22[1] = pair322;
                                                        pairArr22[2] = pair422;
                                                        java.lang.Exception exc22 = e;
                                                        com.paypal.android.logger.Logger.e$default(logger222, "Failed to show notification", kotlin.collections.MapsKt.mapOf(pairArr22), null, exc22, 4, null);
                                                        return arrow.core.EitherKt.left(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown(exc22));
                                                    }
                                                } else {
                                                    str5 = str10;
                                                    str7 = str13;
                                                    str8 = str14;
                                                    i3 = i5;
                                                    android.content.Intent intent3 = new android.content.Intent(this.getHighSpeedVideoFpsRangesFor, (java.lang.Class<?>) com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.class);
                                                    intent3.setAction(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.ACTION_NOTIFICATION_ACTION_CLICK);
                                                    intent3.putExtra(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                                    intent3.putExtra("action_id", notificationAction.getId());
                                                    intent3.putExtra("metadata", new java.util.HashMap(data.getMetadata()));
                                                    intent3.putExtra(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_ACTION_METADATA, new java.util.HashMap(notificationAction.getMetadata()));
                                                    android.content.Context context2 = this.getHighSpeedVideoFpsRangesFor;
                                                    java.lang.String id3 = data.getId();
                                                    java.lang.String id4 = notificationAction.getId();
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                    sb2.append(id3);
                                                    sb2.append(id4);
                                                    c = 0;
                                                    activity = android.app.PendingIntent.getBroadcast(context2, sb2.toString().hashCode(), intent3, 201326592);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "");
                                                }
                                                java.lang.String icon = notificationAction.getIcon();
                                                if (icon == null || (i4 = this.getHighSpeedVideoFpsRangesFor.getResources().getIdentifier(icon, "drawable", this.getHighSpeedVideoFpsRangesFor.getPackageName())) == 0) {
                                                    i4 = 0;
                                                }
                                                androidx.core.app.NotificationCompat.Action build = new androidx.core.app.NotificationCompat.Action.Builder(i4, notificationAction.getTitle(), activity).build();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                                                contentIntent.addAction(build);
                                                i5 = i3;
                                                str12 = str6;
                                                str14 = str8;
                                                str13 = str7;
                                                str10 = str5;
                                            } catch (java.lang.Exception e4) {
                                                e = e4;
                                                str5 = str10;
                                                str6 = str12;
                                            }
                                        }
                                        str5 = str10;
                                        str6 = str12;
                                        str7 = str13;
                                        str8 = str14;
                                        progress = data.getProgress();
                                        if (progress != null) {
                                            contentIntent.setProgress(progress.getMax(), progress.getCurrent(), progress.getIndeterminate());
                                        }
                                        android.app.Notification build2 = contentIntent.build();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
                                        this.getHighSpeedVideoSizes.notify(data.getId().hashCode(), build2);
                                        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                                        kotlin.Pair[] pairArr3 = new kotlin.Pair[8];
                                        pairArr3[0] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                        str4 = str8;
                                        str = str5;
                                        pairArr3[1] = kotlin.TuplesKt.to(str4, str);
                                        str2 = str6;
                                        str3 = str7;
                                        pairArr3[2] = kotlin.TuplesKt.to(str2, str3);
                                        kotlin.Pair pair5 = kotlin.TuplesKt.to("channel_id", orCreateChannelId);
                                        i = 3;
                                        pairArr3[3] = pair5;
                                        pairArr3[4] = kotlin.TuplesKt.to("has_media", java.lang.Boolean.valueOf(data.getStyle() instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture));
                                        pairArr3[5] = kotlin.TuplesKt.to("has_custom_view", java.lang.Boolean.valueOf(data.getCustomViews() == null));
                                        pairArr3[6] = kotlin.TuplesKt.to("action_count", java.lang.Integer.valueOf(data.getActions().size()));
                                        pairArr3[7] = kotlin.TuplesKt.to("has_deeplink", java.lang.Boolean.valueOf(data.getMetadata().get("oslo_deeplink") == null));
                                        com.paypal.android.logger.Logger.i$default(logger3, "Notification posted", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                                    }
                                    throw new kotlin.NoWhenBranchMatchedException();
                                } catch (java.lang.Exception e5) {
                                    e = e5;
                                    r3 = 3;
                                    i = r3;
                                    str = str10;
                                    str2 = "campaign_id";
                                    str3 = str13;
                                    str4 = com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER;
                                    com.paypal.android.logger.Logger logger2222 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                                    kotlin.Pair pair2222 = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                                    kotlin.Pair pair3222 = kotlin.TuplesKt.to(str4, str);
                                    kotlin.Pair pair4222 = kotlin.TuplesKt.to(str2, str3);
                                    kotlin.Pair[] pairArr222 = new kotlin.Pair[i];
                                    pairArr222[0] = pair2222;
                                    pairArr222[1] = pair3222;
                                    pairArr222[2] = pair4222;
                                    java.lang.Exception exc222 = e;
                                    com.paypal.android.logger.Logger.e$default(logger2222, "Failed to show notification", kotlin.collections.MapsKt.mapOf(pairArr222), null, exc222, 4, null);
                                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown(exc222));
                                }
                            }
                            pairArr3[3] = pair5;
                            pairArr3[4] = kotlin.TuplesKt.to("has_media", java.lang.Boolean.valueOf(data.getStyle() instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture));
                            pairArr3[5] = kotlin.TuplesKt.to("has_custom_view", java.lang.Boolean.valueOf(data.getCustomViews() == null));
                            pairArr3[6] = kotlin.TuplesKt.to("action_count", java.lang.Integer.valueOf(data.getActions().size()));
                            pairArr3[7] = kotlin.TuplesKt.to("has_deeplink", java.lang.Boolean.valueOf(data.getMetadata().get("oslo_deeplink") == null));
                            com.paypal.android.logger.Logger.i$default(logger3, "Notification posted", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                        } catch (java.lang.Exception e6) {
                            e = e6;
                            com.paypal.android.logger.Logger logger22222 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                            kotlin.Pair pair22222 = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                            kotlin.Pair pair32222 = kotlin.TuplesKt.to(str4, str);
                            kotlin.Pair pair42222 = kotlin.TuplesKt.to(str2, str3);
                            kotlin.Pair[] pairArr2222 = new kotlin.Pair[i];
                            pairArr2222[0] = pair22222;
                            pairArr2222[1] = pair32222;
                            pairArr2222[2] = pair42222;
                            java.lang.Exception exc2222 = e;
                            com.paypal.android.logger.Logger.e$default(logger22222, "Failed to show notification", kotlin.collections.MapsKt.mapOf(pairArr2222), null, exc2222, 4, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError.Unknown(exc2222));
                        }
                        pairArr3[1] = kotlin.TuplesKt.to(str4, str);
                        str2 = str6;
                        str3 = str7;
                        pairArr3[2] = kotlin.TuplesKt.to(str2, str3);
                        kotlin.Pair pair52 = kotlin.TuplesKt.to("channel_id", orCreateChannelId);
                        i = 3;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        str2 = str6;
                        str3 = str7;
                    }
                    com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle style = data.getStyle();
                    if (style != null) {
                        contentIntent.setStyle(com.paypal.oslo.core.pushnotification.data.rendering.NotificationCompatExtensionsKt.toCompat(style));
                    }
                    while (r20.hasNext()) {
                    }
                    str5 = str10;
                    str6 = str12;
                    str7 = str13;
                    str8 = str14;
                    progress = data.getProgress();
                    if (progress != null) {
                    }
                    android.app.Notification build22 = contentIntent.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build22, "");
                    this.getHighSpeedVideoSizes.notify(data.getId().hashCode(), build22);
                    com.paypal.android.logger.Logger logger32 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr32 = new kotlin.Pair[8];
                    pairArr32[0] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, data.getId());
                    str4 = str8;
                    str = str5;
                } catch (java.lang.Exception e8) {
                    e = e8;
                }
            } catch (java.lang.Exception e9) {
                e = e9;
                str = str10;
                str2 = "campaign_id";
                str3 = str13;
                str4 = com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
            i = 3;
        }
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer
    public final void cancel(java.lang.String notificationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Cancelling notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", notificationId)), null, 4, null);
        this.getHighSpeedVideoSizes.cancel(notificationId.hashCode());
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer
    public final void cancelAll() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Cancelling all notifications", null, null, 6, null);
        this.getHighSpeedVideoSizes.cancelAll();
    }

    private final boolean getHighSpeedVideoSizes(androidx.core.app.NotificationCompat.Builder p0, com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template p1, com.paypal.oslo.core.pushnotification.domain.notification.NotificationData p2) {
        java.lang.Object obj;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, p1.getTemplateId());
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, p2.getId());
        java.lang.String str = p2.getMetadata().get("MID");
        if (str == null) {
            str = p2.getMetadata().get("content_id");
        }
        pairArr[2] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str);
        java.lang.String str2 = p2.getMetadata().get("CID");
        if (str2 == null) {
            str2 = p2.getMetadata().get("campaign_id");
        }
        pairArr[3] = kotlin.TuplesKt.to("campaign_id", str2);
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
        try {
            java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer) obj).getTemplateId(), p1.getTemplateId(), true)) {
                    break;
                }
            }
            com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer customViewRenderer = (com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer) obj;
            if (customViewRenderer == null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "No renderer registered for custom view template", mapOf, null, 4, null);
                return false;
            }
            android.widget.RemoteViews render = customViewRenderer.render(p1.getData(), p2.getTitle(), p2.getBody(), p2.getId(), p2.getMetadata());
            if (render == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Failed to build custom RemoteViews", mapOf, null, 4, null);
                return false;
            }
            p0.setCustomBigContentView(render);
            p0.setStyle(new androidx.core.app.NotificationCompat.DecoratedCustomViewStyle());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Custom views applied successfully", mapOf, null, 4, null);
            return true;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Exception while applying custom views", mapOf, null, e, 4, null);
            return false;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(android.content.Intent intent, com.paypal.oslo.core.pushnotification.domain.notification.NotificationData notificationData, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = notificationData.getMetadata().get("MID");
        if (str4 == null) {
            str4 = notificationData.getMetadata().get("content_id");
        }
        java.lang.String str5 = notificationData.getMetadata().get("CID");
        if (str5 == null) {
            str5 = notificationData.getMetadata().get("campaign_id");
        }
        if (str == null) {
            if (str3 != null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "REDIRECT_CTA action has no deeplink", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notificationData.getId()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str4), kotlin.TuplesKt.to("campaign_id", str5), kotlin.TuplesKt.to("action_id", str3)), null, 4, null);
                return;
            }
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notificationData.getId());
            pairArr[1] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str4);
            pairArr[2] = kotlin.TuplesKt.to("campaign_id", str5);
            java.lang.String str6 = notificationData.getMetadata().get("type");
            if (str6 == null) {
                str6 = "unknown";
            }
            pairArr[3] = kotlin.TuplesKt.to("payload_type", str6);
            com.paypal.android.logger.Logger.d$default(logger, "Push notification has no deeplink", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return;
        }
        java.lang.String extractDeeplinkPath = com.paypal.oslo.core.pushnotification.deeplink.DeeplinkPathExtractorKt.extractDeeplinkPath(str);
        java.lang.String normalize = this.Camera2StreamConfigurationMap.normalize(extractDeeplinkPath, com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource.PUSH_NOTIFICATION);
        intent.setData(android.net.Uri.parse(normalize));
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notificationData.getId());
        createMapBuilder.put(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str4);
        createMapBuilder.put("campaign_id", str5);
        createMapBuilder.put("raw_deeplink", str);
        createMapBuilder.put("extracted_path", extractDeeplinkPath);
        createMapBuilder.put("normalized_path", normalize);
        createMapBuilder.put("click_target", str2);
        if (str3 != null) {
            createMapBuilder.put("action_id", str3);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.paypal.android.logger.Logger.i$default(logger2, "Push deeplink intent created", kotlin.collections.MapsKt.build(createMapBuilder), null, 4, null);
        if (kotlin.text.StringsKt.isBlank(extractDeeplinkPath)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Push deeplink extraction failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notificationData.getId()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str4), kotlin.TuplesKt.to("campaign_id", str5), kotlin.TuplesKt.to("raw_deeplink", str), kotlin.TuplesKt.to("reason", "empty_extracted_path")), null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationRendererImpl$Companion;", "", "<init>", "()V", "", "KEY_CONTENT_DEEPLINK", "Ljava/lang/String;", "KEY_ACTION_DEEPLINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
