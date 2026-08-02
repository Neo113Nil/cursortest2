package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class MessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(java.lang.String str) {
        super.onNewToken(str);
        com.adobe.marketing.mobile.MobileCore.setPushIdentifier(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        handleRemoteMessage(this, remoteMessage);
    }

    public static boolean handleRemoteMessage(android.content.Context context, com.google.firebase.messaging.RemoteMessage remoteMessage) {
        if (!remoteMessage.getData().containsKey("_xdm") && !remoteMessage.getData().containsKey(com.adobe.marketing.mobile.messaging.MessagingConstants.Push.PayloadKeys.TITLE)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingService", "The received push message is not generated from Adobe Journey Optimizer. Messaging extension is ignoring to display the push notification.", new java.lang.Object[0]);
            return false;
        }
        androidx.core.app.NotificationManagerCompat.from(context).notify(remoteMessage.getMessageId().hashCode(), com.adobe.marketing.mobile.messaging.MessagingPushBuilder.getHighSpeedVideoSizes(new com.adobe.marketing.mobile.MessagingPushPayload(remoteMessage), context));
        com.adobe.marketing.mobile.MobileCore.dispatchEvent(new com.adobe.marketing.mobile.Event.Builder("Push Notification Displayed", com.adobe.marketing.mobile.EventType.MESSAGING, com.adobe.marketing.mobile.EventSource.RESPONSE_CONTENT).setEventData(new java.util.HashMap(remoteMessage.getData())).build());
        return true;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
