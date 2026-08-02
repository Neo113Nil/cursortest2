package com.paypal.oslo.feature.pushnotification.delivery.data.adapter;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010 \u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/adapter/CommsPushNotificationClickHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "notificationRenderer", "Landroidx/work/WorkManager;", "workManager", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationClickUseCase;", "trackPushNotificationClickUseCase", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "deeplinkResolver", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;Landroidx/work/WorkManager;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationClickUseCase;Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;)V", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;", com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE, "", "onNotificationClicked", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClick;)Z", "", "p0", "", "", "p1", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/util/Map;)V", "getHighSpeedVideoSizes", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "getOutputFormats", "Landroidx/work/WorkManager;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationClickUseCase;", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "getHighSpeedVideoSizesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommsPushNotificationClickHandler implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler {

    @java.lang.Deprecated
    public static final java.lang.String ACTION_TYPE_ONE_CLICK_CTA = "ONE_CLICK_CTA";

    @java.lang.Deprecated
    public static final java.lang.String ACTION_TYPE_REDIRECT_CTA = "REDIRECT_CTA";

    @java.lang.Deprecated
    public static final long BACKOFF_DELAY_SECONDS = 10;

    @java.lang.Deprecated
    public static final java.lang.String KEY_ACTION_DEEPLINK = "deeplink";

    @java.lang.Deprecated
    public static final java.lang.String KEY_CODE = "code";

    @java.lang.Deprecated
    public static final java.lang.String KEY_CONTACT_ID = "contact_id";

    @java.lang.Deprecated
    public static final java.lang.String KEY_CONTENT_DEEPLINK = "oslo_deeplink";

    @java.lang.Deprecated
    public static final java.lang.String KEY_TRACKING_TOKEN = "tracking_token";

    @java.lang.Deprecated
    public static final java.lang.String KEY_TYPE = "type";

    @java.lang.Deprecated
    public static final java.lang.String TYPE_COMMS = "comms";

    @java.lang.Deprecated
    public static final java.lang.String TYPE_OSLO = "oslo";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.deeplink.DeeplinkResolver getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.work.WorkManager getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.Companion Companion = new com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CommsPushNotificationClickHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer, androidx.work.WorkManager workManager, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase trackPushNotificationClickUseCase, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackPushNotificationClickUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkResolver, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = notificationRenderer;
        this.getHighSpeedVideoFpsRanges = workManager;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = trackPushNotificationClickUseCase;
        this.getHighSpeedVideoSizesFor = deeplinkResolver;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler
    public final boolean onNotificationClicked(com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick click) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "");
        java.lang.String str2 = click.getMetadata().get("type");
        if (str2 == null) {
            return false;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, TYPE_COMMS) && !kotlin.jvm.internal.Intrinsics.areEqual(str2, TYPE_OSLO)) {
            return false;
        }
        java.lang.String str3 = click.getMetadata().get("MID");
        if (str3 == null) {
            str3 = click.getMetadata().get("content_id");
        }
        java.lang.String str4 = click.getMetadata().get("CID");
        if (str4 == null) {
            str4 = click.getMetadata().get("campaign_id");
        }
        java.lang.String str5 = click.getMetadata().get("tracking_token");
        if (str5 != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler$trackClick$1(this, str5, null), 3, null);
        }
        if (click instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content) {
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content content = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content) click;
            java.lang.String str6 = content.getMetadata().get("oslo_deeplink");
            getHighSpeedVideoFpsRanges(str6, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, content.getNotificationId()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str3), kotlin.TuplesKt.to("campaign_id", str4), kotlin.TuplesKt.to("notification_type", str2), kotlin.TuplesKt.to("click_type", "content"), kotlin.TuplesKt.to("deeplink_path", str6), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, content.getMetadata().get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE)), kotlin.TuplesKt.to("source", content.getMetadata().get("source")), kotlin.TuplesKt.to("use_case", content.getMetadata().get("use_case")), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID, content.getMetadata().get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID))));
        } else {
            if (!(click instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action action = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action) click;
            java.lang.String str7 = action.getActionMetadata().get("type");
            java.lang.String str8 = action.getActionMetadata().get("deeplink");
            getHighSpeedVideoFpsRanges(str8, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, action.getNotificationId()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str3), kotlin.TuplesKt.to("campaign_id", str4), kotlin.TuplesKt.to("notification_type", str2), kotlin.TuplesKt.to("click_type", "action"), kotlin.TuplesKt.to("action_id", action.getActionId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ACTION_TYPE, str7), kotlin.TuplesKt.to("deeplink_path", str8), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, action.getMetadata().get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE)), kotlin.TuplesKt.to("source", action.getMetadata().get("source"))));
            java.lang.String str9 = action.getActionMetadata().get("type");
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, action.getActionId());
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, str9 == null ? "unknown" : str9);
            com.paypal.android.logger.Logger.d$default(logger, "Handling action click", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str9, ACTION_TYPE_ONE_CLICK_CTA)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(str9, ACTION_TYPE_REDIRECT_CTA)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Handling REDIRECT_CTA action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, action.getActionId()), kotlin.TuplesKt.to("has_deeplink", java.lang.String.valueOf(action.getActionMetadata().containsKey("deeplink")))), null, 4, null);
                } else {
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    pairArr2[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, action.getActionId());
                    java.lang.String str10 = action.getActionMetadata().get("type");
                    if (str10 == null) {
                        str10 = "unknown";
                    }
                    pairArr2[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, str10);
                    com.paypal.android.logger.Logger.d$default(logger2, "Unrecognized action type, dismissing notification", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                }
            } else {
                java.lang.String str11 = action.getMetadata().get("MID");
                if (str11 == null) {
                    str11 = action.getMetadata().get("content_id");
                }
                java.lang.String str12 = action.getMetadata().get("CID");
                if (str12 == null) {
                    str12 = action.getMetadata().get("campaign_id");
                }
                java.lang.String str13 = action.getMetadata().get(KEY_CONTACT_ID);
                java.lang.String str14 = action.getActionMetadata().get("code");
                java.lang.String str15 = str13;
                if (str15 == null || kotlin.text.StringsKt.isBlank(str15) || (str = str14) == null || kotlin.text.StringsKt.isBlank(str)) {
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[6];
                    pairArr3[0] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, action.getNotificationId());
                    pairArr3[1] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str11);
                    pairArr3[2] = kotlin.TuplesKt.to("campaign_id", str12);
                    pairArr3[3] = kotlin.TuplesKt.to("action_id", action.getActionId());
                    pairArr3[4] = kotlin.TuplesKt.to("has_contact_id", java.lang.String.valueOf(!(str15 == null || kotlin.text.StringsKt.isBlank(str15))));
                    java.lang.String str16 = str14;
                    pairArr3[5] = kotlin.TuplesKt.to("has_code", java.lang.String.valueOf(!(str16 == null || kotlin.text.StringsKt.isBlank(str16))));
                    com.paypal.android.logger.Logger.w$default(logger3, "ONE_CLICK_CTA missing required fields, skipping enqueue", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                } else {
                    androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker.class);
                    kotlin.Pair[] pairArr4 = {kotlin.TuplesKt.to("action_id", str13), kotlin.TuplesKt.to("code", str14)};
                    androidx.work.Data.Builder builder2 = new androidx.work.Data.Builder();
                    int i = 0;
                    for (int i2 = 2; i < i2; i2 = 2) {
                        kotlin.Pair pair = pairArr4[i];
                        builder2.put((java.lang.String) pair.getFirst(), pair.getSecond());
                        i++;
                    }
                    this.getHighSpeedVideoFpsRanges.enqueue(builder.setInputData(builder2.build()).setBackoffCriteria(androidx.work.BackoffPolicy.LINEAR, 10L, java.util.concurrent.TimeUnit.SECONDS).build());
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "ONE_CLICK_CTA work enqueued", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, action.getNotificationId()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str11), kotlin.TuplesKt.to("campaign_id", str12), kotlin.TuplesKt.to("action_id", action.getActionId())), null, 4, null);
                }
            }
            this.getHighSpeedVideoSizes.cancel(action.getNotificationId());
        }
        return true;
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0, java.util.Map<java.lang.String, ? extends java.lang.Object> p1) {
        kotlin.Pair pair;
        java.lang.String str = p0;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push notification click handled", kotlin.collections.MapsKt.plus(p1, kotlin.TuplesKt.to("has_deeplink", java.lang.Boolean.FALSE)), null, 4, null);
            return;
        }
        java.lang.String extractDeeplinkPath = com.paypal.oslo.core.pushnotification.deeplink.DeeplinkPathExtractorKt.extractDeeplinkPath(p0);
        java.lang.String classifyDeeplinkScheme = com.paypal.oslo.core.pushnotification.deeplink.DeeplinkPathExtractorKt.classifyDeeplinkScheme(p0);
        arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve = this.getHighSpeedVideoSizesFor.resolve(extractDeeplinkPath);
        if (resolve instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push notification click handled", kotlin.collections.MapsKt.plus(p1, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("has_deeplink", java.lang.Boolean.TRUE), kotlin.TuplesKt.to("deeplink_resolved", java.lang.Boolean.TRUE), kotlin.TuplesKt.to("deeplink_scheme", classifyDeeplinkScheme))), null, 4, null);
            return;
        }
        if (resolve instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.deeplink.DeeplinkResolver.Error error = (com.paypal.oslo.core.deeplink.DeeplinkResolver.Error) ((arrow.core.Either.Left) resolve).getValue();
            if (error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) {
                pair = kotlin.TuplesKt.to("malformed_path", ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) error).getPath());
            } else {
                if (!(error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                pair = kotlin.TuplesKt.to("unrecognized_path", ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath) error).getPath());
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push notification click has unresolvable deeplink", kotlin.collections.MapsKt.plus(p1, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deeplink_error", (java.lang.String) pair.component1()), kotlin.TuplesKt.to("extracted_path", (java.lang.String) pair.component2()), kotlin.TuplesKt.to("deeplink_scheme", classifyDeeplinkScheme))), null, 4, null);
            return;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/adapter/CommsPushNotificationClickHandler$Companion;", "", "<init>", "()V", "", "KEY_TYPE", "Ljava/lang/String;", "TYPE_COMMS", "TYPE_OSLO", "KEY_CODE", "KEY_CONTACT_ID", "KEY_TRACKING_TOKEN", "KEY_CONTENT_DEEPLINK", "KEY_ACTION_DEEPLINK", "ACTION_TYPE_ONE_CLICK_CTA", "ACTION_TYPE_REDIRECT_CTA", "", "BACKOFF_DELAY_SECONDS", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
