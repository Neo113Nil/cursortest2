package com.paypal.oslo.core.pushnotification.data.fcm;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/fcm/PushNotificationEventDispatcher;", "", "", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "handlers", "<init>", "(Ljava/util/Set;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "onMessageReceived$push_notification_release", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "onNewToken$push_notification_release", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PushNotificationEventDispatcher {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PushNotificationEventDispatcher(java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRangesFor = set;
    }

    public final void onMessageReceived$push_notification_release(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Set<com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler> set = this.getHighSpeedVideoFpsRangesFor;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            for (com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler pushNotificationHandler : set) {
                try {
                } catch (java.lang.Throwable th) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Handler failed to process push notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("handler", pushNotificationHandler.name()), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, message.getMessageId())), null, th, 4, null);
                }
                if (pushNotificationHandler.handle(message)) {
                    return;
                }
            }
        }
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        java.util.Set of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"ID", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, "cust_id", "user_id"});
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("fcm_message_id", message.getMessageId());
        createMapBuilder.put("has_notification", java.lang.Boolean.valueOf(message.getNotification() != null));
        createMapBuilder.put("from", message.getFrom());
        createMapBuilder.put("sender_id", message.getSenderId());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : data.entrySet()) {
            if (!of.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        createMapBuilder.putAll(linkedHashMap);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.util.Map<java.lang.String, ? extends java.lang.Object> build = kotlin.collections.MapsKt.build(createMapBuilder);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : data.entrySet()) {
            if (of.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        logger.w("Push notification not handled by any registered handler", build, linkedHashMap2);
    }

    public final void onNewToken$push_notification_release(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        for (com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler pushNotificationHandler : this.getHighSpeedVideoFpsRangesFor) {
            try {
                pushNotificationHandler.onNewToken(token);
            } catch (java.lang.Throwable th) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Handler failed to process FCM token update", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("handler", pushNotificationHandler.name())), null, th, 4, null);
            }
        }
    }
}
