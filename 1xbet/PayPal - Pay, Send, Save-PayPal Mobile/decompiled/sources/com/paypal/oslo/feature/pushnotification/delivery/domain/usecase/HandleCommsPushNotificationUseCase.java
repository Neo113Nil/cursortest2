package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBK\b\u0007\u0012\u0015\u0010\u0005\u001a\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0003¢\u0006\u0002\b\u00040\u0002\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0017\u001a\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/HandleCommsPushNotificationUseCase;", "", "", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "Lkotlin/jvm/JvmSuppressWildcards;", "validators", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "mappers", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "notificationRenderer", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationImpressionUseCase;", "trackImpressionUseCase", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationImpressionUseCase;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "invoke", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationImpressionUseCase;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleCommsPushNotificationUseCase {

    @java.lang.Deprecated
    public static final java.lang.String KEY_TRACKING_TOKEN = "tracking_token";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase.Companion Companion = new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public HandleCommsPushNotificationUseCase(java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?>> set, java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper> set2, com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase trackPushNotificationImpressionUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackPushNotificationImpressionUseCase, "");
        this.getHighSpeedVideoFpsRanges = set;
        this.getHighSpeedVideoFpsRangesFor = set2;
        this.Camera2StreamConfigurationMap = notificationRenderer;
        this.getHighSpeedVideoSizes = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = trackPushNotificationImpressionUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0378, code lost:
    
        if (r17 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x037a, code lost:
    
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "No validator could validate the payload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, r3), kotlin.TuplesKt.to("campaign_id", r4), kotlin.TuplesKt.to("data_keys", kotlin.collections.CollectionsKt.joinToString$default(r2.keySet(), null, null, null, 0, null, null, 63, null))), null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x03bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x03bd, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r39.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase$invoke$1(r39, r17, r3, r4, r29, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03d9, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(com.google.firebase.messaging.RemoteMessage message) {
        java.lang.String str;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload;
        java.lang.String str2;
        java.util.Iterator it;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload2;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapOf;
        java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap;
        com.google.firebase.messaging.RemoteMessage remoteMessage = message;
        java.lang.String str3 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "");
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        java.lang.String str4 = data.get("MID");
        if (str4 == null && (str4 = data.get("content_id")) == null) {
            str4 = message.getMessageId();
        }
        java.lang.String str5 = data.get("CID");
        if (str5 == null) {
            str5 = data.get("campaign_id");
        }
        java.lang.String str6 = data.get("tracking_token");
        java.util.Iterator it2 = this.getHighSpeedVideoFpsRanges.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = str6;
                validatedPayload = null;
                break;
            }
            com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator pushNotificationPayloadValidator = (com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator) it2.next();
            arrow.core.Either validate = pushNotificationPayloadValidator.validate(remoteMessage);
            if (validate instanceof arrow.core.Either.Right) {
                validatedPayload2 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload) ((arrow.core.Either.Right) validate).getValue();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                boolean z = validatedPayload2 instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload;
                str2 = str3;
                it = it2;
                if (z) {
                    kotlin.Pair[] pairArr = new kotlin.Pair[15];
                    com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) validatedPayload2;
                    str = str6;
                    pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload.getMessageId());
                    pairArr[1] = kotlin.TuplesKt.to("campaign_id", commsV1PushPayload.getCampaignId());
                    pairArr[2] = kotlin.TuplesKt.to("validator", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(pushNotificationPayloadValidator.getClass()).getSimpleName());
                    pairArr[3] = kotlin.TuplesKt.to("payload_type", "CommsV1PushPayload");
                    pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, commsV1PushPayload.getEventType());
                    pairArr[5] = kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID, commsV1PushPayload.getUnpTid());
                    pairArr[6] = kotlin.TuplesKt.to("template_version", commsV1PushPayload.getTemplateVersion());
                    pairArr[7] = kotlin.TuplesKt.to("use_case", commsV1PushPayload.getUseCase());
                    pairArr[8] = kotlin.TuplesKt.to("paypal_request_id", commsV1PushPayload.getPaypalRequestId());
                    pairArr[9] = kotlin.TuplesKt.to("nn_android", commsV1PushPayload.getNnAndroid());
                    pairArr[10] = kotlin.TuplesKt.to("media_url", commsV1PushPayload.getMediaUrl());
                    pairArr[11] = kotlin.TuplesKt.to("has_actions", java.lang.Boolean.valueOf(commsV1PushPayload.getActions() != null));
                    pairArr[12] = kotlin.TuplesKt.to("custom_view", commsV1PushPayload.getCustomView());
                    pairArr[13] = kotlin.TuplesKt.to("min_app_version", commsV1PushPayload.getMinAppVersion());
                    pairArr[14] = kotlin.TuplesKt.to("oslo_deeplink", commsV1PushPayload.getOsloDeeplink());
                    mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
                } else {
                    str = str6;
                    if (validatedPayload2 instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) {
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[17];
                        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload osloPushPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) validatedPayload2;
                        pairArr2[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload.getContentId());
                        pairArr2[1] = kotlin.TuplesKt.to("campaign_id", osloPushPayload.getCampaignId());
                        pairArr2[2] = kotlin.TuplesKt.to("validator", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(pushNotificationPayloadValidator.getClass()).getSimpleName());
                        pairArr2[3] = kotlin.TuplesKt.to("payload_type", "OsloPushPayload");
                        pairArr2[4] = kotlin.TuplesKt.to("source", osloPushPayload.getSource());
                        pairArr2[5] = kotlin.TuplesKt.to("type", osloPushPayload.getType());
                        pairArr2[6] = kotlin.TuplesKt.to("instance_id", osloPushPayload.getInstanceId());
                        pairArr2[7] = kotlin.TuplesKt.to("unp_id", osloPushPayload.getUnpId());
                        pairArr2[8] = kotlin.TuplesKt.to("traffic_pattern", osloPushPayload.getTrafficPattern());
                        pairArr2[9] = kotlin.TuplesKt.to("target_id", osloPushPayload.getTargetId());
                        pairArr2[10] = kotlin.TuplesKt.to("origin_ts", osloPushPayload.getOriginTimestamp());
                        pairArr2[11] = kotlin.TuplesKt.to("deeplink", osloPushPayload.getDeeplink());
                        pairArr2[12] = kotlin.TuplesKt.to("media_url", osloPushPayload.getMediaUrl());
                        pairArr2[13] = kotlin.TuplesKt.to("has_custom_view", java.lang.Boolean.valueOf(osloPushPayload.getCustomView() != null));
                        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customView = osloPushPayload.getCustomView();
                        pairArr2[14] = kotlin.TuplesKt.to("custom_view_type", customView != null ? customView.getType() : null);
                        pairArr2[15] = kotlin.TuplesKt.to("min_app_version", osloPushPayload.getMinAppVersion());
                        pairArr2[16] = kotlin.TuplesKt.to("action_count", java.lang.Integer.valueOf(osloPushPayload.getActions().size()));
                        mapOf = kotlin.collections.MapsKt.mapOf(pairArr2);
                    } else {
                        mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("validator", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(pushNotificationPayloadValidator.getClass()).getSimpleName()), kotlin.TuplesKt.to("payload_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(validatedPayload2.getClass()).getSimpleName()));
                    }
                }
                if (z) {
                    com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload2 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) validatedPayload2;
                    emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("encrypted_customer_id", commsV1PushPayload2.getEncryptedCustomerId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, commsV1PushPayload2.getContactId()), kotlin.TuplesKt.to("customer_id", commsV1PushPayload2.getCustomerId()));
                } else if (validatedPayload2 instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) {
                    emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_id", ((com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) validatedPayload2).getUserId()));
                } else {
                    emptyMap = kotlin.collections.MapsKt.emptyMap();
                }
                logger.i("Payload validated", mapOf, emptyMap);
            } else {
                str2 = str3;
                str = str6;
                it = it2;
                if (validate instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError validationError = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError) ((arrow.core.Either.Left) validate).getValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[5];
                    pairArr3[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str4);
                    pairArr3[1] = kotlin.TuplesKt.to("campaign_id", str5);
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(pushNotificationPayloadValidator.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = str2;
                    }
                    pairArr3[2] = kotlin.TuplesKt.to("validator", simpleName);
                    pairArr3[3] = kotlin.TuplesKt.to("error_reason", validationError.toString());
                    pairArr3[4] = kotlin.TuplesKt.to("data_keys", kotlin.collections.CollectionsKt.joinToString$default(message.getData().keySet(), null, null, null, 0, null, null, 63, null));
                    com.paypal.android.logger.Logger.w$default(logger2, "Payload validation failed", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                    validatedPayload2 = null;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (validatedPayload2 != null) {
                validatedPayload = validatedPayload2;
                break;
            }
            remoteMessage = message;
            str3 = str2;
            it2 = it;
            str6 = str;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/HandleCommsPushNotificationUseCase$Companion;", "", "<init>", "()V", "", "KEY_TRACKING_TOKEN", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
