package com.paypal.oslo.core.pushnotification.data.click;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/click/NotificationIntentHandlerImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationIntentHandler;", "Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;)V", "Landroid/content/Intent;", "intent", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationLaunchInfo;", "handleIfNotificationIntent", "(Landroid/content/Intent;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationLaunchInfo;", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/pushnotification/data/click/NotificationClickDispatcher;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationIntentHandlerImpl implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher getHighSpeedVideoSizes;

    @javax.inject.Inject
    public NotificationIntentHandlerImpl(com.paypal.oslo.core.pushnotification.data.click.NotificationClickDispatcher notificationClickDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationClickDispatcher, "");
        this.getHighSpeedVideoSizes = notificationClickDispatcher;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler
    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo handleIfNotificationIntent(android.content.Intent intent) {
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content content;
        android.net.Uri data;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        java.lang.String stringExtra = intent.getStringExtra(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID);
        if (stringExtra == null || kotlin.text.StringsKt.isBlank(stringExtra)) {
            stringExtra = null;
        }
        if (stringExtra == null) {
            if (intent.hasExtra("metadata") || ((data = intent.getData()) != null && (obj = data.toString()) != null && (!kotlin.text.StringsKt.isBlank(obj)))) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("intent_action", intent.getAction());
                pairArr[1] = kotlin.TuplesKt.to("has_intent_data", java.lang.Boolean.valueOf(intent.getData() != null));
                android.net.Uri data2 = intent.getData();
                pairArr[2] = kotlin.TuplesKt.to("intent_data_uri", data2 != null ? data2.toString() : null);
                com.paypal.android.logger.Logger.w$default(logger, "Push notification intent missing ID", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            }
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(intent, "metadata");
        java.lang.String str = highSpeedVideoFpsRanges.get("MID");
        if (str == null) {
            str = highSpeedVideoFpsRanges.get("content_id");
        }
        java.lang.String str2 = highSpeedVideoFpsRanges.get("CID");
        if (str2 == null) {
            str2 = highSpeedVideoFpsRanges.get("campaign_id");
        }
        if (highSpeedVideoFpsRanges.isEmpty()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Push notification metadata lost", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, stringExtra), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str), kotlin.TuplesKt.to("campaign_id", str2), kotlin.TuplesKt.to("metadata_keys_count", java.lang.Integer.valueOf(highSpeedVideoFpsRanges.size()))), null, 4, null);
        }
        java.lang.String stringExtra2 = intent.getStringExtra("action_id");
        java.lang.String str3 = stringExtra2;
        if (str3 != null && !kotlin.text.StringsKt.isBlank(str3)) {
            java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(intent, com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_ACTION_METADATA);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Dispatching action click from Activity intent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, stringExtra), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str), kotlin.TuplesKt.to("campaign_id", str2), kotlin.TuplesKt.to("action_id", stringExtra2)), null, 4, null);
            content = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Action(stringExtra, highSpeedVideoFpsRanges, stringExtra2, highSpeedVideoFpsRanges2);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Dispatching content click from Activity intent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, stringExtra), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str), kotlin.TuplesKt.to("campaign_id", str2)), null, 4, null);
            content = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationClick.Content(stringExtra, highSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoSizes.dispatchClick(content);
        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo(stringExtra);
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(android.content.Intent intent, java.lang.String str) {
        java.util.HashMap hashMap;
        java.util.LinkedHashMap linkedHashMap = null;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            hashMap = (java.util.HashMap) intent.getSerializableExtra(str, java.util.HashMap.class);
        } else {
            java.io.Serializable serializableExtra = intent.getSerializableExtra(str);
            hashMap = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
        }
        if (hashMap != null) {
            java.util.HashMap hashMap2 = hashMap;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(hashMap2.size()));
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                linkedHashMap2.put(entry.getKey().toString(), entry.getValue());
            }
            linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        return linkedHashMap == null ? kotlin.collections.MapsKt.emptyMap() : linkedHashMap;
    }
}
