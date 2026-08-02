package com.paypal.oslo.core.pushnotification.data.fcm;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/fcm/OsloFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "onNewToken", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/core/pushnotification/data/fcm/PushNotificationEventDispatcher;", "pushNotificationEventDispatcher", "Lcom/paypal/oslo/core/pushnotification/data/fcm/PushNotificationEventDispatcher;", "getPushNotificationEventDispatcher$push_notification_release", "()Lcom/paypal/oslo/core/pushnotification/data/fcm/PushNotificationEventDispatcher;", "setPushNotificationEventDispatcher$push_notification_release", "(Lcom/paypal/oslo/core/pushnotification/data/fcm/PushNotificationEventDispatcher;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes10.dex */
public final class OsloFirebaseMessagingService extends com.paypal.oslo.core.pushnotification.data.fcm.Hilt_OsloFirebaseMessagingService {

    @javax.inject.Inject
    public com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher pushNotificationEventDispatcher;

    public final com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher getPushNotificationEventDispatcher$push_notification_release() {
        com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher pushNotificationEventDispatcher = this.pushNotificationEventDispatcher;
        if (pushNotificationEventDispatcher != null) {
            return pushNotificationEventDispatcher;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setPushNotificationEventDispatcher$push_notification_release(com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher pushNotificationEventDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationEventDispatcher, "");
        this.pushNotificationEventDispatcher = pushNotificationEventDispatcher;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage message) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[24];
        java.lang.String str = data.get("MID");
        if (str == null && (str = data.get("content_id")) == null) {
            str = message.getMessageId();
        }
        pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str);
        java.lang.String str2 = data.get("CID");
        if (str2 == null) {
            str2 = data.get("campaign_id");
        }
        pairArr[1] = kotlin.TuplesKt.to("campaign_id", str2);
        pairArr[2] = kotlin.TuplesKt.to("has_notification", java.lang.Boolean.valueOf(message.getNotification() != null));
        pairArr[3] = kotlin.TuplesKt.to("has_data", java.lang.Boolean.valueOf(!data.isEmpty()));
        pairArr[4] = kotlin.TuplesKt.to("from", message.getFrom());
        pairArr[5] = kotlin.TuplesKt.to("sender_id", message.getSenderId());
        pairArr[6] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, data.get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE));
        pairArr[7] = kotlin.TuplesKt.to("source", data.get("source"));
        pairArr[8] = kotlin.TuplesKt.to("type", data.get("type"));
        pairArr[9] = kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID, data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID));
        pairArr[10] = kotlin.TuplesKt.to("template_version", data.get("template_version"));
        pairArr[11] = kotlin.TuplesKt.to("use_case", data.get("use_case"));
        pairArr[12] = kotlin.TuplesKt.to("paypal_request_id", data.get("paypal_request_id"));
        pairArr[13] = kotlin.TuplesKt.to("nn_android", data.get("NN_ANDROID"));
        java.lang.String str3 = data.get("MU");
        if (str3 == null) {
            str3 = data.get("media_url");
        }
        pairArr[14] = kotlin.TuplesKt.to("media_url", str3);
        java.lang.String str4 = data.get("custom_view");
        if (str4 == null) {
            str4 = data.get("custom_view_type");
        }
        pairArr[15] = kotlin.TuplesKt.to("custom_view", str4);
        java.lang.String str5 = data.get("MIN_APP_VER");
        if (str5 == null) {
            str5 = data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.MIN_APP_VERSION);
        }
        pairArr[16] = kotlin.TuplesKt.to("min_app_version", str5);
        java.lang.String str6 = data.get("oslo_deeplink");
        if (str6 == null) {
            str6 = data.get("deeplink");
        }
        pairArr[17] = kotlin.TuplesKt.to("oslo_deeplink", str6);
        pairArr[18] = kotlin.TuplesKt.to("instance_id", data.get("instance_id"));
        pairArr[19] = kotlin.TuplesKt.to("unp_id", data.get("unp_id"));
        pairArr[20] = kotlin.TuplesKt.to("traffic_pattern", data.get("traffic_pattern"));
        pairArr[21] = kotlin.TuplesKt.to("target_id", data.get("target_id"));
        pairArr[22] = kotlin.TuplesKt.to("origin_ts", data.get("origin_ts"));
        if (data.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY) == null) {
            java.util.Set<java.lang.String> keySet = data.keySet();
            if (!(keySet instanceof java.util.Collection) || !keySet.isEmpty()) {
                for (java.lang.String str7 : keySet) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str7);
                    if (kotlin.text.StringsKt.startsWith$default(str7, "action_", false, 2, (java.lang.Object) null)) {
                    }
                }
            }
            z = false;
            pairArr[23] = kotlin.TuplesKt.to("has_actions", java.lang.Boolean.valueOf(z));
            logger.i("FCM message received", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("encrypted_customer_id", data.get("ID")), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, data.get(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID)), kotlin.TuplesKt.to("customer_id", data.get("cust_id")), kotlin.TuplesKt.to("user_id", data.get("user_id"))));
            getPushNotificationEventDispatcher$push_notification_release().onMessageReceived$push_notification_release(message);
        }
        z = true;
        pairArr[23] = kotlin.TuplesKt.to("has_actions", java.lang.Boolean.valueOf(z));
        logger.i("FCM message received", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("encrypted_customer_id", data.get("ID")), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID, data.get(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID)), kotlin.TuplesKt.to("customer_id", data.get("cust_id")), kotlin.TuplesKt.to("user_id", data.get("user_id"))));
        getPushNotificationEventDispatcher$push_notification_release().onMessageReceived$push_notification_release(message);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "FCM token refreshed", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, token)), 2, null);
        getPushNotificationEventDispatcher$push_notification_release().onNewToken$push_notification_release(token);
    }

    @Override // com.paypal.oslo.core.pushnotification.data.fcm.Hilt_OsloFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.paypal.oslo.core.pushnotification.data.fcm.Hilt_OsloFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
