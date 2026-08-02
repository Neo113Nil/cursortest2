package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/OsloPushPayloadMapper;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "mediaImageLoader", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;", "customViewMapper", "<init>", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;)V", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;", "payload", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", "tryMap", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloPushPayload;", "p0", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloPushPayload;)Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "Landroid/graphics/Bitmap;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloPushPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OsloPushPayloadMapper implements com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public OsloPushPayloadMapper(com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader mediaImageLoader, com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper customViewMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaImageLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customViewMapper, "");
        this.getHighSpeedVideoFpsRangesFor = mediaImageLoader;
        this.getHighSpeedVideoFpsRanges = customViewMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object tryMap(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.domain.notification.NotificationData> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$tryMap$1 osloPushPayloadMapper$tryMap$1;
        int i;
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        java.lang.String mediaUrl;
        java.lang.String deeplink;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle notificationStyle;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText bigText;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload2 = validatedPayload;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$tryMap$1) {
            osloPushPayloadMapper$tryMap$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$tryMap$1) continuation;
            if ((osloPushPayloadMapper$tryMap$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                osloPushPayloadMapper$tryMap$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj4 = osloPushPayloadMapper$tryMap$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osloPushPayloadMapper$tryMap$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    if (!(validatedPayload2 instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload)) {
                        return null;
                    }
                    java.lang.String generateUniqueNotificationId = com.paypal.oslo.feature.pushnotification.delivery.data.mapper.NotificationIdGeneratorKt.generateUniqueNotificationId();
                    osloPushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI = validatedPayload2;
                    osloPushPayloadMapper$tryMap$1.getHighSpeedVideoSizes = generateUniqueNotificationId;
                    osloPushPayloadMapper$tryMap$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) validatedPayload2, osloPushPayloadMapper$tryMap$1);
                    if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = generateUniqueNotificationId;
                    obj4 = highResolutionOutputSizeshNQ4ISI;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str2 = (java.lang.String) osloPushPayloadMapper$tryMap$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload3 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload) osloPushPayloadMapper$tryMap$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    str = str2;
                    validatedPayload2 = validatedPayload3;
                }
                bitmap = (android.graphics.Bitmap) obj4;
                com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload osloPushPayload = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) validatedPayload2;
                com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(osloPushPayload);
                java.util.List<com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction> actions = osloPushPayload.getActions();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(actions, 10));
                for (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction osloNotificationAction : actions) {
                    java.lang.String id = osloNotificationAction.getId();
                    java.lang.String label = osloNotificationAction.getLabel();
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    createMapBuilder.put("type", osloNotificationAction.getType().name());
                    java.lang.String deeplink2 = osloNotificationAction.getDeeplink();
                    if (deeplink2 != null) {
                    }
                    java.lang.String actionId = osloNotificationAction.getActionId();
                    if (actionId != null) {
                        createMapBuilder.put(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, actionId);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    arrayList.add(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction(id, label, null, kotlin.collections.MapsKt.build(createMapBuilder), osloNotificationAction.getType() == com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.DEEPLINK, 4, null));
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
                createMapBuilder2.putAll(osloPushPayload.getMetadata());
                createMapBuilder2.put("type", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_OSLO);
                mediaUrl = osloPushPayload.getMediaUrl();
                if (mediaUrl != null) {
                }
                deeplink = osloPushPayload.getDeeplink();
                if (deeplink != null) {
                    createMapBuilder2.put("deeplink", deeplink);
                }
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder2);
                if (bitmap == null) {
                    obj = "media_url";
                    obj2 = "type";
                    obj3 = "deeplink";
                    bigText = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture(bitmap, null, osloPushPayload.getBody(), 2, null);
                } else {
                    obj = "media_url";
                    obj2 = "type";
                    obj3 = "deeplink";
                    if (osloPushPayload.getBody().length() <= 40) {
                        notificationStyle = null;
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[17];
                        pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload.getContentId());
                        pairArr[1] = kotlin.TuplesKt.to("campaign_id", osloPushPayload.getCampaignId());
                        pairArr[2] = kotlin.TuplesKt.to("mapper", "OsloPushPayloadMapper");
                        pairArr[3] = kotlin.TuplesKt.to("source", osloPushPayload.getSource());
                        pairArr[4] = kotlin.TuplesKt.to(obj2, osloPushPayload.getType());
                        pairArr[5] = kotlin.TuplesKt.to("instance_id", osloPushPayload.getInstanceId());
                        pairArr[6] = kotlin.TuplesKt.to("unp_id", osloPushPayload.getUnpId());
                        pairArr[7] = kotlin.TuplesKt.to("traffic_pattern", osloPushPayload.getTrafficPattern());
                        pairArr[8] = kotlin.TuplesKt.to("target_id", osloPushPayload.getTargetId());
                        pairArr[9] = kotlin.TuplesKt.to("origin_ts", osloPushPayload.getOriginTimestamp());
                        pairArr[10] = kotlin.TuplesKt.to(obj3, osloPushPayload.getDeeplink());
                        pairArr[11] = kotlin.TuplesKt.to(obj, osloPushPayload.getMediaUrl());
                        pairArr[12] = kotlin.TuplesKt.to("has_custom_view", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(osloPushPayload.getCustomView() != null));
                        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customView = osloPushPayload.getCustomView();
                        pairArr[13] = kotlin.TuplesKt.to("custom_view_type", customView != null ? customView.getType() : null);
                        pairArr[14] = kotlin.TuplesKt.to("min_app_version", osloPushPayload.getMinAppVersion());
                        pairArr[15] = kotlin.TuplesKt.to("action_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(osloPushPayload.getActions().size()));
                        pairArr[16] = kotlin.TuplesKt.to("has_media_image", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap != null));
                        logger.i("Push notification payload mapped", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_id", osloPushPayload.getUserId())));
                        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(str, com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT, osloPushPayload.getTitle(), osloPushPayload.getBody(), null, notificationStyle, arrayList2, null, true, false, null, build, Camera2StreamConfigurationMap, 1680, null);
                    }
                    bigText = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText(osloPushPayload.getBody());
                }
                notificationStyle = bigText;
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[17];
                pairArr2[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload.getContentId());
                pairArr2[1] = kotlin.TuplesKt.to("campaign_id", osloPushPayload.getCampaignId());
                pairArr2[2] = kotlin.TuplesKt.to("mapper", "OsloPushPayloadMapper");
                pairArr2[3] = kotlin.TuplesKt.to("source", osloPushPayload.getSource());
                pairArr2[4] = kotlin.TuplesKt.to(obj2, osloPushPayload.getType());
                pairArr2[5] = kotlin.TuplesKt.to("instance_id", osloPushPayload.getInstanceId());
                pairArr2[6] = kotlin.TuplesKt.to("unp_id", osloPushPayload.getUnpId());
                pairArr2[7] = kotlin.TuplesKt.to("traffic_pattern", osloPushPayload.getTrafficPattern());
                pairArr2[8] = kotlin.TuplesKt.to("target_id", osloPushPayload.getTargetId());
                pairArr2[9] = kotlin.TuplesKt.to("origin_ts", osloPushPayload.getOriginTimestamp());
                pairArr2[10] = kotlin.TuplesKt.to(obj3, osloPushPayload.getDeeplink());
                pairArr2[11] = kotlin.TuplesKt.to(obj, osloPushPayload.getMediaUrl());
                pairArr2[12] = kotlin.TuplesKt.to("has_custom_view", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(osloPushPayload.getCustomView() != null));
                com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customView2 = osloPushPayload.getCustomView();
                pairArr2[13] = kotlin.TuplesKt.to("custom_view_type", customView2 != null ? customView2.getType() : null);
                pairArr2[14] = kotlin.TuplesKt.to("min_app_version", osloPushPayload.getMinAppVersion());
                pairArr2[15] = kotlin.TuplesKt.to("action_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(osloPushPayload.getActions().size()));
                pairArr2[16] = kotlin.TuplesKt.to("has_media_image", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap != null));
                logger2.i("Push notification payload mapped", kotlin.collections.MapsKt.mapOf(pairArr2), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_id", osloPushPayload.getUserId())));
                return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(str, com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT, osloPushPayload.getTitle(), osloPushPayload.getBody(), null, notificationStyle, arrayList2, null, true, false, null, build, Camera2StreamConfigurationMap, 1680, null);
            }
        }
        osloPushPayloadMapper$tryMap$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$tryMap$1(this, continuation);
        java.lang.Object obj42 = osloPushPayloadMapper$tryMap$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osloPushPayloadMapper$tryMap$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        bitmap = (android.graphics.Bitmap) obj42;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload osloPushPayload2 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) validatedPayload2;
        com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(osloPushPayload2);
        java.util.List<com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction> actions2 = osloPushPayload2.getActions();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(actions2, 10));
        while (r3.hasNext()) {
        }
        java.util.ArrayList arrayList22 = arrayList3;
        java.util.Map createMapBuilder22 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder22.putAll(osloPushPayload2.getMetadata());
        createMapBuilder22.put("type", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_OSLO);
        mediaUrl = osloPushPayload2.getMediaUrl();
        if (mediaUrl != null) {
        }
        deeplink = osloPushPayload2.getDeeplink();
        if (deeplink != null) {
        }
        java.util.Map build2 = kotlin.collections.MapsKt.build(createMapBuilder22);
        if (bitmap == null) {
        }
        notificationStyle = bigText;
        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
        kotlin.Pair[] pairArr22 = new kotlin.Pair[17];
        pairArr22[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload2.getContentId());
        pairArr22[1] = kotlin.TuplesKt.to("campaign_id", osloPushPayload2.getCampaignId());
        pairArr22[2] = kotlin.TuplesKt.to("mapper", "OsloPushPayloadMapper");
        pairArr22[3] = kotlin.TuplesKt.to("source", osloPushPayload2.getSource());
        pairArr22[4] = kotlin.TuplesKt.to(obj2, osloPushPayload2.getType());
        pairArr22[5] = kotlin.TuplesKt.to("instance_id", osloPushPayload2.getInstanceId());
        pairArr22[6] = kotlin.TuplesKt.to("unp_id", osloPushPayload2.getUnpId());
        pairArr22[7] = kotlin.TuplesKt.to("traffic_pattern", osloPushPayload2.getTrafficPattern());
        pairArr22[8] = kotlin.TuplesKt.to("target_id", osloPushPayload2.getTargetId());
        pairArr22[9] = kotlin.TuplesKt.to("origin_ts", osloPushPayload2.getOriginTimestamp());
        pairArr22[10] = kotlin.TuplesKt.to(obj3, osloPushPayload2.getDeeplink());
        pairArr22[11] = kotlin.TuplesKt.to(obj, osloPushPayload2.getMediaUrl());
        pairArr22[12] = kotlin.TuplesKt.to("has_custom_view", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(osloPushPayload2.getCustomView() != null));
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customView22 = osloPushPayload2.getCustomView();
        pairArr22[13] = kotlin.TuplesKt.to("custom_view_type", customView22 != null ? customView22.getType() : null);
        pairArr22[14] = kotlin.TuplesKt.to("min_app_version", osloPushPayload2.getMinAppVersion());
        pairArr22[15] = kotlin.TuplesKt.to("action_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(osloPushPayload2.getActions().size()));
        pairArr22[16] = kotlin.TuplesKt.to("has_media_image", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap != null));
        logger22.i("Push notification payload mapped", kotlin.collections.MapsKt.mapOf(pairArr22), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_id", osloPushPayload2.getUserId())));
        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(str, com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT, osloPushPayload2.getTitle(), osloPushPayload2.getBody(), null, notificationStyle, arrayList22, null, true, false, null, build2, Camera2StreamConfigurationMap2, 1680, null);
    }

    private final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews Camera2StreamConfigurationMap(com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload p0) {
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customView = p0.getCustomView();
        if (customView == null) {
            return null;
        }
        try {
            return this.getHighSpeedVideoFpsRanges.map(customView);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            createMapBuilder.put(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, p0.getContentId());
            createMapBuilder.put("campaign_id", p0.getCampaignId());
            createMapBuilder.put("custom_view_type", customView.getType());
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            createMapBuilder.put("error", message);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.paypal.android.logger.Logger.w$default(logger, "Failed to map custom view", kotlin.collections.MapsKt.build(createMapBuilder), null, 4, null);
            return null;
        }
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
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload osloPushPayload, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$loadMediaImageIfPresent$1 osloPushPayloadMapper$loadMediaImageIfPresent$1;
        int i;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload osloPushPayload2;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload osloPushPayload3;
        java.lang.String message;
        android.graphics.Bitmap bitmap;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$loadMediaImageIfPresent$1) {
            osloPushPayloadMapper$loadMediaImageIfPresent$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$loadMediaImageIfPresent$1) continuation;
            if ((osloPushPayloadMapper$loadMediaImageIfPresent$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                osloPushPayloadMapper$loadMediaImageIfPresent$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = osloPushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osloPushPayloadMapper$loadMediaImageIfPresent$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String mediaUrl = osloPushPayload.getMediaUrl();
                    if (mediaUrl == null || kotlin.text.StringsKt.isBlank(mediaUrl)) {
                        return null;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Loading media image for Oslo notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload.getContentId()), kotlin.TuplesKt.to("campaign_id", osloPushPayload.getCampaignId()), kotlin.TuplesKt.to("media_url", osloPushPayload.getMediaUrl())), null, 4, null);
                    try {
                        com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader mediaImageLoader = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.String mediaUrl2 = osloPushPayload.getMediaUrl();
                        osloPushPayload2 = osloPushPayload;
                        try {
                            osloPushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoFpsRangesFor = osloPushPayload2;
                            osloPushPayloadMapper$loadMediaImageIfPresent$1.Camera2StreamConfigurationMap = 1;
                            obj = mediaImageLoader.loadImage(mediaUrl2, osloPushPayloadMapper$loadMediaImageIfPresent$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            osloPushPayload3 = osloPushPayload2;
                        } catch (java.lang.Exception e) {
                            e = e;
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[3];
                            pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload2.getContentId());
                            pairArr[1] = kotlin.TuplesKt.to("campaign_id", osloPushPayload2.getCampaignId());
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
                        osloPushPayload2 = osloPushPayload;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    osloPushPayload3 = (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload) osloPushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        osloPushPayload2 = osloPushPayload3;
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                        pairArr2[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload2.getContentId());
                        pairArr2[1] = kotlin.TuplesKt.to("campaign_id", osloPushPayload2.getCampaignId());
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
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Media image loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload3.getContentId()), kotlin.TuplesKt.to("campaign_id", osloPushPayload3.getCampaignId()), kotlin.TuplesKt.to("width", java.lang.String.valueOf(bitmap.getWidth())), kotlin.TuplesKt.to("height", java.lang.String.valueOf(bitmap.getHeight()))), null, 4, null);
                    return bitmap;
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Media image loading returned null", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, osloPushPayload3.getContentId()), kotlin.TuplesKt.to("campaign_id", osloPushPayload3.getCampaignId())), null, 4, null);
                return bitmap;
            }
        }
        osloPushPayloadMapper$loadMediaImageIfPresent$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$loadMediaImageIfPresent$1(this, continuation);
        java.lang.Object obj2 = osloPushPayloadMapper$loadMediaImageIfPresent$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osloPushPayloadMapper$loadMediaImageIfPresent$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null) {
        }
    }
}
