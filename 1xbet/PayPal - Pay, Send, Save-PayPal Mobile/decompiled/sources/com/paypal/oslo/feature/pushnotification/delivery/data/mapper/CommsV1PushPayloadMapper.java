package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CommsV1PushPayloadMapper;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "mediaImageLoader", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;", "customViewMapper", "<init>", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;)V", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;", "payload", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", "tryMap", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationAction;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/util/List;", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewPayload;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewPayload;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CommsV1PushPayload;", "Landroid/graphics/Bitmap;", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CommsV1PushPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommsV1PushPayloadMapper implements com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public CommsV1PushPayloadMapper(com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader mediaImageLoader, com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper customViewMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaImageLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customViewMapper, "");
        this.Camera2StreamConfigurationMap = mediaImageLoader;
        this.getHighResolutionOutputSizeshNQ4ISI = customViewMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object tryMap(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.domain.notification.NotificationData> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$tryMap$1 commsV1PushPayloadMapper$tryMap$1;
        int i;
        android.graphics.Bitmap bitmap;
        java.lang.String mediaUrl;
        java.lang.String osloDeeplink;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText bigText;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload2 = validatedPayload;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$tryMap$1) {
            commsV1PushPayloadMapper$tryMap$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$tryMap$1) continuation;
            if ((commsV1PushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                commsV1PushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = commsV1PushPayloadMapper$tryMap$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commsV1PushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture bigPicture = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(validatedPayload2 instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload)) {
                        return null;
                    }
                    commsV1PushPayloadMapper$tryMap$1.getHighSpeedVideoFpsRangesFor = validatedPayload2;
                    commsV1PushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) validatedPayload2, commsV1PushPayloadMapper$tryMap$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    validatedPayload2 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload) commsV1PushPayloadMapper$tryMap$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                bitmap = (android.graphics.Bitmap) obj;
                com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) validatedPayload2;
                java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(commsV1PushPayload.getActions());
                java.util.Map<java.lang.String, java.lang.String> highSpeedVideoSizes = getHighSpeedVideoSizes(commsV1PushPayload.getNnPayloadAndroid());
                com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(commsV1PushPayload.getCustomView());
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                createMapBuilder.putAll(commsV1PushPayload.getMetadata());
                createMapBuilder.put("type", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_COMMS);
                mediaUrl = commsV1PushPayload.getMediaUrl();
                if (mediaUrl != null) {
                }
                osloDeeplink = commsV1PushPayload.getOsloDeeplink();
                if (osloDeeplink != null) {
                }
                createMapBuilder.putAll(highSpeedVideoSizes);
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                if (bitmap == null) {
                    bigPicture = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture(bitmap, null, commsV1PushPayload.getBody(), 2, null);
                } else if (commsV1PushPayload.getBody().length() > 40) {
                    bigText = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText(commsV1PushPayload.getBody());
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[15];
                    pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload.getMessageId());
                    pairArr[1] = kotlin.TuplesKt.to("campaign_id", commsV1PushPayload.getCampaignId());
                    pairArr[2] = kotlin.TuplesKt.to("mapper", "CommsV1PushPayloadMapper");
                    pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, commsV1PushPayload.getEventType());
                    pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID, commsV1PushPayload.getUnpTid());
                    pairArr[5] = kotlin.TuplesKt.to("template_version", commsV1PushPayload.getTemplateVersion());
                    pairArr[6] = kotlin.TuplesKt.to("use_case", commsV1PushPayload.getUseCase());
                    pairArr[7] = kotlin.TuplesKt.to("paypal_request_id", commsV1PushPayload.getPaypalRequestId());
                    pairArr[8] = kotlin.TuplesKt.to("nn_android", commsV1PushPayload.getNnAndroid());
                    pairArr[9] = kotlin.TuplesKt.to("media_url", commsV1PushPayload.getMediaUrl());
                    pairArr[10] = kotlin.TuplesKt.to("has_actions", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(commsV1PushPayload.getActions() != null));
                    pairArr[11] = kotlin.TuplesKt.to("custom_view", commsV1PushPayload.getCustomView());
                    pairArr[12] = kotlin.TuplesKt.to("min_app_version", commsV1PushPayload.getMinAppVersion());
                    pairArr[13] = kotlin.TuplesKt.to("oslo_deeplink", commsV1PushPayload.getOsloDeeplink());
                    pairArr[14] = kotlin.TuplesKt.to("has_media_image", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap != null));
                    logger.i("Push notification payload mapped", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("encrypted_customer_id", commsV1PushPayload.getEncryptedCustomerId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, commsV1PushPayload.getContactId()), kotlin.TuplesKt.to("customer_id", commsV1PushPayload.getCustomerId())));
                    return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.NotificationIdGeneratorKt.generateUniqueNotificationId(), com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT, commsV1PushPayload.getTitle(), commsV1PushPayload.getBody(), null, bigText, Camera2StreamConfigurationMap, null, true, false, null, build, highSpeedVideoFpsRanges, 1680, null);
                }
                bigText = bigPicture;
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[15];
                pairArr2[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload.getMessageId());
                pairArr2[1] = kotlin.TuplesKt.to("campaign_id", commsV1PushPayload.getCampaignId());
                pairArr2[2] = kotlin.TuplesKt.to("mapper", "CommsV1PushPayloadMapper");
                pairArr2[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, commsV1PushPayload.getEventType());
                pairArr2[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID, commsV1PushPayload.getUnpTid());
                pairArr2[5] = kotlin.TuplesKt.to("template_version", commsV1PushPayload.getTemplateVersion());
                pairArr2[6] = kotlin.TuplesKt.to("use_case", commsV1PushPayload.getUseCase());
                pairArr2[7] = kotlin.TuplesKt.to("paypal_request_id", commsV1PushPayload.getPaypalRequestId());
                pairArr2[8] = kotlin.TuplesKt.to("nn_android", commsV1PushPayload.getNnAndroid());
                pairArr2[9] = kotlin.TuplesKt.to("media_url", commsV1PushPayload.getMediaUrl());
                pairArr2[10] = kotlin.TuplesKt.to("has_actions", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(commsV1PushPayload.getActions() != null));
                pairArr2[11] = kotlin.TuplesKt.to("custom_view", commsV1PushPayload.getCustomView());
                pairArr2[12] = kotlin.TuplesKt.to("min_app_version", commsV1PushPayload.getMinAppVersion());
                pairArr2[13] = kotlin.TuplesKt.to("oslo_deeplink", commsV1PushPayload.getOsloDeeplink());
                pairArr2[14] = kotlin.TuplesKt.to("has_media_image", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap != null));
                logger2.i("Push notification payload mapped", kotlin.collections.MapsKt.mapOf(pairArr2), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("encrypted_customer_id", commsV1PushPayload.getEncryptedCustomerId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, commsV1PushPayload.getContactId()), kotlin.TuplesKt.to("customer_id", commsV1PushPayload.getCustomerId())));
                return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.NotificationIdGeneratorKt.generateUniqueNotificationId(), com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT, commsV1PushPayload.getTitle(), commsV1PushPayload.getBody(), null, bigText, Camera2StreamConfigurationMap, null, true, false, null, build, highSpeedVideoFpsRanges, 1680, null);
            }
        }
        commsV1PushPayloadMapper$tryMap$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$tryMap$1(this, continuation);
        java.lang.Object obj2 = commsV1PushPayloadMapper$tryMap$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commsV1PushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture bigPicture2 = null;
        if (i != 0) {
        }
        bitmap = (android.graphics.Bitmap) obj2;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload2 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) validatedPayload2;
        java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(commsV1PushPayload2.getActions());
        java.util.Map<java.lang.String, java.lang.String> highSpeedVideoSizes2 = getHighSpeedVideoSizes(commsV1PushPayload2.getNnPayloadAndroid());
        com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(commsV1PushPayload2.getCustomView());
        java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder2.putAll(commsV1PushPayload2.getMetadata());
        createMapBuilder2.put("type", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_COMMS);
        mediaUrl = commsV1PushPayload2.getMediaUrl();
        if (mediaUrl != null) {
        }
        osloDeeplink = commsV1PushPayload2.getOsloDeeplink();
        if (osloDeeplink != null) {
        }
        createMapBuilder2.putAll(highSpeedVideoSizes2);
        java.util.Map build2 = kotlin.collections.MapsKt.build(createMapBuilder2);
        if (bitmap == null) {
        }
        bigText = bigPicture2;
        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
        kotlin.Pair[] pairArr22 = new kotlin.Pair[15];
        pairArr22[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload2.getMessageId());
        pairArr22[1] = kotlin.TuplesKt.to("campaign_id", commsV1PushPayload2.getCampaignId());
        pairArr22[2] = kotlin.TuplesKt.to("mapper", "CommsV1PushPayloadMapper");
        pairArr22[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, commsV1PushPayload2.getEventType());
        pairArr22[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID, commsV1PushPayload2.getUnpTid());
        pairArr22[5] = kotlin.TuplesKt.to("template_version", commsV1PushPayload2.getTemplateVersion());
        pairArr22[6] = kotlin.TuplesKt.to("use_case", commsV1PushPayload2.getUseCase());
        pairArr22[7] = kotlin.TuplesKt.to("paypal_request_id", commsV1PushPayload2.getPaypalRequestId());
        pairArr22[8] = kotlin.TuplesKt.to("nn_android", commsV1PushPayload2.getNnAndroid());
        pairArr22[9] = kotlin.TuplesKt.to("media_url", commsV1PushPayload2.getMediaUrl());
        pairArr22[10] = kotlin.TuplesKt.to("has_actions", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(commsV1PushPayload2.getActions() != null));
        pairArr22[11] = kotlin.TuplesKt.to("custom_view", commsV1PushPayload2.getCustomView());
        pairArr22[12] = kotlin.TuplesKt.to("min_app_version", commsV1PushPayload2.getMinAppVersion());
        pairArr22[13] = kotlin.TuplesKt.to("oslo_deeplink", commsV1PushPayload2.getOsloDeeplink());
        pairArr22[14] = kotlin.TuplesKt.to("has_media_image", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap != null));
        logger22.i("Push notification payload mapped", kotlin.collections.MapsKt.mapOf(pairArr22), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("encrypted_customer_id", commsV1PushPayload2.getEncryptedCustomerId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, commsV1PushPayload2.getContactId()), kotlin.TuplesKt.to("customer_id", commsV1PushPayload2.getCustomerId())));
        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.NotificationIdGeneratorKt.generateUniqueNotificationId(), com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT, commsV1PushPayload2.getTitle(), commsV1PushPayload2.getBody(), null, bigText, Camera2StreamConfigurationMap2, null, true, false, null, build2, highSpeedVideoFpsRanges2, 1680, null);
    }

    private static java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> Camera2StreamConfigurationMap(java.lang.String p0) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "type";
        java.lang.String str4 = "error";
        java.lang.String str5 = p0;
        if (str5 == null || kotlin.text.StringsKt.isBlank(str5)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        try {
            try {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(p0);
                    int length = jSONArray.length();
                    java.util.ArrayList arrayList = new java.util.ArrayList(length);
                    int i = 0;
                    while (i < length) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                        java.lang.String optString = jSONObject.optString(str3, "");
                        int i2 = length;
                        java.lang.String optString2 = jSONObject.optString("redirect_nn_GCM", "");
                        org.json.JSONArray jSONArray2 = jSONArray;
                        java.lang.String string = jSONObject.getString("id");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        str2 = str4;
                        try {
                            int i3 = i;
                            java.lang.String optString3 = jSONObject.optString("label", "Action");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString3, "");
                            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                            createMapBuilder.put(str3, optString);
                            java.lang.String str6 = str3;
                            java.lang.String optString4 = jSONObject.optString("result_type", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString4, "");
                            createMapBuilder.put("result_type", optString4);
                            java.lang.String optString5 = jSONObject.optString("code", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString5, "");
                            createMapBuilder.put("code", optString5);
                            java.lang.String optString6 = jSONObject.optString("auth", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString6, "");
                            createMapBuilder.put("auth", optString6);
                            java.lang.String optString7 = jSONObject.optString("success_message", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString7, "");
                            createMapBuilder.put("success_message", optString7);
                            java.lang.String optString8 = jSONObject.optString("error_message", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString8, "");
                            createMapBuilder.put("error_message", optString8);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(optString2);
                            createMapBuilder.put("redirect_nn_GCM", optString2);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(optString, com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.ACTION_TYPE_REDIRECT_CTA) && !kotlin.text.StringsKt.isBlank(optString2)) {
                                createMapBuilder.put("deeplink", optString2);
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            arrayList.add(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction(string, optString3, null, kotlin.collections.MapsKt.build(createMapBuilder), kotlin.jvm.internal.Intrinsics.areEqual(optString, com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.ACTION_TYPE_REDIRECT_CTA), 4, null));
                            i = i3 + 1;
                            length = i2;
                            jSONArray = jSONArray2;
                            str4 = str2;
                            str3 = str6;
                        } catch (org.json.JSONException e) {
                            e = e;
                            str = str2;
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                            java.lang.String message = e.getMessage();
                            com.paypal.android.logger.Logger.w$default(logger, "Failed to parse actions JSON", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(str, message != null ? message : "")), null, 4, null);
                            return kotlin.collections.CollectionsKt.emptyList();
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                            java.lang.String message2 = e.getMessage();
                            com.paypal.android.logger.Logger.w$default(logger2, "Unexpected error parsing actions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(str2, message2 != null ? message2 : "")), null, 4, null);
                            return kotlin.collections.CollectionsKt.emptyList();
                        }
                    }
                    str2 = str4;
                    return arrayList;
                } catch (org.json.JSONException e3) {
                    e = e3;
                    str2 = str4;
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                str2 = str4;
            }
        } catch (org.json.JSONException e5) {
            e = e5;
            str = "error";
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(java.lang.String p0) {
        java.lang.String str = p0;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(p0);
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                java.lang.String optString = jSONObject.optString(next, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "");
                createMapBuilder.put(next, optString);
            }
            return kotlin.collections.MapsKt.build(createMapBuilder);
        } catch (org.json.JSONException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
            java.lang.String message = e.getMessage();
            com.paypal.android.logger.Logger.w$default(logger, "Failed to parse Android payload JSON", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message != null ? message : "")), null, 4, null);
            return kotlin.collections.MapsKt.emptyMap();
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
            java.lang.String message2 = e2.getMessage();
            com.paypal.android.logger.Logger.w$default(logger2, "Unexpected error parsing Android payload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message2 != null ? message2 : "")), null, 4, null);
            return kotlin.collections.MapsKt.emptyMap();
        }
    }

    private final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews getHighSpeedVideoFpsRanges(java.lang.String p0) {
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.map(highResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("custom_view_type", highResolutionOutputSizeshNQ4ISI.getType());
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to map CommsV1 custom view", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }

    private static com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        java.lang.String str = p0;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(p0);
                if (jSONArray.length() == 0) {
                    return null;
                }
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(0);
                java.lang.String string = jSONObject.getString("template_id");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString("view_payload"));
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                    java.lang.Object obj = jSONObject2.get(next);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                    createMapBuilder.put(next, obj);
                }
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload(string, null, build, null);
            } catch (org.json.JSONException e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                java.lang.String message = e.getMessage();
                com.paypal.android.logger.Logger.w$default(logger, "Failed to parse CommsV1 custom_view JSON", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message != null ? message : "")), null, 4, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:11:0x0035, B:12:0x009a, B:14:0x009e, B:17:0x00e5), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:11:0x0035, B:12:0x009a, B:14:0x009e, B:17:0x00e5), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$loadMediaImageIfPresent$1 commsV1PushPayloadMapper$loadMediaImageIfPresent$1;
        int i;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload2;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload commsV1PushPayload3;
        java.lang.String message;
        android.graphics.Bitmap bitmap;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$loadMediaImageIfPresent$1) {
            commsV1PushPayloadMapper$loadMediaImageIfPresent$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$loadMediaImageIfPresent$1) continuation;
            if ((commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String mediaUrl = commsV1PushPayload.getMediaUrl();
                    if (mediaUrl == null || kotlin.text.StringsKt.isBlank(mediaUrl)) {
                        return null;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Loading media image for notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload.getMessageId()), kotlin.TuplesKt.to("campaign_id", commsV1PushPayload.getCampaignId()), kotlin.TuplesKt.to("media_url", commsV1PushPayload.getMediaUrl())), null, 4, null);
                    try {
                        com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader mediaImageLoader = this.Camera2StreamConfigurationMap;
                        java.lang.String mediaUrl2 = commsV1PushPayload.getMediaUrl();
                        commsV1PushPayload2 = commsV1PushPayload;
                        try {
                            commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoSizes = commsV1PushPayload2;
                            commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = mediaImageLoader.loadImage(mediaUrl2, commsV1PushPayloadMapper$loadMediaImageIfPresent$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            commsV1PushPayload3 = commsV1PushPayload2;
                        } catch (java.lang.Exception e) {
                            e = e;
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[3];
                            pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload2.getMessageId());
                            pairArr[1] = kotlin.TuplesKt.to("campaign_id", commsV1PushPayload2.getCampaignId());
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            pairArr[2] = kotlin.TuplesKt.to("error", message);
                            com.paypal.android.logger.Logger.w$default(logger, "Failed to load media image", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            return null;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        commsV1PushPayload2 = commsV1PushPayload;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    commsV1PushPayload3 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload) commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        commsV1PushPayload2 = commsV1PushPayload3;
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                        pairArr2[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload2.getMessageId());
                        pairArr2[1] = kotlin.TuplesKt.to("campaign_id", commsV1PushPayload2.getCampaignId());
                        message = e.getMessage();
                        if (message == null) {
                        }
                        pairArr2[2] = kotlin.TuplesKt.to("error", message);
                        com.paypal.android.logger.Logger.w$default(logger2, "Failed to load media image", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        return null;
                    }
                }
                bitmap = (android.graphics.Bitmap) obj;
                if (bitmap == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Media image loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload3.getMessageId()), kotlin.TuplesKt.to("campaign_id", commsV1PushPayload3.getCampaignId()), kotlin.TuplesKt.to("width", java.lang.String.valueOf(bitmap.getWidth())), kotlin.TuplesKt.to("height", java.lang.String.valueOf(bitmap.getHeight()))), null, 4, null);
                    return bitmap;
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Media image loading returned null", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, commsV1PushPayload3.getMessageId()), kotlin.TuplesKt.to("campaign_id", commsV1PushPayload3.getCampaignId())), null, 4, null);
                return bitmap;
            }
        }
        commsV1PushPayloadMapper$loadMediaImageIfPresent$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$loadMediaImageIfPresent$1(this, continuation);
        java.lang.Object obj2 = commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commsV1PushPayloadMapper$loadMediaImageIfPresent$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null) {
        }
    }
}
